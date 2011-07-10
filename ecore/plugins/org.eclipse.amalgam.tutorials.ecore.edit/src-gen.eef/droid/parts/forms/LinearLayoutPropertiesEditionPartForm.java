/**
 * Generated with Acceleo
 */
package droid.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import droid.parts.DroidViewsRepository;
import droid.parts.LinearLayoutPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class LinearLayoutPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, LinearLayoutPropertiesEditionPart {

	protected Text name;
	protected Text alpha;
	protected EObjectFlatComboViewer nextFocusDown;
	protected EObjectFlatComboViewer nextFocusLeft;
	protected EObjectFlatComboViewer nextFocusRight;
	protected EObjectFlatComboViewer nextFocusUp;
	protected EMFComboViewer visibility;
	protected EMFComboViewer orientation;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LinearLayoutPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence linearLayoutStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = linearLayoutStep.addStep(DroidViewsRepository.LinearLayout.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.LinearLayout.Properties.name);
		propertiesStep.addStep(DroidViewsRepository.LinearLayout.Properties.alpha);
		propertiesStep.addStep(DroidViewsRepository.LinearLayout.Properties.nextFocusDown);
		propertiesStep.addStep(DroidViewsRepository.LinearLayout.Properties.nextFocusLeft);
		propertiesStep.addStep(DroidViewsRepository.LinearLayout.Properties.nextFocusRight);
		propertiesStep.addStep(DroidViewsRepository.LinearLayout.Properties.nextFocusUp);
		propertiesStep.addStep(DroidViewsRepository.LinearLayout.Properties.visibility);
		propertiesStep.addStep(DroidViewsRepository.LinearLayout.Properties.orientation);
		
		
		composer = new PartComposer(linearLayoutStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.LinearLayout.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.LinearLayout.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.LinearLayout.Properties.alpha) {
					return 		createAlphaText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.LinearLayout.Properties.nextFocusDown) {
					return createNextFocusDownFlatComboViewer(parent, widgetFactory);
				}
				if (key == DroidViewsRepository.LinearLayout.Properties.nextFocusLeft) {
					return createNextFocusLeftFlatComboViewer(parent, widgetFactory);
				}
				if (key == DroidViewsRepository.LinearLayout.Properties.nextFocusRight) {
					return createNextFocusRightFlatComboViewer(parent, widgetFactory);
				}
				if (key == DroidViewsRepository.LinearLayout.Properties.nextFocusUp) {
					return createNextFocusUpFlatComboViewer(parent, widgetFactory);
				}
				if (key == DroidViewsRepository.LinearLayout.Properties.visibility) {
					return createVisibilityEMFComboViewer(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.LinearLayout.Properties.orientation) {
					return createOrientationEMFComboViewer(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(DroidMessages.LinearLayoutPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LinearLayoutPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LinearLayout.Properties.name, DroidViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinearLayoutPropertiesEditionPartForm.this, DroidViewsRepository.LinearLayout.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinearLayoutPropertiesEditionPartForm.this, DroidViewsRepository.LinearLayout.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, DroidViewsRepository.LinearLayout.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LinearLayout.Properties.name, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAlphaText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LinearLayoutPropertiesEditionPart_AlphaLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LinearLayout.Properties.alpha, DroidViewsRepository.FORM_KIND));
		alpha = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		alpha.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData alphaData = new GridData(GridData.FILL_HORIZONTAL);
		alpha.setLayoutData(alphaData);
		alpha.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinearLayoutPropertiesEditionPartForm.this, DroidViewsRepository.LinearLayout.Properties.alpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, alpha.getText()));
			}
		});
		alpha.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinearLayoutPropertiesEditionPartForm.this, DroidViewsRepository.LinearLayout.Properties.alpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, alpha.getText()));
				}
			}
		});
		EditingUtils.setID(alpha, DroidViewsRepository.LinearLayout.Properties.alpha);
		EditingUtils.setEEFtype(alpha, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LinearLayout.Properties.alpha, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createNextFocusDownFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LinearLayoutPropertiesEditionPart_NextFocusDownLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LinearLayout.Properties.nextFocusDown, DroidViewsRepository.FORM_KIND));
		nextFocusDown = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.LinearLayout.Properties.nextFocusDown, DroidViewsRepository.FORM_KIND));
		widgetFactory.adapt(nextFocusDown);
		nextFocusDown.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData nextFocusDownData = new GridData(GridData.FILL_HORIZONTAL);
		nextFocusDown.setLayoutData(nextFocusDownData);
		nextFocusDown.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinearLayoutPropertiesEditionPartForm.this, DroidViewsRepository.LinearLayout.Properties.nextFocusDown, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getNextFocusDown()));
			}

		});
		nextFocusDown.setID(DroidViewsRepository.LinearLayout.Properties.nextFocusDown);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LinearLayout.Properties.nextFocusDown, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createNextFocusLeftFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LinearLayoutPropertiesEditionPart_NextFocusLeftLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LinearLayout.Properties.nextFocusLeft, DroidViewsRepository.FORM_KIND));
		nextFocusLeft = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.LinearLayout.Properties.nextFocusLeft, DroidViewsRepository.FORM_KIND));
		widgetFactory.adapt(nextFocusLeft);
		nextFocusLeft.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData nextFocusLeftData = new GridData(GridData.FILL_HORIZONTAL);
		nextFocusLeft.setLayoutData(nextFocusLeftData);
		nextFocusLeft.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinearLayoutPropertiesEditionPartForm.this, DroidViewsRepository.LinearLayout.Properties.nextFocusLeft, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getNextFocusLeft()));
			}

		});
		nextFocusLeft.setID(DroidViewsRepository.LinearLayout.Properties.nextFocusLeft);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LinearLayout.Properties.nextFocusLeft, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createNextFocusRightFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LinearLayoutPropertiesEditionPart_NextFocusRightLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LinearLayout.Properties.nextFocusRight, DroidViewsRepository.FORM_KIND));
		nextFocusRight = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.LinearLayout.Properties.nextFocusRight, DroidViewsRepository.FORM_KIND));
		widgetFactory.adapt(nextFocusRight);
		nextFocusRight.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData nextFocusRightData = new GridData(GridData.FILL_HORIZONTAL);
		nextFocusRight.setLayoutData(nextFocusRightData);
		nextFocusRight.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinearLayoutPropertiesEditionPartForm.this, DroidViewsRepository.LinearLayout.Properties.nextFocusRight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getNextFocusRight()));
			}

		});
		nextFocusRight.setID(DroidViewsRepository.LinearLayout.Properties.nextFocusRight);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LinearLayout.Properties.nextFocusRight, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createNextFocusUpFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LinearLayoutPropertiesEditionPart_NextFocusUpLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LinearLayout.Properties.nextFocusUp, DroidViewsRepository.FORM_KIND));
		nextFocusUp = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.LinearLayout.Properties.nextFocusUp, DroidViewsRepository.FORM_KIND));
		widgetFactory.adapt(nextFocusUp);
		nextFocusUp.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData nextFocusUpData = new GridData(GridData.FILL_HORIZONTAL);
		nextFocusUp.setLayoutData(nextFocusUpData);
		nextFocusUp.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinearLayoutPropertiesEditionPartForm.this, DroidViewsRepository.LinearLayout.Properties.nextFocusUp, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getNextFocusUp()));
			}

		});
		nextFocusUp.setID(DroidViewsRepository.LinearLayout.Properties.nextFocusUp);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LinearLayout.Properties.nextFocusUp, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVisibilityEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LinearLayoutPropertiesEditionPart_VisibilityLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LinearLayout.Properties.visibility, DroidViewsRepository.FORM_KIND));
		visibility = new EMFComboViewer(parent);
		visibility.setContentProvider(new ArrayContentProvider());
		visibility.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData visibilityData = new GridData(GridData.FILL_HORIZONTAL);
		visibility.getCombo().setLayoutData(visibilityData);
		visibility.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinearLayoutPropertiesEditionPartForm.this, DroidViewsRepository.LinearLayout.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
			}

		});
		visibility.setID(DroidViewsRepository.LinearLayout.Properties.visibility);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LinearLayout.Properties.visibility, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOrientationEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LinearLayoutPropertiesEditionPart_OrientationLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LinearLayout.Properties.orientation, DroidViewsRepository.FORM_KIND));
		orientation = new EMFComboViewer(parent);
		orientation.setContentProvider(new ArrayContentProvider());
		orientation.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData orientationData = new GridData(GridData.FILL_HORIZONTAL);
		orientation.getCombo().setLayoutData(orientationData);
		orientation.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinearLayoutPropertiesEditionPartForm.this, DroidViewsRepository.LinearLayout.Properties.orientation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOrientation()));
			}

		});
		orientation.setID(DroidViewsRepository.LinearLayout.Properties.orientation);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LinearLayout.Properties.orientation, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#getAlpha()
	 * 
	 */
	public String getAlpha() {
		return alpha.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#setAlpha(String newValue)
	 * 
	 */
	public void setAlpha(String newValue) {
		if (newValue != null) {
			alpha.setText(newValue);
		} else {
			alpha.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#getNextFocusDown()
	 * 
	 */
	public EObject getNextFocusDown() {
		if (nextFocusDown.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) nextFocusDown.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#initNextFocusDown(EObjectFlatComboSettings)
	 */
	public void initNextFocusDown(EObjectFlatComboSettings settings) {
		nextFocusDown.setInput(settings);
		if (current != null) {
			nextFocusDown.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#setNextFocusDown(EObject newValue)
	 * 
	 */
	public void setNextFocusDown(EObject newValue) {
		if (newValue != null) {
			nextFocusDown.setSelection(new StructuredSelection(newValue));
		} else {
			nextFocusDown.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#setNextFocusDownButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNextFocusDownButtonMode(ButtonsModeEnum newValue) {
		nextFocusDown.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#addFilterNextFocusDown(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNextFocusDown(ViewerFilter filter) {
		nextFocusDown.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#addBusinessFilterNextFocusDown(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNextFocusDown(ViewerFilter filter) {
		nextFocusDown.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#getNextFocusLeft()
	 * 
	 */
	public EObject getNextFocusLeft() {
		if (nextFocusLeft.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) nextFocusLeft.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#initNextFocusLeft(EObjectFlatComboSettings)
	 */
	public void initNextFocusLeft(EObjectFlatComboSettings settings) {
		nextFocusLeft.setInput(settings);
		if (current != null) {
			nextFocusLeft.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#setNextFocusLeft(EObject newValue)
	 * 
	 */
	public void setNextFocusLeft(EObject newValue) {
		if (newValue != null) {
			nextFocusLeft.setSelection(new StructuredSelection(newValue));
		} else {
			nextFocusLeft.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#setNextFocusLeftButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNextFocusLeftButtonMode(ButtonsModeEnum newValue) {
		nextFocusLeft.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#addFilterNextFocusLeft(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNextFocusLeft(ViewerFilter filter) {
		nextFocusLeft.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#addBusinessFilterNextFocusLeft(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNextFocusLeft(ViewerFilter filter) {
		nextFocusLeft.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#getNextFocusRight()
	 * 
	 */
	public EObject getNextFocusRight() {
		if (nextFocusRight.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) nextFocusRight.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#initNextFocusRight(EObjectFlatComboSettings)
	 */
	public void initNextFocusRight(EObjectFlatComboSettings settings) {
		nextFocusRight.setInput(settings);
		if (current != null) {
			nextFocusRight.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#setNextFocusRight(EObject newValue)
	 * 
	 */
	public void setNextFocusRight(EObject newValue) {
		if (newValue != null) {
			nextFocusRight.setSelection(new StructuredSelection(newValue));
		} else {
			nextFocusRight.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#setNextFocusRightButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNextFocusRightButtonMode(ButtonsModeEnum newValue) {
		nextFocusRight.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#addFilterNextFocusRight(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNextFocusRight(ViewerFilter filter) {
		nextFocusRight.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#addBusinessFilterNextFocusRight(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNextFocusRight(ViewerFilter filter) {
		nextFocusRight.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#getNextFocusUp()
	 * 
	 */
	public EObject getNextFocusUp() {
		if (nextFocusUp.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) nextFocusUp.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#initNextFocusUp(EObjectFlatComboSettings)
	 */
	public void initNextFocusUp(EObjectFlatComboSettings settings) {
		nextFocusUp.setInput(settings);
		if (current != null) {
			nextFocusUp.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#setNextFocusUp(EObject newValue)
	 * 
	 */
	public void setNextFocusUp(EObject newValue) {
		if (newValue != null) {
			nextFocusUp.setSelection(new StructuredSelection(newValue));
		} else {
			nextFocusUp.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#setNextFocusUpButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNextFocusUpButtonMode(ButtonsModeEnum newValue) {
		nextFocusUp.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#addFilterNextFocusUp(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNextFocusUp(ViewerFilter filter) {
		nextFocusUp.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#addBusinessFilterNextFocusUp(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNextFocusUp(ViewerFilter filter) {
		nextFocusUp.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#getVisibility()
	 * 
	 */
	public Enumerator getVisibility() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) visibility.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#initVisibility(EEnum eenum, Enumerator current)
	 */
	public void initVisibility(EEnum eenum, Enumerator current) {
		visibility.setInput(eenum.getELiterals());
		visibility.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#setVisibility(Enumerator newValue)
	 * 
	 */
	public void setVisibility(Enumerator newValue) {
		visibility.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#getOrientation()
	 * 
	 */
	public Enumerator getOrientation() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) orientation.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#initOrientation(EEnum eenum, Enumerator current)
	 */
	public void initOrientation(EEnum eenum, Enumerator current) {
		orientation.setInput(eenum.getELiterals());
		orientation.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LinearLayoutPropertiesEditionPart#setOrientation(Enumerator newValue)
	 * 
	 */
	public void setOrientation(Enumerator newValue) {
		orientation.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.LinearLayout_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
