/*******************************************************************************
 * Copyright (c) 2011, 2012 Cristiano Gavião - Lunifera.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Cristiano Gavião - initial API and implementation
 *******************************************************************************/
package org.lunifera.metamodel.dsl.software.composition.utilities;

import javax.inject.Inject;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.MultimapBasedSelectable;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.ConstraintType;
import org.lunifera.metamodel.dsl.component.template.library.componentTemplateLibraryDsl.UnitType;
import org.lunifera.metamodel.dsl.software.composition.compositeModelDsl.UnitInstance;

/**
 * @author cvgaviao
 * 
 */
public class CompositeModelUtility {


	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Inject
	private IQualifiedNameConverter converter;

	/**
	 *  Checks the hierarchy for the existence of Enum value different from "None". 
	 * @param object from where start to search.
	 * @param parentReference points to the parent to be called recursively.  
	 * @param attributeToCheck the Enum attribute to check.
	 * @param enumNoneValue the value which represents a none value.
	 * @return the number of occurrences found in the search.
	 */
	public int checkExistenceOfEnumNotNoneInHierarchy(EObject object,
			EReference parentReference, EAttribute attributeToCheck,
			String enumNoneValue) {
		int result = 0;

		// verify the existence of reference in the current object
		Object value = object.eGet(attributeToCheck);
		if (value != null && !value.toString().equals(enumNoneValue)) {
			result++;
		}

		EObject parent = (EObject) object.eGet(parentReference);
		if (parent != null && !parent.equals(object)) {
			result = result
					+ checkExistenceOfEnumNotNoneInHierarchy(parent,
							parentReference, attributeToCheck, enumNoneValue);
		}
		return result;
	}

	/**
	 * @param object
	 * @param parentReference parentReference points to the parent to be called recursively.
	 * @param referenceToCheck
	 * @return the number of occurrences found in the search.
	 */
	public int checkExistenceOfNotEmptyReferenceListInHierarchy(EObject object,
			EReference parentReference, EReference referenceToCheck) {
		int result = 0;

		// verify the existence of reference in the current object
		EList<?> list = (EList<?>) object.eGet(referenceToCheck);
		if (list != null && !list.isEmpty()) {
			result++;
		}

		EObject parent = (EObject) object.eGet(parentReference);
		if (parent != null) {
			result = result
					+ checkExistenceOfNotEmptyReferenceListInHierarchy(parent,
							parentReference, referenceToCheck);
		}
		return result;
	}

	/**
	 * 
	 * @param object
	 * @param parentReference parentReference points to the parent to be called recursively.
	 * @param referenceToCheck
	 * @return the number of occurrences found in the search.
	 */
	public int checkExistenceOfReferenceInHierarchy(EObject object,
			EReference parentReference, EReference referenceToCheck) {
		int result = 0;

		// verify the existence of reference in the current object
		EObject reference = (EObject) object.eGet(referenceToCheck);
		if (reference != null) {
			result++;
		}

		EObject parent = (EObject) object.eGet(parentReference);
		if (parent != null) {
			result = result
					+ checkExistenceOfReferenceInHierarchy(parent,
							parentReference, referenceToCheck);
		}
		return result;
	}


	public IScope getCostraintOuterAttributeScope4(final ConstraintType parent) {
		if (parent == null) {
			return IScope.NULLSCOPE;
		} else {
			// TODO must handle proxy resolution here
			return Scopes.scopeFor(parent.getAttributes(),
					getCostraintOuterAttributeScope4(parent.getSuperType()));
		}
	}

	/**
	 * This method is useful to calculate the number and which feature items are
	 * in the hierarchy. But this method must not be used to create one scope.
	 * 
	 * @param returnType
	 * @param eObject
	 * @param parentReference points to the parent to be called recursively. 
	 * @param referenceToCheck
	 * @return
	 */
	public <T> EList<T> getElementsFromHierarchy(Class<T> returnType,
			EObject eObject, EReference parentReference,
			EReference referenceToCheck) {

		EList<T> returnList = new BasicEList<T>();

		// verify the existence of reference in the current object
		@SuppressWarnings("unchecked")
		EList<T> referenceList = (EList<T>) eObject.eGet(referenceToCheck);
		if (referenceList != null && !referenceList.isEmpty()) {
			returnList.addAll(referenceList);
		}

		EObject parent = (EObject) eObject.eGet(parentReference);
		if (parent != null) {
			returnList.addAll(getElementsFromHierarchy(returnType, parent,
					parentReference, referenceToCheck));
		}
		return returnList;
	}

