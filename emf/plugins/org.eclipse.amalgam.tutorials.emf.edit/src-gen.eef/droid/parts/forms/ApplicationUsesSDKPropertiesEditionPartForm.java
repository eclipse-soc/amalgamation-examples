/**
 * Generated with Acceleo
 */
package droid.parts.forms;

// Start of user code for imports
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import droid.parts.ApplicationUsesSDKPropertiesEditionPart;
import droid.parts.DroidViewsRepository;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class ApplicationUsesSDKPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ApplicationUsesSDKPropertiesEditionPart {

	protected Text minSdkVersion;
	protected Text maxSdkVersion;
	protected Text targetSdkVersion;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ApplicationUsesSDKPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence applicationUsesSDKStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = applicationUsesSDKStep.addStep(DroidViewsRepository.ApplicationUsesSDK.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion);
		propertiesStep.addStep(DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion);
		propertiesStep.addStep(DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion);
		
		
		composer = new PartComposer(applicationUsesSDKStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.ApplicationUsesSDK.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion) {
					return 		createMinSdkVersionText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion) {
					return 		createMaxSdkVersionText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion) {
					return 		createTargetSdkVersionText(widgetFactory, parent);
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
		propertiesSection.setText(DroidMessages.ApplicationUsesSDKPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createMinSdkVersionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.ApplicationUsesSDKPropertiesEditionPart_MinSdkVersionLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion, DroidViewsRepository.FORM_KIND));
		minSdkVersion = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		minSdkVersion.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData minSdkVersionData = new GridData(GridData.FILL_HORIZONTAL);
		minSdkVersion.setLayoutData(minSdkVersionData);
		minSdkVersion.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationUsesSDKPropertiesEditionPartForm.this, DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minSdkVersion.getText()));
			}
		});
		minSdkVersion.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationUsesSDKPropertiesEditionPartForm.this, DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minSdkVersion.getText()));
				}
			}
		});
		EditingUtils.setID(minSdkVersion, DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion);
		EditingUtils.setEEFtype(minSdkVersion, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMaxSdkVersionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.ApplicationUsesSDKPropertiesEditionPart_MaxSdkVersionLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion, DroidViewsRepository.FORM_KIND));
		maxSdkVersion = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		maxSdkVersion.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData maxSdkVersionData = new GridData(GridData.FILL_HORIZONTAL);
		maxSdkVersion.setLayoutData(maxSdkVersionData);
		maxSdkVersion.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationUsesSDKPropertiesEditionPartForm.this, DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxSdkVersion.getText()));
			}
		});
		maxSdkVersion.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationUsesSDKPropertiesEditionPartForm.this, DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxSdkVersion.getText()));
				}
			}
		});
		EditingUtils.setID(maxSdkVersion, DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion);
		EditingUtils.setEEFtype(maxSdkVersion, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTargetSdkVersionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.ApplicationUsesSDKPropertiesEditionPart_TargetSdkVersionLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion, DroidViewsRepository.FORM_KIND));
		targetSdkVersion = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		targetSdkVersion.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData targetSdkVersionData = new GridData(GridData.FILL_HORIZONTAL);
		targetSdkVersion.setLayoutData(targetSdkVersionData);
		targetSdkVersion.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationUsesSDKPropertiesEditionPartForm.this, DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, targetSdkVersion.getText()));
			}
		});
		targetSdkVersion.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationUsesSDKPropertiesEditionPartForm.this, DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, targetSdkVersion.getText()));
				}
			}
		});
		EditingUtils.setID(targetSdkVersion, DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion);
		EditingUtils.setEEFtype(targetSdkVersion, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see droid.parts.ApplicationUsesSDKPropertiesEditionPart#getMinSdkVersion()
	 * 
	 */
	public String getMinSdkVersion() {
		return minSdkVersion.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationUsesSDKPropertiesEditionPart#setMinSdkVersion(String newValue)
	 * 
	 */
	public void setMinSdkVersion(String newValue) {
		if (newValue != null) {
			minSdkVersion.setText(newValue);
		} else {
			minSdkVersion.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationUsesSDKPropertiesEditionPart#getMaxSdkVersion()
	 * 
	 */
	public String getMaxSdkVersion() {
		return maxSdkVersion.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationUsesSDKPropertiesEditionPart#setMaxSdkVersion(String newValue)
	 * 
	 */
	public void setMaxSdkVersion(String newValue) {
		if (newValue != null) {
			maxSdkVersion.setText(newValue);
		} else {
			maxSdkVersion.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationUsesSDKPropertiesEditionPart#getTargetSdkVersion()
	 * 
	 */
	public String getTargetSdkVersion() {
		return targetSdkVersion.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationUsesSDKPropertiesEditionPart#setTargetSdkVersion(String newValue)
	 * 
	 */
	public void setTargetSdkVersion(String newValue) {
		if (newValue != null) {
			targetSdkVersion.setText(newValue);
		} else {
			targetSdkVersion.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.ApplicationUsesSDK_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
