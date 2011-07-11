/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.parts.SubMenuPropertiesEditionPart;
import org.eclipse.amalgam.tutorials.emf.droid.providers.DroidMessages;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;


// End of user code

/**
 * 
 * 
 */
public class SubMenuPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SubMenuPropertiesEditionPart {

protected ReferencesTable menuItems;
protected List<ViewerFilter> menuItemsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> menuItemsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable groups;
protected List<ViewerFilter> groupsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> groupsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SubMenuPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence subMenuStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = subMenuStep.addStep(DroidViewsRepository.SubMenu.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.SubMenu.Properties.menuItems);
		propertiesStep.addStep(DroidViewsRepository.SubMenu.Properties.groups);
		
		
		composer = new PartComposer(subMenuStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.SubMenu.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.SubMenu.Properties.menuItems) {
					return createMenuItemsAdvancedTableComposition(parent);
				}
				if (key == DroidViewsRepository.SubMenu.Properties.groups) {
					return createGroupsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(DroidMessages.SubMenuPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMenuItemsAdvancedTableComposition(Composite parent) {
		this.menuItems = new ReferencesTable(DroidMessages.SubMenuPropertiesEditionPart_MenuItemsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubMenuPropertiesEditionPartImpl.this, DroidViewsRepository.SubMenu.Properties.menuItems, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				menuItems.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubMenuPropertiesEditionPartImpl.this, DroidViewsRepository.SubMenu.Properties.menuItems, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				menuItems.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubMenuPropertiesEditionPartImpl.this, DroidViewsRepository.SubMenu.Properties.menuItems, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				menuItems.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubMenuPropertiesEditionPartImpl.this, DroidViewsRepository.SubMenu.Properties.menuItems, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				menuItems.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.menuItemsFilters) {
			this.menuItems.addFilter(filter);
		}
		this.menuItems.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.SubMenu.Properties.menuItems, DroidViewsRepository.SWT_KIND));
		this.menuItems.createControls(parent);
		this.menuItems.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubMenuPropertiesEditionPartImpl.this, DroidViewsRepository.SubMenu.Properties.menuItems, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData menuItemsData = new GridData(GridData.FILL_HORIZONTAL);
		menuItemsData.horizontalSpan = 3;
		this.menuItems.setLayoutData(menuItemsData);
		this.menuItems.setLowerBound(0);
		this.menuItems.setUpperBound(-1);
		menuItems.setID(DroidViewsRepository.SubMenu.Properties.menuItems);
		menuItems.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createGroupsAdvancedTableComposition(Composite parent) {
		this.groups = new ReferencesTable(DroidMessages.SubMenuPropertiesEditionPart_GroupsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubMenuPropertiesEditionPartImpl.this, DroidViewsRepository.SubMenu.Properties.groups, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				groups.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubMenuPropertiesEditionPartImpl.this, DroidViewsRepository.SubMenu.Properties.groups, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				groups.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubMenuPropertiesEditionPartImpl.this, DroidViewsRepository.SubMenu.Properties.groups, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				groups.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubMenuPropertiesEditionPartImpl.this, DroidViewsRepository.SubMenu.Properties.groups, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				groups.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.groupsFilters) {
			this.groups.addFilter(filter);
		}
		this.groups.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.SubMenu.Properties.groups, DroidViewsRepository.SWT_KIND));
		this.groups.createControls(parent);
		this.groups.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SubMenuPropertiesEditionPartImpl.this, DroidViewsRepository.SubMenu.Properties.groups, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData groupsData = new GridData(GridData.FILL_HORIZONTAL);
		groupsData.horizontalSpan = 3;
		this.groups.setLayoutData(groupsData);
		this.groups.setLowerBound(0);
		this.groups.setUpperBound(-1);
		groups.setID(DroidViewsRepository.SubMenu.Properties.groups);
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.SubMenuPropertiesEditionPart#initMenuItems(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.SubMenuPropertiesEditionPart#updateMenuItems()
	 * 
	 */
	public void updateMenuItems() {
	menuItems.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.SubMenuPropertiesEditionPart#addFilterMenuItems(ViewerFilter filter)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.SubMenuPropertiesEditionPart#addBusinessFilterMenuItems(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMenuItems(ViewerFilter filter) {
		menuItemsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.SubMenuPropertiesEditionPart#isContainedInMenuItemsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMenuItemsTable(EObject element) {
		return ((ReferencesTableSettings)menuItems.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.SubMenuPropertiesEditionPart#initGroups(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.SubMenuPropertiesEditionPart#updateGroups()
	 * 
	 */
	public void updateGroups() {
	groups.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.SubMenuPropertiesEditionPart#addFilterGroups(ViewerFilter filter)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.SubMenuPropertiesEditionPart#addBusinessFilterGroups(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGroups(ViewerFilter filter) {
		groupsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.SubMenuPropertiesEditionPart#isContainedInGroupsTable(EObject element)
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
		return DroidMessages.SubMenu_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
