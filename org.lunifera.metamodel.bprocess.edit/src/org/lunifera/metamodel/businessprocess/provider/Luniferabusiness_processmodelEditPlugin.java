/**
 */
package org.lunifera.metamodel.businessprocess.provider;

import org.eclipse.bpmn2.provider.Bpmn2EditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.lunifera.metamodel.common.provider.LuniferacommommodelEditPlugin;

import org.lunifera.metamodel.knowledge.provider.LuniferaknowledgemodelEditPlugin;

import org.lunifera.metamodel.organization.provider.LuniferaorganizationmodelEditPlugin;

/**
 * This is the central singleton for the Lunifera-business_process-model edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Luniferabusiness_processmodelEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Luniferabusiness_processmodelEditPlugin INSTANCE = new Luniferabusiness_processmodelEditPlugin();

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
	public Luniferabusiness_processmodelEditPlugin() {
		super
		  (new ResourceLocator [] {
		     Bpmn2EditPlugin.INSTANCE,
		     LuniferacommommodelEditPlugin.INSTANCE,
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
