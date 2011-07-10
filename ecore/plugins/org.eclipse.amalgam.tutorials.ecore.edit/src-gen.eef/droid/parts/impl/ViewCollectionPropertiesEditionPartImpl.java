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
import droid.parts.ViewCollectionPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class ViewCollectionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ViewCollectionPropertiesEditionPart {

protected ReferencesTable views;
protected List<ViewerFilter> viewsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> viewsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ViewCollectionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence viewCollectionStep = new BindingCompositionSequence(propertiesEditionComponent);
		viewCollectionStep
			.addStep(DroidViewsRepository.ViewCollection.Properties.class)
			.addStep(DroidViewsRepository.ViewCollection.Properties.views);
		
		
		composer = new PartComposer(viewCollectionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.ViewCollection.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.ViewCollection.Properties.views) {
					return createViewsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(DroidMessages.ViewCollectionPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createViewsAdvancedTableComposition(Composite parent) {
		this.views = new ReferencesTable(DroidMessages.ViewCollectionPropertiesEditionPart_ViewsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewCollectionPropertiesEditionPartImpl.this, DroidViewsRepository.ViewCollection.Properties.views, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				views.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewCollectionPropertiesEditionPartImpl.this, DroidViewsRepository.ViewCollection.Properties.views, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				views.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewCollectionPropertiesEditionPartImpl.this, DroidViewsRepository.ViewCollection.Properties.views, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				views.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewCollectionPropertiesEditionPartImpl.this, DroidViewsRepository.ViewCollection.Properties.views, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				views.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.viewsFilters) {
			this.views.addFilter(filter);
		}
		this.views.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.ViewCollection.Properties.views, DroidViewsRepository.SWT_KIND));
		this.views.createControls(parent);
		this.views.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ViewCollectionPropertiesEditionPartImpl.this, DroidViewsRepository.ViewCollection.Properties.views, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData viewsData = new GridData(GridData.FILL_HORIZONTAL);
		viewsData.horizontalSpan = 3;
		this.views.setLayoutData(viewsData);
		this.views.setLowerBound(0);
		this.views.setUpperBound(-1);
		views.setID(DroidViewsRepository.ViewCollection.Properties.views);
		views.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see droid.parts.ViewCollectionPropertiesEditionPart#initViews(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initViews(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		views.setContentProvider(contentProvider);
		views.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ViewCollectionPropertiesEditionPart#updateViews()
	 * 
	 */
	public void updateViews() {
	views.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ViewCollectionPropertiesEditionPart#addFilterViews(ViewerFilter filter)
	 * 
	 */
	public void addFilterToViews(ViewerFilter filter) {
		viewsFilters.add(filter);
		if (this.views != null) {
			this.views.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ViewCollectionPropertiesEditionPart#addBusinessFilterViews(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToViews(ViewerFilter filter) {
		viewsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ViewCollectionPropertiesEditionPart#isContainedInViewsTable(EObject element)
	 * 
	 */
	public boolean isContainedInViewsTable(EObject element) {
		return ((ReferencesTableSettings)views.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.ViewCollection_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
