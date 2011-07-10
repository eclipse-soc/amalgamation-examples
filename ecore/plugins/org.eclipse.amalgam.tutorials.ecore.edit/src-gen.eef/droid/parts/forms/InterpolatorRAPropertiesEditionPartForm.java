/**
 * Generated with Acceleo
 */
package droid.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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
import droid.parts.InterpolatorRAPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class InterpolatorRAPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, InterpolatorRAPropertiesEditionPart {

	protected Text externalResource;
	protected EMFComboViewer interpolatorName;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InterpolatorRAPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence interpolatorRAStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = interpolatorRAStep.addStep(DroidViewsRepository.InterpolatorRA.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.InterpolatorRA.Properties.externalResource);
		propertiesStep.addStep(DroidViewsRepository.InterpolatorRA.Properties.interpolatorName);
		
		
		composer = new PartComposer(interpolatorRAStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.InterpolatorRA.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.InterpolatorRA.Properties.externalResource) {
					return 		createExternalResourceText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.InterpolatorRA.Properties.interpolatorName) {
					return createInterpolatorNameEMFComboViewer(widgetFactory, parent);
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
		propertiesSection.setText(DroidMessages.InterpolatorRAPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.InterpolatorRAPropertiesEditionPart_ExternalResourceLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.InterpolatorRA.Properties.externalResource, DroidViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterpolatorRAPropertiesEditionPartForm.this, DroidViewsRepository.InterpolatorRA.Properties.externalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, externalResource.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterpolatorRAPropertiesEditionPartForm.this, DroidViewsRepository.InterpolatorRA.Properties.externalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, externalResource.getText()));
				}
			}
		});
		EditingUtils.setID(externalResource, DroidViewsRepository.InterpolatorRA.Properties.externalResource);
		EditingUtils.setEEFtype(externalResource, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.InterpolatorRA.Properties.externalResource, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createInterpolatorNameEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.InterpolatorRAPropertiesEditionPart_InterpolatorNameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.InterpolatorRA.Properties.interpolatorName, DroidViewsRepository.FORM_KIND));
		interpolatorName = new EMFComboViewer(parent);
		interpolatorName.setContentProvider(new ArrayContentProvider());
		interpolatorName.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData interpolatorNameData = new GridData(GridData.FILL_HORIZONTAL);
		interpolatorName.getCombo().setLayoutData(interpolatorNameData);
		interpolatorName.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterpolatorRAPropertiesEditionPartForm.this, DroidViewsRepository.InterpolatorRA.Properties.interpolatorName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInterpolatorName()));
			}

		});
		interpolatorName.setID(DroidViewsRepository.InterpolatorRA.Properties.interpolatorName);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.InterpolatorRA.Properties.interpolatorName, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see droid.parts.InterpolatorRAPropertiesEditionPart#getExternalResource()
	 * 
	 */
	public String getExternalResource() {
		return externalResource.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.InterpolatorRAPropertiesEditionPart#setExternalResource(String newValue)
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
	 * @see droid.parts.InterpolatorRAPropertiesEditionPart#getInterpolatorName()
	 * 
	 */
	public Enumerator getInterpolatorName() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) interpolatorName.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.InterpolatorRAPropertiesEditionPart#initInterpolatorName(EEnum eenum, Enumerator current)
	 */
	public void initInterpolatorName(EEnum eenum, Enumerator current) {
		interpolatorName.setInput(eenum.getELiterals());
		interpolatorName.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.InterpolatorRAPropertiesEditionPart#setInterpolatorName(Enumerator newValue)
	 * 
	 */
	public void setInterpolatorName(Enumerator newValue) {
		interpolatorName.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.InterpolatorRA_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
