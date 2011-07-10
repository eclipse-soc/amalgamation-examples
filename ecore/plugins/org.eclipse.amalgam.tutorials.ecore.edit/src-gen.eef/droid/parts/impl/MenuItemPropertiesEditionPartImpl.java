/**
 * Generated with Acceleo
 */
package droid.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

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

import droid.parts.DroidViewsRepository;
import droid.parts.MenuItemPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class MenuItemPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MenuItemPropertiesEditionPart {

protected ReferencesTable subMenus;
protected List<ViewerFilter> subMenusBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> subMenusFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MenuItemPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence menuItemStep = new BindingCompositionSequence(propertiesEditionComponent);
		menuItemStep
			.addStep(DroidViewsRepository.MenuItem.Properties.class)
			.addStep(DroidViewsRepository.MenuItem.Properties.subMenus);
		
		
		composer = new PartComposer(menuItemStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.MenuItem.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.MenuItem.Properties.subMenus) {
					return createSubMenusAdvancedTableComposition(parent);
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
		propertiesGroup.setText(DroidMessages.MenuItemPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createSubMenusAdvancedTableComposition(Composite parent) {
		this.subMenus = new ReferencesTable(DroidMessages.MenuItemPropertiesEditionPart_SubMenusLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuItemPropertiesEditionPartImpl.this, DroidViewsRepository.MenuItem.Properties.subMenus, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				subMenus.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuItemPropertiesEditionPartImpl.this, DroidViewsRepository.MenuItem.Properties.subMenus, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				subMenus.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuItemPropertiesEditionPartImpl.this, DroidViewsRepository.MenuItem.Properties.subMenus, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				subMenus.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuItemPropertiesEditionPartImpl.this, DroidViewsRepository.MenuItem.Properties.subMenus, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				subMenus.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.subMenusFilters) {
			this.subMenus.addFilter(filter);
		}
		this.subMenus.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.MenuItem.Properties.subMenus, DroidViewsRepository.SWT_KIND));
		this.subMenus.createControls(parent);
		this.subMenus.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MenuItemPropertiesEditionPartImpl.this, DroidViewsRepository.MenuItem.Properties.subMenus, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData subMenusData = new GridData(GridData.FILL_HORIZONTAL);
		subMenusData.horizontalSpan = 3;
		this.subMenus.setLayoutData(subMenusData);
		this.subMenus.setLowerBound(0);
		this.subMenus.setUpperBound(-1);
		subMenus.setID(DroidViewsRepository.MenuItem.Properties.subMenus);
		subMenus.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see droid.parts.MenuItemPropertiesEditionPart#initSubMenus(EObject current, EReference containingFeature, EReference feature)
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
	 * @see droid.parts.MenuItemPropertiesEditionPart#updateSubMenus()
	 * 
	 */
	public void updateSubMenus() {
	subMenus.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.MenuItemPropertiesEditionPart#addFilterSubMenus(ViewerFilter filter)
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
	 * @see droid.parts.MenuItemPropertiesEditionPart#addBusinessFilterSubMenus(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubMenus(ViewerFilter filter) {
		subMenusBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.MenuItemPropertiesEditionPart#isContainedInSubMenusTable(EObject element)
	 * 
	 */
	public boolean isContainedInSubMenusTable(EObject element) {
		return ((ReferencesTableSettings)subMenus.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.MenuItem_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
