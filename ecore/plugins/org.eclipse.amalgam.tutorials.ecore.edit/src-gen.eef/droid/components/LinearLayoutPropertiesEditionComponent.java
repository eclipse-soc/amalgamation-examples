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

import droid.DroidFactory;
import droid.DroidPackage;
import droid.LayoutOrientationKind;
import droid.LayoutVisibilityKind;
import droid.LinearLayout;
import droid.View;
import droid.parts.DroidViewsRepository;
import droid.parts.LinearLayoutPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class LinearLayoutPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for nextFocusDown EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings nextFocusDownSettings;
	
	/**
	 * Settings for nextFocusLeft EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings nextFocusLeftSettings;
	
	/**
	 * Settings for nextFocusRight EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings nextFocusRightSettings;
	
	/**
	 * Settings for nextFocusUp EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings nextFocusUpSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public LinearLayoutPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject linearLayout, String editing_mode) {
		super(editingContext, linearLayout, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.LinearLayout.class;
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
			final LinearLayout linearLayout = (LinearLayout)elt;
			final LinearLayoutPropertiesEditionPart basePart = (LinearLayoutPropertiesEditionPart)editingPart;
			// init values
			if (linearLayout.getName() != null && isAccessible(DroidViewsRepository.LinearLayout.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), linearLayout.getName()));
			
			if (linearLayout.getAlpha() != null && isAccessible(DroidViewsRepository.LinearLayout.Properties.alpha))
				basePart.setAlpha(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEFloatObject(), linearLayout.getAlpha()));
			
			if (isAccessible(DroidViewsRepository.LinearLayout.Properties.nextFocusDown)) {
				// init part
				nextFocusDownSettings = new EObjectFlatComboSettings(linearLayout, DroidPackage.eINSTANCE.getLayout_NextFocusDown());
				basePart.initNextFocusDown(nextFocusDownSettings);
				// set the button mode
				basePart.setNextFocusDownButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DroidViewsRepository.LinearLayout.Properties.nextFocusLeft)) {
				// init part
				nextFocusLeftSettings = new EObjectFlatComboSettings(linearLayout, DroidPackage.eINSTANCE.getLayout_NextFocusLeft());
				basePart.initNextFocusLeft(nextFocusLeftSettings);
				// set the button mode
				basePart.setNextFocusLeftButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DroidViewsRepository.LinearLayout.Properties.nextFocusRight)) {
				// init part
				nextFocusRightSettings = new EObjectFlatComboSettings(linearLayout, DroidPackage.eINSTANCE.getLayout_NextFocusRight());
				basePart.initNextFocusRight(nextFocusRightSettings);
				// set the button mode
				basePart.setNextFocusRightButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DroidViewsRepository.LinearLayout.Properties.nextFocusUp)) {
				// init part
				nextFocusUpSettings = new EObjectFlatComboSettings(linearLayout, DroidPackage.eINSTANCE.getLayout_NextFocusUp());
				basePart.initNextFocusUp(nextFocusUpSettings);
				// set the button mode
				basePart.setNextFocusUpButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(DroidViewsRepository.LinearLayout.Properties.visibility)) {
				basePart.initVisibility((EEnum) DroidPackage.eINSTANCE.getLayout_Visibility().getEType(), linearLayout.getVisibility());
			}
			if (isAccessible(DroidViewsRepository.LinearLayout.Properties.orientation)) {
				basePart.initOrientation((EEnum) DroidPackage.eINSTANCE.getAbstractLinearLayout_Orientation().getEType(), linearLayout.getOrientation());
			}
			// init filters
			
			
			basePart.addFilterToNextFocusDown(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof View); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for nextFocusDown
			// End of user code
			
			basePart.addFilterToNextFocusLeft(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof View); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for nextFocusLeft
			// End of user code
			
			basePart.addFilterToNextFocusRight(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof View); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for nextFocusRight
			// End of user code
			
			basePart.addFilterToNextFocusUp(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof View); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for nextFocusUp
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
		LinearLayout linearLayout = (LinearLayout)semanticObject;
		if (DroidViewsRepository.LinearLayout.Properties.name == event.getAffectedEditor()) {
			linearLayout.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.LinearLayout.Properties.alpha == event.getAffectedEditor()) {
			linearLayout.setAlpha((java.lang.Float)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEFloatObject(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.LinearLayout.Properties.nextFocusDown == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				nextFocusDownSettings.setToReference((View)event.getNewValue());
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
				nextFocusDownSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.LinearLayout.Properties.nextFocusLeft == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				nextFocusLeftSettings.setToReference((View)event.getNewValue());
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
				nextFocusLeftSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.LinearLayout.Properties.nextFocusRight == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				nextFocusRightSettings.setToReference((View)event.getNewValue());
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
				nextFocusRightSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.LinearLayout.Properties.nextFocusUp == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				nextFocusUpSettings.setToReference((View)event.getNewValue());
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
				nextFocusUpSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.LinearLayout.Properties.visibility == event.getAffectedEditor()) {
			linearLayout.setVisibility((LayoutVisibilityKind)event.getNewValue());
		}
		if (DroidViewsRepository.LinearLayout.Properties.orientation == event.getAffectedEditor()) {
			linearLayout.setOrientation((LayoutOrientationKind)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			LinearLayoutPropertiesEditionPart basePart = (LinearLayoutPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getAbstractView_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LinearLayout.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (DroidPackage.eINSTANCE.getLayout_Alpha().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LinearLayout.Properties.alpha)) {
				if (msg.getNewValue() != null) {
					basePart.setAlpha(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEFloatObject(), msg.getNewValue()));
				} else {
					basePart.setAlpha("");
				}
			}
			if (DroidPackage.eINSTANCE.getLayout_NextFocusDown().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LinearLayout.Properties.nextFocusDown))
				basePart.setNextFocusDown((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getLayout_NextFocusLeft().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LinearLayout.Properties.nextFocusLeft))
				basePart.setNextFocusLeft((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getLayout_NextFocusRight().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LinearLayout.Properties.nextFocusRight))
				basePart.setNextFocusRight((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getLayout_NextFocusUp().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.LinearLayout.Properties.nextFocusUp))
				basePart.setNextFocusUp((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getLayout_Visibility().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.LinearLayout.Properties.visibility))
				basePart.setVisibility((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getAbstractLinearLayout_Orientation().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.LinearLayout.Properties.orientation))
				basePart.setOrientation((Enumerator)msg.getNewValue());
			
			
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
				if (DroidViewsRepository.LinearLayout.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getAbstractView_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getAbstractView_Name().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.LinearLayout.Properties.alpha == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getLayout_Alpha().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getLayout_Alpha().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.LinearLayout.Properties.visibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getLayout_Visibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getLayout_Visibility().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.LinearLayout.Properties.orientation == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getAbstractLinearLayout_Orientation().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getAbstractLinearLayout_Orientation().getEAttributeType(), newValue);
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
