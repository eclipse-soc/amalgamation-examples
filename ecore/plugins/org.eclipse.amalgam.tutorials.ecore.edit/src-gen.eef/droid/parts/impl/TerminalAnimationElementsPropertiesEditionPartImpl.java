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

import droid.parts.DroidViewsRepository;
import droid.parts.TerminalAnimationElementsPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class TerminalAnimationElementsPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TerminalAnimationElementsPropertiesEditionPart {

	protected Text fromAlpha;
	protected Text toAlpha;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TerminalAnimationElementsPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence terminalAnimationElementsStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = terminalAnimationElementsStep.addStep(DroidViewsRepository.TerminalAnimationElements.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.TerminalAnimationElements.Properties.fromAlpha);
		propertiesStep.addStep(DroidViewsRepository.TerminalAnimationElements.Properties.toAlpha);
		
		
		composer = new PartComposer(terminalAnimationElementsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.TerminalAnimationElements.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.TerminalAnimationElements.Properties.fromAlpha) {
					return createFromAlphaText(parent);
				}
				if (key == DroidViewsRepository.TerminalAnimationElements.Properties.toAlpha) {
					return createToAlphaText(parent);
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
		propertiesGroup.setText(DroidMessages.TerminalAnimationElementsPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createFromAlphaText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.TerminalAnimationElementsPropertiesEditionPart_FromAlphaLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.TerminalAnimationElements.Properties.fromAlpha, DroidViewsRepository.SWT_KIND));
		fromAlpha = new Text(parent, SWT.BORDER);
		GridData fromAlphaData = new GridData(GridData.FILL_HORIZONTAL);
		fromAlpha.setLayoutData(fromAlphaData);
		fromAlpha.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TerminalAnimationElementsPropertiesEditionPartImpl.this, DroidViewsRepository.TerminalAnimationElements.Properties.fromAlpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fromAlpha.getText()));
			}

		});
		fromAlpha.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TerminalAnimationElementsPropertiesEditionPartImpl.this, DroidViewsRepository.TerminalAnimationElements.Properties.fromAlpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fromAlpha.getText()));
				}
			}

		});
		EditingUtils.setID(fromAlpha, DroidViewsRepository.TerminalAnimationElements.Properties.fromAlpha);
		EditingUtils.setEEFtype(fromAlpha, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.TerminalAnimationElements.Properties.fromAlpha, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createToAlphaText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.TerminalAnimationElementsPropertiesEditionPart_ToAlphaLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.TerminalAnimationElements.Properties.toAlpha, DroidViewsRepository.SWT_KIND));
		toAlpha = new Text(parent, SWT.BORDER);
		GridData toAlphaData = new GridData(GridData.FILL_HORIZONTAL);
		toAlpha.setLayoutData(toAlphaData);
		toAlpha.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TerminalAnimationElementsPropertiesEditionPartImpl.this, DroidViewsRepository.TerminalAnimationElements.Properties.toAlpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, toAlpha.getText()));
			}

		});
		toAlpha.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TerminalAnimationElementsPropertiesEditionPartImpl.this, DroidViewsRepository.TerminalAnimationElements.Properties.toAlpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, toAlpha.getText()));
				}
			}

		});
		EditingUtils.setID(toAlpha, DroidViewsRepository.TerminalAnimationElements.Properties.toAlpha);
		EditingUtils.setEEFtype(toAlpha, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.TerminalAnimationElements.Properties.toAlpha, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see droid.parts.TerminalAnimationElementsPropertiesEditionPart#getFromAlpha()
	 * 
	 */
	public String getFromAlpha() {
		return fromAlpha.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TerminalAnimationElementsPropertiesEditionPart#setFromAlpha(String newValue)
	 * 
	 */
	public void setFromAlpha(String newValue) {
		if (newValue != null) {
			fromAlpha.setText(newValue);
		} else {
			fromAlpha.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TerminalAnimationElementsPropertiesEditionPart#getToAlpha()
	 * 
	 */
	public String getToAlpha() {
		return toAlpha.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.TerminalAnimationElementsPropertiesEditionPart#setToAlpha(String newValue)
	 * 
	 */
	public void setToAlpha(String newValue) {
		if (newValue != null) {
			toAlpha.setText(newValue);
		} else {
			toAlpha.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.TerminalAnimationElements_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
