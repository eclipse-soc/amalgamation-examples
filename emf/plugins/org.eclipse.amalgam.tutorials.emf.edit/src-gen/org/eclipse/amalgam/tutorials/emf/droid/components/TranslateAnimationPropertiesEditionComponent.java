/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.components;

// Start of user code for imports
import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.TranslateAnimation;
import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.parts.TranslateAnimationPropertiesEditionPart;
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
public class TranslateAnimationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public TranslateAnimationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject translateAnimation, String editing_mode) {
		super(editingContext, translateAnimation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.TranslateAnimation.class;
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
			final TranslateAnimation translateAnimation = (TranslateAnimation)elt;
			final TranslateAnimationPropertiesEditionPart basePart = (TranslateAnimationPropertiesEditionPart)editingPart;
			// init values
			if (translateAnimation.getFromAlpha() != null && isAccessible(DroidViewsRepository.TranslateAnimation.Properties.fromAlpha))
				basePart.setFromAlpha(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEFloatObject(), translateAnimation.getFromAlpha()));
			
			if (translateAnimation.getToAlpha() != null && isAccessible(DroidViewsRepository.TranslateAnimation.Properties.toAlpha))
				basePart.setToAlpha(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEFloatObject(), translateAnimation.getToAlpha()));
			
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
		TranslateAnimation translateAnimation = (TranslateAnimation)semanticObject;
		if (DroidViewsRepository.TranslateAnimation.Properties.fromAlpha == event.getAffectedEditor()) {
			translateAnimation.setFromAlpha((java.lang.Float)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEFloatObject(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.TranslateAnimation.Properties.toAlpha == event.getAffectedEditor()) {
			translateAnimation.setToAlpha((java.lang.Float)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEFloatObject(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TranslateAnimationPropertiesEditionPart basePart = (TranslateAnimationPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getTerminalAnimationElements_FromAlpha().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.TranslateAnimation.Properties.fromAlpha)) {
				if (msg.getNewValue() != null) {
					basePart.setFromAlpha(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEFloatObject(), msg.getNewValue()));
				} else {
					basePart.setFromAlpha("");
				}
			}
			if (DroidPackage.eINSTANCE.getTerminalAnimationElements_ToAlpha().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.TranslateAnimation.Properties.toAlpha)) {
				if (msg.getNewValue() != null) {
					basePart.setToAlpha(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEFloatObject(), msg.getNewValue()));
				} else {
					basePart.setToAlpha("");
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
				if (DroidViewsRepository.TranslateAnimation.Properties.fromAlpha == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getTerminalAnimationElements_FromAlpha().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getTerminalAnimationElements_FromAlpha().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.TranslateAnimation.Properties.toAlpha == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getTerminalAnimationElements_ToAlpha().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getTerminalAnimationElements_ToAlpha().getEAttributeType(), newValue);
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
