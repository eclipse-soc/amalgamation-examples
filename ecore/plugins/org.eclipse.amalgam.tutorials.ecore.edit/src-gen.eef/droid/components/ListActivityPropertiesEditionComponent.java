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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import droid.Action;
import droid.DroidFactory;
import droid.DroidPackage;
import droid.Layout;
import droid.ListActivity;
import droid.parts.DroidViewsRepository;
import droid.parts.ListActivityPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ListActivityPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for referencedLayout EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings referencedLayoutSettings;
	
	/**
	 * Settings for itemLayout EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings itemLayoutSettings;
	
	/**
	 * Settings for actions ReferencesTable
	 */
	protected ReferencesTableSettings actionsSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public ListActivityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject listActivity, String editing_mode) {
		super(editingContext, listActivity, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.ListActivity.class;
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
			final ListActivity listActivity = (ListActivity)elt;
			final ListActivityPropertiesEditionPart basePart = (ListActivityPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DroidViewsRepository.ListActivity.Properties.referencedLayout)) {
				// init part
				referencedLayoutSettings = new EObjectFlatComboSettings(listActivity, DroidPackage.eINSTANCE.getAbstractActivity_ReferencedLayout());
				basePart.initReferencedLayout(referencedLayoutSettings);
				// set the button mode
				basePart.setReferencedLayoutButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (listActivity.getName() != null && isAccessible(DroidViewsRepository.ListActivity.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), listActivity.getName()));
			
			if (listActivity.getDataSource() != null && isAccessible(DroidViewsRepository.ListActivity.Properties.dataSource))
				basePart.setDataSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), listActivity.getDataSource()));
			
			if (isAccessible(DroidViewsRepository.ListActivity.Properties.itemLayout)) {
				// init part
				itemLayoutSettings = new EObjectFlatComboSettings(listActivity, DroidPackage.eINSTANCE.getListActivity_ItemLayout());
				basePart.initItemLayout(itemLayoutSettings);
				// set the button mode
				basePart.setItemLayoutButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DroidViewsRepository.ListActivity.Properties.actions)) {
				actionsSettings = new ReferencesTableSettings(listActivity, DroidPackage.eINSTANCE.getListActivity_Actions());
				basePart.initActions(actionsSettings);
			}
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
			
			
			
			basePart.addFilterToItemLayout(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Layout); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for itemLayout
			// End of user code
			
			basePart.addFilterToActions(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Action); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for actions
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
		ListActivity listActivity = (ListActivity)semanticObject;
		if (DroidViewsRepository.ListActivity.Properties.referencedLayout == event.getAffectedEditor()) {
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
		if (DroidViewsRepository.ListActivity.Properties.name == event.getAffectedEditor()) {
			listActivity.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.ListActivity.Properties.dataSource == event.getAffectedEditor()) {
			listActivity.setDataSource((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.ListActivity.Properties.itemLayout == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				itemLayoutSettings.setToReference((Layout)event.getNewValue());
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
				itemLayoutSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.ListActivity.Properties.actions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, actionsSettings, editingContext.getAdapterFactory());
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
					actionsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ListActivityPropertiesEditionPart basePart = (ListActivityPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getAbstractActivity_ReferencedLayout().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.ListActivity.Properties.referencedLayout))
				basePart.setReferencedLayout((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getActivity_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.ListActivity.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (DroidPackage.eINSTANCE.getListActivity_DataSource().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.ListActivity.Properties.dataSource)) {
				if (msg.getNewValue() != null) {
					basePart.setDataSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDataSource("");
				}
			}
			if (DroidPackage.eINSTANCE.getListActivity_ItemLayout().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.ListActivity.Properties.itemLayout))
				basePart.setItemLayout((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getListActivity_Actions().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.ListActivity.Properties.actions))
				basePart.updateActions();
			
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
				if (DroidViewsRepository.ListActivity.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getActivity_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getActivity_Name().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.ListActivity.Properties.dataSource == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getListActivity_DataSource().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getListActivity_DataSource().getEAttributeType(), newValue);
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
