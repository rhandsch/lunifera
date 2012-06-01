/**
 */
package org.lunifera.metamodel.organization.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.lunifera.metamodel.common.provider.AbstractDescribedClassItemProvider;

import org.lunifera.metamodel.organization.Organization;
import org.lunifera.metamodel.organization.OrganizationFactory;
import org.lunifera.metamodel.organization.OrganizationPackage;

/**
 * This is the item provider adapter for a {@link org.lunifera.metamodel.organization.Organization} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationItemProvider
	extends AbstractDescribedClassItemProvider
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
	public OrganizationItemProvider(AdapterFactory adapterFactory) {
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

			addPartnersPropertyDescriptor(object);
			addMainContactPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Partners feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartnersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Organization_partners_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Organization_partners_feature", "_UI_Organization_type"),
				 OrganizationPackage.Literals.ORGANIZATION__PARTNERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Main Contact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMainContactPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Organization_mainContact_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Organization_mainContact_feature", "_UI_Organization_type"),
				 OrganizationPackage.Literals.ORGANIZATION__MAIN_CONTACT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(OrganizationPackage.Literals.ORGANIZATION__UNITS);
			childrenFeatures.add(OrganizationPackage.Literals.ORGANIZATION__PERSONS);
			childrenFeatures.add(OrganizationPackage.Literals.ORGANIZATION__WORKERS);
			childrenFeatures.add(OrganizationPackage.Literals.ORGANIZATION__ROLES);
			childrenFeatures.add(OrganizationPackage.Literals.ORGANIZATION__UNIT_TYPES);
			childrenFeatures.add(OrganizationPackage.Literals.ORGANIZATION__SECURITY_REALMS);
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
	 * This returns Organization.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Organization"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Organization)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Organization_type") :
			getString("_UI_Organization_type") + " " + label;
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

		switch (notification.getFeatureID(Organization.class)) {
			case OrganizationPackage.ORGANIZATION__UNITS:
			case OrganizationPackage.ORGANIZATION__PERSONS:
			case OrganizationPackage.ORGANIZATION__WORKERS:
			case OrganizationPackage.ORGANIZATION__ROLES:
			case OrganizationPackage.ORGANIZATION__UNIT_TYPES:
			case OrganizationPackage.ORGANIZATION__SECURITY_REALMS:
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
				(OrganizationPackage.Literals.ORGANIZATION__UNITS,
				 OrganizationFactory.eINSTANCE.createUnit()));

		newChildDescriptors.add
			(createChildParameter
				(OrganizationPackage.Literals.ORGANIZATION__PERSONS,
				 OrganizationFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(OrganizationPackage.Literals.ORGANIZATION__WORKERS,
				 OrganizationFactory.eINSTANCE.createWorker()));

		newChildDescriptors.add
			(createChildParameter
				(OrganizationPackage.Literals.ORGANIZATION__ROLES,
				 OrganizationFactory.eINSTANCE.createBusinessRole()));

		newChildDescriptors.add
			(createChildParameter
				(OrganizationPackage.Literals.ORGANIZATION__UNIT_TYPES,
				 OrganizationFactory.eINSTANCE.createUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(OrganizationPackage.Literals.ORGANIZATION__SECURITY_REALMS,
				 OrganizationFactory.eINSTANCE.createSecurityRealm()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LuniferaorganizationmodelEditPlugin.INSTANCE;
	}

}
