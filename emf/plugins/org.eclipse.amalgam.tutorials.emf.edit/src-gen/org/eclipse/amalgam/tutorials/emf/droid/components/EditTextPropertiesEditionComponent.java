/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import org.eclipse.amalgam.tutorials.emf.droid.AutoLinkKind;
import org.eclipse.amalgam.tutorials.emf.droid.CapitalizeKind;
import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.EditText;
import org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind;
import org.eclipse.amalgam.tutorials.emf.droid.TypefaceKind;
import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.parts.EditTextPropertiesEditionPart;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;


// End of user code

/**
 * 
 * 
 */
public class EditTextPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public EditTextPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject editText, String editing_mode) {
		super(editingContext, editText, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.EditText.class;
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
			final EditText editText = (EditText)elt;
			final EditTextPropertiesEditionPart basePart = (EditTextPropertiesEditionPart)editingPart;
			// init values
			if (editText.getName() != null && isAccessible(DroidViewsRepository.EditText.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), editText.getName()));
			
			if (isAccessible(DroidViewsRepository.EditText.Properties.autoLink)) {
				basePart.initAutoLink((EEnum) DroidPackage.eINSTANCE.getEditText_AutoLink().getEType(), editText.getAutoLink());
			}
			if (isAccessible(DroidViewsRepository.EditText.Properties.capitalize)) {
				basePart.initCapitalize((EEnum) DroidPackage.eINSTANCE.getEditText_Capitalize().getEType(), editText.getCapitalize());
			}
			if (isAccessible(DroidViewsRepository.EditText.Properties.gravity)) {
				basePart.initGravity((EEnum) DroidPackage.eINSTANCE.getEditText_Gravity().getEType(), editText.getGravity());
			}
			if (isAccessible(DroidViewsRepository.EditText.Properties.typeface)) {
				basePart.initTypeface((EEnum) DroidPackage.eINSTANCE.getEditText_Typeface().getEType(), editText.getTypeface());
			}
			if (editText.getTextStyle() != null && isAccessible(DroidViewsRepository.EditText.Properties.textStyle))
				basePart.setTextStyle(editText.getTextStyle());
			
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
		EditText editText = (EditText)semanticObject;
		if (DroidViewsRepository.EditText.Properties.name == event.getAffectedEditor()) {
			editText.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.EditText.Properties.autoLink == event.getAffectedEditor()) {
			editText.setAutoLink((AutoLinkKind)event.getNewValue());
		}
		if (DroidViewsRepository.EditText.Properties.capitalize == event.getAffectedEditor()) {
			editText.setCapitalize((CapitalizeKind)event.getNewValue());
		}
		if (DroidViewsRepository.EditText.Properties.gravity == event.getAffectedEditor()) {
			editText.setGravity((LayoutGravityKind)event.getNewValue());
		}
		if (DroidViewsRepository.EditText.Properties.typeface == event.getAffectedEditor()) {
			editText.setTypeface((TypefaceKind)event.getNewValue());
		}
		if (DroidViewsRepository.EditText.Properties.textStyle == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				editText.getTextStyle().clear();
				editText.getTextStyle().addAll(((List) event.getNewValue()));
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			EditTextPropertiesEditionPart basePart = (EditTextPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getAbstractView_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.EditText.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (DroidPackage.eINSTANCE.getEditText_AutoLink().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.EditText.Properties.autoLink))
				basePart.setAutoLink((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getEditText_Capitalize().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.EditText.Properties.capitalize))
				basePart.setCapitalize((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getEditText_Gravity().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.EditText.Properties.gravity))
				basePart.setGravity((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getEditText_Typeface().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.EditText.Properties.typeface))
				basePart.setTypeface((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getEditText_TextStyle().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.EditText.Properties.textStyle)) {
				basePart.setTextStyle(((EditText)semanticObject).getTextStyle());
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
				if (DroidViewsRepository.EditText.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getAbstractView_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getAbstractView_Name().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.EditText.Properties.autoLink == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getEditText_AutoLink().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getEditText_AutoLink().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.EditText.Properties.capitalize == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getEditText_Capitalize().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getEditText_Capitalize().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.EditText.Properties.gravity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getEditText_Gravity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getEditText_Gravity().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.EditText.Properties.typeface == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getEditText_Typeface().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getEditText_Typeface().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.EditText.Properties.textStyle == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getEditText_TextStyle().getEAttributeType(), iterator.next()));
					}
					ret = chain;
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
