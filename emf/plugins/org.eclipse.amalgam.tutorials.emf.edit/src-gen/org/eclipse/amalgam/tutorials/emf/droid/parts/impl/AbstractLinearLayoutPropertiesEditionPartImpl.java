/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.parts.impl;

// Start of user code for imports
import org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart;
import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.providers.DroidMessages;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;


// End of user code

/**
 * 
 * 
 */
public class AbstractLinearLayoutPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AbstractLinearLayoutPropertiesEditionPart {

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
	public AbstractLinearLayoutPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence abstractLinearLayoutStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = abstractLinearLayoutStep.addStep(DroidViewsRepository.AbstractLinearLayout.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.AbstractLinearLayout.Properties.name);
		propertiesStep.addStep(DroidViewsRepository.AbstractLinearLayout.Properties.alpha);
		propertiesStep.addStep(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusDown);
		propertiesStep.addStep(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusLeft);
		propertiesStep.addStep(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusRight);
		propertiesStep.addStep(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusUp);
		propertiesStep.addStep(DroidViewsRepository.AbstractLinearLayout.Properties.visibility);
		propertiesStep.addStep(DroidViewsRepository.AbstractLinearLayout.Properties.orientation);
		
		
		composer = new PartComposer(abstractLinearLayoutStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.AbstractLinearLayout.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.AbstractLinearLayout.Properties.name) {
					return createNameText(parent);
				}
				if (key == DroidViewsRepository.AbstractLinearLayout.Properties.alpha) {
					return createAlphaText(parent);
				}
				if (key == DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusDown) {
					return createNextFocusDownFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusLeft) {
					return createNextFocusLeftFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusRight) {
					return createNextFocusRightFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusUp) {
					return createNextFocusUpFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.AbstractLinearLayout.Properties.visibility) {
					return createVisibilityEMFComboViewer(parent);
				}
				if (key == DroidViewsRepository.AbstractLinearLayout.Properties.orientation) {
					return createOrientationEMFComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(DroidMessages.AbstractLinearLayoutPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.AbstractLinearLayoutPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.AbstractLinearLayout.Properties.name, DroidViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AbstractLinearLayoutPropertiesEditionPartImpl.this, DroidViewsRepository.AbstractLinearLayout.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AbstractLinearLayoutPropertiesEditionPartImpl.this, DroidViewsRepository.AbstractLinearLayout.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, DroidViewsRepository.AbstractLinearLayout.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.AbstractLinearLayout.Properties.name, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAlphaText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.AbstractLinearLayoutPropertiesEditionPart_AlphaLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.AbstractLinearLayout.Properties.alpha, DroidViewsRepository.SWT_KIND));
		alpha = new Text(parent, SWT.BORDER);
		GridData alphaData = new GridData(GridData.FILL_HORIZONTAL);
		alpha.setLayoutData(alphaData);
		alpha.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AbstractLinearLayoutPropertiesEditionPartImpl.this, DroidViewsRepository.AbstractLinearLayout.Properties.alpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, alpha.getText()));
			}

		});
		alpha.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AbstractLinearLayoutPropertiesEditionPartImpl.this, DroidViewsRepository.AbstractLinearLayout.Properties.alpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, alpha.getText()));
				}
			}

		});
		EditingUtils.setID(alpha, DroidViewsRepository.AbstractLinearLayout.Properties.alpha);
		EditingUtils.setEEFtype(alpha, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.AbstractLinearLayout.Properties.alpha, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createNextFocusDownFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.AbstractLinearLayoutPropertiesEditionPart_NextFocusDownLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusDown, DroidViewsRepository.SWT_KIND));
		nextFocusDown = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusDown, DroidViewsRepository.SWT_KIND));
		nextFocusDown.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		nextFocusDown.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AbstractLinearLayoutPropertiesEditionPartImpl.this, DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusDown, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getNextFocusDown()));
			}

		});
		GridData nextFocusDownData = new GridData(GridData.FILL_HORIZONTAL);
		nextFocusDown.setLayoutData(nextFocusDownData);
		nextFocusDown.setID(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusDown);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusDown, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createNextFocusLeftFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.AbstractLinearLayoutPropertiesEditionPart_NextFocusLeftLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusLeft, DroidViewsRepository.SWT_KIND));
		nextFocusLeft = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusLeft, DroidViewsRepository.SWT_KIND));
		nextFocusLeft.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		nextFocusLeft.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AbstractLinearLayoutPropertiesEditionPartImpl.this, DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusLeft, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getNextFocusLeft()));
			}

		});
		GridData nextFocusLeftData = new GridData(GridData.FILL_HORIZONTAL);
		nextFocusLeft.setLayoutData(nextFocusLeftData);
		nextFocusLeft.setID(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusLeft);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusLeft, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createNextFocusRightFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.AbstractLinearLayoutPropertiesEditionPart_NextFocusRightLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusRight, DroidViewsRepository.SWT_KIND));
		nextFocusRight = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusRight, DroidViewsRepository.SWT_KIND));
		nextFocusRight.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		nextFocusRight.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AbstractLinearLayoutPropertiesEditionPartImpl.this, DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusRight, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getNextFocusRight()));
			}

		});
		GridData nextFocusRightData = new GridData(GridData.FILL_HORIZONTAL);
		nextFocusRight.setLayoutData(nextFocusRightData);
		nextFocusRight.setID(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusRight);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusRight, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createNextFocusUpFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.AbstractLinearLayoutPropertiesEditionPart_NextFocusUpLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusUp, DroidViewsRepository.SWT_KIND));
		nextFocusUp = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusUp, DroidViewsRepository.SWT_KIND));
		nextFocusUp.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		nextFocusUp.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AbstractLinearLayoutPropertiesEditionPartImpl.this, DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusUp, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getNextFocusUp()));
			}

		});
		GridData nextFocusUpData = new GridData(GridData.FILL_HORIZONTAL);
		nextFocusUp.setLayoutData(nextFocusUpData);
		nextFocusUp.setID(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusUp);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.AbstractLinearLayout.Properties.nextFocusUp, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVisibilityEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.AbstractLinearLayoutPropertiesEditionPart_VisibilityLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.AbstractLinearLayout.Properties.visibility, DroidViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AbstractLinearLayoutPropertiesEditionPartImpl.this, DroidViewsRepository.AbstractLinearLayout.Properties.visibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVisibility()));
			}

		});
		visibility.setID(DroidViewsRepository.AbstractLinearLayout.Properties.visibility);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.AbstractLinearLayout.Properties.visibility, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOrientationEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.AbstractLinearLayoutPropertiesEditionPart_OrientationLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.AbstractLinearLayout.Properties.orientation, DroidViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AbstractLinearLayoutPropertiesEditionPartImpl.this, DroidViewsRepository.AbstractLinearLayout.Properties.orientation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOrientation()));
			}

		});
		orientation.setID(DroidViewsRepository.AbstractLinearLayout.Properties.orientation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.AbstractLinearLayout.Properties.orientation, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#getAlpha()
	 * 
	 */
	public String getAlpha() {
		return alpha.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#setAlpha(String newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#getNextFocusDown()
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#initNextFocusDown(EObjectFlatComboSettings)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#setNextFocusDown(EObject newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#setNextFocusDownButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNextFocusDownButtonMode(ButtonsModeEnum newValue) {
		nextFocusDown.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#addFilterNextFocusDown(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNextFocusDown(ViewerFilter filter) {
		nextFocusDown.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#addBusinessFilterNextFocusDown(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNextFocusDown(ViewerFilter filter) {
		nextFocusDown.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#getNextFocusLeft()
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#initNextFocusLeft(EObjectFlatComboSettings)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#setNextFocusLeft(EObject newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#setNextFocusLeftButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNextFocusLeftButtonMode(ButtonsModeEnum newValue) {
		nextFocusLeft.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#addFilterNextFocusLeft(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNextFocusLeft(ViewerFilter filter) {
		nextFocusLeft.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#addBusinessFilterNextFocusLeft(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNextFocusLeft(ViewerFilter filter) {
		nextFocusLeft.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#getNextFocusRight()
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#initNextFocusRight(EObjectFlatComboSettings)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#setNextFocusRight(EObject newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#setNextFocusRightButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNextFocusRightButtonMode(ButtonsModeEnum newValue) {
		nextFocusRight.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#addFilterNextFocusRight(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNextFocusRight(ViewerFilter filter) {
		nextFocusRight.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#addBusinessFilterNextFocusRight(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNextFocusRight(ViewerFilter filter) {
		nextFocusRight.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#getNextFocusUp()
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#initNextFocusUp(EObjectFlatComboSettings)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#setNextFocusUp(EObject newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#setNextFocusUpButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNextFocusUpButtonMode(ButtonsModeEnum newValue) {
		nextFocusUp.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#addFilterNextFocusUp(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNextFocusUp(ViewerFilter filter) {
		nextFocusUp.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#addBusinessFilterNextFocusUp(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNextFocusUp(ViewerFilter filter) {
		nextFocusUp.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#getVisibility()
	 * 
	 */
	public Enumerator getVisibility() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) visibility.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#initVisibility(EEnum eenum, Enumerator current)
	 */
	public void initVisibility(EEnum eenum, Enumerator current) {
		visibility.setInput(eenum.getELiterals());
		visibility.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#setVisibility(Enumerator newValue)
	 * 
	 */
	public void setVisibility(Enumerator newValue) {
		visibility.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#getOrientation()
	 * 
	 */
	public Enumerator getOrientation() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) orientation.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#initOrientation(EEnum eenum, Enumerator current)
	 */
	public void initOrientation(EEnum eenum, Enumerator current) {
		orientation.setInput(eenum.getELiterals());
		orientation.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AbstractLinearLayoutPropertiesEditionPart#setOrientation(Enumerator newValue)
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
		return DroidMessages.AbstractLinearLayout_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
