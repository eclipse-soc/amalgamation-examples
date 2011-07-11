/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.parts.MenuGroupPropertiesEditionPart;
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
public class MenuGroupPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MenuGroupPropertiesEditionPart {

protected ReferencesTable items;
protected List<ViewerFilter> itemsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> itemsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MenuGroupPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence menuGroupStep = new BindingCompositionSequence(propertiesEditionComponent);
		menuGroupStep
			.addStep(DroidViewsRepository.MenuGroup.Properties.class)
			.addStep(DroidViewsRepository.MenuGroup.Properties.items);
		
		
		composer = new PartComposer(menuGroupStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.MenuGroup.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.MenuGroup.Properties.items) {
					return createItemsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(DroidMessages.MenuGroupPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createItemsAdvancedTableComposition(Composite parent) {
		this.items = new ReferencesTable(DroidMessages.MenuGroupPropertiesEditionPart_ItemsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuGroupPropertiesEditionPartImpl.this, DroidViewsRepository.MenuGroup.Properties.items, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				items.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuGroupPropertiesEditionPartImpl.this, DroidViewsRepository.MenuGroup.Properties.items, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				items.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuGroupPropertiesEditionPartImpl.this, DroidViewsRepository.MenuGroup.Properties.items, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				items.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuGroupPropertiesEditionPartImpl.this, DroidViewsRepository.MenuGroup.Properties.items, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				items.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.itemsFilters) {
			this.items.addFilter(filter);
		}
		this.items.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.MenuGroup.Properties.items, DroidViewsRepository.SWT_KIND));
		this.items.createControls(parent);
		this.items.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuGroupPropertiesEditionPartImpl.this, DroidViewsRepository.MenuGroup.Properties.items, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData itemsData = new GridData(GridData.FILL_HORIZONTAL);
		itemsData.horizontalSpan = 3;
		this.items.setLayoutData(itemsData);
		this.items.setLowerBound(0);
		this.items.setUpperBound(-1);
		items.setID(DroidViewsRepository.MenuGroup.Properties.items);
		items.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuGroupPropertiesEditionPart#initItems(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initItems(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		items.setContentProvider(contentProvider);
		items.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuGroupPropertiesEditionPart#updateItems()
	 * 
	 */
	public void updateItems() {
	items.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuGroupPropertiesEditionPart#addFilterItems(ViewerFilter filter)
	 * 
	 */
	public void addFilterToItems(ViewerFilter filter) {
		itemsFilters.add(filter);
		if (this.items != null) {
			this.items.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuGroupPropertiesEditionPart#addBusinessFilterItems(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToItems(ViewerFilter filter) {
		itemsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.MenuGroupPropertiesEditionPart#isContainedInItemsTable(EObject element)
	 * 
	 */
	public boolean isContainedInItemsTable(EObject element) {
		return ((ReferencesTableSettings)items.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.MenuGroup_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
