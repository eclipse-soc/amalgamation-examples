/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.util;

import java.util.List;

import org.eclipse.amalgam.tutorials.xtext.droid.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage
 * @generated
 */
public class DroidSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DroidPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DroidSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DroidPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DroidPackage.APPLICATION:
      {
        Application application = (Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.MANIFEST_FILE:
      {
        ManifestFile manifestFile = (ManifestFile)theEObject;
        T result = caseManifestFile(manifestFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.RESOURCE:
      {
        Resource resource = (Resource)theEObject;
        T result = caseResource(resource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.GENERIC_RESOURCE:
      {
        GenericResource genericResource = (GenericResource)theEObject;
        T result = caseGenericResource(genericResource);
        if (result == null) result = caseResource(genericResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.MENU_RESOURCE:
      {
        MenuResource menuResource = (MenuResource)theEObject;
        T result = caseMenuResource(menuResource);
        if (result == null) result = caseResource(menuResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.VALUE_RESOURCE:
      {
        ValueResource valueResource = (ValueResource)theEObject;
        T result = caseValueResource(valueResource);
        if (result == null) result = caseResource(valueResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.STRING_VALUE_RESOURCE:
      {
        StringValueResource stringValueResource = (StringValueResource)theEObject;
        T result = caseStringValueResource(stringValueResource);
        if (result == null) result = caseValueResource(stringValueResource);
        if (result == null) result = caseResource(stringValueResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.INTEGER_VALUE_RESOURCE:
      {
        IntegerValueResource integerValueResource = (IntegerValueResource)theEObject;
        T result = caseIntegerValueResource(integerValueResource);
        if (result == null) result = caseValueResource(integerValueResource);
        if (result == null) result = caseResource(integerValueResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.BOOLEAN_VALUE_RESOURCE:
      {
        BooleanValueResource booleanValueResource = (BooleanValueResource)theEObject;
        T result = caseBooleanValueResource(booleanValueResource);
        if (result == null) result = caseValueResource(booleanValueResource);
        if (result == null) result = caseResource(booleanValueResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.COLOR_VALUE_RESOURCE:
      {
        ColorValueResource colorValueResource = (ColorValueResource)theEObject;
        T result = caseColorValueResource(colorValueResource);
        if (result == null) result = caseValueResource(colorValueResource);
        if (result == null) result = caseResource(colorValueResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.DIMENSION_VALUE_RESOURCE:
      {
        DimensionValueResource dimensionValueResource = (DimensionValueResource)theEObject;
        T result = caseDimensionValueResource(dimensionValueResource);
        if (result == null) result = caseValueResource(dimensionValueResource);
        if (result == null) result = caseResource(dimensionValueResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.DRAWABLE_RESOURCE:
      {
        DrawableResource drawableResource = (DrawableResource)theEObject;
        T result = caseDrawableResource(drawableResource);
        if (result == null) result = caseResource(drawableResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.BITMAP_DRAWABLE_RESOURCE:
      {
        BitmapDrawableResource bitmapDrawableResource = (BitmapDrawableResource)theEObject;
        T result = caseBitmapDrawableResource(bitmapDrawableResource);
        if (result == null) result = caseDrawableResource(bitmapDrawableResource);
        if (result == null) result = caseResource(bitmapDrawableResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TRANSITION_DRAWABLE_RESOURCE:
      {
        TransitionDrawableResource transitionDrawableResource = (TransitionDrawableResource)theEObject;
        T result = caseTransitionDrawableResource(transitionDrawableResource);
        if (result == null) result = caseDrawableResource(transitionDrawableResource);
        if (result == null) result = caseResource(transitionDrawableResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ANIMATION_RESOURCE:
      {
        AnimationResource animationResource = (AnimationResource)theEObject;
        T result = caseAnimationResource(animationResource);
        if (result == null) result = caseResource(animationResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.LAYOUT:
      {
        Layout layout = (Layout)theEObject;
        T result = caseLayout(layout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.WIDGET:
      {
        Widget widget = (Widget)theEObject;
        T result = caseWidget(widget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.GENERIC_WIDGET:
      {
        GenericWidget genericWidget = (GenericWidget)theEObject;
        T result = caseGenericWidget(genericWidget);
        if (result == null) result = caseWidget(genericWidget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TEXT_VIEW:
      {
        TextView textView = (TextView)theEObject;
        T result = caseTextView(textView);
        if (result == null) result = caseWidget(textView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseWidget(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.IMAGE_BUTTON:
      {
        ImageButton imageButton = (ImageButton)theEObject;
        T result = caseImageButton(imageButton);
        if (result == null) result = caseWidget(imageButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = caseWidget(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.SPINNER:
      {
        Spinner spinner = (Spinner)theEObject;
        T result = caseSpinner(spinner);
        if (result == null) result = caseWidget(spinner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.EDIT_TEXT:
      {
        EditText editText = (EditText)theEObject;
        T result = caseEditText(editText);
        if (result == null) result = caseWidget(editText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ACTIVITY:
      {
        Activity activity = (Activity)theEObject;
        T result = caseActivity(activity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.GENERIC_ACTIVITY:
      {
        GenericActivity genericActivity = (GenericActivity)theEObject;
        T result = caseGenericActivity(genericActivity);
        if (result == null) result = caseActivity(genericActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.LIST_ACTIVITY:
      {
        ListActivity listActivity = (ListActivity)theEObject;
        T result = caseListActivity(listActivity);
        if (result == null) result = caseActivity(listActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TAB_ACTIVITY:
      {
        TabActivity tabActivity = (TabActivity)theEObject;
        T result = caseTabActivity(tabActivity);
        if (result == null) result = caseActivity(tabActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TAB:
      {
        Tab tab = (Tab)theEObject;
        T result = caseTab(tab);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.GENERIC_ACTION:
      {
        GenericAction genericAction = (GenericAction)theEObject;
        T result = caseGenericAction(genericAction);
        if (result == null) result = caseAction(genericAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.GO_TO_URL_ACTION:
      {
        GoToURLAction goToURLAction = (GoToURLAction)theEObject;
        T result = caseGoToURLAction(goToURLAction);
        if (result == null) result = caseAction(goToURLAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.SHOW_LAYOUT_ACTION:
      {
        ShowLayoutAction showLayoutAction = (ShowLayoutAction)theEObject;
        T result = caseShowLayoutAction(showLayoutAction);
        if (result == null) result = caseAction(showLayoutAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.INVOKE_ACTIVITY_ACTION:
      {
        InvokeActivityAction invokeActivityAction = (InvokeActivityAction)theEObject;
        T result = caseInvokeActivityAction(invokeActivityAction);
        if (result == null) result = caseAction(invokeActivityAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.LOAD_RESOURCE_ACTION:
      {
        LoadResourceAction loadResourceAction = (LoadResourceAction)theEObject;
        T result = caseLoadResourceAction(loadResourceAction);
        if (result == null) result = caseAction(loadResourceAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.PROPERTY_VALUE:
      {
        PropertyValue propertyValue = (PropertyValue)theEObject;
        T result = casePropertyValue(propertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.STRING_PROPERTY_VALUE:
      {
        StringPropertyValue stringPropertyValue = (StringPropertyValue)theEObject;
        T result = caseStringPropertyValue(stringPropertyValue);
        if (result == null) result = casePropertyValue(stringPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.INTEGER_PROPERTY_VALUE:
      {
        IntegerPropertyValue integerPropertyValue = (IntegerPropertyValue)theEObject;
        T result = caseIntegerPropertyValue(integerPropertyValue);
        if (result == null) result = casePropertyValue(integerPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.BOOLEAN_PROPERTY_VALUE:
      {
        BooleanPropertyValue booleanPropertyValue = (BooleanPropertyValue)theEObject;
        T result = caseBooleanPropertyValue(booleanPropertyValue);
        if (result == null) result = casePropertyValue(booleanPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.COLOR_PROPERTY_VALUE:
      {
        ColorPropertyValue colorPropertyValue = (ColorPropertyValue)theEObject;
        T result = caseColorPropertyValue(colorPropertyValue);
        if (result == null) result = casePropertyValue(colorPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.DIMENSION_PROPERTY_VALUE:
      {
        DimensionPropertyValue dimensionPropertyValue = (DimensionPropertyValue)theEObject;
        T result = caseDimensionPropertyValue(dimensionPropertyValue);
        if (result == null) result = casePropertyValue(dimensionPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.DRAWABLE_RESOURCE_PROPERTY_VALUE:
      {
        DrawableResourcePropertyValue drawableResourcePropertyValue = (DrawableResourcePropertyValue)theEObject;
        T result = caseDrawableResourcePropertyValue(drawableResourcePropertyValue);
        if (result == null) result = casePropertyValue(drawableResourcePropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE:
      {
        DrawableImageResourcePropertyValue drawableImageResourcePropertyValue = (DrawableImageResourcePropertyValue)theEObject;
        T result = caseDrawableImageResourcePropertyValue(drawableImageResourcePropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication(Application object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Manifest File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Manifest File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseManifestFile(ManifestFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResource(Resource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericResource(GenericResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menu Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menu Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenuResource(MenuResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueResource(ValueResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValueResource(StringValueResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Value Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Value Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerValueResource(IntegerValueResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Value Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Value Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanValueResource(BooleanValueResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Value Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Value Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorValueResource(ColorValueResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimension Value Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimension Value Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimensionValueResource(DimensionValueResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drawable Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drawable Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDrawableResource(DrawableResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bitmap Drawable Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bitmap Drawable Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitmapDrawableResource(BitmapDrawableResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Drawable Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Drawable Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionDrawableResource(TransitionDrawableResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Animation Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Animation Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnimationResource(AnimationResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayout(Layout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWidget(Widget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Widget</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Widget</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericWidget(GenericWidget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextView(TextView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageButton(ImageButton object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spinner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spinner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpinner(Spinner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edit Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edit Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEditText(EditText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivity(Activity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericActivity(GenericActivity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListActivity(ListActivity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabActivity(TabActivity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTab(Tab object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericAction(GenericAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Go To URL Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Go To URL Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoToURLAction(GoToURLAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Show Layout Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Show Layout Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShowLayoutAction(ShowLayoutAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invoke Activity Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invoke Activity Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvokeActivityAction(InvokeActivityAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load Resource Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load Resource Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoadResourceAction(LoadResourceAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyValue(PropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringPropertyValue(StringPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerPropertyValue(IntegerPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanPropertyValue(BooleanPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorPropertyValue(ColorPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimension Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimension Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimensionPropertyValue(DimensionPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drawable Resource Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drawable Resource Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDrawableResourcePropertyValue(DrawableResourcePropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drawable Image Resource Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drawable Image Resource Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDrawableImageResourcePropertyValue(DrawableImageResourcePropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DroidSwitch
