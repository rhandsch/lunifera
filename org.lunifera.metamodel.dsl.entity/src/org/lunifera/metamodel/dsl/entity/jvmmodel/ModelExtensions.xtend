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
package org.lunifera.metamodel.dsl.entity.jvmmodel

import org.lunifera.metamodel.dsl.entity.entitymodel.LReference
import org.lunifera.metamodel.dsl.entity.entitymodel.LProperty

class ModelExtensions {
	
	def boolean isToMany(LReference ref){
		EntityBounds::createFor(ref.multiplicity).toMany
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
	def String toMethodParamName(String name) {
		return String::format("_%s", name);
	}
}