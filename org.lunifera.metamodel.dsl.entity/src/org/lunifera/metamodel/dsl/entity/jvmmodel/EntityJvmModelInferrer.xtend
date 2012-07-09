package org.lunifera.metamodel.dsl.entity.jvmmodel

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.lunifera.metamodel.dsl.entity.lentity.LContainer
import org.lunifera.metamodel.dsl.entity.lentity.LContains
import org.lunifera.metamodel.dsl.entity.lentity.LEntity
import org.lunifera.metamodel.dsl.entity.lentity.LEntityMember
import org.lunifera.metamodel.dsl.entity.lentity.LOperation
import org.lunifera.metamodel.dsl.entity.lentity.LProperty
import org.lunifera.metamodel.dsl.entity.lentity.LReference
import org.lunifera.metamodel.dsl.entity.lentity.UpperBound

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
	@Inject extension JvmTypesBuilder
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
				if (e.superType != null)
					superTypes += e.superType.cloneWithProxies
					
				// fields
				for ( f : e.entityMembers ) {
					switch f {
						LProperty : {
							members += f.toField(f.name, f.type)
						}
						
						LReference : {
							if(!f.fullyQualifiedName.empty){
								var JvmTypeReference ref = null;
								if(f.multiplicity == null || f.multiplicity.upper == UpperBound::ONE){
									ref = f.newTypeRef(f.type.fullyQualifiedName.toString, null)
								}else {
									var JvmTypeReference genericParam = f.newTypeRef(f.type.fullyQualifiedName.toString, null)
									ref = f.newTypeRef(typeof(List), genericParam)
								}
								members += f.toField(f.name, ref)
							}
						}
						
						LContainer : {
							if(!f.fullyQualifiedName.empty){
								var JvmTypeReference ref = null;
								if(f.multiplicity == null || f.multiplicity.upper == UpperBound::ONE){
									ref = f.newTypeRef(f.type.fullyQualifiedName.toString, null)
								}else {
									var JvmTypeReference genericParam = f.newTypeRef(f.type.fullyQualifiedName.toString, null)
									ref = f.newTypeRef(typeof(List), genericParam)
								}
								members += f.toField(f.name, ref)
							}
						}
						
						LContains : {
							if(!f.fullyQualifiedName.empty){
								var JvmTypeReference ref = null;
								if(f.multiplicity == null || f.multiplicity.upper == UpperBound::ONE){
									ref = f.newTypeRef(f.type.fullyQualifiedName.toString, null)
								}else {
									var JvmTypeReference genericParam = f.newTypeRef(f.type.fullyQualifiedName.toString, null)
									ref = f.newTypeRef(typeof(List), genericParam)
								}
								members += f.toField(f.name, ref)
							}
						}
					}
				}
					
				// methods
				for ( f : e.entityMembers ) {
					switch f {
						LProperty : {
							members += f.toGetter(f.name, f.type)
							members += f.toSetter(f.name, f.type)
						}
						
						LReference : {
//							members += f.toGetter(f.name, f.newTypeRef(f.fullyQualifiedName.toString, null))
//							members += f.toSetter(f.name, f.newTypeRef(f.fullyQualifiedName.toString, null))			
						}

						LOperation : {
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
   	
	def Iterable<? extends LEntityMember> toReference(LReference reference, String string, LEntity entity) { }

	def Iterable<? extends JvmTypeReference> cloneWithProxies(Object object) { }

	def superType(LEntity entity) { }

	def Iterable<? extends JvmTypeReference> cloneWithProxies(EObject object) { }

  }
