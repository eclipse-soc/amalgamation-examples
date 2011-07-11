/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.parts.forms;

// Start of user code for imports
import org.eclipse.amalgam.tutorials.emf.droid.parts.AlphaAnimationPropertiesEditionPart;
import org.eclipse.amalgam.tutorials.emf.droid.parts.DroidViewsRepository;
import org.eclipse.amalgam.tutorials.emf.droid.providers.DroidMessages;
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


// End of user code

/**
 * 
 * 
 */
public class AlphaAnimationPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, AlphaAnimationPropertiesEditionPart {

	protected Text fromAlpha;
	protected Text toAlpha;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AlphaAnimationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence alphaAnimationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = alphaAnimationStep.addStep(DroidViewsRepository.AlphaAnimation.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.AlphaAnimation.Properties.fromAlpha);
		propertiesStep.addStep(DroidViewsRepository.AlphaAnimation.Properties.toAlpha);
		
		
		composer = new PartComposer(alphaAnimationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.AlphaAnimation.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.AlphaAnimation.Properties.fromAlpha) {
					return 		createFromAlphaText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.AlphaAnimation.Properties.toAlpha) {
					return 		createToAlphaText(widgetFactory, parent);
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
		propertiesSection.setText(DroidMessages.AlphaAnimationPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createFromAlphaText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.AlphaAnimationPropertiesEditionPart_FromAlphaLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.AlphaAnimation.Properties.fromAlpha, DroidViewsRepository.FORM_KIND));
		fromAlpha = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		fromAlpha.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData fromAlphaData = new GridData(GridData.FILL_HORIZONTAL);
		fromAlpha.setLayoutData(fromAlphaData);
		fromAlpha.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AlphaAnimationPropertiesEditionPartForm.this, DroidViewsRepository.AlphaAnimation.Properties.fromAlpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fromAlpha.getText()));
			}
		});
		fromAlpha.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AlphaAnimationPropertiesEditionPartForm.this, DroidViewsRepository.AlphaAnimation.Properties.fromAlpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fromAlpha.getText()));
				}
			}
		});
		EditingUtils.setID(fromAlpha, DroidViewsRepository.AlphaAnimation.Properties.fromAlpha);
		EditingUtils.setEEFtype(fromAlpha, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.AlphaAnimation.Properties.fromAlpha, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createToAlphaText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.AlphaAnimationPropertiesEditionPart_ToAlphaLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.AlphaAnimation.Properties.toAlpha, DroidViewsRepository.FORM_KIND));
		toAlpha = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		toAlpha.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData toAlphaData = new GridData(GridData.FILL_HORIZONTAL);
		toAlpha.setLayoutData(toAlphaData);
		toAlpha.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AlphaAnimationPropertiesEditionPartForm.this, DroidViewsRepository.AlphaAnimation.Properties.toAlpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, toAlpha.getText()));
			}
		});
		toAlpha.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AlphaAnimationPropertiesEditionPartForm.this, DroidViewsRepository.AlphaAnimation.Properties.toAlpha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, toAlpha.getText()));
				}
			}
		});
		EditingUtils.setID(toAlpha, DroidViewsRepository.AlphaAnimation.Properties.toAlpha);
		EditingUtils.setEEFtype(toAlpha, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.AlphaAnimation.Properties.toAlpha, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AlphaAnimationPropertiesEditionPart#getFromAlpha()
	 * 
	 */
	public String getFromAlpha() {
		return fromAlpha.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AlphaAnimationPropertiesEditionPart#setFromAlpha(String newValue)
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AlphaAnimationPropertiesEditionPart#getToAlpha()
	 * 
	 */
	public String getToAlpha() {
		return toAlpha.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.amalgam.tutorials.emf.droid.parts.AlphaAnimationPropertiesEditionPart#setToAlpha(String newValue)
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
		return DroidMessages.AlphaAnimation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
