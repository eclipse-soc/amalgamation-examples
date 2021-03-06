/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart;
import org.eclipse.amalgam.tutorials.emf.droid.providers.DroidMessages;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
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


// End of user code

/**
 * 
 * 
 */
public class MenuResourcePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, MenuResourcePropertiesEditionPart {

	protected Text name;
	protected ReferencesTable menuItems;
	protected List<ViewerFilter> menuItemsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> menuItemsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable subMenus;
	protected List<ViewerFilter> subMenusBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> subMenusFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable groups;
	protected List<ViewerFilter> groupsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> groupsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MenuResourcePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence menuResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = menuResourceStep.addStep(DroidViewsRepository.MenuResource.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.MenuResource.Properties.name);
		propertiesStep.addStep(DroidViewsRepository.MenuResource.Properties.menuItems);
		propertiesStep.addStep(DroidViewsRepository.MenuResource.Properties.subMenus);
		propertiesStep.addStep(DroidViewsRepository.MenuResource.Properties.groups);
		
		
		composer = new PartComposer(menuResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.MenuResource.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.MenuResource.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.MenuResource.Properties.menuItems) {
					return createMenuItemsTableComposition(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.MenuResource.Properties.subMenus) {
					return createSubMenusTableComposition(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.MenuResource.Properties.groups) {
					return createGroupsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(DroidMessages.MenuResourcePropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.MenuResourcePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.MenuResource.Properties.name, DroidViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, DroidViewsRepository.MenuResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.MenuResource.Properties.name, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMenuItemsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.menuItems = new ReferencesTable(DroidMessages.MenuResourcePropertiesEditionPart_MenuItemsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.menuItems, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				menuItems.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.menuItems, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				menuItems.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.menuItems, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				menuItems.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.menuItems, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				menuItems.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.menuItemsFilters) {
			this.menuItems.addFilter(filter);
		}
		this.menuItems.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.MenuResource.Properties.menuItems, DroidViewsRepository.FORM_KIND));
		this.menuItems.createControls(parent, widgetFactory);
		this.menuItems.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.menuItems, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData menuItemsData = new GridData(GridData.FILL_HORIZONTAL);
		menuItemsData.horizontalSpan = 3;
		this.menuItems.setLayoutData(menuItemsData);
		this.menuItems.setLowerBound(0);
		this.menuItems.setUpperBound(-1);
		menuItems.setID(DroidViewsRepository.MenuResource.Properties.menuItems);
		menuItems.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSubMenusTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.subMenus = new ReferencesTable(DroidMessages.MenuResourcePropertiesEditionPart_SubMenusLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.subMenus, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				subMenus.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.subMenus, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				subMenus.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.subMenus, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				subMenus.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.subMenus, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				subMenus.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.subMenusFilters) {
			this.subMenus.addFilter(filter);
		}
		this.subMenus.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.MenuResource.Properties.subMenus, DroidViewsRepository.FORM_KIND));
		this.subMenus.createControls(parent, widgetFactory);
		this.subMenus.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.subMenus, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData subMenusData = new GridData(GridData.FILL_HORIZONTAL);
		subMenusData.horizontalSpan = 3;
		this.subMenus.setLayoutData(subMenusData);
		this.subMenus.setLowerBound(0);
		this.subMenus.setUpperBound(-1);
		subMenus.setID(DroidViewsRepository.MenuResource.Properties.subMenus);
		subMenus.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createGroupsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.groups = new ReferencesTable(DroidMessages.MenuResourcePropertiesEditionPart_GroupsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.groups, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				groups.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.groups, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				groups.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.groups, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				groups.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.groups, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				groups.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.groupsFilters) {
			this.groups.addFilter(filter);
		}
		this.groups.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.MenuResource.Properties.groups, DroidViewsRepository.FORM_KIND));
		this.groups.createControls(parent, widgetFactory);
		this.groups.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuResourcePropertiesEditionPartForm.this, DroidViewsRepository.MenuResource.Properties.groups, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData groupsData = new GridData(GridData.FILL_HORIZONTAL);
		groupsData.horizontalSpan = 3;
		this.groups.setLayoutData(groupsData);
		this.groups.setLowerBound(0);
		this.groups.setUpperBound(-1);
		groups.setID(DroidViewsRepository.MenuResource.Properties.groups);
		groups.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#setName(String newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#initMenuItems(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMenuItems(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		menuItems.setContentProvider(contentProvider);
		menuItems.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#updateMenuItems()
	 * 
	 */
	public void updateMenuItems() {
	menuItems.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#addFilterMenuItems(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMenuItems(ViewerFilter filter) {
		menuItemsFilters.add(filter);
		if (this.menuItems != null) {
			this.menuItems.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#addBusinessFilterMenuItems(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMenuItems(ViewerFilter filter) {
		menuItemsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#isContainedInMenuItemsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMenuItemsTable(EObject element) {
		return ((ReferencesTableSettings)menuItems.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#initSubMenus(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSubMenus(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		subMenus.setContentProvider(contentProvider);
		subMenus.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#updateSubMenus()
	 * 
	 */
	public void updateSubMenus() {
	subMenus.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#addFilterSubMenus(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubMenus(ViewerFilter filter) {
		subMenusFilters.add(filter);
		if (this.subMenus != null) {
			this.subMenus.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#addBusinessFilterSubMenus(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubMenus(ViewerFilter filter) {
		subMenusBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#isContainedInSubMenusTable(EObject element)
	 * 
	 */
	public boolean isContainedInSubMenusTable(EObject element) {
		return ((ReferencesTableSettings)subMenus.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#initGroups(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGroups(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		groups.setContentProvider(contentProvider);
		groups.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#updateGroups()
	 * 
	 */
	public void updateGroups() {
	groups.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#addFilterGroups(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGroups(ViewerFilter filter) {
		groupsFilters.add(filter);
		if (this.groups != null) {
			this.groups.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#addBusinessFilterGroups(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGroups(ViewerFilter filter) {
		groupsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuResourcePropertiesEditionPart#isContainedInGroupsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGroupsTable(EObject element) {
		return ((ReferencesTableSettings)groups.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.MenuResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
