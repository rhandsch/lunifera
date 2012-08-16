/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Based on org.eclipse.xtend.ide.labeling.XtendLabelProvider
 * 
 */
package org.lunifera.metamodel.dsl.entity.ui.labeling;

import static com.google.common.collect.Iterables.filter;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;
import org.eclipse.xtext.xbase.validation.UIStrings;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContainer;
import org.lunifera.metamodel.dsl.entity.entitymodel.LContains;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEmbedds;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntity;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEnum;
import org.lunifera.metamodel.dsl.entity.entitymodel.LEnumLiteral;
import org.lunifera.metamodel.dsl.entity.entitymodel.LImport;
import org.lunifera.metamodel.dsl.entity.entitymodel.LOperation;
import org.lunifera.metamodel.dsl.entity.entitymodel.LProperty;
import org.lunifera.metamodel.dsl.entity.entitymodel.LRefers;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 */
@SuppressWarnings("restriction")
public class EntityLabelProvider extends XbaseLabelProvider {

	@Inject
	private UIStrings uiStrings;

	@Inject
	private EntityImages images;

	@Inject
	private IJvmModelAssociations associations;

	@Inject
	public EntityLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	public Image image(XtendFile element) {
		return images.forFile();
	}

	public Image image(LImport element) {
		return images.forImport();
	}

	public Image image(LEntity element) {
		final JvmGenericType inferredType = getFirstOrNull(
				associations.getJvmElements(element), JvmGenericType.class);
		return images.forClass(inferredType.getVisibility());
	}

	public Image image(LEnum element) {
		return images.forEnum(JvmVisibility.PUBLIC);
	}
	
	public Image image(LEnumLiteral element) {
		return images.forEnumLiteral();
	}

	public Image image(LOperation element) {
		JvmOperation inferredOperation = getFirstOrNull(
				associations.getJvmElements(element), JvmOperation.class);
		return images.forOperation(inferredOperation.getVisibility(),
				inferredOperation.isStatic());
	}

	public Image image(LProperty element) {
		JvmField inferredField = getFirstOrNull(
				associations.getJvmElements(element), JvmField.class);
		return images.forField(inferredField.getVisibility(),
				inferredField.isStatic(), false);
	}

	public Image image(LRefers element) {
		return images.forRefers();
	}

	public Image image(LContains element) {
		return images.forContains();
	}

	public Image image(LContainer element) {
		return images.forContainer();
	}

	public Image image(LEmbedds element) {
		return images.forEmbedds();
	}

	public Image image(JvmParameterizedTypeReference typeRef) {
		return images.forTypeParameter();
	}

	public String text(LImport element) {
		return element.getImportedNamespace();
	}

	public String text(LEntity element) {
		return element.getName();
	}

	public Object text(LOperation element) {
		JvmOperation inferredOperation = getFirstOrNull(
				associations.getJvmElements(element), JvmOperation.class);
		return signature(element.getName(), inferredOperation);
	}

	public String text(LProperty element) {
		JvmField inferredField = getFirstOrNull(
				associations.getJvmElements(element), JvmField.class);
		if (inferredField != null) {
			JvmTypeReference type = inferredField.getType();
			if (type != null) {
				return element.getName() + " : " + type.getSimpleName();
			}
		}
		return element.getName();
	}

	public String text(LRefers element) {
		JvmField inferredField = getFirstOrNull(
				associations.getJvmElements(element), JvmField.class);
		if (inferredField != null) {
			JvmTypeReference type = inferredField.getType();
			if (type != null) {
				return element.getName() + " : " + type.getSimpleName()
						+ " [refers]";
			}
		}
		return element.getName();
	}

	public String text(LContains element) {
		JvmField inferredField = getFirstOrNull(
				associations.getJvmElements(element), JvmField.class);
		if (inferredField != null) {
			JvmTypeReference type = inferredField.getType();
			if (type != null) {
				return element.getName() + " : " + type.getSimpleName()
						+ " [contains]";
			}
		}
		return element.getName();
	}

	public String text(LContainer element) {
		JvmField inferredField = getFirstOrNull(
				associations.getJvmElements(element), JvmField.class);
		if (inferredField != null) {
			JvmTypeReference type = inferredField.getType();
			if (type != null) {
				return element.getName() + " : " + type.getSimpleName()
						+ " [container]";
			}
		}
		return element.getName();
	}

	public String text(LEmbedds element) {
		JvmField inferredField = getFirstOrNull(
				associations.getJvmElements(element), JvmField.class);
		if (inferredField != null) {
			JvmTypeReference type = inferredField.getType();
			if (type != null) {
				return element.getName() + " : " + type.getSimpleName()
						+ " [embedds]";
			}
		}
		return element.getName();
	}

	public String text(JvmParameterizedTypeReference typeRef) {
		return typeRef.getType().getSimpleName();
	}

	protected <T> T getFirstOrNull(Iterable<EObject> elements, Class<T> type) {
		Iterator<T> iterator = filter(elements, type).iterator();
		return iterator.hasNext() ? iterator.next() : null;
	}
}
