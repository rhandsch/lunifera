/**
 */
package org.lunifera.metamodel.behavior.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import org.lunifera.metamodel.behavior.BehaviorPackage;
import org.lunifera.metamodel.behavior.EmbedderDefinition;

/**
 * This is the item provider adapter for a {@link org.lunifera.metamodel.behavior.EmbedderDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EmbedderDefinitionItemProvider
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
	public EmbedderDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addUsingStepsPropertyDescriptor(object);
			addStoriesToRunPropertyDescriptor(object);
			addGenerateViewAfterStoriesPropertyDescriptor(object);
			addIgnoreFailureInStoriesPropertyDescriptor(object);
			addIgnoreFailureInViewPropertyDescriptor(object);
			addVerboseFailuresPropertyDescriptor(object);
			addStoryTimeoutInSecsPropertyDescriptor(object);
			addThreadsPropertyDescriptor(object);
			addMetaFiltersPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Using Steps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsingStepsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EmbedderDefinition_usingSteps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EmbedderDefinition_usingSteps_feature", "_UI_EmbedderDefinition_type"),
				 BehaviorPackage.Literals.EMBEDDER_DEFINITION__USING_STEPS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stories To Run feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStoriesToRunPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EmbedderDefinition_storiesToRun_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EmbedderDefinition_storiesToRun_feature", "_UI_EmbedderDefinition_type"),
				 BehaviorPackage.Literals.EMBEDDER_DEFINITION__STORIES_TO_RUN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate View After Stories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateViewAfterStoriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EmbedderDefinition_generateViewAfterStories_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EmbedderDefinition_generateViewAfterStories_feature", "_UI_EmbedderDefinition_type"),
				 BehaviorPackage.Literals.EMBEDDER_DEFINITION__GENERATE_VIEW_AFTER_STORIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ignore Failure In Stories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoreFailureInStoriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EmbedderDefinition_ignoreFailureInStories_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EmbedderDefinition_ignoreFailureInStories_feature", "_UI_EmbedderDefinition_type"),
				 BehaviorPackage.Literals.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_STORIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ignore Failure In View feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoreFailureInViewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EmbedderDefinition_ignoreFailureInView_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EmbedderDefinition_ignoreFailureInView_feature", "_UI_EmbedderDefinition_type"),
				 BehaviorPackage.Literals.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_VIEW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Verbose Failures feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerboseFailuresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EmbedderDefinition_verboseFailures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EmbedderDefinition_verboseFailures_feature", "_UI_EmbedderDefinition_type"),
				 BehaviorPackage.Literals.EMBEDDER_DEFINITION__VERBOSE_FAILURES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Story Timeout In Secs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStoryTimeoutInSecsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EmbedderDefinition_storyTimeoutInSecs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EmbedderDefinition_storyTimeoutInSecs_feature", "_UI_EmbedderDefinition_type"),
				 BehaviorPackage.Literals.EMBEDDER_DEFINITION__STORY_TIMEOUT_IN_SECS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Threads feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThreadsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EmbedderDefinition_threads_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EmbedderDefinition_threads_feature", "_UI_EmbedderDefinition_type"),
				 BehaviorPackage.Literals.EMBEDDER_DEFINITION__THREADS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meta Filters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetaFiltersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EmbedderDefinition_metaFilters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EmbedderDefinition_metaFilters_feature", "_UI_EmbedderDefinition_type"),
				 BehaviorPackage.Literals.EMBEDDER_DEFINITION__META_FILTERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EmbedderDefinition_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EmbedderDefinition_name_feature", "_UI_EmbedderDefinition_type"),
				 BehaviorPackage.Literals.EMBEDDER_DEFINITION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EmbedderDefinition_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EmbedderDefinition_id_feature", "_UI_EmbedderDefinition_type"),
				 BehaviorPackage.Literals.EMBEDDER_DEFINITION__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EmbedderDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EmbedderDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EmbedderDefinition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EmbedderDefinition_type") :
			getString("_UI_EmbedderDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(EmbedderDefinition.class)) {
			case BehaviorPackage.EMBEDDER_DEFINITION__GENERATE_VIEW_AFTER_STORIES:
			case BehaviorPackage.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_STORIES:
			case BehaviorPackage.EMBEDDER_DEFINITION__IGNORE_FAILURE_IN_VIEW:
			case BehaviorPackage.EMBEDDER_DEFINITION__VERBOSE_FAILURES:
			case BehaviorPackage.EMBEDDER_DEFINITION__STORY_TIMEOUT_IN_SECS:
			case BehaviorPackage.EMBEDDER_DEFINITION__THREADS:
			case BehaviorPackage.EMBEDDER_DEFINITION__META_FILTERS:
			case BehaviorPackage.EMBEDDER_DEFINITION__NAME:
			case BehaviorPackage.EMBEDDER_DEFINITION__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
