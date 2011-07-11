/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart;
import org.eclipse.amalgam.tutorials.emf.droid.providers.DroidMessages;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;


// End of user code

/**
 * 
 * 
 */
public class ListActivityPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ListActivityPropertiesEditionPart {

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
	public ListActivityPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.ListActivity.Properties.referencedLayout) {
					return createReferencedLayoutFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.ListActivity.Properties.name) {
					return createNameText(parent);
				}
				if (key == DroidViewsRepository.ListActivity.Properties.dataSource) {
					return createDataSourceText(parent);
				}
				if (key == DroidViewsRepository.ListActivity.Properties.itemLayout) {
					return createItemLayoutFlatComboViewer(parent);
				}
				if (key == DroidViewsRepository.ListActivity.Properties.actions) {
					return createActionsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(DroidMessages.ListActivityPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createReferencedLayoutFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.ListActivityPropertiesEditionPart_ReferencedLayoutLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ListActivity.Properties.referencedLayout, DroidViewsRepository.SWT_KIND));
		referencedLayout = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.ListActivity.Properties.referencedLayout, DroidViewsRepository.SWT_KIND));
		referencedLayout.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		referencedLayout.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartImpl.this, DroidViewsRepository.ListActivity.Properties.referencedLayout, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getReferencedLayout()));
			}

		});
		GridData referencedLayoutData = new GridData(GridData.FILL_HORIZONTAL);
		referencedLayout.setLayoutData(referencedLayoutData);
		referencedLayout.setID(DroidViewsRepository.ListActivity.Properties.referencedLayout);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ListActivity.Properties.referencedLayout, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.ListActivityPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ListActivity.Properties.name, DroidViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartImpl.this, DroidViewsRepository.ListActivity.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartImpl.this, DroidViewsRepository.ListActivity.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, DroidViewsRepository.ListActivity.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ListActivity.Properties.name, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDataSourceText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.ListActivityPropertiesEditionPart_DataSourceLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ListActivity.Properties.dataSource, DroidViewsRepository.SWT_KIND));
		dataSource = new Text(parent, SWT.BORDER);
		GridData dataSourceData = new GridData(GridData.FILL_HORIZONTAL);
		dataSource.setLayoutData(dataSourceData);
		dataSource.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartImpl.this, DroidViewsRepository.ListActivity.Properties.dataSource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dataSource.getText()));
			}

		});
		dataSource.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartImpl.this, DroidViewsRepository.ListActivity.Properties.dataSource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dataSource.getText()));
				}
			}

		});
		EditingUtils.setID(dataSource, DroidViewsRepository.ListActivity.Properties.dataSource);
		EditingUtils.setEEFtype(dataSource, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ListActivity.Properties.dataSource, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createItemLayoutFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.ListActivityPropertiesEditionPart_ItemLayoutLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ListActivity.Properties.itemLayout, DroidViewsRepository.SWT_KIND));
		itemLayout = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.ListActivity.Properties.itemLayout, DroidViewsRepository.SWT_KIND));
		itemLayout.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		itemLayout.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartImpl.this, DroidViewsRepository.ListActivity.Properties.itemLayout, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getItemLayout()));
			}

		});
		GridData itemLayoutData = new GridData(GridData.FILL_HORIZONTAL);
		itemLayout.setLayoutData(itemLayoutData);
		itemLayout.setID(DroidViewsRepository.ListActivity.Properties.itemLayout);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ListActivity.Properties.itemLayout, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createActionsAdvancedTableComposition(Composite parent) {
		this.actions = new ReferencesTable(DroidMessages.ListActivityPropertiesEditionPart_ActionsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartImpl.this, DroidViewsRepository.ListActivity.Properties.actions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				actions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartImpl.this, DroidViewsRepository.ListActivity.Properties.actions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				actions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartImpl.this, DroidViewsRepository.ListActivity.Properties.actions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				actions.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartImpl.this, DroidViewsRepository.ListActivity.Properties.actions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				actions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.actionsFilters) {
			this.actions.addFilter(filter);
		}
		this.actions.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.ListActivity.Properties.actions, DroidViewsRepository.SWT_KIND));
		this.actions.createControls(parent);
		this.actions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ListActivityPropertiesEditionPartImpl.this, DroidViewsRepository.ListActivity.Properties.actions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#getReferencedLayout()
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#initReferencedLayout(EObjectFlatComboSettings)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#setReferencedLayout(EObject newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#setReferencedLayoutButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReferencedLayoutButtonMode(ButtonsModeEnum newValue) {
		referencedLayout.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#addFilterReferencedLayout(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferencedLayout(ViewerFilter filter) {
		referencedLayout.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#addBusinessFilterReferencedLayout(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferencedLayout(ViewerFilter filter) {
		referencedLayout.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#getDataSource()
	 * 
	 */
	public String getDataSource() {
		return dataSource.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#setDataSource(String newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#getItemLayout()
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#initItemLayout(EObjectFlatComboSettings)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#setItemLayout(EObject newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#setItemLayoutButtonMode(ButtonsModeEnum newValue)
	 */
	public void setItemLayoutButtonMode(ButtonsModeEnum newValue) {
		itemLayout.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#addFilterItemLayout(ViewerFilter filter)
	 * 
	 */
	public void addFilterToItemLayout(ViewerFilter filter) {
		itemLayout.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#addBusinessFilterItemLayout(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToItemLayout(ViewerFilter filter) {
		itemLayout.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#initActions(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#updateActions()
	 * 
	 */
	public void updateActions() {
	actions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#addFilterActions(ViewerFilter filter)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#addBusinessFilterActions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToActions(ViewerFilter filter) {
		actionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.ListActivityPropertiesEditionPart#isContainedInActionsTable(EObject element)
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
