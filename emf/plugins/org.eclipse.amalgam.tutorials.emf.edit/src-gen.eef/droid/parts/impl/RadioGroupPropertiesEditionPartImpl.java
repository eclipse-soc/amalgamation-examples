/**
 * Generated with Acceleo
 */
package droid.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
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

import droid.parts.DroidViewsRepository;
import droid.parts.RadioGroupPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class RadioGroupPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RadioGroupPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable radioButtons;
	protected List<ViewerFilter> radioButtonsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> radioButtonsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RadioGroupPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence radioGroupStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = radioGroupStep.addStep(DroidViewsRepository.RadioGroup.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.RadioGroup.Properties.name);
		propertiesStep.addStep(DroidViewsRepository.RadioGroup.Properties.radioButtons);
		
		
		composer = new PartComposer(radioGroupStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.RadioGroup.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.RadioGroup.Properties.name) {
					return createNameText(parent);
				}
				if (key == DroidViewsRepository.RadioGroup.Properties.radioButtons) {
					return createRadioButtonsAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(DroidMessages.RadioGroupPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.RadioGroupPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.RadioGroup.Properties.name, DroidViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RadioGroupPropertiesEditionPartImpl.this, DroidViewsRepository.RadioGroup.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RadioGroupPropertiesEditionPartImpl.this, DroidViewsRepository.RadioGroup.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, DroidViewsRepository.RadioGroup.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.RadioGroup.Properties.name, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRadioButtonsAdvancedReferencesTable(Composite parent) {
		this.radioButtons = new ReferencesTable(DroidMessages.RadioGroupPropertiesEditionPart_RadioButtonsLabel, new ReferencesTableListener() {
			public void handleAdd() { addRadioButtons(); }
			public void handleEdit(EObject element) { editRadioButtons(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveRadioButtons(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromRadioButtons(element); }
			public void navigateTo(EObject element) { }
		});
		this.radioButtons.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.RadioGroup.Properties.radioButtons, DroidViewsRepository.SWT_KIND));
		this.radioButtons.createControls(parent);
		this.radioButtons.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RadioGroupPropertiesEditionPartImpl.this, DroidViewsRepository.RadioGroup.Properties.radioButtons, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData radioButtonsData = new GridData(GridData.FILL_HORIZONTAL);
		radioButtonsData.horizontalSpan = 3;
		this.radioButtons.setLayoutData(radioButtonsData);
		this.radioButtons.disableMove();
		radioButtons.setID(DroidViewsRepository.RadioGroup.Properties.radioButtons);
		radioButtons.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addRadioButtons() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(radioButtons.getInput(), radioButtonsFilters, radioButtonsBusinessFilters,
		"radioButtons", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RadioGroupPropertiesEditionPartImpl.this, DroidViewsRepository.RadioGroup.Properties.radioButtons,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				radioButtons.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRadioButtons(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RadioGroupPropertiesEditionPartImpl.this, DroidViewsRepository.RadioGroup.Properties.radioButtons, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		radioButtons.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRadioButtons(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RadioGroupPropertiesEditionPartImpl.this, DroidViewsRepository.RadioGroup.Properties.radioButtons, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		radioButtons.refresh();
	}

	/**
	 * 
	 */
	protected void editRadioButtons(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				radioButtons.refresh();
			}
		}
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
	 * @see droid.parts.RadioGroupPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.RadioGroupPropertiesEditionPart#setName(String newValue)
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
	 * @see droid.parts.RadioGroupPropertiesEditionPart#initRadioButtons(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRadioButtons(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		radioButtons.setContentProvider(contentProvider);
		radioButtons.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.RadioGroupPropertiesEditionPart#updateRadioButtons()
	 * 
	 */
	public void updateRadioButtons() {
	radioButtons.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.RadioGroupPropertiesEditionPart#addFilterRadioButtons(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRadioButtons(ViewerFilter filter) {
		radioButtonsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.RadioGroupPropertiesEditionPart#addBusinessFilterRadioButtons(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRadioButtons(ViewerFilter filter) {
		radioButtonsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.RadioGroupPropertiesEditionPart#isContainedInRadioButtonsTable(EObject element)
	 * 
	 */
	public boolean isContainedInRadioButtonsTable(EObject element) {
		return ((ReferencesTableSettings)radioButtons.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.RadioGroup_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
