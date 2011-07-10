/**
 * Generated with Acceleo
 */
package droid.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

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
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import droid.DroidPackage;
import droid.IntegerArrayResource;
import droid.parts.DroidViewsRepository;
import droid.parts.IntegerArrayResourcePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class IntegerArrayResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public IntegerArrayResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject integerArrayResource, String editing_mode) {
		super(editingContext, integerArrayResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.IntegerArrayResource.class;
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
			final IntegerArrayResource integerArrayResource = (IntegerArrayResource)elt;
			final IntegerArrayResourcePropertiesEditionPart basePart = (IntegerArrayResourcePropertiesEditionPart)editingPart;
			// init values
			if (integerArrayResource.getName() != null && isAccessible(DroidViewsRepository.IntegerArrayResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), integerArrayResource.getName()));
			
			if (integerArrayResource.getItems() != null && isAccessible(DroidViewsRepository.IntegerArrayResource.Properties.items))
				basePart.setItems(integerArrayResource.getItems());
			
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
		IntegerArrayResource integerArrayResource = (IntegerArrayResource)semanticObject;
		if (DroidViewsRepository.IntegerArrayResource.Properties.name == event.getAffectedEditor()) {
			integerArrayResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.IntegerArrayResource.Properties.items == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				integerArrayResource.getItems().clear();
				integerArrayResource.getItems().addAll(((List) event.getNewValue()));
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			IntegerArrayResourcePropertiesEditionPart basePart = (IntegerArrayResourcePropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getResource_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.IntegerArrayResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (DroidPackage.eINSTANCE.getIntegerArrayResource_Items().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.IntegerArrayResource.Properties.items)) {
				basePart.setItems(((IntegerArrayResource)semanticObject).getItems());
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
				if (DroidViewsRepository.IntegerArrayResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getResource_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getResource_Name().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.IntegerArrayResource.Properties.items == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getIntegerArrayResource_Items().getEAttributeType(), iterator.next()));
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
