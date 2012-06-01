/**
 */
package org.lunifera.metamodel.behavior.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.lunifera.metamodel.common.provider.LuniferacommommodelEditPlugin;

import org.lunifera.metamodel.knowledge.provider.LuniferaknowledgemodelEditPlugin;

import org.lunifera.metamodel.organization.provider.LuniferaorganizationmodelEditPlugin;

import org.lunifera.metamodel.software.provider.LuniferacomponentsoftwaremodelEditPlugin;

/**
 * This is the central singleton for the Lunifera-behavior-model edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class LuniferabehaviormodelEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LuniferabehaviormodelEditPlugin INSTANCE = new LuniferabehaviormodelEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuniferabehaviormodelEditPlugin() {
		super
		  (new ResourceLocator [] {
		     LuniferacommommodelEditPlugin.INSTANCE,
		     LuniferacomponentsoftwaremodelEditPlugin.INSTANCE,
		     LuniferaknowledgemodelEditPlugin.INSTANCE,
		     LuniferaorganizationmodelEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
