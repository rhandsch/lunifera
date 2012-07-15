package org.lunifera.metamodel.dsl.entity.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.lunifera.metamodel.dsl.entity.entitymodel.LContainer
import org.lunifera.metamodel.dsl.entity.entitymodel.LContains
import org.lunifera.metamodel.dsl.entity.entitymodel.LProperty
import org.lunifera.metamodel.dsl.entity.entitymodel.LReference

class OperationsGenerator {
	
	@Inject extension ModelExtensions
	
	/**
	 * 
	 */
	def ensureReferenceDocumentantion(LReference ref)'''
	Ensures that the list of «ref.name.toFirstLower» is created. It will be instantiated 
	lazy.'''
	
	/**
	 * 
	 */
	def ensureReferenceOperationContent(LReference ref, String fieldName)'''
	if (this.«fieldName» == null) {
		this.«fieldName» = new java.util.ArrayList<«ref.type.name»>();
	}'''
	
	/**
	 * 
	 */
	def get_toOne_Property_Documentantion(LProperty property, String propertyName)'''
	Returns the «propertyName» property or <code>null</code> if not present.

	@return «propertyName»'''
	
	/**
	 * 
	 */
	def get_toOne_Reference_Documentantion(LReference ref, String propertyName)'''
	Returns the «propertyName» reference or <code>null</code> if not present.

	@return «propertyName»'''
	
	/**
	 * 
	 */
	def set_toOne_Propertey_Documentantion(LProperty property, String propertyName)'''
	Sets the «propertyName» property to this instance.

	@param «propertyName»'''
	
	/**
	 * 
	 */
	def set_toOne_Reference_Documentantion(LReference ref, String propertyName)'''
	Sets the «propertyName» reference to this instance.

	@param «propertyName»'''
	
