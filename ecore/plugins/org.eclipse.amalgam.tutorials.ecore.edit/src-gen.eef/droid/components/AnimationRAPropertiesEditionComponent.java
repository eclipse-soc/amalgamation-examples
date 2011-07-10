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

import droid.AnimationRA;
import droid.AnimationResource;
import droid.DroidFactory;
import droid.DroidPackage;
import droid.parts.AnimationRAPropertiesEditionPart;
import droid.parts.DroidViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class AnimationRAPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for resource EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings resourceSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public AnimationRAPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject animationRA, String editing_mode) {
		super(editingContext, animationRA, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.AnimationRA.class;
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
			final AnimationRA animationRA = (AnimationRA)elt;
			final AnimationRAPropertiesEditionPart basePart = (AnimationRAPropertiesEditionPart)editingPart;
			// init values
			if (animationRA.getExternalResource() != null && isAccessible(DroidViewsRepository.AnimationRA.Properties.externalResource))
				basePart.setExternalResource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), animationRA.getExternalResource()));
			
			if (isAccessible(DroidViewsRepository.AnimationRA.Properties.resource)) {
				// init part
				resourceSettings = new EObjectFlatComboSettings(animationRA, DroidPackage.eINSTANCE.getAnimationRA_Resource());
				basePart.initResource(resourceSettings);
				// set the button mode
				basePart.setResourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			basePart.addFilterToResource(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof AnimationResource); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for resource
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
		AnimationRA animationRA = (AnimationRA)semanticObject;
		if (DroidViewsRepository.AnimationRA.Properties.externalResource == event.getAffectedEditor()) {
			animationRA.setExternalResource((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.AnimationRA.Properties.resource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				resourceSettings.setToReference((AnimationResource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				AnimationResource eObject = DroidFactory.eINSTANCE.createAnimationResource();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				resourceSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			AnimationRAPropertiesEditionPart basePart = (AnimationRAPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getAbstractResourceAccess_ExternalResource().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.AnimationRA.Properties.externalResource)) {
				if (msg.getNewValue() != null) {
					basePart.setExternalResource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setExternalResource("");
				}
			}
			if (DroidPackage.eINSTANCE.getAnimationRA_Resource().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.AnimationRA.Properties.resource))
				basePart.setResource((EObject)msg.getNewValue());
			
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
				if (DroidViewsRepository.AnimationRA.Properties.externalResource == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getAbstractResourceAccess_ExternalResource().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getAbstractResourceAccess_ExternalResource().getEAttributeType(), newValue);
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
