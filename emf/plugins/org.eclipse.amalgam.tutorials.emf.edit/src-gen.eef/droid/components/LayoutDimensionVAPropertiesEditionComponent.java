/**
 * Generated with Acceleo
 */
package droid.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import droid.DroidPackage;
import droid.LayoutDimensionKind;
import droid.LayoutDimensionVA;
import droid.parts.DroidViewsRepository;
import droid.parts.LayoutDimensionVAPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class LayoutDimensionVAPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public LayoutDimensionVAPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject layoutDimensionVA, String editing_mode) {
		super(editingContext, layoutDimensionVA, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.LayoutDimensionVA.class;
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
			final LayoutDimensionVA layoutDimensionVA = (LayoutDimensionVA)elt;
			final LayoutDimensionVAPropertiesEditionPart basePart = (LayoutDimensionVAPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DroidViewsRepository.LayoutDimensionVA.Properties.constant_value)) {
				basePart.initConstant_value((EEnum) DroidPackage.eINSTANCE.getLayoutDimensionVA_Constant_value().getEType(), layoutDimensionVA.getConstant_value());
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
		LayoutDimensionVA layoutDimensionVA = (LayoutDimensionVA)semanticObject;
		if (DroidViewsRepository.LayoutDimensionVA.Properties.constant_value == event.getAffectedEditor()) {
			layoutDimensionVA.setConstant_value((LayoutDimensionKind)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			LayoutDimensionVAPropertiesEditionPart basePart = (LayoutDimensionVAPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getLayoutDimensionVA_Constant_value().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.LayoutDimensionVA.Properties.constant_value))
				basePart.setConstant_value((Enumerator)msg.getNewValue());
			
			
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
				if (DroidViewsRepository.LayoutDimensionVA.Properties.constant_value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getLayoutDimensionVA_Constant_value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getLayoutDimensionVA_Constant_value().getEAttributeType(), newValue);
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
