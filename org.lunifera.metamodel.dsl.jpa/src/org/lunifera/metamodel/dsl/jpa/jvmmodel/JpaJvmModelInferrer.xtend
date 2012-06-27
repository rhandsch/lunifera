package org.lunifera.metamodel.dsl.jpa.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.lunifera.metamodel.dsl.entity.entity.Entity
import org.lunifera.metamodel.dsl.entity.entity.Operation
import org.lunifera.metamodel.dsl.entity.entity.Property
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmTypeReference

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class JpaJvmModelInferrer extends AbstractModelInferrer {
 
    /**
     * conveninence API to build and initialize JvmTypes and their members.
     */
	@Inject extension JvmTypesBuilder
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
   	def dispatch void infer(Entity e, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
		acceptor.accept(
			e.toClass( e.fullyQualifiedName ) [
				documentation = e.documentation
				if (e.superType != null)
					superTypes += e.superType.cloneWithProxies
					
				for ( f : e.features ) {
					switch f {
				
						Property : {
							members += f.toField(f.name, f.type)
							members += f.toGetter(f.name, f.type)
							members += f.toSetter(f.name, f.type)
						}
				
						Operation : {
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
		)
   	}
	def Iterable<? extends JvmTypeReference> cloneWithProxies(Object object) { }

	def superType(Entity entity) { }

	def Iterable<? extends JvmTypeReference> cloneWithProxies(EObject object) { }

  }
