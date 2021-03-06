/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.dsl.entity.jvmmodel.services.entity

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.lunifera.metamodel.dsl.entity.extensions.ModelExtensions
import org.lunifera.metamodel.dsl.entity.jvmmodel.services.IOperationContentCompiler
import org.lunifera.metamodel.entity.entitymodel.LCompilerType
import org.lunifera.metamodel.entity.entitymodel.LContainer
import org.lunifera.metamodel.entity.entitymodel.LContains
import org.lunifera.metamodel.entity.entitymodel.LEmbedds
import org.lunifera.metamodel.entity.entitymodel.LEntity
import org.lunifera.metamodel.entity.entitymodel.LGenSettings
import org.lunifera.metamodel.entity.entitymodel.LProperty
import org.lunifera.metamodel.entity.entitymodel.LReference
import org.lunifera.metamodel.entity.entitymodel.LRefers

class PojoOperationsGenerator implements IOperationContentCompiler {
	
	@Inject extension ModelExtensions
	
	override isResponsible(LCompilerType compilerType) {
		return compilerType == null || compilerType.name == null || compilerType.name.equals("")
				|| compilerType.compilesToPojoModel
	}
	
	/**
	 * 
	 */
	override createLazy_toMany_ReferenceContainer_Documentantion(LReference ref)'''
	Ensures that the list of «ref.name.toFirstLower» is created. It will be instantiated 
	lazy.'''
	
	/**
	 * 
	 */
	override createLazy_toMany_ReferenceContainer_Content(LReference ref, String fieldName)'''
	if (this.«fieldName» == null) {
		this.«fieldName» = new java.util.ArrayList<«ref.type.name»>();
	}'''
	
	override createLazy_toMany_PropertyContainer_Documentantion(LProperty prop)'''
	Ensures that the list of «prop.name.toFirstLower» is created. It will be instantiated 
	lazy.'''
	
	override createLazy_toMany_PropertyContainer_Content(LProperty prop, String fieldName)'''
	if (this.«fieldName» == null) {
		this.«fieldName» = new java.util.ArrayList<«prop.type.simpleName»>();
	}'''
	
	/**
	 * 
	 */
	override get_toOne_Property_Documentantion(LProperty property, String fieldName, LGenSettings setting)'''
	Returns the «fieldName» property or <code>null</code> if not present.

	@return «fieldName»'''
	