	/**
	 * 
	 */
	def set_toOne_Container_Documentantion(LContainer ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
	Sets the «ref.name.toFirstLower» reference to this instance.
	
	«IF ref.opposite != null»
	Since the reference is a container reference, the opposite reference («ref.type.name».«ref.opposite.name.toFirstLower») 
	of the «propertyName» will be handled automatically and no further coding is required to keep them in sync. 
	See {@link «ref.type.name»#set«ref.opposite.name.toFirstUpper»(«ref.type.name»)}.
	«ELSE»
	ATTENTION:<br>
	The reference is defined as a container reference, but no opposite is available.
	So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
	is set properly.
	«ENDIF»

	@param «ref.name.toFirstLower»'''
	
	/**
	 * 
	 */
	def set_toOne_Container_OperationContent(LContainer ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
	«IF ref.opposite != null»
	if (setting«fieldName.toFirstUpper») {
		// avoid loops
		return;
	}
	«ENDIF»
	
	«ref.type.name» old«fieldName.toFirstUpper» = this.«fieldName»;

	// if the parent does not change, we can leave
	if (old«fieldName.toFirstUpper» == «fieldName») {
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
			this.«fieldName» = «fieldName»;
			
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
			this.«fieldName» = «fieldName»;
			
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
	this.«fieldName» = «fieldName»;
	«ENDIF»'''
	
	/**
	 * 
	 */
	def set_toOne_Containment_Documentantion(LContains ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
	Sets the «ref.name.toFirstLower» reference to this instance.
	
	«IF ref.opposite != null»
	Since the reference is a containment reference, the opposite reference («ref.type.name».«ref.opposite.name.toFirstLower») 
	of the «propertyName» will be handled automatically and no further coding is required to keep them in sync. 
	See {@link «ref.type.name»#set«ref.opposite.name.toFirstUpper»(«ref.type.name»)}.
	«ELSE»
	ATTENTION:<br>
	The reference is defined as a containment reference, but no opposite is available.
	So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
	is set properly.
	«ENDIF»

	@param «ref.name.toFirstLower»'''
	
	/**
	 * 
	 */
	def set_toOne_Containment_OperationContent(LContains ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
	«IF ref.opposite != null»
	if (setting«fieldName.toFirstUpper») {
		// avoid loops
		return;
	}
	«ENDIF»
	
	«ref.type.name» old«fieldName.toFirstUpper» = this.«fieldName»;

	// if the parent does not change, we can leave
	if (old«fieldName.toFirstUpper» == «fieldName») {
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
		this.«fieldName» = «fieldName»;
		
		// Then add 'this' to the new value
		if (this.«fieldName» != null) {
			this.«fieldName».set«ref.opposite.name.toFirstUpper»(this);
		}
	} finally {
		setting«fieldName.toFirstUpper» = false;
	}
	«ELSE»
	// Assign the new value
	this.«fieldName» = «fieldName»;
	«ENDIF»'''
	
	/**
	 * 
	 */
	def set_toOne_Reference_Documentantion(LReference ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
	Sets the «propertyName» reference to this instance.
	
	@param «propertyName»'''
	
	/**
	 * 
	 */
	def set_toOne_Reference_OperationContent(LReference ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
	this.«fieldName» = «propertyName»;'''
	
	/**
	 * 
	 */
	def get_toMany_Reference_Documentantion(LReference ref, String propertyName)'''
	Returns an unmodifiable list of «propertyName».
	
	@return «propertyName»'''
	
	/**
	 * 
	 */
	def get_toMany_Reference_OperationContent(LReference ref, String fieldName, JvmTypeReference typeRef)'''
	ensure«fieldName.toFirstUpper»();
	return java.util.Collections.unmodifiableList(this.«fieldName»);'''
	
	/** 
	 * 
	 */
	def add_toMany_Reference_Documentantion(LReference ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
	Adds the given «propertyName» to this object. <p>

	@param «propertyName»'''
	
	/**
	 * 
	 */
	def add_toMany_Reference_OperationContent(LReference ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
    // If «propertyName» is null, we do not add it
    if(«propertyName»==null){
        return;
    }
    
    ensure«fieldName.toFirstUpper»();

    // Adds the parameter to the list
    if(!this.«fieldName».contains(«propertyName»)){
        this.«fieldName».add(«propertyName»);
    }'''
	
	/** 
	 * 
	 */
	def remove_toMany_Reference_Documentantion(LReference ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
	Removes the given «propertyName» from this object.
	
	@param «propertyName»'''
	
	/**
	 * 
	 */
	def remove_toMany_Reference_OperationContent(LReference ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
    // If «propertyName» or the «fieldName» are null, we can leave
    if(«propertyName»==null || «fieldName»==null){
        return;
    }
    
    this.«fieldName».remove(«propertyName»);'''
	
	/** 
	 * 
	 */
	def add_toMany_Containmant_Documentantion(LContains ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
	Adds the given «propertyName» to this object. <p>
	«IF ref.opposite != null»
	Since the reference is a containment reference, the opposite reference («ref.type.name».«ref.opposite.name.toFirstLower») 
	of the «propertyName» will be handled automatically and no further coding is required to keep them in sync. 
	See {@link «ref.type.name»#set«ref.opposite.name.toFirstUpper»(«ref.type.name»)}.
	«ELSE»
	ATTENTION:<br>
	The reference is defined as a containment reference, but no opposite is available.
	So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
	is set properly.
	«ENDIF»

	@param «propertyName»'''
	
	/**
	 * 
	 */
	def add_toMany_Containmant_OperationContent(LContains ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
	«IF ref.opposite != null»
	if (setting«fieldName.toFirstUpper») {
		// avoid loops
		return;
	}
	«ENDIF»
	
	// If «propertyName» is null, we do not add it
	if(«propertyName»==null){
	    return;
	}
	
	«IF ref.opposite != null»
	try{
		setting«fieldName.toFirstUpper» = true;

		ensure«fieldName.toFirstUpper»();

		// Adds the parameter to the list
		if(!this.«fieldName».contains(«propertyName»)){
	    	this.«fieldName».add(«propertyName»);
	
			// Set 'this' as the parent of the containment reference to the «propertyName»
			«propertyName».set«ref.opposite.name.toFirstUpper»(this);
		}
	} finally {
		setting«fieldName.toFirstUpper» = false;
	}
	«ELSE»
	// Adds the parameter to the list
	if(!this.«fieldName».contains(«propertyName»)){
		this.«fieldName».add(«propertyName»);
	}
	«ENDIF»'''
    
	/** 
	 * 
	 */
	def remove_toMany_Containmant_Documentantion(LContains ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
	Removes the given «propertyName» from this object. <p>
	«IF ref.opposite != null»
	Since the reference is a containment reference, the opposite reference («ref.type.name».«ref.opposite.name.toFirstLower») 
	of the «propertyName» will be handled automatically and no further coding is required to keep them in sync. 
	See {@link «ref.type.name»#set«ref.opposite.name.toFirstUpper»(«ref.type.name»)}.
	«ELSE»
	ATTENTION:<br>
	The reference is defined as a containment reference, but no opposite is available.
	So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
	is set properly.
	«ENDIF»

	@param «propertyName»'''
	
	/**
	 * 
	 */
	def remove_toMany_Containmant_OperationContent(LContains ref, String propertyName, String fieldName, JvmTypeReference typeRef)'''
	// If the parameter or the field are null, we can leave
	if («propertyName» == null || «fieldName» == null) {
		return;
	}

	// if the «propertyName» is not contained, then we can leave
	if (!this.«fieldName».contains(«propertyName»)) {
		return;
	}

	// Removes the parameter from the field
	this.«fieldName».remove(«propertyName»);
	«IF ref.opposite != null»
	// Set 'this' as the parent of the containment reference to the «propertyName»
	«propertyName».set«ref.opposite.name.toFirstUpper»(null);
	«ENDIF»'''
	
	/**
	 * 
	 */
	def isDisposed_Documentantion()'''
	Returns true, if the object is disposed. Disposed means, that it is
	prepared for garbage collection and may not be used anymore. Accessing
	objects that are already disposed will cause runtime exceptions.
	
	@return true if the object is disposed and false otherwise'''
	
	/**
	 * 
	 */
	def disposed_Documentantion()'''
	Calling dispose will destroy that instance. The internal state will be 
	set to 'disposed' and methods of that object must not be used anymore. 
	Each call will result in runtime exceptions.<br>
	If this object keeps containment references, these will be disposed too. 
	So the whole containment tree will be disposed on calling this method.
	'''
	
	/**
	 * 
	 */
	def checkDisposed_Documentantion()'''
	Checks whether the object is disposed.
	
	@throws RuntimeException if the object is disposed.
	'''
	
	/**
	 * 
	 */
	def checkDisposed_OperationContent()'''
	if (disposed) {
		throw new RuntimeException(String.format(
				"Object already disposed: {}", this.toString()));
	}
	'''
}


