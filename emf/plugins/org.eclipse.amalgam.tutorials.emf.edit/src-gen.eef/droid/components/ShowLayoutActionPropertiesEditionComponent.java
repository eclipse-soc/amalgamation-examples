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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import droid.DroidFactory;
import droid.DroidPackage;
import droid.Layout;
import droid.ShowLayoutAction;
import droid.parts.DroidViewsRepository;
import droid.parts.ShowLayoutActionPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ShowLayoutActionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for layout EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings layoutSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public ShowLayoutActionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject showLayoutAction, String editing_mode) {
		super(editingContext, showLayoutAction, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.ShowLayoutAction.class;
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
			final ShowLayoutAction showLayoutAction = (ShowLayoutAction)elt;
			final ShowLayoutActionPropertiesEditionPart basePart = (ShowLayoutActionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DroidViewsRepository.ShowLayoutAction.Properties.layout)) {
				// init part
				layoutSettings = new EObjectFlatComboSettings(showLayoutAction, DroidPackage.eINSTANCE.getShowLayoutAction_Layout());
				basePart.initLayout(layoutSettings);
				// set the button mode
				basePart.setLayoutButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToLayout(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Layout); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for layout
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
		ShowLayoutAction showLayoutAction = (ShowLayoutAction)semanticObject;
		if (DroidViewsRepository.ShowLayoutAction.Properties.layout == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				layoutSettings.setToReference((Layout)event.getNewValue());
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
				layoutSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ShowLayoutActionPropertiesEditionPart basePart = (ShowLayoutActionPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getShowLayoutAction_Layout().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.ShowLayoutAction.Properties.layout))
				basePart.setLayout((EObject)msg.getNewValue());
			
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
