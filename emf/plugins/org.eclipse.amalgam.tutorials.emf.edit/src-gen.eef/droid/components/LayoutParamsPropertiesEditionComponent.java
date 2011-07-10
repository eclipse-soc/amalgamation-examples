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
import droid.LayoutParams;
import droid.View;
import droid.parts.DroidViewsRepository;
import droid.parts.LayoutParamsPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class LayoutParamsPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for layout_above EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings layout_aboveSettings;
	
	/**
	 * Settings for layout_alignBaseline EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings layout_alignBaselineSettings;
	
	/**
	 * Settings for layout_alignBottom EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings layout_alignBottomSettings;
	
	/**
	 * Settings for layout_alignLeft EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings layout_alignLeftSettings;
	
	/**
	 * Settings for layout_alignTop EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings layout_alignTopSettings;
	
	/**
	 * Settings for layout_below EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings layout_belowSettings;
	
	/**
	 * Settings for layout_toLeftOf EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings layout_toLeftOfSettings;
	
	/**
	 * Settings for layout_toRightOf EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings layout_toRightOfSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public LayoutParamsPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject layoutParams, String editing_mode) {
		super(editingContext, layoutParams, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.LayoutParams.class;
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
			final LayoutParams layoutParams = (LayoutParams)elt;
			final LayoutParamsPropertiesEditionPart basePart = (LayoutParamsPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_above)) {
				// init part
				layout_aboveSettings = new EObjectFlatComboSettings(layoutParams, DroidPackage.eINSTANCE.getLayoutParams_Layout_above());
				basePart.initLayout_above(layout_aboveSettings);
				// set the button mode
				basePart.setLayout_aboveButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_alignBaseline)) {
				// init part
				layout_alignBaselineSettings = new EObjectFlatComboSettings(layoutParams, DroidPackage.eINSTANCE.getLayoutParams_Layout_alignBaseline());
				basePart.initLayout_alignBaseline(layout_alignBaselineSettings);
				// set the button mode
				basePart.setLayout_alignBaselineButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_alignBottom)) {
				// init part
				layout_alignBottomSettings = new EObjectFlatComboSettings(layoutParams, DroidPackage.eINSTANCE.getLayoutParams_Layout_alignBottom());
				basePart.initLayout_alignBottom(layout_alignBottomSettings);
				// set the button mode
				basePart.setLayout_alignBottomButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_alignLeft)) {
				// init part
				layout_alignLeftSettings = new EObjectFlatComboSettings(layoutParams, DroidPackage.eINSTANCE.getLayoutParams_Layout_alignLeft());
				basePart.initLayout_alignLeft(layout_alignLeftSettings);
				// set the button mode
				basePart.setLayout_alignLeftButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_alignTop)) {
				// init part
				layout_alignTopSettings = new EObjectFlatComboSettings(layoutParams, DroidPackage.eINSTANCE.getLayoutParams_Layout_alignTop());
				basePart.initLayout_alignTop(layout_alignTopSettings);
				// set the button mode
				basePart.setLayout_alignTopButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_below)) {
				// init part
				layout_belowSettings = new EObjectFlatComboSettings(layoutParams, DroidPackage.eINSTANCE.getLayoutParams_Layout_below());
				basePart.initLayout_below(layout_belowSettings);
				// set the button mode
				basePart.setLayout_belowButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_toLeftOf)) {
				// init part
				layout_toLeftOfSettings = new EObjectFlatComboSettings(layoutParams, DroidPackage.eINSTANCE.getLayoutParams_Layout_toLeftOf());
				basePart.initLayout_toLeftOf(layout_toLeftOfSettings);
				// set the button mode
				basePart.setLayout_toLeftOfButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_toRightOf)) {
				// init part
				layout_toRightOfSettings = new EObjectFlatComboSettings(layoutParams, DroidPackage.eINSTANCE.getLayoutParams_Layout_toRightOf());
				basePart.initLayout_toRightOf(layout_toRightOfSettings);
				// set the button mode
				basePart.setLayout_toRightOfButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToLayout_above(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof View); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for layout_above
			// End of user code
			
			basePart.addFilterToLayout_alignBaseline(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof View); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for layout_alignBaseline
			// End of user code
			
			basePart.addFilterToLayout_alignBottom(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof View); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for layout_alignBottom
			// End of user code
			
			basePart.addFilterToLayout_alignLeft(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof View); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for layout_alignLeft
			// End of user code
			
			basePart.addFilterToLayout_alignTop(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof View); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for layout_alignTop
			// End of user code
			
			basePart.addFilterToLayout_below(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof View); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for layout_below
			// End of user code
			
			basePart.addFilterToLayout_toLeftOf(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof View); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for layout_toLeftOf
			// End of user code
			
			basePart.addFilterToLayout_toRightOf(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof View); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for layout_toRightOf
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
		LayoutParams layoutParams = (LayoutParams)semanticObject;
		if (DroidViewsRepository.LayoutParams.Properties.layout_above == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				layout_aboveSettings.setToReference((View)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				View eObject = DroidFactory.eINSTANCE.createView();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				layout_aboveSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.LayoutParams.Properties.layout_alignBaseline == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				layout_alignBaselineSettings.setToReference((View)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				View eObject = DroidFactory.eINSTANCE.createView();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				layout_alignBaselineSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.LayoutParams.Properties.layout_alignBottom == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				layout_alignBottomSettings.setToReference((View)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				View eObject = DroidFactory.eINSTANCE.createView();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				layout_alignBottomSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.LayoutParams.Properties.layout_alignLeft == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				layout_alignLeftSettings.setToReference((View)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				View eObject = DroidFactory.eINSTANCE.createView();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				layout_alignLeftSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.LayoutParams.Properties.layout_alignTop == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				layout_alignTopSettings.setToReference((View)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				View eObject = DroidFactory.eINSTANCE.createView();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				layout_alignTopSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.LayoutParams.Properties.layout_below == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				layout_belowSettings.setToReference((View)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				View eObject = DroidFactory.eINSTANCE.createView();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				layout_belowSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.LayoutParams.Properties.layout_toLeftOf == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				layout_toLeftOfSettings.setToReference((View)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				View eObject = DroidFactory.eINSTANCE.createView();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				layout_toLeftOfSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.LayoutParams.Properties.layout_toRightOf == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				layout_toRightOfSettings.setToReference((View)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				View eObject = DroidFactory.eINSTANCE.createView();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				layout_toRightOfSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			LayoutParamsPropertiesEditionPart basePart = (LayoutParamsPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getLayoutParams_Layout_above().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_above))
				basePart.setLayout_above((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getLayoutParams_Layout_alignBaseline().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_alignBaseline))
				basePart.setLayout_alignBaseline((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getLayoutParams_Layout_alignBottom().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_alignBottom))
				basePart.setLayout_alignBottom((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getLayoutParams_Layout_alignLeft().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_alignLeft))
				basePart.setLayout_alignLeft((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getLayoutParams_Layout_alignTop().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_alignTop))
				basePart.setLayout_alignTop((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getLayoutParams_Layout_below().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_below))
				basePart.setLayout_below((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getLayoutParams_Layout_toLeftOf().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_toLeftOf))
				basePart.setLayout_toLeftOf((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getLayoutParams_Layout_toRightOf().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LayoutParams.Properties.layout_toRightOf))
				basePart.setLayout_toRightOf((EObject)msg.getNewValue());
			
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
