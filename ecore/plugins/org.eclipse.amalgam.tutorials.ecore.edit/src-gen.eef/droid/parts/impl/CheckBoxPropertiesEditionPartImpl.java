/**
 * Generated with Acceleo
 */
package droid.parts.impl;

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
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import droid.DroidPackage;
import droid.parts.CheckBoxPropertiesEditionPart;
import droid.parts.DroidViewsRepository;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class CheckBoxPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CheckBoxPropertiesEditionPart {

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
	public CheckBoxPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence checkBoxStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = checkBoxStep.addStep(DroidViewsRepository.CheckBox.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.CheckBox.Properties.name);
		propertiesStep.addStep(DroidViewsRepository.CheckBox.Properties.autoLink);
		propertiesStep.addStep(DroidViewsRepository.CheckBox.Properties.capitalize);
		propertiesStep.addStep(DroidViewsRepository.CheckBox.Properties.gravity);
		propertiesStep.addStep(DroidViewsRepository.CheckBox.Properties.typeface);
		propertiesStep.addStep(DroidViewsRepository.CheckBox.Properties.textStyle);
		
		
		composer = new PartComposer(checkBoxStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.CheckBox.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.CheckBox.Properties.name) {
					return createNameText(parent);
				}
				if (key == DroidViewsRepository.CheckBox.Properties.autoLink) {
					return createAutoLinkEMFComboViewer(parent);
				}
				if (key == DroidViewsRepository.CheckBox.Properties.capitalize) {
					return createCapitalizeEMFComboViewer(parent);
				}
				if (key == DroidViewsRepository.CheckBox.Properties.gravity) {
					return createGravityEMFComboViewer(parent);
				}
				if (key == DroidViewsRepository.CheckBox.Properties.typeface) {
					return createTypefaceEMFComboViewer(parent);
				}
				if (key == DroidViewsRepository.CheckBox.Properties.textStyle) {
					return createTextStyleMultiValuedEditor(parent);
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
		propertiesGroup.setText(DroidMessages.CheckBoxPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.CheckBoxPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.CheckBox.Properties.name, DroidViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CheckBoxPropertiesEditionPartImpl.this, DroidViewsRepository.CheckBox.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CheckBoxPropertiesEditionPartImpl.this, DroidViewsRepository.CheckBox.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, DroidViewsRepository.CheckBox.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.CheckBox.Properties.name, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAutoLinkEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.CheckBoxPropertiesEditionPart_AutoLinkLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.CheckBox.Properties.autoLink, DroidViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CheckBoxPropertiesEditionPartImpl.this, DroidViewsRepository.CheckBox.Properties.autoLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAutoLink()));
			}

		});
		autoLink.setID(DroidViewsRepository.CheckBox.Properties.autoLink);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.CheckBox.Properties.autoLink, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCapitalizeEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.CheckBoxPropertiesEditionPart_CapitalizeLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.CheckBox.Properties.capitalize, DroidViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CheckBoxPropertiesEditionPartImpl.this, DroidViewsRepository.CheckBox.Properties.capitalize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCapitalize()));
			}

		});
		capitalize.setID(DroidViewsRepository.CheckBox.Properties.capitalize);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.CheckBox.Properties.capitalize, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createGravityEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.CheckBoxPropertiesEditionPart_GravityLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.CheckBox.Properties.gravity, DroidViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CheckBoxPropertiesEditionPartImpl.this, DroidViewsRepository.CheckBox.Properties.gravity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getGravity()));
			}

		});
		gravity.setID(DroidViewsRepository.CheckBox.Properties.gravity);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.CheckBox.Properties.gravity, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypefaceEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.CheckBoxPropertiesEditionPart_TypefaceLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.CheckBox.Properties.typeface, DroidViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CheckBoxPropertiesEditionPartImpl.this, DroidViewsRepository.CheckBox.Properties.typeface, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTypeface()));
			}

		});
		typeface.setID(DroidViewsRepository.CheckBox.Properties.typeface);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.CheckBox.Properties.typeface, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createTextStyleMultiValuedEditor(Composite parent) {
		textStyle = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData textStyleData = new GridData(GridData.FILL_HORIZONTAL);
		textStyleData.horizontalSpan = 2;
		textStyle.setLayoutData(textStyleData);
		EditingUtils.setID(textStyle, DroidViewsRepository.CheckBox.Properties.textStyle);
		EditingUtils.setEEFtype(textStyle, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editTextStyle = new Button(parent, SWT.NONE);
		editTextStyle.setText(DroidMessages.CheckBoxPropertiesEditionPart_TextStyleLabel);
		GridData editTextStyleData = new GridData();
		editTextStyle.setLayoutData(editTextStyleData);
		editTextStyle.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						textStyle.getShell(), "CheckBox", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						textStyleList, DroidPackage.eINSTANCE.getCheckBox_TextStyle().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					textStyleList = dialog.getResult();
					if (textStyleList == null) {
						textStyleList = new BasicEList();
					}
					textStyle.setText(textStyleList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CheckBoxPropertiesEditionPartImpl.this, DroidViewsRepository.CheckBox.Properties.textStyle, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(textStyleList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editTextStyle, DroidViewsRepository.CheckBox.Properties.textStyle);
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
	 * @see droid.parts.CheckBoxPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#setName(String newValue)
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
	 * @see droid.parts.CheckBoxPropertiesEditionPart#getAutoLink()
	 * 
	 */
	public Enumerator getAutoLink() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) autoLink.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#initAutoLink(EEnum eenum, Enumerator current)
	 */
	public void initAutoLink(EEnum eenum, Enumerator current) {
		autoLink.setInput(eenum.getELiterals());
		autoLink.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#setAutoLink(Enumerator newValue)
	 * 
	 */
	public void setAutoLink(Enumerator newValue) {
		autoLink.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#getCapitalize()
	 * 
	 */
	public Enumerator getCapitalize() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) capitalize.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#initCapitalize(EEnum eenum, Enumerator current)
	 */
	public void initCapitalize(EEnum eenum, Enumerator current) {
		capitalize.setInput(eenum.getELiterals());
		capitalize.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#setCapitalize(Enumerator newValue)
	 * 
	 */
	public void setCapitalize(Enumerator newValue) {
		capitalize.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#getGravity()
	 * 
	 */
	public Enumerator getGravity() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) gravity.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#initGravity(EEnum eenum, Enumerator current)
	 */
	public void initGravity(EEnum eenum, Enumerator current) {
		gravity.setInput(eenum.getELiterals());
		gravity.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#setGravity(Enumerator newValue)
	 * 
	 */
	public void setGravity(Enumerator newValue) {
		gravity.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#getTypeface()
	 * 
	 */
	public Enumerator getTypeface() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) typeface.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#initTypeface(EEnum eenum, Enumerator current)
	 */
	public void initTypeface(EEnum eenum, Enumerator current) {
		typeface.setInput(eenum.getELiterals());
		typeface.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#setTypeface(Enumerator newValue)
	 * 
	 */
	public void setTypeface(Enumerator newValue) {
		typeface.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#getTextStyle()
	 * 
	 */
	public EList getTextStyle() {
		return textStyleList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.CheckBoxPropertiesEditionPart#setTextStyle(EList newValue)
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
		return DroidMessages.CheckBox_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
