/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
      case DroidPackage.MANIFEST_FILE: return createManifestFile();
      case DroidPackage.RESOURCE: return createResource();
      case DroidPackage.GENERIC_RESOURCE: return createGenericResource();
      case DroidPackage.MENU_RESOURCE: return createMenuResource();
      case DroidPackage.VALUE_RESOURCE: return createValueResource();
      case DroidPackage.STRING_VALUE_RESOURCE: return createStringValueResource();
      case DroidPackage.INTEGER_VALUE_RESOURCE: return createIntegerValueResource();
      case DroidPackage.BOOLEAN_VALUE_RESOURCE: return createBooleanValueResource();
      case DroidPackage.COLOR_VALUE_RESOURCE: return createColorValueResource();
      case DroidPackage.DIMENSION_VALUE_RESOURCE: return createDimensionValueResource();
      case DroidPackage.DRAWABLE_RESOURCE: return createDrawableResource();
      case DroidPackage.BITMAP_DRAWABLE_RESOURCE: return createBitmapDrawableResource();
      case DroidPackage.TRANSITION_DRAWABLE_RESOURCE: return createTransitionDrawableResource();
      case DroidPackage.ANIMATION_RESOURCE: return createAnimationResource();
      case DroidPackage.LAYOUT: return createLayout();
      case DroidPackage.WIDGET: return createWidget();
      case DroidPackage.GENERIC_WIDGET: return createGenericWidget();
      case DroidPackage.TEXT_VIEW: return createTextView();
      case DroidPackage.BUTTON: return createButton();
      case DroidPackage.IMAGE_BUTTON: return createImageButton();
      case DroidPackage.LINK: return createLink();
      case DroidPackage.SPINNER: return createSpinner();
      case DroidPackage.EDIT_TEXT: return createEditText();
      case DroidPackage.ACTIVITY: return createActivity();
      case DroidPackage.GENERIC_ACTIVITY: return createGenericActivity();
      case DroidPackage.LIST_ACTIVITY: return createListActivity();
      case DroidPackage.TAB_ACTIVITY: return createTabActivity();
      case DroidPackage.TAB: return createTab();
      case DroidPackage.ACTION: return createAction();
      case DroidPackage.GENERIC_ACTION: return createGenericAction();
      case DroidPackage.GO_TO_URL_ACTION: return createGoToURLAction();
      case DroidPackage.SHOW_LAYOUT_ACTION: return createShowLayoutAction();
      case DroidPackage.INVOKE_ACTIVITY_ACTION: return createInvokeActivityAction();
      case DroidPackage.LOAD_RESOURCE_ACTION: return createLoadResourceAction();
      case DroidPackage.PROPERTY_VALUE: return createPropertyValue();
      case DroidPackage.STRING_PROPERTY_VALUE: return createStringPropertyValue();
      case DroidPackage.INTEGER_PROPERTY_VALUE: return createIntegerPropertyValue();
      case DroidPackage.BOOLEAN_PROPERTY_VALUE: return createBooleanPropertyValue();
      case DroidPackage.COLOR_PROPERTY_VALUE: return createColorPropertyValue();
      case DroidPackage.DIMENSION_PROPERTY_VALUE: return createDimensionPropertyValue();
      case DroidPackage.DRAWABLE_RESOURCE_PROPERTY_VALUE: return createDrawableResourcePropertyValue();
      case DroidPackage.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE: return createDrawableImageResourcePropertyValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DroidPackage.DIMENSION_KIND:
        return createDimensionKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DroidPackage.DIMENSION_KIND:
        return convertDimensionKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericResource createGenericResource()
  {
    GenericResourceImpl genericResource = new GenericResourceImpl();
    return genericResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MenuResource createMenuResource()
  {
    MenuResourceImpl menuResource = new MenuResourceImpl();
    return menuResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueResource createValueResource()
  {
    ValueResourceImpl valueResource = new ValueResourceImpl();
    return valueResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValueResource createStringValueResource()
  {
    StringValueResourceImpl stringValueResource = new StringValueResourceImpl();
    return stringValueResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValueResource createIntegerValueResource()
  {
    IntegerValueResourceImpl integerValueResource = new IntegerValueResourceImpl();
    return integerValueResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValueResource createBooleanValueResource()
  {
    BooleanValueResourceImpl booleanValueResource = new BooleanValueResourceImpl();
    return booleanValueResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorValueResource createColorValueResource()
  {
    ColorValueResourceImpl colorValueResource = new ColorValueResourceImpl();
    return colorValueResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionValueResource createDimensionValueResource()
  {
    DimensionValueResourceImpl dimensionValueResource = new DimensionValueResourceImpl();
    return dimensionValueResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrawableResource createDrawableResource()
  {
    DrawableResourceImpl drawableResource = new DrawableResourceImpl();
    return drawableResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitmapDrawableResource createBitmapDrawableResource()
  {
    BitmapDrawableResourceImpl bitmapDrawableResource = new BitmapDrawableResourceImpl();
    return bitmapDrawableResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionDrawableResource createTransitionDrawableResource()
  {
    TransitionDrawableResourceImpl transitionDrawableResource = new TransitionDrawableResourceImpl();
    return transitionDrawableResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnimationResource createAnimationResource()
  {
    AnimationResourceImpl animationResource = new AnimationResourceImpl();
    return animationResource;
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
  public ImageButton createImageButton()
  {
    ImageButtonImpl imageButton = new ImageButtonImpl();
    return imageButton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
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
  public Tab createTab()
  {
    TabImpl tab = new TabImpl();
    return tab;
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
  public PropertyValue createPropertyValue()
  {
    PropertyValueImpl propertyValue = new PropertyValueImpl();
    return propertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringPropertyValue createStringPropertyValue()
  {
    StringPropertyValueImpl stringPropertyValue = new StringPropertyValueImpl();
    return stringPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerPropertyValue createIntegerPropertyValue()
  {
    IntegerPropertyValueImpl integerPropertyValue = new IntegerPropertyValueImpl();
    return integerPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanPropertyValue createBooleanPropertyValue()
  {
    BooleanPropertyValueImpl booleanPropertyValue = new BooleanPropertyValueImpl();
    return booleanPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorPropertyValue createColorPropertyValue()
  {
    ColorPropertyValueImpl colorPropertyValue = new ColorPropertyValueImpl();
    return colorPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionPropertyValue createDimensionPropertyValue()
  {
    DimensionPropertyValueImpl dimensionPropertyValue = new DimensionPropertyValueImpl();
    return dimensionPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrawableResourcePropertyValue createDrawableResourcePropertyValue()
  {
    DrawableResourcePropertyValueImpl drawableResourcePropertyValue = new DrawableResourcePropertyValueImpl();
    return drawableResourcePropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrawableImageResourcePropertyValue createDrawableImageResourcePropertyValue()
  {
    DrawableImageResourcePropertyValueImpl drawableImageResourcePropertyValue = new DrawableImageResourcePropertyValueImpl();
    return drawableImageResourcePropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionKind createDimensionKindFromString(EDataType eDataType, String initialValue)
  {
    DimensionKind result = DimensionKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDimensionKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
