/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.csvmanl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.csvmanl.CsvManRuntimeModule
import org.xtext.example.csvmanl.CsvManStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class CsvManIdeSetup extends CsvManStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new CsvManRuntimeModule, new CsvManIdeModule))
	}
	
}