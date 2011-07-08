package org.eclipse.amalgam.tutorials.xtext.validation;

import org.eclipse.amalgam.tutorials.xtext.droid.Application;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.xtext.validation.Check;
 

public class DroidJavaValidator extends AbstractDroidJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Application app) {
//		if (app.getVersionCode() == 0) {
//			warning("Version Code should be greater than 0", DroidPackage.APPLICATION__VERSION_CODE);
//		}
//
//		if (app.getVersionName().trim().length() == 0) {
//			warning("Version Name should be a string", DroidPackage.APPLICATION__VERSION_NAME);
//		}
//
//		if(app.getSdkVersion() == null){
//			warning("SDK version not specified.", DroidPackage.APPLICATION__SDK_VERSION);
//		}
//		
//	}

}
