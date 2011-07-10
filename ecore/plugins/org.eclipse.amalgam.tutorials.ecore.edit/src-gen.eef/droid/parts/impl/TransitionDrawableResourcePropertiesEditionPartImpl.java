/**
 * Generated with Acceleo
 */
package droid.parts.impl;

// Start of user code for imports
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
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
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

import droid.parts.DroidViewsRepository;
import droid.parts.TransitionDrawableResourcePropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class TransitionDrawableResourcePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TransitionDrawableResourcePropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer from;
	protected EObjectFlatComboViewer to;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TransitionDrawableResourcePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence transitionDrawableResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = transitionDrawableResourceStep.addStep(DroidViewsRepository.TransitionDrawableResource.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.TransitionDrawableResource.Properties.name);
		propertiesStep.addStep(DroidViewsRepository.TransitionDrawableResource.Properties.from);
		propertiesStep.addStep(DroidViewsRepository.TransitionDrawableResource.Properties.to);
		
		
		composer = new PartComposer(transitionDrawableResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.TransitionDrawableResource.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.TransitionDrawableResource.Properties.name) {
					return createNameText(parent);
				}
				if (key == DroidViewsRepository.TransitionDrawableResource.Properties.from) {
					return createFromFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.TransitionDrawableResource.Properties.to) {
					return createToFlatComboViewer(parent);
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
		propertiesGroup.setText(DroidMessages.TransitionDrawableResourcePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.TransitionDrawableResourcePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.TransitionDrawableResource.Properties.name, DroidViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionDrawableResourcePropertiesEditionPartImpl.this, DroidViewsRepository.TransitionDrawableResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionDrawableResourcePropertiesEditionPartImpl.this, DroidViewsRepository.TransitionDrawableResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, DroidViewsRepository.TransitionDrawableResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.TransitionDrawableResource.Properties.name, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createFromFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.TransitionDrawableResourcePropertiesEditionPart_FromLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.TransitionDrawableResource.Properties.from, DroidViewsRepository.SWT_KIND));
		from = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.TransitionDrawableResource.Properties.from, DroidViewsRepository.SWT_KIND));
		from.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		from.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionDrawableResourcePropertiesEditionPartImpl.this, DroidViewsRepository.TransitionDrawableResource.Properties.from, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getFrom()));
			}

		});
		GridData fromData = new GridData(GridData.FILL_HORIZONTAL);
		from.setLayoutData(fromData);
		from.setID(DroidViewsRepository.TransitionDrawableResource.Properties.from);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.TransitionDrawableResource.Properties.from, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createToFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.TransitionDrawableResourcePropertiesEditionPart_ToLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.TransitionDrawableResource.Properties.to, DroidViewsRepository.SWT_KIND));
		to = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.TransitionDrawableResource.Properties.to, DroidViewsRepository.SWT_KIND));
		to.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		to.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TransitionDrawableResourcePropertiesEditionPartImpl.this, DroidViewsRepository.TransitionDrawableResource.Properties.to, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTo()));
			}

		});
		GridData toData = new GridData(GridData.FILL_HORIZONTAL);
		to.setLayoutData(toData);
		to.setID(DroidViewsRepository.TransitionDrawableResource.Properties.to);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.TransitionDrawableResource.Properties.to, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#setName(String newValue)
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
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#getFrom()
	 * 
	 */
	public EObject getFrom() {
		if (from.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) from.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#initFrom(EObjectFlatComboSettings)
	 */
	public void initFrom(EObjectFlatComboSettings settings) {
		from.setInput(settings);
		if (current != null) {
			from.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#setFrom(EObject newValue)
	 * 
	 */
	public void setFrom(EObject newValue) {
		if (newValue != null) {
			from.setSelection(new StructuredSelection(newValue));
		} else {
			from.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#setFromButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFromButtonMode(ButtonsModeEnum newValue) {
		from.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#addFilterFrom(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFrom(ViewerFilter filter) {
		from.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#addBusinessFilterFrom(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFrom(ViewerFilter filter) {
		from.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#getTo()
	 * 
	 */
	public EObject getTo() {
		if (to.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) to.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#initTo(EObjectFlatComboSettings)
	 */
	public void initTo(EObjectFlatComboSettings settings) {
		to.setInput(settings);
		if (current != null) {
			to.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#setTo(EObject newValue)
	 * 
	 */
	public void setTo(EObject newValue) {
		if (newValue != null) {
			to.setSelection(new StructuredSelection(newValue));
		} else {
			to.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#setToButtonMode(ButtonsModeEnum newValue)
	 */
	public void setToButtonMode(ButtonsModeEnum newValue) {
		to.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#addFilterTo(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTo(ViewerFilter filter) {
		to.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TransitionDrawableResourcePropertiesEditionPart#addBusinessFilterTo(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTo(ViewerFilter filter) {
		to.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.TransitionDrawableResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
