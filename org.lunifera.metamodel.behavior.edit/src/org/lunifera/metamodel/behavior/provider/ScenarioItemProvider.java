/**
 */
package org.lunifera.metamodel.behavior.provider;


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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.lunifera.metamodel.behavior.BehaviorFactory;
import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.Scenario;

/**
 * This is the item provider adapter for a {@link org.lunifera.metamodel.behavior.Scenario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioItemProvider
	extends ItemProviderAdapter
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
	public ScenarioItemProvider(AdapterFactory adapterFactory) {
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

			addTitlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scenario_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_title_feature", "_UI_Scenario_type"),
				 BehaviorPackage.Literals.SCENARIO__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(BehaviorPackage.Literals.SCENARIO__GIVEN_STORIES);
			childrenFeatures.add(BehaviorPackage.Literals.SCENARIO__EXAMPLES);
			childrenFeatures.add(BehaviorPackage.Literals.SCENARIO__STEPS);
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
	 * This returns Scenario.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Scenario"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Scenario)object).getTitle();
		return label == null || label.length() == 0 ?
			getString("_UI_Scenario_type") :
			getString("_UI_Scenario_type") + " " + label;
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

		switch (notification.getFeatureID(Scenario.class)) {
			case BehaviorPackage.SCENARIO__TITLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BehaviorPackage.SCENARIO__GIVEN_STORIES:
			case BehaviorPackage.SCENARIO__EXAMPLES:
			case BehaviorPackage.SCENARIO__STEPS:
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
				(BehaviorPackage.Literals.SCENARIO__GIVEN_STORIES,
				 BehaviorFactory.eINSTANCE.createGivenStories()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SCENARIO__EXAMPLES,
				 BehaviorFactory.eINSTANCE.createExamplesTable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SCENARIO__STEPS,
				 BehaviorFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SCENARIO__STEPS,
				 BehaviorFactory.eINSTANCE.createGiven()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SCENARIO__STEPS,
				 BehaviorFactory.eINSTANCE.createWhen()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SCENARIO__STEPS,
				 BehaviorFactory.eINSTANCE.createThen()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SCENARIO__STEPS,
				 BehaviorFactory.eINSTANCE.createStepLink()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SCENARIO__STEPS,
				 BehaviorFactory.eINSTANCE.createGivenLink()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SCENARIO__STEPS,
				 BehaviorFactory.eINSTANCE.createWhenLink()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SCENARIO__STEPS,
				 BehaviorFactory.eINSTANCE.createThenLink()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SCENARIO__STEPS,
				 BehaviorFactory.eINSTANCE.createAndLink()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LuniferabehaviormodelEditPlugin.INSTANCE;
	}

}
