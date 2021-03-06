/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.parts.forms;

// Start of user code for imports
import org.eclipse.amalgam.tutorials.emf.droid.parts.DimensionVAPropertiesEditionPart;
import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.providers.DroidMessages;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * 
 * 
 */
public class DimensionVAPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, DimensionVAPropertiesEditionPart {

	protected EMFComboViewer constant_value;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DimensionVAPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence dimensionVAStep = new BindingCompositionSequence(propertiesEditionComponent);
		dimensionVAStep
			.addStep(DroidViewsRepository.DimensionVA.Properties.class)
			.addStep(DroidViewsRepository.DimensionVA.Properties.constant_value);
		
		
		composer = new PartComposer(dimensionVAStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.DimensionVA.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.DimensionVA.Properties.constant_value) {
					return createConstant_valueEMFComboViewer(widgetFactory, parent);
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
		propertiesSection.setText(DroidMessages.DimensionVAPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createConstant_valueEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.DimensionVAPropertiesEditionPart_Constant_valueLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.DimensionVA.Properties.constant_value, DroidViewsRepository.FORM_KIND));
		constant_value = new EMFComboViewer(parent);
		constant_value.setContentProvider(new ArrayContentProvider());
		constant_value.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData constant_valueData = new GridData(GridData.FILL_HORIZONTAL);
		constant_value.getCombo().setLayoutData(constant_valueData);
		constant_value.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DimensionVAPropertiesEditionPartForm.this, DroidViewsRepository.DimensionVA.Properties.constant_value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConstant_value()));
			}

		});
		constant_value.setID(DroidViewsRepository.DimensionVA.Properties.constant_value);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.DimensionVA.Properties.constant_value, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.DimensionVAPropertiesEditionPart#getConstant_value()
	 * 
	 */
	public Enumerator getConstant_value() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) constant_value.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.DimensionVAPropertiesEditionPart#initConstant_value(EEnum eenum, Enumerator current)
	 */
	public void initConstant_value(EEnum eenum, Enumerator current) {
		constant_value.setInput(eenum.getELiterals());
		constant_value.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.DimensionVAPropertiesEditionPart#setConstant_value(Enumerator newValue)
	 * 
	 */
	public void setConstant_value(Enumerator newValue) {
		constant_value.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.DimensionVA_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
