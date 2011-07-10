/**
 * Generated with Acceleo
 */
package droid.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import droid.parts.DroidViewsRepository;
import droid.parts.ShowLayoutActionPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class ShowLayoutActionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ShowLayoutActionPropertiesEditionPart {

	protected EObjectFlatComboViewer layout;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ShowLayoutActionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence showLayoutActionStep = new BindingCompositionSequence(propertiesEditionComponent);
		showLayoutActionStep
			.addStep(DroidViewsRepository.ShowLayoutAction.Properties.class)
			.addStep(DroidViewsRepository.ShowLayoutAction.Properties.layout);
		
		
		composer = new PartComposer(showLayoutActionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.ShowLayoutAction.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.ShowLayoutAction.Properties.layout) {
					return createLayoutFlatComboViewer(parent);
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
		propertiesGroup.setText(DroidMessages.ShowLayoutActionPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createLayoutFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.ShowLayoutActionPropertiesEditionPart_LayoutLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ShowLayoutAction.Properties.layout, DroidViewsRepository.SWT_KIND));
		layout = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.ShowLayoutAction.Properties.layout, DroidViewsRepository.SWT_KIND));
		layout.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		layout.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ShowLayoutActionPropertiesEditionPartImpl.this, DroidViewsRepository.ShowLayoutAction.Properties.layout, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getLayout()));
			}

		});
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layout.setLayoutData(layoutData);
		layout.setID(DroidViewsRepository.ShowLayoutAction.Properties.layout);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ShowLayoutAction.Properties.layout, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see droid.parts.ShowLayoutActionPropertiesEditionPart#getLayout()
	 * 
	 */
	public EObject getLayout() {
		if (layout.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) layout.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ShowLayoutActionPropertiesEditionPart#initLayout(EObjectFlatComboSettings)
	 */
	public void initLayout(EObjectFlatComboSettings settings) {
		layout.setInput(settings);
		if (current != null) {
			layout.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ShowLayoutActionPropertiesEditionPart#setLayout(EObject newValue)
	 * 
	 */
	public void setLayout(EObject newValue) {
		if (newValue != null) {
			layout.setSelection(new StructuredSelection(newValue));
		} else {
			layout.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ShowLayoutActionPropertiesEditionPart#setLayoutButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLayoutButtonMode(ButtonsModeEnum newValue) {
		layout.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ShowLayoutActionPropertiesEditionPart#addFilterLayout(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLayout(ViewerFilter filter) {
		layout.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ShowLayoutActionPropertiesEditionPart#addBusinessFilterLayout(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLayout(ViewerFilter filter) {
		layout.addBusinessRuleFilter(filter);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.ShowLayoutAction_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
