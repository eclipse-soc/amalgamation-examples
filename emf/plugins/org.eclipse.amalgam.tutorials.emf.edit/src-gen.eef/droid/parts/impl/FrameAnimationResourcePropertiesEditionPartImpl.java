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
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import droid.parts.DroidViewsRepository;
import droid.parts.FrameAnimationResourcePropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class FrameAnimationResourcePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, FrameAnimationResourcePropertiesEditionPart {

	protected Text name;
	protected Button oneShot;
protected ReferencesTable frames;
protected List<ViewerFilter> framesBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> framesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FrameAnimationResourcePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence frameAnimationResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = frameAnimationResourceStep.addStep(DroidViewsRepository.FrameAnimationResource.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.FrameAnimationResource.Properties.name);
		propertiesStep.addStep(DroidViewsRepository.FrameAnimationResource.Properties.oneShot);
		propertiesStep.addStep(DroidViewsRepository.FrameAnimationResource.Properties.frames);
		
		
		composer = new PartComposer(frameAnimationResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.FrameAnimationResource.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.FrameAnimationResource.Properties.name) {
					return createNameText(parent);
				}
				if (key == DroidViewsRepository.FrameAnimationResource.Properties.oneShot) {
					return createOneShotCheckbox(parent);
				}
				if (key == DroidViewsRepository.FrameAnimationResource.Properties.frames) {
					return createFramesAdvancedTableComposition(parent);
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
		propertiesGroup.setText(DroidMessages.FrameAnimationResourcePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.FrameAnimationResourcePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.FrameAnimationResource.Properties.name, DroidViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FrameAnimationResourcePropertiesEditionPartImpl.this, DroidViewsRepository.FrameAnimationResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FrameAnimationResourcePropertiesEditionPartImpl.this, DroidViewsRepository.FrameAnimationResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, DroidViewsRepository.FrameAnimationResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.FrameAnimationResource.Properties.name, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOneShotCheckbox(Composite parent) {
		oneShot = new Button(parent, SWT.CHECK);
		oneShot.setText(DroidMessages.FrameAnimationResourcePropertiesEditionPart_OneShotLabel);
		oneShot.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FrameAnimationResourcePropertiesEditionPartImpl.this, DroidViewsRepository.FrameAnimationResource.Properties.oneShot, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(oneShot.getSelection())));
			}

		});
		GridData oneShotData = new GridData(GridData.FILL_HORIZONTAL);
		oneShotData.horizontalSpan = 2;
		oneShot.setLayoutData(oneShotData);
		EditingUtils.setID(oneShot, DroidViewsRepository.FrameAnimationResource.Properties.oneShot);
		EditingUtils.setEEFtype(oneShot, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.FrameAnimationResource.Properties.oneShot, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createFramesAdvancedTableComposition(Composite parent) {
		this.frames = new ReferencesTable(DroidMessages.FrameAnimationResourcePropertiesEditionPart_FramesLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FrameAnimationResourcePropertiesEditionPartImpl.this, DroidViewsRepository.FrameAnimationResource.Properties.frames, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				frames.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FrameAnimationResourcePropertiesEditionPartImpl.this, DroidViewsRepository.FrameAnimationResource.Properties.frames, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				frames.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FrameAnimationResourcePropertiesEditionPartImpl.this, DroidViewsRepository.FrameAnimationResource.Properties.frames, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				frames.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FrameAnimationResourcePropertiesEditionPartImpl.this, DroidViewsRepository.FrameAnimationResource.Properties.frames, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				frames.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.framesFilters) {
			this.frames.addFilter(filter);
		}
		this.frames.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.FrameAnimationResource.Properties.frames, DroidViewsRepository.SWT_KIND));
		this.frames.createControls(parent);
		this.frames.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FrameAnimationResourcePropertiesEditionPartImpl.this, DroidViewsRepository.FrameAnimationResource.Properties.frames, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData framesData = new GridData(GridData.FILL_HORIZONTAL);
		framesData.horizontalSpan = 3;
		this.frames.setLayoutData(framesData);
		this.frames.setLowerBound(0);
		this.frames.setUpperBound(-1);
		frames.setID(DroidViewsRepository.FrameAnimationResource.Properties.frames);
		frames.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see droid.parts.FrameAnimationResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.FrameAnimationResourcePropertiesEditionPart#setName(String newValue)
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
	 * @see droid.parts.FrameAnimationResourcePropertiesEditionPart#getOneShot()
	 * 
	 */
	public Boolean getOneShot() {
		return Boolean.valueOf(oneShot.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.FrameAnimationResourcePropertiesEditionPart#setOneShot(Boolean newValue)
	 * 
	 */
	public void setOneShot(Boolean newValue) {
		if (newValue != null) {
			oneShot.setSelection(newValue.booleanValue());
		} else {
			oneShot.setSelection(false);
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.FrameAnimationResourcePropertiesEditionPart#initFrames(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initFrames(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		frames.setContentProvider(contentProvider);
		frames.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.FrameAnimationResourcePropertiesEditionPart#updateFrames()
	 * 
	 */
	public void updateFrames() {
	frames.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.FrameAnimationResourcePropertiesEditionPart#addFilterFrames(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFrames(ViewerFilter filter) {
		framesFilters.add(filter);
		if (this.frames != null) {
			this.frames.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.FrameAnimationResourcePropertiesEditionPart#addBusinessFilterFrames(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFrames(ViewerFilter filter) {
		framesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.FrameAnimationResourcePropertiesEditionPart#isContainedInFramesTable(EObject element)
	 * 
	 */
	public boolean isContainedInFramesTable(EObject element) {
		return ((ReferencesTableSettings)frames.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.FrameAnimationResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
