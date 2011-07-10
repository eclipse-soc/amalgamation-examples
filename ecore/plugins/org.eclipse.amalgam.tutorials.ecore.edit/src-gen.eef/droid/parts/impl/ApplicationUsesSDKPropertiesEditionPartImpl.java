/**
 * Generated with Acceleo
 */
package droid.parts.impl;

// Start of user code for imports
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
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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

import droid.parts.ApplicationUsesSDKPropertiesEditionPart;
import droid.parts.DroidViewsRepository;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class ApplicationUsesSDKPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ApplicationUsesSDKPropertiesEditionPart {

	protected Text minSdkVersion;
	protected Text maxSdkVersion;
	protected Text targetSdkVersion;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ApplicationUsesSDKPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence applicationUsesSDKStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = applicationUsesSDKStep.addStep(DroidViewsRepository.ApplicationUsesSDK.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion);
		propertiesStep.addStep(DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion);
		propertiesStep.addStep(DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion);
		
		
		composer = new PartComposer(applicationUsesSDKStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.ApplicationUsesSDK.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion) {
					return createMinSdkVersionText(parent);
				}
				if (key == DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion) {
					return createMaxSdkVersionText(parent);
				}
				if (key == DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion) {
					return createTargetSdkVersionText(parent);
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
		propertiesGroup.setText(DroidMessages.ApplicationUsesSDKPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createMinSdkVersionText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.ApplicationUsesSDKPropertiesEditionPart_MinSdkVersionLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion, DroidViewsRepository.SWT_KIND));
		minSdkVersion = new Text(parent, SWT.BORDER);
		GridData minSdkVersionData = new GridData(GridData.FILL_HORIZONTAL);
		minSdkVersion.setLayoutData(minSdkVersionData);
		minSdkVersion.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationUsesSDKPropertiesEditionPartImpl.this, DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minSdkVersion.getText()));
			}

		});
		minSdkVersion.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationUsesSDKPropertiesEditionPartImpl.this, DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minSdkVersion.getText()));
				}
			}

		});
		EditingUtils.setID(minSdkVersion, DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion);
		EditingUtils.setEEFtype(minSdkVersion, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ApplicationUsesSDK.Properties.minSdkVersion, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMaxSdkVersionText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.ApplicationUsesSDKPropertiesEditionPart_MaxSdkVersionLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion, DroidViewsRepository.SWT_KIND));
		maxSdkVersion = new Text(parent, SWT.BORDER);
		GridData maxSdkVersionData = new GridData(GridData.FILL_HORIZONTAL);
		maxSdkVersion.setLayoutData(maxSdkVersionData);
		maxSdkVersion.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationUsesSDKPropertiesEditionPartImpl.this, DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxSdkVersion.getText()));
			}

		});
		maxSdkVersion.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationUsesSDKPropertiesEditionPartImpl.this, DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxSdkVersion.getText()));
				}
			}

		});
		EditingUtils.setID(maxSdkVersion, DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion);
		EditingUtils.setEEFtype(maxSdkVersion, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ApplicationUsesSDK.Properties.maxSdkVersion, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTargetSdkVersionText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.ApplicationUsesSDKPropertiesEditionPart_TargetSdkVersionLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion, DroidViewsRepository.SWT_KIND));
		targetSdkVersion = new Text(parent, SWT.BORDER);
		GridData targetSdkVersionData = new GridData(GridData.FILL_HORIZONTAL);
		targetSdkVersion.setLayoutData(targetSdkVersionData);
		targetSdkVersion.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationUsesSDKPropertiesEditionPartImpl.this, DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, targetSdkVersion.getText()));
			}

		});
		targetSdkVersion.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationUsesSDKPropertiesEditionPartImpl.this, DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, targetSdkVersion.getText()));
				}
			}

		});
		EditingUtils.setID(targetSdkVersion, DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion);
		EditingUtils.setEEFtype(targetSdkVersion, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.ApplicationUsesSDK.Properties.targetSdkVersion, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
