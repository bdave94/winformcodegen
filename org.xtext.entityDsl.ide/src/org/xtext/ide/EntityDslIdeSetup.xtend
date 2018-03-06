/*
 * generated by Xtext 2.11.0
 */
package org.xtext.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.EntityDslRuntimeModule
import org.xtext.EntityDslStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class EntityDslIdeSetup extends EntityDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new EntityDslRuntimeModule, new EntityDslIdeModule))
	}
	
}
