/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.parts.impl;

// Start of user code for imports
import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart;
import org.eclipse.amalgam.tutorials.emf.droid.providers.DroidMessages;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;


// End of user code

/**
 * 
 * 
 */
public class LayoutParamsPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, LayoutParamsPropertiesEditionPart {

	protected EObjectFlatComboViewer layout_above;
	protected EObjectFlatComboViewer layout_alignBaseline;
	protected EObjectFlatComboViewer layout_alignBottom;
	protected EObjectFlatComboViewer layout_alignLeft;
	protected EObjectFlatComboViewer layout_alignTop;
	protected EObjectFlatComboViewer layout_below;
	protected EObjectFlatComboViewer layout_toLeftOf;
	protected EObjectFlatComboViewer layout_toRightOf;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LayoutParamsPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence layoutParamsStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = layoutParamsStep.addStep(DroidViewsRepository.LayoutParams.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.LayoutParams.Properties.layout_above);
		propertiesStep.addStep(DroidViewsRepository.LayoutParams.Properties.layout_alignBaseline);
		propertiesStep.addStep(DroidViewsRepository.LayoutParams.Properties.layout_alignBottom);
		propertiesStep.addStep(DroidViewsRepository.LayoutParams.Properties.layout_alignLeft);
		propertiesStep.addStep(DroidViewsRepository.LayoutParams.Properties.layout_alignTop);
		propertiesStep.addStep(DroidViewsRepository.LayoutParams.Properties.layout_below);
		propertiesStep.addStep(DroidViewsRepository.LayoutParams.Properties.layout_toLeftOf);
		propertiesStep.addStep(DroidViewsRepository.LayoutParams.Properties.layout_toRightOf);
		
		
		composer = new PartComposer(layoutParamsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.LayoutParams.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.LayoutParams.Properties.layout_above) {
					return createLayout_aboveFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.LayoutParams.Properties.layout_alignBaseline) {
					return createLayout_alignBaselineFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.LayoutParams.Properties.layout_alignBottom) {
					return createLayout_alignBottomFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.LayoutParams.Properties.layout_alignLeft) {
					return createLayout_alignLeftFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.LayoutParams.Properties.layout_alignTop) {
					return createLayout_alignTopFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.LayoutParams.Properties.layout_below) {
					return createLayout_belowFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.LayoutParams.Properties.layout_toLeftOf) {
					return createLayout_toLeftOfFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.LayoutParams.Properties.layout_toRightOf) {
					return createLayout_toRightOfFlatComboViewer(parent);
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
		propertiesGroup.setText(DroidMessages.LayoutParamsPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createLayout_aboveFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.LayoutParamsPropertiesEditionPart_Layout_aboveLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_above, DroidViewsRepository.SWT_KIND));
		layout_above = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_above, DroidViewsRepository.SWT_KIND));
		layout_above.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		layout_above.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutParamsPropertiesEditionPartImpl.this, DroidViewsRepository.LayoutParams.Properties.layout_above, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getLayout_above()));
			}

		});
		GridData layout_aboveData = new GridData(GridData.FILL_HORIZONTAL);
		layout_above.setLayoutData(layout_aboveData);
		layout_above.setID(DroidViewsRepository.LayoutParams.Properties.layout_above);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LayoutParams.Properties.layout_above, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createLayout_alignBaselineFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.LayoutParamsPropertiesEditionPart_Layout_alignBaselineLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_alignBaseline, DroidViewsRepository.SWT_KIND));
		layout_alignBaseline = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_alignBaseline, DroidViewsRepository.SWT_KIND));
		layout_alignBaseline.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		layout_alignBaseline.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutParamsPropertiesEditionPartImpl.this, DroidViewsRepository.LayoutParams.Properties.layout_alignBaseline, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getLayout_alignBaseline()));
			}

		});
		GridData layout_alignBaselineData = new GridData(GridData.FILL_HORIZONTAL);
		layout_alignBaseline.setLayoutData(layout_alignBaselineData);
		layout_alignBaseline.setID(DroidViewsRepository.LayoutParams.Properties.layout_alignBaseline);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LayoutParams.Properties.layout_alignBaseline, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createLayout_alignBottomFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.LayoutParamsPropertiesEditionPart_Layout_alignBottomLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_alignBottom, DroidViewsRepository.SWT_KIND));
		layout_alignBottom = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_alignBottom, DroidViewsRepository.SWT_KIND));
		layout_alignBottom.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		layout_alignBottom.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutParamsPropertiesEditionPartImpl.this, DroidViewsRepository.LayoutParams.Properties.layout_alignBottom, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getLayout_alignBottom()));
			}

		});
		GridData layout_alignBottomData = new GridData(GridData.FILL_HORIZONTAL);
		layout_alignBottom.setLayoutData(layout_alignBottomData);
		layout_alignBottom.setID(DroidViewsRepository.LayoutParams.Properties.layout_alignBottom);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LayoutParams.Properties.layout_alignBottom, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createLayout_alignLeftFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.LayoutParamsPropertiesEditionPart_Layout_alignLeftLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_alignLeft, DroidViewsRepository.SWT_KIND));
		layout_alignLeft = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_alignLeft, DroidViewsRepository.SWT_KIND));
		layout_alignLeft.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		layout_alignLeft.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutParamsPropertiesEditionPartImpl.this, DroidViewsRepository.LayoutParams.Properties.layout_alignLeft, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getLayout_alignLeft()));
			}

		});
		GridData layout_alignLeftData = new GridData(GridData.FILL_HORIZONTAL);
		layout_alignLeft.setLayoutData(layout_alignLeftData);
		layout_alignLeft.setID(DroidViewsRepository.LayoutParams.Properties.layout_alignLeft);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LayoutParams.Properties.layout_alignLeft, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createLayout_alignTopFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.LayoutParamsPropertiesEditionPart_Layout_alignTopLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_alignTop, DroidViewsRepository.SWT_KIND));
		layout_alignTop = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_alignTop, DroidViewsRepository.SWT_KIND));
		layout_alignTop.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		layout_alignTop.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutParamsPropertiesEditionPartImpl.this, DroidViewsRepository.LayoutParams.Properties.layout_alignTop, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getLayout_alignTop()));
			}

		});
		GridData layout_alignTopData = new GridData(GridData.FILL_HORIZONTAL);
		layout_alignTop.setLayoutData(layout_alignTopData);
		layout_alignTop.setID(DroidViewsRepository.LayoutParams.Properties.layout_alignTop);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LayoutParams.Properties.layout_alignTop, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createLayout_belowFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.LayoutParamsPropertiesEditionPart_Layout_belowLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_below, DroidViewsRepository.SWT_KIND));
		layout_below = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_below, DroidViewsRepository.SWT_KIND));
		layout_below.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		layout_below.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutParamsPropertiesEditionPartImpl.this, DroidViewsRepository.LayoutParams.Properties.layout_below, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getLayout_below()));
			}

		});
		GridData layout_belowData = new GridData(GridData.FILL_HORIZONTAL);
		layout_below.setLayoutData(layout_belowData);
		layout_below.setID(DroidViewsRepository.LayoutParams.Properties.layout_below);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LayoutParams.Properties.layout_below, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createLayout_toLeftOfFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.LayoutParamsPropertiesEditionPart_Layout_toLeftOfLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_toLeftOf, DroidViewsRepository.SWT_KIND));
		layout_toLeftOf = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_toLeftOf, DroidViewsRepository.SWT_KIND));
		layout_toLeftOf.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		layout_toLeftOf.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutParamsPropertiesEditionPartImpl.this, DroidViewsRepository.LayoutParams.Properties.layout_toLeftOf, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getLayout_toLeftOf()));
			}

		});
		GridData layout_toLeftOfData = new GridData(GridData.FILL_HORIZONTAL);
		layout_toLeftOf.setLayoutData(layout_toLeftOfData);
		layout_toLeftOf.setID(DroidViewsRepository.LayoutParams.Properties.layout_toLeftOf);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LayoutParams.Properties.layout_toLeftOf, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createLayout_toRightOfFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.LayoutParamsPropertiesEditionPart_Layout_toRightOfLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_toRightOf, DroidViewsRepository.SWT_KIND));
		layout_toRightOf = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutParams.Properties.layout_toRightOf, DroidViewsRepository.SWT_KIND));
		layout_toRightOf.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		layout_toRightOf.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutParamsPropertiesEditionPartImpl.this, DroidViewsRepository.LayoutParams.Properties.layout_toRightOf, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getLayout_toRightOf()));
			}

		});
		GridData layout_toRightOfData = new GridData(GridData.FILL_HORIZONTAL);
		layout_toRightOf.setLayoutData(layout_toRightOfData);
		layout_toRightOf.setID(DroidViewsRepository.LayoutParams.Properties.layout_toRightOf);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LayoutParams.Properties.layout_toRightOf, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#getLayout_above()
	 * 
	 */
	public EObject getLayout_above() {
		if (layout_above.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) layout_above.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#initLayout_above(EObjectFlatComboSettings)
	 */
	public void initLayout_above(EObjectFlatComboSettings settings) {
		layout_above.setInput(settings);
		if (current != null) {
			layout_above.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_above(EObject newValue)
	 * 
	 */
	public void setLayout_above(EObject newValue) {
		if (newValue != null) {
			layout_above.setSelection(new StructuredSelection(newValue));
		} else {
			layout_above.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_aboveButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLayout_aboveButtonMode(ButtonsModeEnum newValue) {
		layout_above.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addFilterLayout_above(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLayout_above(ViewerFilter filter) {
		layout_above.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addBusinessFilterLayout_above(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLayout_above(ViewerFilter filter) {
		layout_above.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#getLayout_alignBaseline()
	 * 
	 */
	public EObject getLayout_alignBaseline() {
		if (layout_alignBaseline.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) layout_alignBaseline.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#initLayout_alignBaseline(EObjectFlatComboSettings)
	 */
	public void initLayout_alignBaseline(EObjectFlatComboSettings settings) {
		layout_alignBaseline.setInput(settings);
		if (current != null) {
			layout_alignBaseline.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_alignBaseline(EObject newValue)
	 * 
	 */
	public void setLayout_alignBaseline(EObject newValue) {
		if (newValue != null) {
			layout_alignBaseline.setSelection(new StructuredSelection(newValue));
		} else {
			layout_alignBaseline.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_alignBaselineButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLayout_alignBaselineButtonMode(ButtonsModeEnum newValue) {
		layout_alignBaseline.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addFilterLayout_alignBaseline(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLayout_alignBaseline(ViewerFilter filter) {
		layout_alignBaseline.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addBusinessFilterLayout_alignBaseline(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLayout_alignBaseline(ViewerFilter filter) {
		layout_alignBaseline.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#getLayout_alignBottom()
	 * 
	 */
	public EObject getLayout_alignBottom() {
		if (layout_alignBottom.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) layout_alignBottom.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#initLayout_alignBottom(EObjectFlatComboSettings)
	 */
	public void initLayout_alignBottom(EObjectFlatComboSettings settings) {
		layout_alignBottom.setInput(settings);
		if (current != null) {
			layout_alignBottom.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_alignBottom(EObject newValue)
	 * 
	 */
	public void setLayout_alignBottom(EObject newValue) {
		if (newValue != null) {
			layout_alignBottom.setSelection(new StructuredSelection(newValue));
		} else {
			layout_alignBottom.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_alignBottomButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLayout_alignBottomButtonMode(ButtonsModeEnum newValue) {
		layout_alignBottom.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addFilterLayout_alignBottom(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLayout_alignBottom(ViewerFilter filter) {
		layout_alignBottom.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addBusinessFilterLayout_alignBottom(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLayout_alignBottom(ViewerFilter filter) {
		layout_alignBottom.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#getLayout_alignLeft()
	 * 
	 */
	public EObject getLayout_alignLeft() {
		if (layout_alignLeft.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) layout_alignLeft.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#initLayout_alignLeft(EObjectFlatComboSettings)
	 */
	public void initLayout_alignLeft(EObjectFlatComboSettings settings) {
		layout_alignLeft.setInput(settings);
		if (current != null) {
			layout_alignLeft.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_alignLeft(EObject newValue)
	 * 
	 */
	public void setLayout_alignLeft(EObject newValue) {
		if (newValue != null) {
			layout_alignLeft.setSelection(new StructuredSelection(newValue));
		} else {
			layout_alignLeft.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_alignLeftButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLayout_alignLeftButtonMode(ButtonsModeEnum newValue) {
		layout_alignLeft.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addFilterLayout_alignLeft(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLayout_alignLeft(ViewerFilter filter) {
		layout_alignLeft.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addBusinessFilterLayout_alignLeft(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLayout_alignLeft(ViewerFilter filter) {
		layout_alignLeft.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#getLayout_alignTop()
	 * 
	 */
	public EObject getLayout_alignTop() {
		if (layout_alignTop.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) layout_alignTop.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#initLayout_alignTop(EObjectFlatComboSettings)
	 */
	public void initLayout_alignTop(EObjectFlatComboSettings settings) {
		layout_alignTop.setInput(settings);
		if (current != null) {
			layout_alignTop.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_alignTop(EObject newValue)
	 * 
	 */
	public void setLayout_alignTop(EObject newValue) {
		if (newValue != null) {
			layout_alignTop.setSelection(new StructuredSelection(newValue));
		} else {
			layout_alignTop.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_alignTopButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLayout_alignTopButtonMode(ButtonsModeEnum newValue) {
		layout_alignTop.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addFilterLayout_alignTop(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLayout_alignTop(ViewerFilter filter) {
		layout_alignTop.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addBusinessFilterLayout_alignTop(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLayout_alignTop(ViewerFilter filter) {
		layout_alignTop.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#getLayout_below()
	 * 
	 */
	public EObject getLayout_below() {
		if (layout_below.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) layout_below.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#initLayout_below(EObjectFlatComboSettings)
	 */
	public void initLayout_below(EObjectFlatComboSettings settings) {
		layout_below.setInput(settings);
		if (current != null) {
			layout_below.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_below(EObject newValue)
	 * 
	 */
	public void setLayout_below(EObject newValue) {
		if (newValue != null) {
			layout_below.setSelection(new StructuredSelection(newValue));
		} else {
			layout_below.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_belowButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLayout_belowButtonMode(ButtonsModeEnum newValue) {
		layout_below.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addFilterLayout_below(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLayout_below(ViewerFilter filter) {
		layout_below.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addBusinessFilterLayout_below(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLayout_below(ViewerFilter filter) {
		layout_below.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#getLayout_toLeftOf()
	 * 
	 */
	public EObject getLayout_toLeftOf() {
		if (layout_toLeftOf.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) layout_toLeftOf.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#initLayout_toLeftOf(EObjectFlatComboSettings)
	 */
	public void initLayout_toLeftOf(EObjectFlatComboSettings settings) {
		layout_toLeftOf.setInput(settings);
		if (current != null) {
			layout_toLeftOf.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_toLeftOf(EObject newValue)
	 * 
	 */
	public void setLayout_toLeftOf(EObject newValue) {
		if (newValue != null) {
			layout_toLeftOf.setSelection(new StructuredSelection(newValue));
		} else {
			layout_toLeftOf.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_toLeftOfButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLayout_toLeftOfButtonMode(ButtonsModeEnum newValue) {
		layout_toLeftOf.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addFilterLayout_toLeftOf(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLayout_toLeftOf(ViewerFilter filter) {
		layout_toLeftOf.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addBusinessFilterLayout_toLeftOf(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLayout_toLeftOf(ViewerFilter filter) {
		layout_toLeftOf.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#getLayout_toRightOf()
	 * 
	 */
	public EObject getLayout_toRightOf() {
		if (layout_toRightOf.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) layout_toRightOf.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#initLayout_toRightOf(EObjectFlatComboSettings)
	 */
	public void initLayout_toRightOf(EObjectFlatComboSettings settings) {
		layout_toRightOf.setInput(settings);
		if (current != null) {
			layout_toRightOf.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_toRightOf(EObject newValue)
	 * 
	 */
	public void setLayout_toRightOf(EObject newValue) {
		if (newValue != null) {
			layout_toRightOf.setSelection(new StructuredSelection(newValue));
		} else {
			layout_toRightOf.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#setLayout_toRightOfButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLayout_toRightOfButtonMode(ButtonsModeEnum newValue) {
		layout_toRightOf.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addFilterLayout_toRightOf(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLayout_toRightOf(ViewerFilter filter) {
		layout_toRightOf.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.LayoutParamsPropertiesEditionPart#addBusinessFilterLayout_toRightOf(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLayout_toRightOf(ViewerFilter filter) {
		layout_toRightOf.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.LayoutParams_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
