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

import droid.Activity;
import droid.DroidFactory;
import droid.DroidPackage;
import droid.Layout;
import droid.parts.ActivityPropertiesEditionPart;
import droid.parts.DroidViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ActivityPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for referencedLayout EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings referencedLayoutSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public ActivityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject activity, String editing_mode) {
		super(editingContext, activity, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.Activity.class;
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
			final Activity activity = (Activity)elt;
			final ActivityPropertiesEditionPart basePart = (ActivityPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DroidViewsRepository.Activity.Properties.referencedLayout)) {
				// init part
				referencedLayoutSettings = new EObjectFlatComboSettings(activity, DroidPackage.eINSTANCE.getAbstractActivity_ReferencedLayout());
				basePart.initReferencedLayout(referencedLayoutSettings);
				// set the button mode
				basePart.setReferencedLayoutButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (activity.getName() != null && isAccessible(DroidViewsRepository.Activity.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), activity.getName()));
			
			// init filters
			basePart.addFilterToReferencedLayout(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Layout); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for referencedLayout
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
		Activity activity = (Activity)semanticObject;
		if (DroidViewsRepository.Activity.Properties.referencedLayout == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				referencedLayoutSettings.setToReference((Layout)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Layout eObject = DroidFactory.eINSTANCE.createLayout();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				referencedLayoutSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.Activity.Properties.name == event.getAffectedEditor()) {
			activity.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ActivityPropertiesEditionPart basePart = (ActivityPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getAbstractActivity_ReferencedLayout().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.Activity.Properties.referencedLayout))
				basePart.setReferencedLayout((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getActivity_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.Activity.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
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
				if (DroidViewsRepository.Activity.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getActivity_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getActivity_Name().getEAttributeType(), newValue);
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
