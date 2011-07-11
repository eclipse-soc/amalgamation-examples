/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.components;

// Start of user code for imports
import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationElement;
import org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet;
import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.parts.TerminalAnimationSetPropertiesEditionPart;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class TerminalAnimationSetPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for elements ReferencesTable
	 */
	protected ReferencesTableSettings elementsSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public TerminalAnimationSetPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject terminalAnimationSet, String editing_mode) {
		super(editingContext, terminalAnimationSet, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.TerminalAnimationSet.class;
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
			final TerminalAnimationSet terminalAnimationSet = (TerminalAnimationSet)elt;
			final TerminalAnimationSetPropertiesEditionPart basePart = (TerminalAnimationSetPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DroidViewsRepository.TerminalAnimationSet.Properties.shareInterpolator)) {
				basePart.setShareInterpolator(terminalAnimationSet.isShareInterpolator());
			}
			if (isAccessible(DroidViewsRepository.TerminalAnimationSet.Properties.elements)) {
				elementsSettings = new ReferencesTableSettings(terminalAnimationSet, DroidPackage.eINSTANCE.getTerminalAnimationSet_Elements());
				basePart.initElements(elementsSettings);
			}
			// init filters
			
			basePart.addFilterToElements(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof FrameAnimationElement); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for elements
			// End of user code
			
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
		TerminalAnimationSet terminalAnimationSet = (TerminalAnimationSet)semanticObject;
		if (DroidViewsRepository.TerminalAnimationSet.Properties.shareInterpolator == event.getAffectedEditor()) {
			terminalAnimationSet.setShareInterpolator((Boolean)event.getNewValue());
		}
		if (DroidViewsRepository.TerminalAnimationSet.Properties.elements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, elementsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					elementsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TerminalAnimationSetPropertiesEditionPart basePart = (TerminalAnimationSetPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getTerminalAnimationSet_ShareInterpolator().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.TerminalAnimationSet.Properties.shareInterpolator))
				basePart.setShareInterpolator((Boolean)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getTerminalAnimationSet_Elements().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.TerminalAnimationSet.Properties.elements))
				basePart.updateElements();
			
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
				if (DroidViewsRepository.TerminalAnimationSet.Properties.shareInterpolator == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getTerminalAnimationSet_ShareInterpolator().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getTerminalAnimationSet_ShareInterpolator().getEAttributeType(), newValue);
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
