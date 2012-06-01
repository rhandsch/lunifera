/**
 */
package org.lunifera.metamodel.entity.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.xtext.common.types.TypesFactory;

import org.eclipse.xtext.xbase.XbaseFactory;

import org.lunifera.metamodel.entity.EntityPackage;
import org.lunifera.metamodel.entity.Operation;

/**
 * This is the item provider adapter for a {@link org.lunifera.metamodel.entity.Operation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationItemProvider
	extends FeatureItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EntityPackage.Literals.OPERATION__PARAMS);
			childrenFeatures.add(EntityPackage.Literals.OPERATION__BODY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Operation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Operation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Operation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Operation_type") :
			getString("_UI_Operation_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Operation.class)) {
			case EntityPackage.OPERATION__PARAMS:
			case EntityPackage.OPERATION__BODY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__PARAMS,
				 TypesFactory.eINSTANCE.createJvmFormalParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXClosure()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXCastedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXUnaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXDoWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXThrowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXTryCatchFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(EntityPackage.Literals.OPERATION__BODY,
				 XbaseFactory.eINSTANCE.createXReturnExpression()));
	}

}
