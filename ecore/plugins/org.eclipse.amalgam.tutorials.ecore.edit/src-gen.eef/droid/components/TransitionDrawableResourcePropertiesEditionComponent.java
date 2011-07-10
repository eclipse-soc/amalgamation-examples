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
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import droid.BitmapDrawableResource;
import droid.DroidFactory;
import droid.DroidPackage;
import droid.TransitionDrawableResource;
import droid.parts.DroidViewsRepository;
import droid.parts.TransitionDrawableResourcePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TransitionDrawableResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for from EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings fromSettings;
	
	/**
	 * Settings for to EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings toSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public TransitionDrawableResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject transitionDrawableResource, String editing_mode) {
		super(editingContext, transitionDrawableResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.TransitionDrawableResource.class;
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
			final TransitionDrawableResource transitionDrawableResource = (TransitionDrawableResource)elt;
			final TransitionDrawableResourcePropertiesEditionPart basePart = (TransitionDrawableResourcePropertiesEditionPart)editingPart;
			// init values
			if (transitionDrawableResource.getName() != null && isAccessible(DroidViewsRepository.TransitionDrawableResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), transitionDrawableResource.getName()));
			
			if (isAccessible(DroidViewsRepository.TransitionDrawableResource.Properties.from)) {
				// init part
				fromSettings = new EObjectFlatComboSettings(transitionDrawableResource, DroidPackage.eINSTANCE.getTransitionDrawableResource_From());
				basePart.initFrom(fromSettings);
				// set the button mode
				basePart.setFromButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DroidViewsRepository.TransitionDrawableResource.Properties.to)) {
				// init part
				toSettings = new EObjectFlatComboSettings(transitionDrawableResource, DroidPackage.eINSTANCE.getTransitionDrawableResource_To());
				basePart.initTo(toSettings);
				// set the button mode
				basePart.setToButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToFrom(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof BitmapDrawableResource); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for from
			// End of user code
			
			basePart.addFilterToTo(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof BitmapDrawableResource); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for to
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
		TransitionDrawableResource transitionDrawableResource = (TransitionDrawableResource)semanticObject;
		if (DroidViewsRepository.TransitionDrawableResource.Properties.name == event.getAffectedEditor()) {
			transitionDrawableResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.TransitionDrawableResource.Properties.from == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				fromSettings.setToReference((BitmapDrawableResource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BitmapDrawableResource eObject = DroidFactory.eINSTANCE.createBitmapDrawableResource();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				fromSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.TransitionDrawableResource.Properties.to == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				toSettings.setToReference((BitmapDrawableResource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BitmapDrawableResource eObject = DroidFactory.eINSTANCE.createBitmapDrawableResource();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				toSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TransitionDrawableResourcePropertiesEditionPart basePart = (TransitionDrawableResourcePropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getResource_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.TransitionDrawableResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (DroidPackage.eINSTANCE.getTransitionDrawableResource_From().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.TransitionDrawableResource.Properties.from))
				basePart.setFrom((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getTransitionDrawableResource_To().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.TransitionDrawableResource.Properties.to))
				basePart.setTo((EObject)msg.getNewValue());
			
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
				if (DroidViewsRepository.TransitionDrawableResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getResource_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getResource_Name().getEAttributeType(), newValue);
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
