/**
 * Generated with Acceleo
 */
package droid.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import droid.DroidPackage;
import droid.parts.DroidViewsRepository;
import droid.parts.EditTextPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class EditTextPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, EditTextPropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer autoLink;
	protected EMFComboViewer capitalize;
	protected EMFComboViewer gravity;
	protected EMFComboViewer typeface;
	protected Text textStyle;
		protected Button editTextStyle;
		private EList textStyleList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EditTextPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence editTextStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = editTextStep.addStep(DroidViewsRepository.EditText.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.EditText.Properties.name);
		propertiesStep.addStep(DroidViewsRepository.EditText.Properties.autoLink);
		propertiesStep.addStep(DroidViewsRepository.EditText.Properties.capitalize);
		propertiesStep.addStep(DroidViewsRepository.EditText.Properties.gravity);
		propertiesStep.addStep(DroidViewsRepository.EditText.Properties.typeface);
		propertiesStep.addStep(DroidViewsRepository.EditText.Properties.textStyle);
		
		
		composer = new PartComposer(editTextStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.EditText.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.EditText.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.EditText.Properties.autoLink) {
					return createAutoLinkEMFComboViewer(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.EditText.Properties.capitalize) {
					return createCapitalizeEMFComboViewer(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.EditText.Properties.gravity) {
					return createGravityEMFComboViewer(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.EditText.Properties.typeface) {
					return createTypefaceEMFComboViewer(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.EditText.Properties.textStyle) {
					return createTextStyleMultiValuedEditor(widgetFactory, parent);
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
		propertiesSection.setText(DroidMessages.EditTextPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.EditTextPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.EditText.Properties.name, DroidViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EditTextPropertiesEditionPartForm.this, DroidViewsRepository.EditText.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EditTextPropertiesEditionPartForm.this, DroidViewsRepository.EditText.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, DroidViewsRepository.EditText.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.EditText.Properties.name, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAutoLinkEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.EditTextPropertiesEditionPart_AutoLinkLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.EditText.Properties.autoLink, DroidViewsRepository.FORM_KIND));
		autoLink = new EMFComboViewer(parent);
		autoLink.setContentProvider(new ArrayContentProvider());
		autoLink.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData autoLinkData = new GridData(GridData.FILL_HORIZONTAL);
		autoLink.getCombo().setLayoutData(autoLinkData);
		autoLink.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EditTextPropertiesEditionPartForm.this, DroidViewsRepository.EditText.Properties.autoLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAutoLink()));
			}

		});
		autoLink.setID(DroidViewsRepository.EditText.Properties.autoLink);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.EditText.Properties.autoLink, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCapitalizeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.EditTextPropertiesEditionPart_CapitalizeLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.EditText.Properties.capitalize, DroidViewsRepository.FORM_KIND));
		capitalize = new EMFComboViewer(parent);
		capitalize.setContentProvider(new ArrayContentProvider());
		capitalize.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData capitalizeData = new GridData(GridData.FILL_HORIZONTAL);
		capitalize.getCombo().setLayoutData(capitalizeData);
		capitalize.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EditTextPropertiesEditionPartForm.this, DroidViewsRepository.EditText.Properties.capitalize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCapitalize()));
			}

		});
		capitalize.setID(DroidViewsRepository.EditText.Properties.capitalize);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.EditText.Properties.capitalize, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createGravityEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.EditTextPropertiesEditionPart_GravityLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.EditText.Properties.gravity, DroidViewsRepository.FORM_KIND));
		gravity = new EMFComboViewer(parent);
		gravity.setContentProvider(new ArrayContentProvider());
		gravity.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData gravityData = new GridData(GridData.FILL_HORIZONTAL);
		gravity.getCombo().setLayoutData(gravityData);
		gravity.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EditTextPropertiesEditionPartForm.this, DroidViewsRepository.EditText.Properties.gravity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getGravity()));
			}

		});
		gravity.setID(DroidViewsRepository.EditText.Properties.gravity);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.EditText.Properties.gravity, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypefaceEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.EditTextPropertiesEditionPart_TypefaceLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.EditText.Properties.typeface, DroidViewsRepository.FORM_KIND));
		typeface = new EMFComboViewer(parent);
		typeface.setContentProvider(new ArrayContentProvider());
		typeface.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData typefaceData = new GridData(GridData.FILL_HORIZONTAL);
		typeface.getCombo().setLayoutData(typefaceData);
		typeface.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EditTextPropertiesEditionPartForm.this, DroidViewsRepository.EditText.Properties.typeface, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTypeface()));
			}

		});
		typeface.setID(DroidViewsRepository.EditText.Properties.typeface);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.EditText.Properties.typeface, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createTextStyleMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		textStyle = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData textStyleData = new GridData(GridData.FILL_HORIZONTAL);
		textStyleData.horizontalSpan = 2;
		textStyle.setLayoutData(textStyleData);
		EditingUtils.setID(textStyle, DroidViewsRepository.EditText.Properties.textStyle);
		EditingUtils.setEEFtype(textStyle, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editTextStyle = widgetFactory.createButton(parent, DroidMessages.EditTextPropertiesEditionPart_TextStyleLabel, SWT.NONE);
		GridData editTextStyleData = new GridData();
		editTextStyle.setLayoutData(editTextStyleData);
		editTextStyle.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						textStyle.getShell(), "EditText", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						textStyleList, DroidPackage.eINSTANCE.getEditText_TextStyle().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					textStyleList = dialog.getResult();
					if (textStyleList == null) {
						textStyleList = new BasicEList();
					}
					textStyle.setText(textStyleList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EditTextPropertiesEditionPartForm.this, DroidViewsRepository.EditText.Properties.textStyle, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(textStyleList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editTextStyle, DroidViewsRepository.EditText.Properties.textStyle);
		EditingUtils.setEEFtype(editTextStyle, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
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
	 * @see droid.parts.EditTextPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#setName(String newValue)
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
	 * @see droid.parts.EditTextPropertiesEditionPart#getAutoLink()
	 * 
	 */
	public Enumerator getAutoLink() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) autoLink.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#initAutoLink(EEnum eenum, Enumerator current)
	 */
	public void initAutoLink(EEnum eenum, Enumerator current) {
		autoLink.setInput(eenum.getELiterals());
		autoLink.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#setAutoLink(Enumerator newValue)
	 * 
	 */
	public void setAutoLink(Enumerator newValue) {
		autoLink.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#getCapitalize()
	 * 
	 */
	public Enumerator getCapitalize() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) capitalize.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#initCapitalize(EEnum eenum, Enumerator current)
	 */
	public void initCapitalize(EEnum eenum, Enumerator current) {
		capitalize.setInput(eenum.getELiterals());
		capitalize.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#setCapitalize(Enumerator newValue)
	 * 
	 */
	public void setCapitalize(Enumerator newValue) {
		capitalize.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#getGravity()
	 * 
	 */
	public Enumerator getGravity() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) gravity.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#initGravity(EEnum eenum, Enumerator current)
	 */
	public void initGravity(EEnum eenum, Enumerator current) {
		gravity.setInput(eenum.getELiterals());
		gravity.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#setGravity(Enumerator newValue)
	 * 
	 */
	public void setGravity(Enumerator newValue) {
		gravity.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#getTypeface()
	 * 
	 */
	public Enumerator getTypeface() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) typeface.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#initTypeface(EEnum eenum, Enumerator current)
	 */
	public void initTypeface(EEnum eenum, Enumerator current) {
		typeface.setInput(eenum.getELiterals());
		typeface.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#setTypeface(Enumerator newValue)
	 * 
	 */
	public void setTypeface(Enumerator newValue) {
		typeface.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#getTextStyle()
	 * 
	 */
	public EList getTextStyle() {
		return textStyleList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.EditTextPropertiesEditionPart#setTextStyle(EList newValue)
	 * 
	 */
	public void setTextStyle(EList newValue) {
		textStyleList = newValue;
		if (newValue != null) {
			textStyle.setText(textStyleList.toString());
		} else {
			textStyle.setText(""); //$NON-NLS-1$
		}
	}

	public void addToTextStyle(Object newValue) {
		textStyleList.add(newValue);
		if (newValue != null) {
			textStyle.setText(textStyleList.toString());
		} else {
			textStyle.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToTextStyle(Object newValue) {
		textStyleList.remove(newValue);
		if (newValue != null) {
			textStyle.setText(textStyleList.toString());
		} else {
			textStyle.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.EditText_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
