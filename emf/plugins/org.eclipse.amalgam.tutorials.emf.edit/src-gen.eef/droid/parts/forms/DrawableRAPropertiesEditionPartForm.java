/**
 * Generated with Acceleo
 */
package droid.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import droid.parts.DrawableRAPropertiesEditionPart;
import droid.parts.DroidViewsRepository;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class DrawableRAPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, DrawableRAPropertiesEditionPart {

	protected Text externalResource;
	protected EObjectFlatComboViewer resource;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DrawableRAPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence drawableRAStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = drawableRAStep.addStep(DroidViewsRepository.DrawableRA.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.DrawableRA.Properties.externalResource);
		propertiesStep.addStep(DroidViewsRepository.DrawableRA.Properties.resource);
		
		
		composer = new PartComposer(drawableRAStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.DrawableRA.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.DrawableRA.Properties.externalResource) {
					return 		createExternalResourceText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.DrawableRA.Properties.resource) {
					return createResourceFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(DroidMessages.DrawableRAPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createExternalResourceText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.DrawableRAPropertiesEditionPart_ExternalResourceLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.DrawableRA.Properties.externalResource, DroidViewsRepository.FORM_KIND));
		externalResource = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		externalResource.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData externalResourceData = new GridData(GridData.FILL_HORIZONTAL);
		externalResource.setLayoutData(externalResourceData);
		externalResource.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DrawableRAPropertiesEditionPartForm.this, DroidViewsRepository.DrawableRA.Properties.externalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, externalResource.getText()));
			}
		});
		externalResource.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DrawableRAPropertiesEditionPartForm.this, DroidViewsRepository.DrawableRA.Properties.externalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, externalResource.getText()));
				}
			}
		});
		EditingUtils.setID(externalResource, DroidViewsRepository.DrawableRA.Properties.externalResource);
		EditingUtils.setEEFtype(externalResource, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.DrawableRA.Properties.externalResource, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createResourceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.DrawableRAPropertiesEditionPart_ResourceLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.DrawableRA.Properties.resource, DroidViewsRepository.FORM_KIND));
		resource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.DrawableRA.Properties.resource, DroidViewsRepository.FORM_KIND));
		widgetFactory.adapt(resource);
		resource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData resourceData = new GridData(GridData.FILL_HORIZONTAL);
		resource.setLayoutData(resourceData);
		resource.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DrawableRAPropertiesEditionPartForm.this, DroidViewsRepository.DrawableRA.Properties.resource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getResource()));
			}

		});
		resource.setID(DroidViewsRepository.DrawableRA.Properties.resource);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.DrawableRA.Properties.resource, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see droid.parts.DrawableRAPropertiesEditionPart#getExternalResource()
	 * 
	 */
	public String getExternalResource() {
		return externalResource.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.DrawableRAPropertiesEditionPart#setExternalResource(String newValue)
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
	 * @see droid.parts.DrawableRAPropertiesEditionPart#getResource()
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
	 * @see droid.parts.DrawableRAPropertiesEditionPart#initResource(EObjectFlatComboSettings)
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
	 * @see droid.parts.DrawableRAPropertiesEditionPart#setResource(EObject newValue)
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
	 * @see droid.parts.DrawableRAPropertiesEditionPart#setResourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setResourceButtonMode(ButtonsModeEnum newValue) {
		resource.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.DrawableRAPropertiesEditionPart#addFilterResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResource(ViewerFilter filter) {
		resource.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.DrawableRAPropertiesEditionPart#addBusinessFilterResource(ViewerFilter filter)
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
		return DroidMessages.DrawableRA_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