	/**
	 * 
	 */
	override get_toOne_Property_OperationContent(LProperty property, String fieldName, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	return this.«fieldName»;'''
	
	/**
	 * 
	 */
	override get_toOne_Reference_Documentantion(LReference ref, String fieldName, LGenSettings setting)'''
	Returns the «fieldName» reference or <code>null</code> if not present.

	@return «fieldName»'''
	
		/**
	 * 
	 */
	override get_toOne_Reference_OperationContent(LReference ref, String fieldName, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	return this.«fieldName»;'''
	 
	/**
	 * 
	 */
	override set_toOne_Property_Documentantion(LProperty property, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	Sets the «localVarName» property to this instance.

	@param «localVarName»'''
	
	/**
	 * 
	 */
	override set_toOne_Property_OperationContent(LProperty ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	this.«fieldName» = «localVarName»;'''
	
	/**
	 * 
	 */
	override set_toOne_Refers_Documentantion(LRefers ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	Sets the «localVarName» reference to this instance.

	@param «localVarName»'''
	
	/**
	 * 
	 */
	override set_toOne_Container_Documentantion(LContainer ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	Sets the «ref.name.toFirstLower» reference to this instance.
	
	«IF ref.opposite != null»
	Since the reference is a container reference, the opposite reference («ref.type.name».«ref.opposite.name.toFirstLower») 
	of the «localVarName» will be handled automatically and no further coding is required to keep them in sync. 
	See {@link «ref.type.name»#set«ref.opposite.name.toFirstUpper»(«ref.type.name»)}.
	«ELSE»
	ATTENTION:<br>
	The reference is a container reference, but no opposite is available.
	So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
	is set properly.
	«ENDIF»

	@param «localVarName»'''
	
	/**
	 * 
	 */
	override set_toOne_Container_OperationContent(LContainer ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	«IF ref.opposite != null»
	if (setting«fieldName.toFirstUpper») {
		// avoid loops
		return;
	}
	«ENDIF»
	
	«ref.type.name» old«fieldName.toFirstUpper» = this.«fieldName»;

	// if the parent does not change, we can leave
	if (old«fieldName.toFirstUpper» == «localVarName») {
		return;
	}

	«IF ref.opposite != null»
	try {
	// avoid loops
	setting«fieldName.toFirstUpper» = true;
		«IF ref.opposite.toMany»
			// First remove the element
			if (old«fieldName.toFirstUpper» != null) {
				old«fieldName.toFirstUpper».remove«ref.opposite.name.toFirstUpper»(this);
			}
			
			// Then assign the new value
			this.«fieldName» = «localVarName»;
			
			// Then add 'this' to the new value
			if (this.«fieldName» != null) {
				this.«fieldName».add«ref.opposite.name.toFirstUpper»(this);
			}
		«ELSE»
			// First remove the element
			if (old«fieldName.toFirstUpper» != null) {
				old«fieldName.toFirstUpper».set«ref.opposite.name.toFirstUpper»(null);
			}
			
			// Then assign the new value
			this.«fieldName» = «localVarName»;
			
			// Then add 'this' to the new value
			if (this.«fieldName» != null) {
				this.«fieldName».set«ref.opposite.name.toFirstUpper»(this);
			}
		«ENDIF»
	} finally {
		setting«fieldName.toFirstUpper» = false;
	}
	«ELSE»
	// Assign the new value
	this.«fieldName» = «localVarName»;
	«ENDIF»'''
	
	/**
	 * 
	 */
	override set_toOne_Containment_Documentantion(LContains ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	Sets the «ref.name.toFirstLower» reference to this instance.
	
	«IF ref.opposite != null»
	Since the reference is a containment reference, the opposite reference («ref.type.name».«ref.opposite.name.toFirstLower») 
	of the «localVarName» will be handled automatically and no further coding is required to keep them in sync. 
	See {@link «ref.type.name»#set«ref.opposite.name.toFirstUpper»(«ref.type.name»)}.
	«ELSE»
	ATTENTION:<br>
	The reference is a containment reference, but no opposite is available.
	So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
	is set properly.
	«ENDIF»

	@param «localVarName»'''
	
	/**
	 * 
	 */
	override set_toOne_Containment_OperationContent(LContains ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	«IF ref.opposite != null»
	if (setting«fieldName.toFirstUpper») {
		// avoid loops
		return;
	}
	«ENDIF»
	
	«ref.type.name» old«fieldName.toFirstUpper» = this.«fieldName»;

	// if the parent does not change, we can leave
	if (old«fieldName.toFirstUpper» == «localVarName») {
		return;
	}
	
	«IF ref.opposite != null»
	try {
		// avoid loops
		setting«fieldName.toFirstUpper» = true;

		// First remove the element
		if (old«fieldName.toFirstUpper» != null) {
			old«fieldName.toFirstUpper».set«ref.opposite.name.toFirstUpper»(null);
		}
		
		// Then assign the new value
		this.«fieldName» = «localVarName»;
		
		// Then add 'this' to the new value
		if (this.«fieldName» != null) {
			this.«fieldName».set«ref.opposite.name.toFirstUpper»(this);
		}
	} finally {
		setting«fieldName.toFirstUpper» = false;
	}
	«ELSE»
	// Assign the new value
	this.«fieldName» = «localVarName»;
	«ENDIF»'''
	
	/**
	 * 
	 */
	override set_toOne_Refers_OperationContent(LRefers ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	this.«fieldName» = «localVarName»;'''
	
	/**
	 * 
	 */
	override get_toMany_Reference_Documentantion(LReference ref, String fieldName, LGenSettings setting)'''
	Returns an unmodifiable list of «fieldName».
	
	@return «fieldName»'''
	
	/**
	 * 
	 */
	override get_toMany_Reference_OperationContent(LReference ref, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	ensure«fieldName.toFirstUpper»();
	return java.util.Collections.unmodifiableList(this.«fieldName»);'''
	
	override get_toMany_Property_Documentantion(LProperty prop, String fieldName, LGenSettings setting)'''
	Returns an unmodifiable list of «fieldName».
	
	@return «fieldName»'''
	
	
	override get_toMany_Property_OperationContent(LProperty prop, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	ensure«fieldName.toFirstUpper»();
	return java.util.Collections.unmodifiableList(this.«fieldName»);'''
	
	/** 
	 * 
	 */
	override add_toMany_Refers_Documentantion(LRefers ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	Adds the given «localVarName» to this object. <p>

	@param «localVarName»'''
	
	/**
	 * 
	 */
	override add_toMany_Refers_OperationContent(LRefers ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»	
	// If «localVarName» is null, we do not add it
	if(«localVarName»==null){
		return;
	}

	ensure«fieldName.toFirstUpper»();

	// Adds the parameter to the list
	if(!this.«fieldName».contains(«localVarName»)){
		this.«fieldName».add(«localVarName»);
	}'''
	
	
	override add_toMany_Property_Documentantion(LProperty prop, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting) '''
	Adds the given «localVarName» to this object. <p>

	@param «localVarName»'''
	
	override add_toMany_Property_OperationContent(LProperty prop, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»	
	// If «localVarName» is null, we do not add it
	if(«localVarName»==null){
		return;
	}

	ensure«fieldName.toFirstUpper»();

	// Adds the parameter to the list
	if(!this.«fieldName».contains(«localVarName»)){
		this.«fieldName».add(«localVarName»);
	}'''
	
	
	/** 
	 * 
	 */
	override remove_toMany_Refers_Documentantion(LRefers ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	Removes the given «localVarName» from this object.
	
	@param «localVarName»'''
	
	/**
	 * 
	 */
	override remove_toMany_Refers_OperationContent(LRefers ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	// If «localVarName» or the «fieldName» are null, we can leave
	if(«localVarName»==null || this.«fieldName»==null){
		return;
	}

	this.«fieldName».remove(«localVarName»);'''
	
	
	override remove_toMany_Property_Documentantion(LProperty prop, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	Removes the given «localVarName» from this object.
	
	@param «localVarName»'''
	
	override remove_toMany_Property_OperationContent(LProperty prop, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	// If «localVarName» or the «fieldName» are null, we can leave
	if(«localVarName»==null || this.«fieldName»==null){
		return;
	}

	this.«fieldName».remove(«localVarName»);'''
	
	/** 
	 * 
	 */
	override add_toMany_Containmant_Documentantion(LContains ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	Adds the given «localVarName» to this object. <p>
	«IF ref.opposite != null»
	Since the reference is a containment reference, the opposite reference («ref.type.name».«ref.opposite.name.toFirstLower») 
	of the «localVarName» will be handled automatically and no further coding is required to keep them in sync. 
	See {@link «ref.type.name»#set«ref.opposite.name.toFirstUpper»(«ref.type.name»)}.
	«ELSE»
	ATTENTION:<br>
	The reference is a containment reference, but no opposite is available.
	So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
	is set properly.
	«ENDIF»

	@param «localVarName»'''
	
	/**
	 * 
	 */
	override add_toMany_Containmant_OperationContent(LContains ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	«IF ref.opposite != null»
	if (setting«fieldName.toFirstUpper») {
		// avoid loops
		return;
	}
	«ENDIF»
	
	// If «localVarName» is null, we do not add it
	if(«localVarName»==null){
	    return;
	}
	
	«IF ref.opposite != null»
	try{
		setting«fieldName.toFirstUpper» = true;

		ensure«fieldName.toFirstUpper»();

		// Adds the parameter to the list
		if(!this.«fieldName».contains(«localVarName»)){
	    	this.«fieldName».add(«localVarName»);
	
			// Set 'this' as the parent of the containment reference to the «localVarName»
			«localVarName».set«ref.opposite.name.toFirstUpper»(this);
		}
	} finally {
		setting«fieldName.toFirstUpper» = false;
	}
	«ELSE»
	ensure«fieldName.toFirstUpper»();
	
	// Adds the parameter to the list
	if(!this.«fieldName».contains(«localVarName»)){
		this.«fieldName».add(«localVarName»);
	}
	«ENDIF»'''
    
	/** 
	 * 
	 */
	override remove_toMany_Containmant_Documentantion(LContains ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	Removes the given «localVarName» from this object. <p>
	«IF ref.opposite != null»
	Since the reference is a containment reference, the opposite reference («ref.type.name».«ref.opposite.name.toFirstLower») 
	of the «localVarName» will be handled automatically and no further coding is required to keep them in sync. 
	See {@link «ref.type.name»#set«ref.opposite.name.toFirstUpper»(«ref.type.name»)}.
	«ELSE»
	ATTENTION:<br>
	The reference is a containment reference, but no opposite is available.
	So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
	is set properly.
	«ENDIF»

	@param «localVarName»'''
	
	/**
	 * 
	 */
	override remove_toMany_Containmant_OperationContent(LContains ref, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting)'''
	«IF setting.lifecycleHandling»
	checkDisposed();
	
	«ENDIF»
	// If the parameter or the field are null, we can leave
	if («localVarName» == null || this.«fieldName» == null) {
		return;
	}

	// if the «localVarName» is not contained, then we can leave
	if (!this.«fieldName».contains(«localVarName»)) {
		return;
	}

	// Removes the parameter from the field
	this.«fieldName».remove(«localVarName»);
	«IF ref.opposite != null»
	// Unset the parent of the containment reference from the «localVarName»
	«localVarName».set«ref.opposite.name.toFirstUpper»(null);
	«ENDIF»'''
	
	/**
	 * 
	 */
	override isDisposed_Documentantion(LEntity lEntity)'''
	Returns true, if the object is disposed. Disposed means, that it is
	prepared for garbage collection and may not be used anymore. Accessing
	objects that are already disposed will cause runtime exceptions.
	
	@return true if the object is disposed and false otherwise'''
	
	override isDisposed_OperationContent(LEntity lEntity)'''
	 return this.disposed;'''
	
	/**
	 * 
	 */
	override checkDisposed_Documentantion(LEntity lEntity)'''
	Checks whether the object is disposed.
	
	@throws RuntimeException if the object is disposed.
	'''
	
	/**
	 * 
	 */
	override checkDisposed_OperationContent(LEntity lEntity)'''
	if (isDisposed()) {
		throw new RuntimeException(String.format(
				"Object already disposed: {}", this.toString()));
	}
	'''
	
   	def isLifecycleHandling(LGenSettings settings){
   		return settings != null && settings.lifecycle
   	}
   	
	/**
	 * 
	 */
	override dispose_Documentantion(LEntity lEntity)'''
	Calling dispose will destroy that instance. The internal state will be 
	set to 'disposed' and methods of that object must not be used anymore. 
	Each call will result in runtime exceptions.<br>
	If this object keeps containment references, these will be disposed too. 
	So the whole containment tree will be disposed on calling this method.
	'''
	
	/**
	 * 
	 */
	override dispose_OperationContent(LEntity entity)'''
	if(isDisposed()){
		return;
	}
	
	«IF entity.entityMembers.filter(typeof(LContains)).size > 0»
		try{
			// dispose all the containment references
			«FOR LContains contains : entity.entityMembers.filter(typeof(LContains))»
			«IF contains.toMany»
			if(this.«contains.name.toFirstLower» != null){
				for(«contains.type.name.toFirstUpper» «contains.type.name.toFirstLower» : this.«contains.name.toFirstLower»){
					«contains.type.name.toFirstLower».dispose();
				}
				this.«contains.name.toFirstLower» = null;
			}
			«ELSE»
			if(this.«contains.name.toFirstLower» != null){
				this.«contains.name.toFirstLower».dispose();
				this.«contains.name.toFirstLower» = null;
			}
			«ENDIF»
			«ENDFOR»
		} finally {
			«IF entity.superType != null»
			super.dispose();
			«ELSE»
			disposed = true;
			«ENDIF»
		}
	«ELSE»
		«IF entity.superType != null»
		super.dispose();
		«ELSE»
		disposed = true;
		«ENDIF»
	«ENDIF»'''


	override get_toOne_Embedds_Documentantion(LEmbedds embedds, String fieldName, LGenSettings setting) {
		// not used for entity model
	}
	
	override get_toOne_Embedds_OperationContent(LEmbedds embedds, String fieldName, LGenSettings setting) {
		// not used for entity model
	}
	
	override set_toOne_Embedds_Documentantion(LEmbedds embedds, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting) {
		// not used for entity model
	}
	
	override set_toOne_Embedds_OperationContent(LEmbedds embedds, String localVarName, String fieldName, JvmTypeReference typeRef, LGenSettings setting) {
		// not used for entity model
	}
	
}



