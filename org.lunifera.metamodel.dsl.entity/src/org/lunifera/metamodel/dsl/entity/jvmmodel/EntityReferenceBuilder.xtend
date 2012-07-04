package org.lunifera.metamodel.dsl.entity.jvmmodel

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.lunifera.metamodel.dsl.entity.lentity.LReference
import org.lunifera.metamodel.dsl.entity.lentity.LEntityMember
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass

class EntityReferenceBuilder implements IGenerator {
	

	override doGenerate(Resource resource, IFileSystemAccess fsa) {

		for(g : resource.allContents.toIterable.filter(typeof(LReference))) {
				if(!clazz.abstract){
					// generate normal JPA-Entity
					if(!clazz.JPAEmbeddable){
						fsa.generateFile(jpaEntity.getFQNFileName(clazz), "jpa_entity", jpaEntity.generateNormal(clazz))
					}
					// generate Embeddable JPA-Entity
					if(clazz.JPAEmbeddable){
						fsa.generateFile(jpaEntity.getFQNFileName(clazz), "jpa_entity", jpaEntity.generateEmbeddable(clazz))
					}
					// generate normal JPA-Service
					if(!clazz.JPAEmbeddable){
						fsa.generateFile(jpaService.getFQNFileName(clazz), "jpa_service", jpaService.generateNormal(clazz))
					}
				} else if(clazz.interface){
						fsa.generateFile(jpaInterface.getFQNFileName(clazz), "jpa_interface", jpaInterface.generateNormal(clazz))
				}
			}
		}
	}



	}
	
	
	
}