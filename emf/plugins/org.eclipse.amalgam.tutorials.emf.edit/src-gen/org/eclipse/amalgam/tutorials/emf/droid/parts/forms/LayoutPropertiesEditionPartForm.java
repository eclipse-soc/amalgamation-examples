/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.parts.forms;

// Start of user code for imports
import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart;
import org.eclipse.amalgam.tutorials.emf.droid.providers.DroidMessages;
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


// End of user code

/**
 * 
 * 
 */
public class LayoutPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, LayoutPropertiesEditionPart {

	protected Text name;
	protected Text alpha;
	protected EObjectFlatComboViewer nextFocusDown;
	protected EObjectFlatComboViewer nextFocusLeft;
	protected EObjectFlatComboViewer nextFocusRight;
	protected EObjectFlatComboViewer nextFocusUp;
	protected EMFComboViewer visibility;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LayoutPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence layoutStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = layoutStep.addStep(DroidViewsRepository.Layout.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.Layout.Properties.name);
		propertiesStep.addStep(DroidViewsRepository.Layout.Properties.alpha);
		propertiesStep.addStep(DroidViewsRepository.Layout.Properties.nextFocusDown);
		propertiesStep.addStep(DroidViewsRepository.Layout.Properties.nextFocusLeft);
		propertiesStep.addStep(DroidViewsRepository.Layout.Properties.nextFocusRight);
		propertiesStep.addStep(DroidViewsRepository.Layout.Properties.nextFocusUp);
		propertiesStep.addStep(DroidViewsRepository.Layout.Properties.visibility);
		
		
		composer = new PartComposer(layoutStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.Layout.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.Layout.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.Layout.Properties.alpha) {
					return 		createAlphaText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.Layout.Properties.nextFocusDown) {
					return createNextFocusDownFlatComboViewer(parent, widgetFactory);
				}
				if (key == DroidViewsRepository.Layout.Properties.nextFocusLeft) {
					return createNextFocusLeftFlatComboViewer(parent, widgetFactory);
				}
				if (key == DroidViewsRepository.Layout.Properties.nextFocusRight) {
					return createNextFocusRightFlatComboViewer(parent, widgetFactory);
				}
				if (key == DroidViewsRepository.Layout.Properties.nextFocusUp) {
					return createNextFocusUpFlatComboViewer(parent, widgetFactory);
				}
				if (key == DroidViewsRepository.Layout.Properties.visibility) {
					return createVisibilityEMFComboViewer(widgetFactory, parent);
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
		propertiesSection.setText(DroidMessages.LayoutPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LayoutPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.Layout.Properties.name, DroidViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutPropertiesEditionPartForm.this, DroidViewsRepository.Layout.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutPropertiesEditionPartForm.this, DroidViewsRepository.Layout.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, DroidViewsRepository.Layout.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.Layout.Properties.name, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAlphaText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LayoutPropertiesEditionPart_AlphaLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.Layout.Properties.alpha, DroidViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutPropertiesEditionPartForm.this, DroidViewsRepository.Layout.Properties.alpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, alpha.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutPropertiesEditionPartForm.this, DroidViewsRepository.Layout.Properties.alpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, alpha.getText()));
				}
			}
		});
		EditingUtils.setID(alpha, DroidViewsRepository.Layout.Properties.alpha);
		EditingUtils.setEEFtype(alpha, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.Layout.Properties.alpha, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createNextFocusDownFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LayoutPropertiesEditionPart_NextFocusDownLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.Layout.Properties.nextFocusDown, DroidViewsRepository.FORM_KIND));
		nextFocusDown = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.Layout.Properties.nextFocusDown, DroidViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutPropertiesEditionPartForm.this, DroidViewsRepository.Layout.Properties.nextFocusDown, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getNextFocusDown()));
			}

		});
		nextFocusDown.setID(DroidViewsRepository.Layout.Properties.nextFocusDown);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.Layout.Properties.nextFocusDown, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createNextFocusLeftFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LayoutPropertiesEditionPart_NextFocusLeftLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.Layout.Properties.nextFocusLeft, DroidViewsRepository.FORM_KIND));
		nextFocusLeft = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.Layout.Properties.nextFocusLeft, DroidViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutPropertiesEditionPartForm.this, DroidViewsRepository.Layout.Properties.nextFocusLeft, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getNextFocusLeft()));
			}

		});
		nextFocusLeft.setID(DroidViewsRepository.Layout.Properties.nextFocusLeft);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.Layout.Properties.nextFocusLeft, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createNextFocusRightFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LayoutPropertiesEditionPart_NextFocusRightLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.Layout.Properties.nextFocusRight, DroidViewsRepository.FORM_KIND));
		nextFocusRight = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.Layout.Properties.nextFocusRight, DroidViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutPropertiesEditionPartForm.this, DroidViewsRepository.Layout.Properties.nextFocusRight, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getNextFocusRight()));
			}

		});
		nextFocusRight.setID(DroidViewsRepository.Layout.Properties.nextFocusRight);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.Layout.Properties.nextFocusRight, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createNextFocusUpFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LayoutPropertiesEditionPart_NextFocusUpLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.Layout.Properties.nextFocusUp, DroidViewsRepository.FORM_KIND));
		nextFocusUp = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.Layout.Properties.nextFocusUp, DroidViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutPropertiesEditionPartForm.this, DroidViewsRepository.Layout.Properties.nextFocusUp, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getNextFocusUp()));
			}

		});
		nextFocusUp.setID(DroidViewsRepository.Layout.Properties.nextFocusUp);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.Layout.Properties.nextFocusUp, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVisibilityEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.LayoutPropertiesEditionPart_VisibilityLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.Layout.Properties.visibility, DroidViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutPropertiesEditionPartForm.this, DroidViewsRepository.Layout.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
			}

		});
		visibility.setID(DroidViewsRepository.Layout.Properties.visibility);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.Layout.Properties.visibility, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#getAlpha()
	 * 
	 */
	public String getAlpha() {
		return alpha.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#setAlpha(String newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#getNextFocusDown()
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#initNextFocusDown(EObjectFlatComboSettings)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#setNextFocusDown(EObject newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#setNextFocusDownButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNextFocusDownButtonMode(ButtonsModeEnum newValue) {
		nextFocusDown.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#addFilterNextFocusDown(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNextFocusDown(ViewerFilter filter) {
		nextFocusDown.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#addBusinessFilterNextFocusDown(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNextFocusDown(ViewerFilter filter) {
		nextFocusDown.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#getNextFocusLeft()
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#initNextFocusLeft(EObjectFlatComboSettings)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#setNextFocusLeft(EObject newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#setNextFocusLeftButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNextFocusLeftButtonMode(ButtonsModeEnum newValue) {
		nextFocusLeft.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#addFilterNextFocusLeft(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNextFocusLeft(ViewerFilter filter) {
		nextFocusLeft.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#addBusinessFilterNextFocusLeft(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNextFocusLeft(ViewerFilter filter) {
		nextFocusLeft.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#getNextFocusRight()
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#initNextFocusRight(EObjectFlatComboSettings)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#setNextFocusRight(EObject newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#setNextFocusRightButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNextFocusRightButtonMode(ButtonsModeEnum newValue) {
		nextFocusRight.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#addFilterNextFocusRight(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNextFocusRight(ViewerFilter filter) {
		nextFocusRight.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#addBusinessFilterNextFocusRight(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNextFocusRight(ViewerFilter filter) {
		nextFocusRight.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#getNextFocusUp()
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#initNextFocusUp(EObjectFlatComboSettings)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#setNextFocusUp(EObject newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#setNextFocusUpButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNextFocusUpButtonMode(ButtonsModeEnum newValue) {
		nextFocusUp.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#addFilterNextFocusUp(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNextFocusUp(ViewerFilter filter) {
		nextFocusUp.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#addBusinessFilterNextFocusUp(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNextFocusUp(ViewerFilter filter) {
		nextFocusUp.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#getVisibility()
	 * 
	 */
	public Enumerator getVisibility() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) visibility.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#initVisibility(EEnum eenum, Enumerator current)
	 */
	public void initVisibility(EEnum eenum, Enumerator current) {
		visibility.setInput(eenum.getELiterals());
		visibility.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutPropertiesEditionPart#setVisibility(Enumerator newValue)
	 * 
	 */
	public void setVisibility(Enumerator newValue) {
		visibility.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.Layout_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
