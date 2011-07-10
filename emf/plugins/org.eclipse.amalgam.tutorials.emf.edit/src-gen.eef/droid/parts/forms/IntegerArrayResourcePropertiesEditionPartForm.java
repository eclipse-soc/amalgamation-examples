/**
 * Generated with Acceleo
 */
package droid.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import droid.DroidPackage;
import droid.parts.DroidViewsRepository;
import droid.parts.IntegerArrayResourcePropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class IntegerArrayResourcePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, IntegerArrayResourcePropertiesEditionPart {

	protected Text name;
	protected Text items;
		protected Button editItems;
		private EList itemsList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public IntegerArrayResourcePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence integerArrayResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = integerArrayResourceStep.addStep(DroidViewsRepository.IntegerArrayResource.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.IntegerArrayResource.Properties.name);
		propertiesStep.addStep(DroidViewsRepository.IntegerArrayResource.Properties.items);
		
		
		composer = new PartComposer(integerArrayResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.IntegerArrayResource.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.IntegerArrayResource.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.IntegerArrayResource.Properties.items) {
					return createItemsMultiValuedEditor(widgetFactory, parent);
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
		propertiesSection.setText(DroidMessages.IntegerArrayResourcePropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.IntegerArrayResourcePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.IntegerArrayResource.Properties.name, DroidViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerArrayResourcePropertiesEditionPartForm.this, DroidViewsRepository.IntegerArrayResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerArrayResourcePropertiesEditionPartForm.this, DroidViewsRepository.IntegerArrayResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, DroidViewsRepository.IntegerArrayResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.IntegerArrayResource.Properties.name, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createItemsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		items = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData itemsData = new GridData(GridData.FILL_HORIZONTAL);
		itemsData.horizontalSpan = 2;
		items.setLayoutData(itemsData);
		EditingUtils.setID(items, DroidViewsRepository.IntegerArrayResource.Properties.items);
		EditingUtils.setEEFtype(items, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editItems = widgetFactory.createButton(parent, DroidMessages.IntegerArrayResourcePropertiesEditionPart_ItemsLabel, SWT.NONE);
		GridData editItemsData = new GridData();
		editItems.setLayoutData(editItemsData);
		editItems.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						items.getShell(), "IntegerArrayResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						itemsList, DroidPackage.eINSTANCE.getIntegerArrayResource_Items().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					itemsList = dialog.getResult();
					if (itemsList == null) {
						itemsList = new BasicEList();
					}
					items.setText(itemsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerArrayResourcePropertiesEditionPartForm.this, DroidViewsRepository.IntegerArrayResource.Properties.items, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(itemsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editItems, DroidViewsRepository.IntegerArrayResource.Properties.items);
		EditingUtils.setEEFtype(editItems, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
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
	 * @see droid.parts.IntegerArrayResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.IntegerArrayResourcePropertiesEditionPart#setName(String newValue)
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
	 * @see droid.parts.IntegerArrayResourcePropertiesEditionPart#getItems()
	 * 
	 */
	public EList getItems() {
		return itemsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.IntegerArrayResourcePropertiesEditionPart#setItems(EList newValue)
	 * 
	 */
	public void setItems(EList newValue) {
		itemsList = newValue;
		if (newValue != null) {
			items.setText(itemsList.toString());
		} else {
			items.setText(""); //$NON-NLS-1$
		}
	}

	public void addToItems(Object newValue) {
		itemsList.add(newValue);
		if (newValue != null) {
			items.setText(itemsList.toString());
		} else {
			items.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToItems(Object newValue) {
		itemsList.remove(newValue);
		if (newValue != null) {
			items.setText(itemsList.toString());
		} else {
			items.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.IntegerArrayResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
