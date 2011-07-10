/**
 * Generated with Acceleo
 */
package droid.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import droid.parts.DroidViewsRepository;
import droid.parts.ListActivityPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class ListActivityPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ListActivityPropertiesEditionPart {

	protected EObjectFlatComboViewer referencedLayout;
	protected Text name;
	protected Text dataSource;
	protected EObjectFlatComboViewer itemLayout;
	protected ReferencesTable actions;
	protected List<ViewerFilter> actionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> actionsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ListActivityPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence listActivityStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = listActivityStep.addStep(DroidViewsRepository.ListActivity.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.ListActivity.Properties.referencedLayout);
		propertiesStep.addStep(DroidViewsRepository.ListActivity.Properties.name);
		propertiesStep.addStep(DroidViewsRepository.ListActivity.Properties.dataSource);
		propertiesStep.addStep(DroidViewsRepository.ListActivity.Properties.itemLayout);
		propertiesStep.addStep(DroidViewsRepository.ListActivity.Properties.actions);
		
		
		composer = new PartComposer(listActivityStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.ListActivity.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.ListActivity.Properties.referencedLayout) {
					return createReferencedLayoutFlatComboViewer(parent, widgetFactory);
				}
				if (key == DroidViewsRepository.ListActivity.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.ListActivity.Properties.dataSource) {
					return 		createDataSourceText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.ListActivity.Properties.itemLayout) {
					return createItemLayoutFlatComboViewer(parent, widgetFactory);
				}
				if (key == DroidViewsRepository.ListActivity.Properties.actions) {
					return createActionsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(DroidMessages.ListActivityPropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createReferencedLayoutFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.ListActivityPropertiesEditionPart_ReferencedLayoutLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ListActivity.Properties.referencedLayout, DroidViewsRepository.FORM_KIND));
		referencedLayout = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.ListActivity.Properties.referencedLayout, DroidViewsRepository.FORM_KIND));
		widgetFactory.adapt(referencedLayout);
		referencedLayout.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData referencedLayoutData = new GridData(GridData.FILL_HORIZONTAL);
		referencedLayout.setLayoutData(referencedLayoutData);
		referencedLayout.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartForm.this, DroidViewsRepository.ListActivity.Properties.referencedLayout, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReferencedLayout()));
			}

		});
		referencedLayout.setID(DroidViewsRepository.ListActivity.Properties.referencedLayout);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ListActivity.Properties.referencedLayout, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.ListActivityPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ListActivity.Properties.name, DroidViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartForm.this, DroidViewsRepository.ListActivity.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartForm.this, DroidViewsRepository.ListActivity.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, DroidViewsRepository.ListActivity.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ListActivity.Properties.name, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDataSourceText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.ListActivityPropertiesEditionPart_DataSourceLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ListActivity.Properties.dataSource, DroidViewsRepository.FORM_KIND));
		dataSource = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		dataSource.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData dataSourceData = new GridData(GridData.FILL_HORIZONTAL);
		dataSource.setLayoutData(dataSourceData);
		dataSource.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartForm.this, DroidViewsRepository.ListActivity.Properties.dataSource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dataSource.getText()));
			}
		});
		dataSource.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartForm.this, DroidViewsRepository.ListActivity.Properties.dataSource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dataSource.getText()));
				}
			}
		});
		EditingUtils.setID(dataSource, DroidViewsRepository.ListActivity.Properties.dataSource);
		EditingUtils.setEEFtype(dataSource, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ListActivity.Properties.dataSource, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createItemLayoutFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.ListActivityPropertiesEditionPart_ItemLayoutLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ListActivity.Properties.itemLayout, DroidViewsRepository.FORM_KIND));
		itemLayout = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.ListActivity.Properties.itemLayout, DroidViewsRepository.FORM_KIND));
		widgetFactory.adapt(itemLayout);
		itemLayout.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData itemLayoutData = new GridData(GridData.FILL_HORIZONTAL);
		itemLayout.setLayoutData(itemLayoutData);
		itemLayout.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartForm.this, DroidViewsRepository.ListActivity.Properties.itemLayout, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getItemLayout()));
			}

		});
		itemLayout.setID(DroidViewsRepository.ListActivity.Properties.itemLayout);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ListActivity.Properties.itemLayout, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createActionsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.actions = new ReferencesTable(DroidMessages.ListActivityPropertiesEditionPart_ActionsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartForm.this, DroidViewsRepository.ListActivity.Properties.actions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				actions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartForm.this, DroidViewsRepository.ListActivity.Properties.actions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				actions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartForm.this, DroidViewsRepository.ListActivity.Properties.actions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				actions.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartForm.this, DroidViewsRepository.ListActivity.Properties.actions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				actions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.actionsFilters) {
			this.actions.addFilter(filter);
		}
		this.actions.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.ListActivity.Properties.actions, DroidViewsRepository.FORM_KIND));
		this.actions.createControls(parent, widgetFactory);
		this.actions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartForm.this, DroidViewsRepository.ListActivity.Properties.actions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData actionsData = new GridData(GridData.FILL_HORIZONTAL);
		actionsData.horizontalSpan = 3;
		this.actions.setLayoutData(actionsData);
		this.actions.setLowerBound(0);
		this.actions.setUpperBound(-1);
		actions.setID(DroidViewsRepository.ListActivity.Properties.actions);
		actions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see droid.parts.ListActivityPropertiesEditionPart#getReferencedLayout()
	 * 
	 */
	public EObject getReferencedLayout() {
		if (referencedLayout.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) referencedLayout.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#initReferencedLayout(EObjectFlatComboSettings)
	 */
	public void initReferencedLayout(EObjectFlatComboSettings settings) {
		referencedLayout.setInput(settings);
		if (current != null) {
			referencedLayout.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#setReferencedLayout(EObject newValue)
	 * 
	 */
	public void setReferencedLayout(EObject newValue) {
		if (newValue != null) {
			referencedLayout.setSelection(new StructuredSelection(newValue));
		} else {
			referencedLayout.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#setReferencedLayoutButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReferencedLayoutButtonMode(ButtonsModeEnum newValue) {
		referencedLayout.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#addFilterReferencedLayout(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedLayout(ViewerFilter filter) {
		referencedLayout.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#addBusinessFilterReferencedLayout(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedLayout(ViewerFilter filter) {
		referencedLayout.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#setName(String newValue)
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
	 * @see droid.parts.ListActivityPropertiesEditionPart#getDataSource()
	 * 
	 */
	public String getDataSource() {
		return dataSource.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#setDataSource(String newValue)
	 * 
	 */
	public void setDataSource(String newValue) {
		if (newValue != null) {
			dataSource.setText(newValue);
		} else {
			dataSource.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#getItemLayout()
	 * 
	 */
	public EObject getItemLayout() {
		if (itemLayout.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) itemLayout.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#initItemLayout(EObjectFlatComboSettings)
	 */
	public void initItemLayout(EObjectFlatComboSettings settings) {
		itemLayout.setInput(settings);
		if (current != null) {
			itemLayout.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#setItemLayout(EObject newValue)
	 * 
	 */
	public void setItemLayout(EObject newValue) {
		if (newValue != null) {
			itemLayout.setSelection(new StructuredSelection(newValue));
		} else {
			itemLayout.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#setItemLayoutButtonMode(ButtonsModeEnum newValue)
	 */
	public void setItemLayoutButtonMode(ButtonsModeEnum newValue) {
		itemLayout.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#addFilterItemLayout(ViewerFilter filter)
	 * 
	 */
	public void addFilterToItemLayout(ViewerFilter filter) {
		itemLayout.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#addBusinessFilterItemLayout(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToItemLayout(ViewerFilter filter) {
		itemLayout.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#initActions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initActions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		actions.setContentProvider(contentProvider);
		actions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#updateActions()
	 * 
	 */
	public void updateActions() {
	actions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#addFilterActions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToActions(ViewerFilter filter) {
		actionsFilters.add(filter);
		if (this.actions != null) {
			this.actions.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#addBusinessFilterActions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToActions(ViewerFilter filter) {
		actionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ListActivityPropertiesEditionPart#isContainedInActionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInActionsTable(EObject element) {
		return ((ReferencesTableSettings)actions.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.ListActivity_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
