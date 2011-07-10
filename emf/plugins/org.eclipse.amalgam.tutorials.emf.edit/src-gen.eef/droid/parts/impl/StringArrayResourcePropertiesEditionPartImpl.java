/**
 * Generated with Acceleo
 */
package droid.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import droid.DroidPackage;
import droid.parts.DroidViewsRepository;
import droid.parts.StringArrayResourcePropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class StringArrayResourcePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, StringArrayResourcePropertiesEditionPart {

	protected Text name;
	protected Text items;
	protected Button editItems;
	private EList itemsList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public StringArrayResourcePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence stringArrayResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = stringArrayResourceStep.addStep(DroidViewsRepository.StringArrayResource.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.StringArrayResource.Properties.name);
		propertiesStep.addStep(DroidViewsRepository.StringArrayResource.Properties.items);
		
		
		composer = new PartComposer(stringArrayResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.StringArrayResource.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.StringArrayResource.Properties.name) {
					return createNameText(parent);
				}
				if (key == DroidViewsRepository.StringArrayResource.Properties.items) {
					return createItemsMultiValuedEditor(parent);
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
		propertiesGroup.setText(DroidMessages.StringArrayResourcePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.StringArrayResourcePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.StringArrayResource.Properties.name, DroidViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StringArrayResourcePropertiesEditionPartImpl.this, DroidViewsRepository.StringArrayResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StringArrayResourcePropertiesEditionPartImpl.this, DroidViewsRepository.StringArrayResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, DroidViewsRepository.StringArrayResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.StringArrayResource.Properties.name, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createItemsMultiValuedEditor(Composite parent) {
		items = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData itemsData = new GridData(GridData.FILL_HORIZONTAL);
		itemsData.horizontalSpan = 2;
		items.setLayoutData(itemsData);
		EditingUtils.setID(items, DroidViewsRepository.StringArrayResource.Properties.items);
		EditingUtils.setEEFtype(items, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editItems = new Button(parent, SWT.NONE);
		editItems.setText(DroidMessages.StringArrayResourcePropertiesEditionPart_ItemsLabel);
		GridData editItemsData = new GridData();
		editItems.setLayoutData(editItemsData);
		editItems.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						items.getShell(), "StringArrayResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						itemsList, DroidPackage.eINSTANCE.getStringArrayResource_Items().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					itemsList = dialog.getResult();
					if (itemsList == null) {
						itemsList = new BasicEList();
					}
					items.setText(itemsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StringArrayResourcePropertiesEditionPartImpl.this, DroidViewsRepository.StringArrayResource.Properties.items, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(itemsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editItems, DroidViewsRepository.StringArrayResource.Properties.items);
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
	 * @see droid.parts.StringArrayResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.StringArrayResourcePropertiesEditionPart#setName(String newValue)
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
	 * @see droid.parts.StringArrayResourcePropertiesEditionPart#getItems()
	 * 
	 */
	public EList getItems() {
		return itemsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.StringArrayResourcePropertiesEditionPart#setItems(EList newValue)
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
		return DroidMessages.StringArrayResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
