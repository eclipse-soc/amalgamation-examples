
package org.eclipse.amalgam.tutorials.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DroidStandaloneSetup extends DroidStandaloneSetupGenerated{

	public static void doSetup() {
		new DroidStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

