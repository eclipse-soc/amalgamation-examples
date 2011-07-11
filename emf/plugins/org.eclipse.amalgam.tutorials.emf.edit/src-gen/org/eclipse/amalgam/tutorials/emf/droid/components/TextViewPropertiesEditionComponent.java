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
import org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind;
import org.eclipse.amalgam.tutorials.emf.droid.TextView;
import org.eclipse.amalgam.tutorials.emf.droid.TypefaceKind;
import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.parts.TextViewPropertiesEditionPart;
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
public class TextViewPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public TextViewPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject textView, String editing_mode) {
		super(editingContext, textView, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.TextView.class;
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
			final TextView textView = (TextView)elt;
			final TextViewPropertiesEditionPart basePart = (TextViewPropertiesEditionPart)editingPart;
			// init values
			if (textView.getName() != null && isAccessible(DroidViewsRepository.TextView.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), textView.getName()));
			
			if (isAccessible(DroidViewsRepository.TextView.Properties.autoLink)) {
				basePart.initAutoLink((EEnum) DroidPackage.eINSTANCE.getTextView_AutoLink().getEType(), textView.getAutoLink());
			}
			if (isAccessible(DroidViewsRepository.TextView.Properties.capitalize)) {
				basePart.initCapitalize((EEnum) DroidPackage.eINSTANCE.getTextView_Capitalize().getEType(), textView.getCapitalize());
			}
			if (isAccessible(DroidViewsRepository.TextView.Properties.gravity)) {
				basePart.initGravity((EEnum) DroidPackage.eINSTANCE.getTextView_Gravity().getEType(), textView.getGravity());
			}
			if (isAccessible(DroidViewsRepository.TextView.Properties.typeface)) {
				basePart.initTypeface((EEnum) DroidPackage.eINSTANCE.getTextView_Typeface().getEType(), textView.getTypeface());
			}
			if (textView.getTextStyle() != null && isAccessible(DroidViewsRepository.TextView.Properties.textStyle))
				basePart.setTextStyle(textView.getTextStyle());
			
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
		TextView textView = (TextView)semanticObject;
		if (DroidViewsRepository.TextView.Properties.name == event.getAffectedEditor()) {
			textView.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.TextView.Properties.autoLink == event.getAffectedEditor()) {
			textView.setAutoLink((AutoLinkKind)event.getNewValue());
		}
		if (DroidViewsRepository.TextView.Properties.capitalize == event.getAffectedEditor()) {
			textView.setCapitalize((CapitalizeKind)event.getNewValue());
		}
		if (DroidViewsRepository.TextView.Properties.gravity == event.getAffectedEditor()) {
			textView.setGravity((LayoutGravityKind)event.getNewValue());
		}
		if (DroidViewsRepository.TextView.Properties.typeface == event.getAffectedEditor()) {
			textView.setTypeface((TypefaceKind)event.getNewValue());
		}
		if (DroidViewsRepository.TextView.Properties.textStyle == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				textView.getTextStyle().clear();
				textView.getTextStyle().addAll(((List) event.getNewValue()));
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TextViewPropertiesEditionPart basePart = (TextViewPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getAbstractView_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.TextView.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (DroidPackage.eINSTANCE.getTextView_AutoLink().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.TextView.Properties.autoLink))
				basePart.setAutoLink((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getTextView_Capitalize().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.TextView.Properties.capitalize))
				basePart.setCapitalize((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getTextView_Gravity().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.TextView.Properties.gravity))
				basePart.setGravity((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getTextView_Typeface().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.TextView.Properties.typeface))
				basePart.setTypeface((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getTextView_TextStyle().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.TextView.Properties.textStyle)) {
				basePart.setTextStyle(((TextView)semanticObject).getTextStyle());
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
				if (DroidViewsRepository.TextView.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getAbstractView_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getAbstractView_Name().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.TextView.Properties.autoLink == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getTextView_AutoLink().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getTextView_AutoLink().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.TextView.Properties.capitalize == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getTextView_Capitalize().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getTextView_Capitalize().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.TextView.Properties.gravity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getTextView_Gravity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getTextView_Gravity().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.TextView.Properties.typeface == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getTextView_Typeface().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getTextView_Typeface().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.TextView.Properties.textStyle == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getTextView_TextStyle().getEAttributeType(), iterator.next()));
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
