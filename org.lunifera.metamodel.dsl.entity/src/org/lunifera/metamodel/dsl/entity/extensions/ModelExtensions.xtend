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
package org.lunifera.metamodel.dsl.entity.extensions

import org.lunifera.metamodel.dsl.entity.entitymodel.LContainer
import org.lunifera.metamodel.dsl.entity.entitymodel.LContains
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember
import org.lunifera.metamodel.dsl.entity.entitymodel.LMultiplicity
import org.lunifera.metamodel.dsl.entity.entitymodel.LProperty
import org.lunifera.metamodel.dsl.entity.entitymodel.LReference
import org.lunifera.metamodel.dsl.entity.entitymodel.LRefers
import org.lunifera.metamodel.dsl.entity.entitymodel.LGenSettings
import org.lunifera.metamodel.dsl.entity.entitymodel.LEmbedds

class ModelExtensions { 
	
	def EntityBounds getEntityBounds(LEntityMember ref){
		EntityBounds::createFor(ref.mulitiplicity_dispatch)
	}
	
	def LMultiplicity getMulitiplicitySetting(LEntityMember ref){
		ref.mulitiplicity_dispatch
	}
	
	def dispatch LMultiplicity getMulitiplicity_dispatch(LContainer ref){
		return null;
	}
	
	def dispatch LMultiplicity getMulitiplicity_dispatch(LContains ref){
		return ref.multiplicity
	}
	
	def dispatch LMultiplicity getMulitiplicity_dispatch(LRefers ref){
		return ref.multiplicity
	}
	
	def dispatch LMultiplicity getMulitiplicity_dispatch(LEmbedds embedds){
		return null
	}
	
	def dispatch LMultiplicity getMulitiplicity_dispatch(LProperty prop){
		return prop.multiplicity
	}
	
	def boolean isToMany(LEntityMember ref){
		ref.entityBounds.toMany
	}
	
	def boolean isRequired(LEntityMember ref){
		ref.entityBounds.required
	}
	
	def boolean isOptional(LEntityMember ref){
		ref.entityBounds.optional
	}
	
	/** 
	 * Returns the property name that is used for method signatures.
	 */
	def String toMethodParamName(LProperty sourceElement) {
		return toMethodParamName(sourceElement.getName());
	}
	
	/** 
	 * Returns the property name that is used for method signatures.
	 */
	def String toMethodParamName(LReference sourceElement) {
		return toMethodParamName(sourceElement.getName());
	}
	
	/** 
	 * Returns the property name that is used for method signatures.
	 */
	def String toMethodParamName(LEmbedds sourceElement) {
		return toMethodParamName(sourceElement.getName());
	}
	
		/** 
	 * Returns the property name that is used for method signatures.
	 */
	def String toMethodParamName(String name) {
		return String::format("_%s", name);
	}
	
   	def isLifecycleHandling(LGenSettings settings){
   		return settings != null && settings.lifecycle
   	}
   	
   	def dispatch String concatsEmbedds(LProperty m, String baseName){
   		return baseName + "_" + m.name
   	}
   	
   	def dispatch String concatsEmbedds(LRefers m, String baseName){
   		return baseName + "_" + m.name
   	}
   	
   	def dispatch String concatsEmbedds(LContains m, String baseName){
   		return baseName + "_" + m.name
   	}
   	
   	def dispatch String concatsEmbedds(LContainer m, String baseName){
   		return baseName + "_" + m.name
   	}
   	
   	def dispatch String concatsEmbedds(LEmbedds m, String baseName){
   		return baseName + "_" + m.name
   	}
}