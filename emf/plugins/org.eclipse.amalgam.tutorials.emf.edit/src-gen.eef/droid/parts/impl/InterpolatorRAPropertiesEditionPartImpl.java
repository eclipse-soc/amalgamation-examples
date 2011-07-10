/**
 * Generated with Acceleo
 */
package droid.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import droid.parts.DroidViewsRepository;
import droid.parts.InterpolatorRAPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class InterpolatorRAPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, InterpolatorRAPropertiesEditionPart {

	protected Text externalResource;
	protected EMFComboViewer interpolatorName;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InterpolatorRAPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence interpolatorRAStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = interpolatorRAStep.addStep(DroidViewsRepository.InterpolatorRA.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.InterpolatorRA.Properties.externalResource);
		propertiesStep.addStep(DroidViewsRepository.InterpolatorRA.Properties.interpolatorName);
		
		
		composer = new PartComposer(interpolatorRAStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.InterpolatorRA.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.InterpolatorRA.Properties.externalResource) {
					return createExternalResourceText(parent);
				}
				if (key == DroidViewsRepository.InterpolatorRA.Properties.interpolatorName) {
					return createInterpolatorNameEMFComboViewer(parent);
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
		propertiesGroup.setText(DroidMessages.InterpolatorRAPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createExternalResourceText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.InterpolatorRAPropertiesEditionPart_ExternalResourceLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.InterpolatorRA.Properties.externalResource, DroidViewsRepository.SWT_KIND));
		externalResource = new Text(parent, SWT.BORDER);
		GridData externalResourceData = new GridData(GridData.FILL_HORIZONTAL);
		externalResource.setLayoutData(externalResourceData);
		externalResource.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterpolatorRAPropertiesEditionPartImpl.this, DroidViewsRepository.InterpolatorRA.Properties.externalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, externalResource.getText()));
			}

		});
		externalResource.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterpolatorRAPropertiesEditionPartImpl.this, DroidViewsRepository.InterpolatorRA.Properties.externalResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, externalResource.getText()));
				}
			}

		});
		EditingUtils.setID(externalResource, DroidViewsRepository.InterpolatorRA.Properties.externalResource);
		EditingUtils.setEEFtype(externalResource, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.InterpolatorRA.Properties.externalResource, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createInterpolatorNameEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.InterpolatorRAPropertiesEditionPart_InterpolatorNameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.InterpolatorRA.Properties.interpolatorName, DroidViewsRepository.SWT_KIND));
		interpolatorName = new EMFComboViewer(parent);
		interpolatorName.setContentProvider(new ArrayContentProvider());
		interpolatorName.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData interpolatorNameData = new GridData(GridData.FILL_HORIZONTAL);
		interpolatorName.getCombo().setLayoutData(interpolatorNameData);
		interpolatorName.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InterpolatorRAPropertiesEditionPartImpl.this, DroidViewsRepository.InterpolatorRA.Properties.interpolatorName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInterpolatorName()));
			}

		});
		interpolatorName.setID(DroidViewsRepository.InterpolatorRA.Properties.interpolatorName);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.InterpolatorRA.Properties.interpolatorName, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see droid.parts.InterpolatorRAPropertiesEditionPart#getExternalResource()
	 * 
	 */
	public String getExternalResource() {
		return externalResource.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.InterpolatorRAPropertiesEditionPart#setExternalResource(String newValue)
	 * 
	 */
	public void setExternalResource(String newValue) {
		if (newValue != null) {
			externalResource.setText(newValue);
		} else {
			externalResource.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.InterpolatorRAPropertiesEditionPart#getInterpolatorName()
	 * 
	 */
	public Enumerator getInterpolatorName() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) interpolatorName.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.InterpolatorRAPropertiesEditionPart#initInterpolatorName(EEnum eenum, Enumerator current)
	 */
	public void initInterpolatorName(EEnum eenum, Enumerator current) {
		interpolatorName.setInput(eenum.getELiterals());
		interpolatorName.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.InterpolatorRAPropertiesEditionPart#setInterpolatorName(Enumerator newValue)
	 * 
	 */
	public void setInterpolatorName(Enumerator newValue) {
		interpolatorName.modelUpdating(new StructuredSelection(newValue));
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.InterpolatorRA_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
