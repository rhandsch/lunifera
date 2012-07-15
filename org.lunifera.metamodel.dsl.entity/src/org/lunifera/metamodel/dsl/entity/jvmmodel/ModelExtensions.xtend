package org.lunifera.metamodel.dsl.entity.jvmmodel

import org.lunifera.metamodel.dsl.entity.entitymodel.LReference

class ModelExtensions {
	
	def boolean isToMany(LReference ref){
		EntityBounds::createFor(ref.multiplicity).toMany
	}
}