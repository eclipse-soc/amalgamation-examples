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
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import droid.Activity;
import droid.Application;
import droid.DroidPackage;
import droid.Layout;
import droid.Resource;
import droid.parts.ApplicationPropertiesEditionPart;
import droid.parts.DroidViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ApplicationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for resources ReferencesTable
	 */
	protected ReferencesTableSettings resourcesSettings;
	
	/**
	 * Settings for activities ReferencesTable
	 */
	protected ReferencesTableSettings activitiesSettings;
	
	/**
	 * Settings for layouts ReferencesTable
	 */
	protected ReferencesTableSettings layoutsSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public ApplicationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject application, String editing_mode) {
		super(editingContext, application, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.Application.class;
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
			final Application application = (Application)elt;
			final ApplicationPropertiesEditionPart basePart = (ApplicationPropertiesEditionPart)editingPart;
			// init values
			if (application.getName() != null && isAccessible(DroidViewsRepository.Application.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), application.getName()));
			
			if (application.getPackageName() != null && isAccessible(DroidViewsRepository.Application.Properties.packageName))
				basePart.setPackageName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), application.getPackageName()));
			
			if (isAccessible(DroidViewsRepository.Application.Properties.versionCode)) {
				basePart.setVersionCode(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), application.getVersionCode()));
			}
			
			if (application.getVersionName() != null && isAccessible(DroidViewsRepository.Application.Properties.versionName))
				basePart.setVersionName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), application.getVersionName()));
			
			if (isAccessible(DroidViewsRepository.Application.Properties.resources)) {
				resourcesSettings = new ReferencesTableSettings(application, DroidPackage.eINSTANCE.getApplication_Resources());
				basePart.initResources(resourcesSettings);
			}
			if (isAccessible(DroidViewsRepository.Application.Properties.activities)) {
				activitiesSettings = new ReferencesTableSettings(application, DroidPackage.eINSTANCE.getApplication_Activities());
				basePart.initActivities(activitiesSettings);
			}
			if (isAccessible(DroidViewsRepository.Application.Properties.layouts)) {
				layoutsSettings = new ReferencesTableSettings(application, DroidPackage.eINSTANCE.getApplication_Layouts());
				basePart.initLayouts(layoutsSettings);
			}
			// init filters
			
			
			
			
			basePart.addFilterToResources(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Resource); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for resources
			// End of user code
			
			basePart.addFilterToActivities(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Activity); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for activities
			// End of user code
			
			basePart.addFilterToLayouts(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Layout); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for layouts
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
		Application application = (Application)semanticObject;
		if (DroidViewsRepository.Application.Properties.name == event.getAffectedEditor()) {
			application.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.Application.Properties.packageName == event.getAffectedEditor()) {
			application.setPackageName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.Application.Properties.versionCode == event.getAffectedEditor()) {
			application.setVersionCode((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (DroidViewsRepository.Application.Properties.versionName == event.getAffectedEditor()) {
			application.setVersionName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.Application.Properties.resources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, resourcesSettings, editingContext.getAdapterFactory());
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
					resourcesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (DroidViewsRepository.Application.Properties.activities == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, activitiesSettings, editingContext.getAdapterFactory());
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
					activitiesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (DroidViewsRepository.Application.Properties.layouts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, layoutsSettings, editingContext.getAdapterFactory());
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
					layoutsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ApplicationPropertiesEditionPart basePart = (ApplicationPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getApplication_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.Application.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (DroidPackage.eINSTANCE.getApplication_PackageName().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.Application.Properties.packageName)) {
				if (msg.getNewValue() != null) {
					basePart.setPackageName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPackageName("");
				}
			}
			if (DroidPackage.eINSTANCE.getApplication_VersionCode().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.Application.Properties.versionCode)) {
				if (msg.getNewValue() != null) {
					basePart.setVersionCode(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setVersionCode("");
				}
			}
			if (DroidPackage.eINSTANCE.getApplication_VersionName().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.Application.Properties.versionName)) {
				if (msg.getNewValue() != null) {
					basePart.setVersionName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setVersionName("");
				}
			}
			if (DroidPackage.eINSTANCE.getApplication_Resources().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.Application.Properties.resources))
				basePart.updateResources();
			if (DroidPackage.eINSTANCE.getApplication_Activities().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.Application.Properties.activities))
				basePart.updateActivities();
			if (DroidPackage.eINSTANCE.getApplication_Layouts().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.Application.Properties.layouts))
				basePart.updateLayouts();
			
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
				if (DroidViewsRepository.Application.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getApplication_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getApplication_Name().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.Application.Properties.packageName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getApplication_PackageName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getApplication_PackageName().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.Application.Properties.versionCode == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getApplication_VersionCode().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getApplication_VersionCode().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.Application.Properties.versionName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getApplication_VersionName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getApplication_VersionName().getEAttributeType(), newValue);
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
