/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DroidFactoryImpl extends EFactoryImpl implements DroidFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DroidFactory init()
  {
    try
    {
      DroidFactory theDroidFactory = (DroidFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/amalgam/tutorials/xtext/Droid"); 
      if (theDroidFactory != null)
      {
        return theDroidFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DroidFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DroidFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DroidPackage.APPLICATION: return createApplication();
      case DroidPackage.APPLICATION_ELEMENT: return createApplicationElement();
      case DroidPackage.MANIFEST_FILE: return createManifestFile();
      case DroidPackage.LAYOUT: return createLayout();
      case DroidPackage.WIDGET: return createWidget();
      case DroidPackage.GENERIC_WIDGET: return createGenericWidget();
      case DroidPackage.BUTTON: return createButton();
      case DroidPackage.SPINNER: return createSpinner();
      case DroidPackage.EDIT_TEXT: return createEditText();
      case DroidPackage.TEXT_VIEW: return createTextView();
      case DroidPackage.ACTIVITY: return createActivity();
      case DroidPackage.GENERIC_ACTIVITY: return createGenericActivity();
      case DroidPackage.LIST_ACTIVITY: return createListActivity();
      case DroidPackage.TAB_ACTIVITY: return createTabActivity();
      case DroidPackage.ACTION: return createAction();
      case DroidPackage.GENERIC_ACTION: return createGenericAction();
      case DroidPackage.GO_TO_URL_ACTION: return createGoToURLAction();
      case DroidPackage.SHOW_LAYOUT_ACTION: return createShowLayoutAction();
      case DroidPackage.INVOKE_ACTIVITY_ACTION: return createInvokeActivityAction();
      case DroidPackage.LOAD_RESOURCE_ACTION: return createLoadResourceAction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationElement createApplicationElement()
  {
    ApplicationElementImpl applicationElement = new ApplicationElementImpl();
    return applicationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ManifestFile createManifestFile()
  {
    ManifestFileImpl manifestFile = new ManifestFileImpl();
    return manifestFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layout createLayout()
  {
    LayoutImpl layout = new LayoutImpl();
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Widget createWidget()
  {
    WidgetImpl widget = new WidgetImpl();
    return widget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericWidget createGenericWidget()
  {
    GenericWidgetImpl genericWidget = new GenericWidgetImpl();
    return genericWidget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spinner createSpinner()
  {
    SpinnerImpl spinner = new SpinnerImpl();
    return spinner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditText createEditText()
  {
    EditTextImpl editText = new EditTextImpl();
    return editText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextView createTextView()
  {
    TextViewImpl textView = new TextViewImpl();
    return textView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity createActivity()
  {
    ActivityImpl activity = new ActivityImpl();
    return activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericActivity createGenericActivity()
  {
    GenericActivityImpl genericActivity = new GenericActivityImpl();
    return genericActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListActivity createListActivity()
  {
    ListActivityImpl listActivity = new ListActivityImpl();
    return listActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabActivity createTabActivity()
  {
    TabActivityImpl tabActivity = new TabActivityImpl();
    return tabActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericAction createGenericAction()
  {
    GenericActionImpl genericAction = new GenericActionImpl();
    return genericAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoToURLAction createGoToURLAction()
  {
    GoToURLActionImpl goToURLAction = new GoToURLActionImpl();
    return goToURLAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShowLayoutAction createShowLayoutAction()
  {
    ShowLayoutActionImpl showLayoutAction = new ShowLayoutActionImpl();
    return showLayoutAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvokeActivityAction createInvokeActivityAction()
  {
    InvokeActivityActionImpl invokeActivityAction = new InvokeActivityActionImpl();
    return invokeActivityAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadResourceAction createLoadResourceAction()
  {
    LoadResourceActionImpl loadResourceAction = new LoadResourceActionImpl();
    return loadResourceAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DroidPackage getDroidPackage()
  {
    return (DroidPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DroidPackage getPackage()
  {
    return DroidPackage.eINSTANCE;
  }

} //DroidFactoryImpl
