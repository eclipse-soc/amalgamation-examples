/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.components;

// Start of user code for imports
import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.IntegerVD;
import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.parts.IntegerVDPropertiesEditionPart;
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


// End of user code

/**
 * 
 * 
 */
public class IntegerVDPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public IntegerVDPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject integerVD, String editing_mode) {
		super(editingContext, integerVD, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.IntegerVD.class;
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
			final IntegerVD integerVD = (IntegerVD)elt;
			final IntegerVDPropertiesEditionPart basePart = (IntegerVDPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DroidViewsRepository.IntegerVD.Properties.value)) {
				basePart.setValue(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), integerVD.getValue()));
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
		IntegerVD integerVD = (IntegerVD)semanticObject;
		if (DroidViewsRepository.IntegerVD.Properties.value == event.getAffectedEditor()) {
			integerVD.setValue((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			IntegerVDPropertiesEditionPart basePart = (IntegerVDPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getIntegerVD_Value().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.IntegerVD.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setValue("");
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
				if (DroidViewsRepository.IntegerVD.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getIntegerVD_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getIntegerVD_Value().getEAttributeType(), newValue);
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
