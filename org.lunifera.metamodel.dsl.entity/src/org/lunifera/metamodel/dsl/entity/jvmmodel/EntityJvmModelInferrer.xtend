package org.lunifera.metamodel.dsl.entity.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.lunifera.metamodel.dsl.entity.entitymodel.LContainer
import org.lunifera.metamodel.dsl.entity.entitymodel.LContains
import org.lunifera.metamodel.dsl.entity.entitymodel.LEmbedds
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntity
import org.lunifera.metamodel.dsl.entity.entitymodel.LEntityMember
import org.lunifera.metamodel.dsl.entity.entitymodel.LOperation
import org.lunifera.metamodel.dsl.entity.entitymodel.LProperty
import org.lunifera.metamodel.dsl.entity.entitymodel.LReference

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class EntityJvmModelInferrer extends AbstractModelInferrer {
  
    /**
     * conveninence API to build and initialize JvmTypes and their members.
     */
	@Inject extension EntityTypesBuilder
	@Inject extension IQualifiedNameProvider
	
	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
	 @SuppressWarnings({"deprecation"})
   	 def dispatch void infer(LEntity e, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		acceptor.accept(
 			e.toClass( e.fullyQualifiedName )
			).initializeLater [
				documentation = e.documentation
				if (e.superType != null){
					superTypes += e.superType.cloneWithProxies
				}
					
				members += e.toConstructor() []
					
//				members += e.toPrimitiveTypeField("dispose", Boolean::TYPE)
				//
				// fields
				//
				for ( f : e.entityMembers ) {
					switch f {
						LProperty: {
							members += f.toField(f.name, f.type)
						}
						
						LEmbedds: {
							f.toEmbeddedFields(f.name, e, members);
						}
						
						LContainer: {
							if(f.fullyQualifiedName != null && !f.fullyQualifiedName.empty){
								if(f.opposite != null){
									members += e.toPrimitiveTypeField("setting"+f.name.toFirstUpper, Boolean::TYPE)
								}
								members += f.toField(f.name, f.toTypeReference())
							}
						}
						
						LContains : {
							if(f.fullyQualifiedName != null && !f.fullyQualifiedName.empty){
								if(f.opposite != null){
									members += e.toPrimitiveTypeField("setting"+f.name.toFirstUpper, Boolean::TYPE)
								}
								members += f.toField(f.name, f.toTypeReference())
							}
						}
						
						LReference: {
							if(f.fullyQualifiedName != null && !f.fullyQualifiedName.empty){
								members += f.toField(f.name, f.toTypeReference())
							}
						}
					}
				}
				
				//
				// methods
				//
				for ( f : e.entityMembers ) {
					switch f {
						LProperty : {
							members += f.toGetter(f.name, f.type)
							members += f.toSetter(f.name, f.type)
						}
						
						LReference : {
							members += f.toGetter(f.name)
							if(!f.many){
								members += f.toSetter(f.name)		
							} else {
								members += f.toAdder(f.name)	
								members += f.toRemover(f.name)		
								members += f.toEnsureReferenceList(f.name)
							}
						}
						
						LEmbedds : {
							f.toEmbeddedAccessorMethods(f.name, e, members);
						}
						
						LContainer : {
							members += f.toGetter(f.name)
							if(!f.many){
								members += f.toSetter(f.name)		
							} else {
								members += f.toAdder(f.name)	
								members += f.toRemover(f.name)		
								members += f.toEnsureReferenceList(f.name)
							}
						}
						
						LContains: {
							members += f.toGetter(f.name)
							if(!f.many){
								members += f.toSetter(f.name)		
							} else {
								members += f.toAdder(f.name)	
								members += f.toRemover(f.name)		
								members += f.toEnsureReferenceList(f.name)
							}
						}

						LOperation: {
							members += f.toMethod(f.name, f.type) [
								documentation = f.documentation
								for (p : f.params) {
									parameters += p.toParameter(p.name, p.parameterType)
								}
								body = f.body
							]
						}
					}
				}
			]
   	}
   	
   	/**
   	 * Transforms the given embedds to fields.
   	 * LContainment and LContainer are not allowed yet, since opposite reference would not be possible! See EntityJavaValidator.class
   	 */
   	def toEmbeddedFields(LEmbedds embedds, String basename, LEntity e, EList<JvmMember> members){
   		for(f : embedds.type.entityMembers){
			switch f {
				LProperty: {
					members += f.toField(f.concatsEmbedds(basename), f.type)
				}
				
				LEmbedds: {
					f.toEmbeddedFields(f.concatsEmbedds(basename), e, members);
				}
				
				LReference: {
					if(f.fullyQualifiedName != null && !f.fullyQualifiedName.empty){
						members += f.toField(f.concatsEmbedds(basename), f.toTypeReference())
					}
				}
			}				
		}
   	}
   	
   	/**
   	 * Transforms the given embedds to the accessor methods like getter, setter, adder and remover.
   	 * LContainment and LContainer are not allowed yet, since opposite reference would not be possible! See EntityJavaValidator.class
   	 */
   	def toEmbeddedAccessorMethods(LEmbedds embedds, String basename, LEntity e, EList<JvmMember> members){
   		for(f : embedds.type.entityMembers){
			switch f {
				LProperty : {
					members += f.toGetter(f.concatsEmbedds(basename), f.type)
					members += f.toSetter(f.concatsEmbedds(basename), f.type)
				}
				
				LReference : {
					members += f.toGetter(f.concatsEmbedds(basename))
					if(!f.many){
						members += f.toSetter(f.concatsEmbedds(basename))		
					} else {
						members += f.toAdder(f.concatsEmbedds(basename))	
						members += f.toRemover(f.concatsEmbedds(basename))		
						members += f.toEnsureReferenceList(f.concatsEmbedds(basename))
					}
				}
				
				LEmbedds : {
					f.toEmbeddedAccessorMethods(f.concatsEmbedds(basename), e, members);
				}
				
				LOperation: {
					members += f.toMethod(f.concatsEmbedds(basename), f.type) [
						documentation = f.documentation
						for (p : f.params) {
							parameters += p.toParameter(p.name, p.parameterType)
						}
						body = f.body
					]
				}
			}				
		}
   	}
   	
   	def String concatsEmbedds(LEntityMember m, String baseName){
   		return baseName + "_" + m.name
   	}
  }
