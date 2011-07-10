/**
 * Generated with Acceleo
 */
package droid.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import droid.ApplicationUsesSDK;
import droid.DroidPackage;
import droid.parts.ApplicationUsesSDKPropertiesEditionPart;
import droid.parts.DroidViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ApplicationUsesSDKPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public ApplicationUsesSDKPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject applicationUsesSDK, String editing_mode) {
		super(editingContext, applicationUsesSDK, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.ApplicationUsesSDK.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final ApplicationUsesSDK applicationUsesSDK = (ApplicationUsesSDK)elt;
			final ApplicationUsesSDKPropertiesEditionPart basePart = (ApplicationUsesSDKPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion)) {
				basePart.setMinSdkVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), applicationUsesSDK.getMinSdkVersion()));
			}
			
			if (isAccessible(DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion)) {
				basePart.setMaxSdkVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), applicationUsesSDK.getMaxSdkVersion()));
			}
			
			if (isAccessible(DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion)) {
				basePart.setTargetSdkVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), applicationUsesSDK.getTargetSdkVersion()));
			}
			
			// init filters
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ApplicationUsesSDK applicationUsesSDK = (ApplicationUsesSDK)semanticObject;
		if (DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion == event.getAffectedEditor()) {
			applicationUsesSDK.setMinSdkVersion((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion == event.getAffectedEditor()) {
			applicationUsesSDK.setMaxSdkVersion((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion == event.getAffectedEditor()) {
			applicationUsesSDK.setTargetSdkVersion((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ApplicationUsesSDKPropertiesEditionPart basePart = (ApplicationUsesSDKPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getApplicationUsesSDK_MinSdkVersion().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion)) {
				if (msg.getNewValue() != null) {
					basePart.setMinSdkVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setMinSdkVersion("");
				}
			}
			if (DroidPackage.eINSTANCE.getApplicationUsesSDK_MaxSdkVersion().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxSdkVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setMaxSdkVersion("");
				}
			}
			if (DroidPackage.eINSTANCE.getApplicationUsesSDK_TargetSdkVersion().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion)) {
				if (msg.getNewValue() != null) {
					basePart.setTargetSdkVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setTargetSdkVersion("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getApplicationUsesSDK_MinSdkVersion().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getApplicationUsesSDK_MinSdkVersion().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getApplicationUsesSDK_MaxSdkVersion().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getApplicationUsesSDK_MaxSdkVersion().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getApplicationUsesSDK_TargetSdkVersion().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getApplicationUsesSDK_TargetSdkVersion().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