	/**
	 * 
	 * @param returnType
	 * @param eObject
	 * @param parentReference points to the parent to be called recursively.
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T extends EObject> EList<T> getHierarchy(Class<T> returnType,
			T eObject, EReference parentReference) {

		EList<T> returnList = new BasicEList<T>();
		if (eObject != null) {
			returnList.add(eObject);
		}

		T parent = (T) eObject.eGet(parentReference);
		if (parent != null) {
			returnList
					.addAll(getHierarchy(returnType, parent, parentReference));
		}
		return returnList;
	}




	public IScope getOuterAttributeScopeOld(final UnitInstance context,
			final UnitType parent) {
		if (parent == null) {
			return IScope.NULLSCOPE;
		} else {
			if (parent.eIsProxy()) {
				UnitType resolvedParent = (UnitType) EcoreUtil.resolve(parent,
						context);
				if (resolvedParent != null && !resolvedParent.eIsProxy()) {
					return Scopes.scopeFor(
							resolvedParent.getAttributes(),
							getOuterAttributeScopeOld(context,
									resolvedParent.getSuperType()));
				} else {
					return IScope.NULLSCOPE;
				}
			} else {
				return Scopes.scopeFor(
						parent.getAttributes(),
						getOuterAttributeScopeOld(context,
								parent.getSuperType()));
			}
		}
	}


	public IScope getOuterProvidedCapabilitiesScopeOld(
			final UnitInstance context, final UnitType parent) {
		if (parent == null) {
			return IScope.NULLSCOPE;
		} else {
			if (parent.eIsProxy()) {
				UnitType resolvedParent = (UnitType) EcoreUtil.resolve(parent,
						context);
				if (resolvedParent != null && !resolvedParent.eIsProxy()) {
					return Scopes.scopeFor(
							resolvedParent.getProvidedCapabilities(),
							getOuterProvidedCapabilitiesScopeOld(context,
									resolvedParent.getSuperType()));
				} else {
					return IScope.NULLSCOPE;
				}
			} else {
				return Scopes.scopeFor(
						parent.getProvidedCapabilities(),
						getOuterProvidedCapabilitiesScopeOld(context,
								parent.getSuperType()));
			}
		}
	}


	public IScope getOuterRequiredCapabilitiesScope3(final UnitInstance context,
			final UnitType parent) {
		if (parent == null) {
			return IScope.NULLSCOPE;
		} else {
			if (parent.eIsProxy()) {
				UnitType resolvedParent = (UnitType) EcoreUtil.resolve(parent,
						context);
				if (resolvedParent != null && !resolvedParent.eIsProxy()) {
					return Scopes.scopeFor(
							resolvedParent.getRequiredCapabilities(),
							getOuterRequiredCapabilitiesScope3(context,
									resolvedParent.getSuperType()));
				} else {
					return IScope.NULLSCOPE;
				}
			} else {
				return Scopes.scopeFor(
						parent.getRequiredCapabilities(),
						getOuterRequiredCapabilitiesScope3(context,
								parent.getSuperType()));
			}
		}
	}

	@SuppressWarnings("unchecked")
	public IScope getScopeFromHierarchyElements5(EObject eObject,
			EReference parentReference, EReference referenceElementsToInclude,
			IScope initialScope) {

		if (eObject == null || referenceElementsToInclude == null
				|| initialScope == null)
			return IScope.NULLSCOPE;

		IScope returnScope = initialScope;
		// verify the existence of reference in the current object
		EList<EObject> referenceList = (EList<EObject>) eObject
				.eGet(referenceElementsToInclude);

		if (referenceList != null && !referenceList.isEmpty()) {
			Iterable<IEObjectDescription> qualifiedElements = Scopes
					.scopedElementsFor(referenceList, qualifiedNameProvider);
			MultimapBasedSelectable selectabler = new MultimapBasedSelectable(
					qualifiedElements);

			returnScope = SelectableBasedScope.createScope(initialScope,
					selectabler,
					referenceElementsToInclude.getEReferenceType(), true);
		}

		EObject parent = (EObject) eObject.eGet(parentReference);
		if (parent != null) {
			if (parent.eIsProxy()) {
				parent = EcoreUtil.resolve(parent, eObject);
			}
			returnScope = getScopeFromHierarchyElements5(parent,
					parentReference, referenceElementsToInclude, returnScope);
		}
		return returnScope;
	}

	/**
	 * This method return the first parent in the hierarchy that is assignable
	 * from the informed target class.
	 * 
	 * @param target
	 * @param object
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T returnTargetRootContainer(Class<T> target, EObject object) {

		if (object != null) {
			if (target.isAssignableFrom(object.getClass()))
				return (T) object;
		}

		EObject parentContainer = object.eContainer();
		if (parentContainer != null) {
			return returnTargetRootContainer(target, parentContainer);
		}
		return null;
	}
}
