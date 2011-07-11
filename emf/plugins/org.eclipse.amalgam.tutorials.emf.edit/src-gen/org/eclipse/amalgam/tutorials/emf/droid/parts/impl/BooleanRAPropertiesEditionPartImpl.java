/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.parts.impl;

// Start of user code for imports
import org.eclipse.amalgam.tutorials.emf.droid.parts.BooleanRAPropertiesEditionPart;
import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
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


// End of user code

/**
 * 
 * 
 */
public class BooleanRAPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, BooleanRAPropertiesEditionPart {

	protected Text externalResource;
	protected EObjectFlatComboViewer resource;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BooleanRAPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence booleanRAStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = booleanRAStep.addStep(DroidViewsRepository.BooleanRA.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.BooleanRA.Properties.externalResource);
		propertiesStep.addStep(DroidViewsRepository.BooleanRA.Properties.resource);
		
		
		composer = new PartComposer(booleanRAStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.BooleanRA.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.BooleanRA.Properties.externalResource) {
					return createExternalResourceText(parent);
				}
				if (key == DroidViewsRepository.BooleanRA.Properties.resource) {
					return createResourceFlatComboViewer(parent);
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
		propertiesGroup.setText(DroidMessages.BooleanRAPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createExternalResourceText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.BooleanRAPropertiesEditionPart_ExternalResourceLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.BooleanRA.Properties.externalResource, DroidViewsRepository.SWT_KIND));
		externalResource = new Text(parent, SWT.BORDER);
		GridData externalResourceData = new GridData(GridData.FILL_HORIZONTAL);
		externalResource.setLayoutData(externalResourceData);
		externalResource.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BooleanRAPropertiesEditionPartImpl.this, DroidViewsRepository.BooleanRA.Properties.externalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, externalResource.getText()));
			}

		});
		externalResource.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BooleanRAPropertiesEditionPartImpl.this, DroidViewsRepository.BooleanRA.Properties.externalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, externalResource.getText()));
				}
			}

		});
		EditingUtils.setID(externalResource, DroidViewsRepository.BooleanRA.Properties.externalResource);
		EditingUtils.setEEFtype(externalResource, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.BooleanRA.Properties.externalResource, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createResourceFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.BooleanRAPropertiesEditionPart_ResourceLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.BooleanRA.Properties.resource, DroidViewsRepository.SWT_KIND));
		resource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.BooleanRA.Properties.resource, DroidViewsRepository.SWT_KIND));
		resource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		resource.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BooleanRAPropertiesEditionPartImpl.this, DroidViewsRepository.BooleanRA.Properties.resource, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getResource()));
			}

		});
		GridData resourceData = new GridData(GridData.FILL_HORIZONTAL);
		resource.setLayoutData(resourceData);
		resource.setID(DroidViewsRepository.BooleanRA.Properties.resource);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.BooleanRA.Properties.resource, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.BooleanRAPropertiesEditionPart#getExternalResource()
	 * 
	 */
	public String getExternalResource() {
		return externalResource.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.BooleanRAPropertiesEditionPart#setExternalResource(String newValue)
	 * 
	 */
	public void setExternalResource(String newValue) {
		if (newValue != null) {
			externalResource.setText(newValue);
		} else {
			externalResource.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.BooleanRAPropertiesEditionPart#getResource()
	 * 
	 */
	public EObject getResource() {
		if (resource.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) resource.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.BooleanRAPropertiesEditionPart#initResource(EObjectFlatComboSettings)
	 */
	public void initResource(EObjectFlatComboSettings settings) {
		resource.setInput(settings);
		if (current != null) {
			resource.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.BooleanRAPropertiesEditionPart#setResource(EObject newValue)
	 * 
	 */
	public void setResource(EObject newValue) {
		if (newValue != null) {
			resource.setSelection(new StructuredSelection(newValue));
		} else {
			resource.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.BooleanRAPropertiesEditionPart#setResourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setResourceButtonMode(ButtonsModeEnum newValue) {
		resource.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.BooleanRAPropertiesEditionPart#addFilterResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResource(ViewerFilter filter) {
		resource.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.BooleanRAPropertiesEditionPart#addBusinessFilterResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResource(ViewerFilter filter) {
		resource.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.BooleanRA_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
