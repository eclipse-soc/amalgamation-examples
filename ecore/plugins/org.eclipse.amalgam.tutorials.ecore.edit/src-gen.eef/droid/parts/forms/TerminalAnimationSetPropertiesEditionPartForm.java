/**
 * Generated with Acceleo
 */
package droid.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import droid.parts.DroidViewsRepository;
import droid.parts.TerminalAnimationSetPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class TerminalAnimationSetPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, TerminalAnimationSetPropertiesEditionPart {

	protected Button shareInterpolator;
	protected ReferencesTable elements;
	protected List<ViewerFilter> elementsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> elementsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TerminalAnimationSetPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence terminalAnimationSetStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = terminalAnimationSetStep.addStep(DroidViewsRepository.TerminalAnimationSet.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.TerminalAnimationSet.Properties.shareInterpolator);
		propertiesStep.addStep(DroidViewsRepository.TerminalAnimationSet.Properties.elements);
		
		
		composer = new PartComposer(terminalAnimationSetStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.TerminalAnimationSet.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.TerminalAnimationSet.Properties.shareInterpolator) {
					return createShareInterpolatorCheckbox(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.TerminalAnimationSet.Properties.elements) {
					return createElementsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(DroidMessages.TerminalAnimationSetPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createShareInterpolatorCheckbox(FormToolkit widgetFactory, Composite parent) {
		shareInterpolator = widgetFactory.createButton(parent, DroidMessages.TerminalAnimationSetPropertiesEditionPart_ShareInterpolatorLabel, SWT.CHECK);
		shareInterpolator.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TerminalAnimationSetPropertiesEditionPartForm.this, DroidViewsRepository.TerminalAnimationSet.Properties.shareInterpolator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(shareInterpolator.getSelection())));
			}

		});
		GridData shareInterpolatorData = new GridData(GridData.FILL_HORIZONTAL);
		shareInterpolatorData.horizontalSpan = 2;
		shareInterpolator.setLayoutData(shareInterpolatorData);
		EditingUtils.setID(shareInterpolator, DroidViewsRepository.TerminalAnimationSet.Properties.shareInterpolator);
		EditingUtils.setEEFtype(shareInterpolator, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.TerminalAnimationSet.Properties.shareInterpolator, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createElementsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.elements = new ReferencesTable(DroidMessages.TerminalAnimationSetPropertiesEditionPart_ElementsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TerminalAnimationSetPropertiesEditionPartForm.this, DroidViewsRepository.TerminalAnimationSet.Properties.elements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				elements.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TerminalAnimationSetPropertiesEditionPartForm.this, DroidViewsRepository.TerminalAnimationSet.Properties.elements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				elements.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TerminalAnimationSetPropertiesEditionPartForm.this, DroidViewsRepository.TerminalAnimationSet.Properties.elements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				elements.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TerminalAnimationSetPropertiesEditionPartForm.this, DroidViewsRepository.TerminalAnimationSet.Properties.elements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				elements.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.elementsFilters) {
			this.elements.addFilter(filter);
		}
		this.elements.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.TerminalAnimationSet.Properties.elements, DroidViewsRepository.FORM_KIND));
		this.elements.createControls(parent, widgetFactory);
		this.elements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TerminalAnimationSetPropertiesEditionPartForm.this, DroidViewsRepository.TerminalAnimationSet.Properties.elements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData elementsData = new GridData(GridData.FILL_HORIZONTAL);
		elementsData.horizontalSpan = 3;
		this.elements.setLayoutData(elementsData);
		this.elements.setLowerBound(0);
		this.elements.setUpperBound(-1);
		elements.setID(DroidViewsRepository.TerminalAnimationSet.Properties.elements);
		elements.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see droid.parts.TerminalAnimationSetPropertiesEditionPart#getShareInterpolator()
	 * 
	 */
	public Boolean getShareInterpolator() {
		return Boolean.valueOf(shareInterpolator.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TerminalAnimationSetPropertiesEditionPart#setShareInterpolator(Boolean newValue)
	 * 
	 */
	public void setShareInterpolator(Boolean newValue) {
		if (newValue != null) {
			shareInterpolator.setSelection(newValue.booleanValue());
		} else {
			shareInterpolator.setSelection(false);
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TerminalAnimationSetPropertiesEditionPart#initElements(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initElements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		elements.setContentProvider(contentProvider);
		elements.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TerminalAnimationSetPropertiesEditionPart#updateElements()
	 * 
	 */
	public void updateElements() {
	elements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TerminalAnimationSetPropertiesEditionPart#addFilterElements(ViewerFilter filter)
	 * 
	 */
	public void addFilterToElements(ViewerFilter filter) {
		elementsFilters.add(filter);
		if (this.elements != null) {
			this.elements.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TerminalAnimationSetPropertiesEditionPart#addBusinessFilterElements(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToElements(ViewerFilter filter) {
		elementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TerminalAnimationSetPropertiesEditionPart#isContainedInElementsTable(EObject element)
	 * 
	 */
	public boolean isContainedInElementsTable(EObject element) {
		return ((ReferencesTableSettings)elements.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.TerminalAnimationSet_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
