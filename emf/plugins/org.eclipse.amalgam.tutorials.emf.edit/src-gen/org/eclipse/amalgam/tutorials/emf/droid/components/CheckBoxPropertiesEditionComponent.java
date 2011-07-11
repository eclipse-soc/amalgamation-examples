/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import org.eclipse.amalgam.tutorials.emf.droid.AutoLinkKind;
import org.eclipse.amalgam.tutorials.emf.droid.CapitalizeKind;
import org.eclipse.amalgam.tutorials.emf.droid.CheckBox;
import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind;
import org.eclipse.amalgam.tutorials.emf.droid.TypefaceKind;
import org.eclipse.amalgam.tutorials.emf.droid.parts.CheckBoxPropertiesEditionPart;
import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
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
public class CheckBoxPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public CheckBoxPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject checkBox, String editing_mode) {
		super(editingContext, checkBox, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.CheckBox.class;
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
			final CheckBox checkBox = (CheckBox)elt;
			final CheckBoxPropertiesEditionPart basePart = (CheckBoxPropertiesEditionPart)editingPart;
			// init values
			if (checkBox.getName() != null && isAccessible(DroidViewsRepository.CheckBox.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), checkBox.getName()));
			
			if (isAccessible(DroidViewsRepository.CheckBox.Properties.autoLink)) {
				basePart.initAutoLink((EEnum) DroidPackage.eINSTANCE.getCheckBox_AutoLink().getEType(), checkBox.getAutoLink());
			}
			if (isAccessible(DroidViewsRepository.CheckBox.Properties.capitalize)) {
				basePart.initCapitalize((EEnum) DroidPackage.eINSTANCE.getCheckBox_Capitalize().getEType(), checkBox.getCapitalize());
			}
			if (isAccessible(DroidViewsRepository.CheckBox.Properties.gravity)) {
				basePart.initGravity((EEnum) DroidPackage.eINSTANCE.getCheckBox_Gravity().getEType(), checkBox.getGravity());
			}
			if (isAccessible(DroidViewsRepository.CheckBox.Properties.typeface)) {
				basePart.initTypeface((EEnum) DroidPackage.eINSTANCE.getCheckBox_Typeface().getEType(), checkBox.getTypeface());
			}
			if (checkBox.getTextStyle() != null && isAccessible(DroidViewsRepository.CheckBox.Properties.textStyle))
				basePart.setTextStyle(checkBox.getTextStyle());
			
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
		CheckBox checkBox = (CheckBox)semanticObject;
		if (DroidViewsRepository.CheckBox.Properties.name == event.getAffectedEditor()) {
			checkBox.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.CheckBox.Properties.autoLink == event.getAffectedEditor()) {
			checkBox.setAutoLink((AutoLinkKind)event.getNewValue());
		}
		if (DroidViewsRepository.CheckBox.Properties.capitalize == event.getAffectedEditor()) {
			checkBox.setCapitalize((CapitalizeKind)event.getNewValue());
		}
		if (DroidViewsRepository.CheckBox.Properties.gravity == event.getAffectedEditor()) {
			checkBox.setGravity((LayoutGravityKind)event.getNewValue());
		}
		if (DroidViewsRepository.CheckBox.Properties.typeface == event.getAffectedEditor()) {
			checkBox.setTypeface((TypefaceKind)event.getNewValue());
		}
		if (DroidViewsRepository.CheckBox.Properties.textStyle == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				checkBox.getTextStyle().clear();
				checkBox.getTextStyle().addAll(((List) event.getNewValue()));
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			CheckBoxPropertiesEditionPart basePart = (CheckBoxPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getCheckBox_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.CheckBox.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (DroidPackage.eINSTANCE.getCheckBox_AutoLink().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.CheckBox.Properties.autoLink))
				basePart.setAutoLink((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getCheckBox_Capitalize().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.CheckBox.Properties.capitalize))
				basePart.setCapitalize((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getCheckBox_Gravity().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.CheckBox.Properties.gravity))
				basePart.setGravity((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getCheckBox_Typeface().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.CheckBox.Properties.typeface))
				basePart.setTypeface((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getCheckBox_TextStyle().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.CheckBox.Properties.textStyle)) {
				basePart.setTextStyle(((CheckBox)semanticObject).getTextStyle());
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
				if (DroidViewsRepository.CheckBox.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getCheckBox_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getCheckBox_Name().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.CheckBox.Properties.autoLink == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getCheckBox_AutoLink().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getCheckBox_AutoLink().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.CheckBox.Properties.capitalize == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getCheckBox_Capitalize().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getCheckBox_Capitalize().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.CheckBox.Properties.gravity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getCheckBox_Gravity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getCheckBox_Gravity().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.CheckBox.Properties.typeface == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getCheckBox_Typeface().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getCheckBox_Typeface().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.CheckBox.Properties.textStyle == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getCheckBox_TextStyle().getEAttributeType(), iterator.next()));
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
