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
      case DroidPackage.RESOURCE:
      {
        Resource resource = (Resource)theEObject;
        T result = caseResource(resource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.LAYOUT:
      {
        Layout layout = (Layout)theEObject;
        T result = caseLayout(layout);
        if (result == null) result = caseView(layout);
        if (result == null) result = caseAbstractView(layout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ABSTRACT_ACTIVITY:
      {
        AbstractActivity abstractActivity = (AbstractActivity)theEObject;
        T result = caseAbstractActivity(abstractActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ACTIVITY:
      {
        Activity activity = (Activity)theEObject;
        T result = caseActivity(activity);
        if (result == null) result = caseAbstractActivity(activity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.GENERIC_ACTIVITY:
      {
        GenericActivity genericActivity = (GenericActivity)theEObject;
        T result = caseGenericActivity(genericActivity);
        if (result == null) result = caseActivity(genericActivity);
        if (result == null) result = caseAbstractActivity(genericActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.VIEW_COLLECTION:
      {
        ViewCollection viewCollection = (ViewCollection)theEObject;
        T result = caseViewCollection(viewCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.LIST_ACTIVITY:
      {
        ListActivity listActivity = (ListActivity)theEObject;
        T result = caseListActivity(listActivity);
        if (result == null) result = caseActivity(listActivity);
        if (result == null) result = caseAbstractActivity(listActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TAB_ACTIVITY:
      {
        TabActivity tabActivity = (TabActivity)theEObject;
        T result = caseTabActivity(tabActivity);
        if (result == null) result = caseActivity(tabActivity);
        if (result == null) result = caseAbstractActivity(tabActivity);
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
      case DroidPackage.ACTION_SET:
      {
        ActionSet actionSet = (ActionSet)theEObject;
        T result = caseActionSet(actionSet);
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
      case DroidPackage.ABSTRACT_LINEAR_LAYOUT:
      {
        AbstractLinearLayout abstractLinearLayout = (AbstractLinearLayout)theEObject;
        T result = caseAbstractLinearLayout(abstractLinearLayout);
        if (result == null) result = caseLayout(abstractLinearLayout);
        if (result == null) result = caseView(abstractLinearLayout);
        if (result == null) result = caseAbstractView(abstractLinearLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ABSTRACT_VIEW:
      {
        AbstractView abstractView = (AbstractView)theEObject;
        T result = caseAbstractView(abstractView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.VIEW:
      {
        View view = (View)theEObject;
        T result = caseView(view);
        if (result == null) result = caseAbstractView(view);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.LINEAR_LAYOUT:
      {
        LinearLayout linearLayout = (LinearLayout)theEObject;
        T result = caseLinearLayout(linearLayout);
        if (result == null) result = caseAbstractLinearLayout(linearLayout);
        if (result == null) result = caseLayout(linearLayout);
        if (result == null) result = caseView(linearLayout);
        if (result == null) result = caseAbstractView(linearLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.RELATIVE_LAYOUT:
      {
        RelativeLayout relativeLayout = (RelativeLayout)theEObject;
        T result = caseRelativeLayout(relativeLayout);
        if (result == null) result = caseLayout(relativeLayout);
        if (result == null) result = caseView(relativeLayout);
        if (result == null) result = caseAbstractView(relativeLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TAB_HOST:
      {
        TabHost tabHost = (TabHost)theEObject;
        T result = caseTabHost(tabHost);
        if (result == null) result = caseLayout(tabHost);
        if (result == null) result = caseView(tabHost);
        if (result == null) result = caseAbstractView(tabHost);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TAB_WIDGET:
      {
        TabWidget tabWidget = (TabWidget)theEObject;
        T result = caseTabWidget(tabWidget);
        if (result == null) result = caseAbstractLinearLayout(tabWidget);
        if (result == null) result = caseLayout(tabWidget);
        if (result == null) result = caseView(tabWidget);
        if (result == null) result = caseAbstractView(tabWidget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.FRAME_LAYOUT:
      {
        FrameLayout frameLayout = (FrameLayout)theEObject;
        T result = caseFrameLayout(frameLayout);
        if (result == null) result = caseLayout(frameLayout);
        if (result == null) result = caseView(frameLayout);
        if (result == null) result = caseAbstractView(frameLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.WIDGET:
      {
        Widget widget = (Widget)theEObject;
        T result = caseWidget(widget);
        if (result == null) result = caseView(widget);
        if (result == null) result = caseAbstractView(widget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ABSTRACT_TEXT_VIEW:
      {
        AbstractTextView abstractTextView = (AbstractTextView)theEObject;
        T result = caseAbstractTextView(abstractTextView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TEXT_VIEW:
      {
        TextView textView = (TextView)theEObject;
        T result = caseTextView(textView);
        if (result == null) result = caseWidget(textView);
        if (result == null) result = caseAbstractTextView(textView);
        if (result == null) result = caseView(textView);
        if (result == null) result = caseAbstractView(textView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.IMAGE_VIEW:
      {
        ImageView imageView = (ImageView)theEObject;
        T result = caseImageView(imageView);
        if (result == null) result = caseWidget(imageView);
        if (result == null) result = caseView(imageView);
        if (result == null) result = caseAbstractView(imageView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseWidget(button);
        if (result == null) result = caseAbstractTextView(button);
        if (result == null) result = caseView(button);
        if (result == null) result = caseAbstractView(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.SPINNER:
      {
        Spinner spinner = (Spinner)theEObject;
        T result = caseSpinner(spinner);
        if (result == null) result = caseWidget(spinner);
        if (result == null) result = caseView(spinner);
        if (result == null) result = caseAbstractView(spinner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.EDIT_TEXT:
      {
        EditText editText = (EditText)theEObject;
        T result = caseEditText(editText);
        if (result == null) result = caseWidget(editText);
        if (result == null) result = caseAbstractTextView(editText);
        if (result == null) result = caseView(editText);
        if (result == null) result = caseAbstractView(editText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.VALUE_ACCESS:
      {
        ValueAccess valueAccess = (ValueAccess)theEObject;
        T result = caseValueAccess(valueAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.STRING_VA:
      {
        StringVA stringVA = (StringVA)theEObject;
        T result = caseStringVA(stringVA);
        if (result == null) result = caseValueAccess(stringVA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.INTEGER_VA:
      {
        IntegerVA integerVA = (IntegerVA)theEObject;
        T result = caseIntegerVA(integerVA);
        if (result == null) result = caseValueAccess(integerVA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.BOOLEAN_VA:
      {
        BooleanVA booleanVA = (BooleanVA)theEObject;
        T result = caseBooleanVA(booleanVA);
        if (result == null) result = caseValueAccess(booleanVA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.COLOR_VA:
      {
        ColorVA colorVA = (ColorVA)theEObject;
        T result = caseColorVA(colorVA);
        if (result == null) result = caseValueAccess(colorVA);
        if (result == null) result = caseAnyDrawableVA(colorVA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.DIMENSION_VA:
      {
        DimensionVA dimensionVA = (DimensionVA)theEObject;
        T result = caseDimensionVA(dimensionVA);
        if (result == null) result = caseValueAccess(dimensionVA);
        if (result == null) result = caseLayoutDimensionVA(dimensionVA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.LAYOUT_DIMENSION_VA:
      {
        LayoutDimensionVA layoutDimensionVA = (LayoutDimensionVA)theEObject;
        T result = caseLayoutDimensionVA(layoutDimensionVA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ANY_DRAWABLE_VA:
      {
        AnyDrawableVA anyDrawableVA = (AnyDrawableVA)theEObject;
        T result = caseAnyDrawableVA(anyDrawableVA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.DRAWABLE_VA:
      {
        DrawableVA drawableVA = (DrawableVA)theEObject;
        T result = caseDrawableVA(drawableVA);
        if (result == null) result = caseValueAccess(drawableVA);
        if (result == null) result = caseAnyDrawableVA(drawableVA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ANIMATION_VA:
      {
        AnimationVA animationVA = (AnimationVA)theEObject;
        T result = caseAnimationVA(animationVA);
        if (result == null) result = caseValueAccess(animationVA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.INTERPOLATOR_VA:
      {
        InterpolatorVA interpolatorVA = (InterpolatorVA)theEObject;
        T result = caseInterpolatorVA(interpolatorVA);
        if (result == null) result = caseValueAccess(interpolatorVA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.VALUE_DEFINITION:
      {
        ValueDefinition valueDefinition = (ValueDefinition)theEObject;
        T result = caseValueDefinition(valueDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.STRING_VD:
      {
        StringVD stringVD = (StringVD)theEObject;
        T result = caseStringVD(stringVD);
        if (result == null) result = caseValueDefinition(stringVD);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.INTEGER_VD:
      {
        IntegerVD integerVD = (IntegerVD)theEObject;
        T result = caseIntegerVD(integerVD);
        if (result == null) result = caseValueDefinition(integerVD);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.BOOLEAN_VD:
      {
        BooleanVD booleanVD = (BooleanVD)theEObject;
        T result = caseBooleanVD(booleanVD);
        if (result == null) result = caseValueDefinition(booleanVD);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.COLOR_VD:
      {
        ColorVD colorVD = (ColorVD)theEObject;
        T result = caseColorVD(colorVD);
        if (result == null) result = caseValueDefinition(colorVD);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.DIMENSION_VD:
      {
        DimensionVD dimensionVD = (DimensionVD)theEObject;
        T result = caseDimensionVD(dimensionVD);
        if (result == null) result = caseValueDefinition(dimensionVD);
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
      case DroidPackage.STRING_RESOURCE:
      {
        StringResource stringResource = (StringResource)theEObject;
        T result = caseStringResource(stringResource);
        if (result == null) result = caseValueResource(stringResource);
        if (result == null) result = caseResource(stringResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.INTEGER_RESOURCE:
      {
        IntegerResource integerResource = (IntegerResource)theEObject;
        T result = caseIntegerResource(integerResource);
        if (result == null) result = caseValueResource(integerResource);
        if (result == null) result = caseResource(integerResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.BOOLEAN_RESOURCE:
      {
        BooleanResource booleanResource = (BooleanResource)theEObject;
        T result = caseBooleanResource(booleanResource);
        if (result == null) result = caseValueResource(booleanResource);
        if (result == null) result = caseResource(booleanResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.COLOR_RESOURCE:
      {
        ColorResource colorResource = (ColorResource)theEObject;
        T result = caseColorResource(colorResource);
        if (result == null) result = caseValueResource(colorResource);
        if (result == null) result = caseResource(colorResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.DIMENSION_RESOURCE:
      {
        DimensionResource dimensionResource = (DimensionResource)theEObject;
        T result = caseDimensionResource(dimensionResource);
        if (result == null) result = caseValueResource(dimensionResource);
        if (result == null) result = caseResource(dimensionResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ARRAY_RESOURCE:
      {
        ArrayResource arrayResource = (ArrayResource)theEObject;
        T result = caseArrayResource(arrayResource);
        if (result == null) result = caseValueResource(arrayResource);
        if (result == null) result = caseResource(arrayResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.INTEGER_ARRAY_RESOURCE:
      {
        IntegerArrayResource integerArrayResource = (IntegerArrayResource)theEObject;
        T result = caseIntegerArrayResource(integerArrayResource);
        if (result == null) result = caseArrayResource(integerArrayResource);
        if (result == null) result = caseValueResource(integerArrayResource);
        if (result == null) result = caseResource(integerArrayResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.STRING_ARRAY_RESOURCE:
      {
        StringArrayResource stringArrayResource = (StringArrayResource)theEObject;
        T result = caseStringArrayResource(stringArrayResource);
        if (result == null) result = caseArrayResource(stringArrayResource);
        if (result == null) result = caseValueResource(stringArrayResource);
        if (result == null) result = caseResource(stringArrayResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TYPED_ARRAY_RESOURCE:
      {
        TypedArrayResource typedArrayResource = (TypedArrayResource)theEObject;
        T result = caseTypedArrayResource(typedArrayResource);
        if (result == null) result = caseArrayResource(typedArrayResource);
        if (result == null) result = caseValueResource(typedArrayResource);
        if (result == null) result = caseResource(typedArrayResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.DRAWABLE_RESOURCE:
      {
        DrawableResource drawableResource = (DrawableResource)theEObject;
        T result = caseDrawableResource(drawableResource);
        if (result == null) result = caseValueResource(drawableResource);
        if (result == null) result = caseResource(drawableResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.BITMAP_DRAWABLE_RESOURCE:
      {
        BitmapDrawableResource bitmapDrawableResource = (BitmapDrawableResource)theEObject;
        T result = caseBitmapDrawableResource(bitmapDrawableResource);
        if (result == null) result = caseDrawableResource(bitmapDrawableResource);
        if (result == null) result = caseValueResource(bitmapDrawableResource);
        if (result == null) result = caseResource(bitmapDrawableResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TRANSITION_DRAWABLE_RESOURCE:
      {
        TransitionDrawableResource transitionDrawableResource = (TransitionDrawableResource)theEObject;
        T result = caseTransitionDrawableResource(transitionDrawableResource);
        if (result == null) result = caseDrawableResource(transitionDrawableResource);
        if (result == null) result = caseValueResource(transitionDrawableResource);
        if (result == null) result = caseResource(transitionDrawableResource);
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
      case DroidPackage.MENU_ITEM:
      {
        MenuItem menuItem = (MenuItem)theEObject;
        T result = caseMenuItem(menuItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.MENU_ITEM_GROUP:
      {
        MenuItemGroup menuItemGroup = (MenuItemGroup)theEObject;
        T result = caseMenuItemGroup(menuItemGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.SUB_MENU:
      {
        SubMenu subMenu = (SubMenu)theEObject;
        T result = caseSubMenu(subMenu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ANIMATION_RESOURCE:
      {
        AnimationResource animationResource = (AnimationResource)theEObject;
        T result = caseAnimationResource(animationResource);
        if (result == null) result = caseValueResource(animationResource);
        if (result == null) result = caseResource(animationResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.FRAME_ANIMATION_ELEMENT:
      {
        FrameAnimationElement frameAnimationElement = (FrameAnimationElement)theEObject;
        T result = caseFrameAnimationElement(frameAnimationElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TERMINAL_ANIMATION_ELEMENTS:
      {
        TerminalAnimationElements terminalAnimationElements = (TerminalAnimationElements)theEObject;
        T result = caseTerminalAnimationElements(terminalAnimationElements);
        if (result == null) result = caseFrameAnimationElement(terminalAnimationElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TERMINAL_ANIMATION_SET:
      {
        TerminalAnimationSet terminalAnimationSet = (TerminalAnimationSet)theEObject;
        T result = caseTerminalAnimationSet(terminalAnimationSet);
        if (result == null) result = caseFrameAnimationElement(terminalAnimationSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ALPHA_ANIMATION:
      {
        AlphaAnimation alphaAnimation = (AlphaAnimation)theEObject;
        T result = caseAlphaAnimation(alphaAnimation);
        if (result == null) result = caseTerminalAnimationElements(alphaAnimation);
        if (result == null) result = caseFrameAnimationElement(alphaAnimation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.SCALE_ANIMATION:
      {
        ScaleAnimation scaleAnimation = (ScaleAnimation)theEObject;
        T result = caseScaleAnimation(scaleAnimation);
        if (result == null) result = caseTerminalAnimationElements(scaleAnimation);
        if (result == null) result = caseFrameAnimationElement(scaleAnimation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TRANSLATE_ANIMATION:
      {
        TranslateAnimation translateAnimation = (TranslateAnimation)theEObject;
        T result = caseTranslateAnimation(translateAnimation);
        if (result == null) result = caseTerminalAnimationElements(translateAnimation);
        if (result == null) result = caseFrameAnimationElement(translateAnimation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ROTATE_ANIMATION:
      {
        RotateAnimation rotateAnimation = (RotateAnimation)theEObject;
        T result = caseRotateAnimation(rotateAnimation);
        if (result == null) result = caseTerminalAnimationElements(rotateAnimation);
        if (result == null) result = caseFrameAnimationElement(rotateAnimation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.TWEEN_ANIMATION_RESOURCE:
      {
        TweenAnimationResource tweenAnimationResource = (TweenAnimationResource)theEObject;
        T result = caseTweenAnimationResource(tweenAnimationResource);
        if (result == null) result = caseAnimationResource(tweenAnimationResource);
        if (result == null) result = caseValueResource(tweenAnimationResource);
        if (result == null) result = caseResource(tweenAnimationResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.FRAME_ANIMATION_RESOURCE:
      {
        FrameAnimationResource frameAnimationResource = (FrameAnimationResource)theEObject;
        T result = caseFrameAnimationResource(frameAnimationResource);
        if (result == null) result = caseAnimationResource(frameAnimationResource);
        if (result == null) result = caseValueResource(frameAnimationResource);
        if (result == null) result = caseResource(frameAnimationResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ANIMATION_FRAME:
      {
        AnimationFrame animationFrame = (AnimationFrame)theEObject;
        T result = caseAnimationFrame(animationFrame);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ABSTRACT_RESOURCE_ACCESS:
      {
        AbstractResourceAccess abstractResourceAccess = (AbstractResourceAccess)theEObject;
        T result = caseAbstractResourceAccess(abstractResourceAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.RESOURCE_ACCESS:
      {
        ResourceAccess resourceAccess = (ResourceAccess)theEObject;
        T result = caseResourceAccess(resourceAccess);
        if (result == null) result = caseAbstractResourceAccess(resourceAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.STRING_RA:
      {
        StringRA stringRA = (StringRA)theEObject;
        T result = caseStringRA(stringRA);
        if (result == null) result = caseResourceAccess(stringRA);
        if (result == null) result = caseAbstractResourceAccess(stringRA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.INTEGER_RA:
      {
        IntegerRA integerRA = (IntegerRA)theEObject;
        T result = caseIntegerRA(integerRA);
        if (result == null) result = caseResourceAccess(integerRA);
        if (result == null) result = caseAbstractResourceAccess(integerRA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.BOOLEAN_RA:
      {
        BooleanRA booleanRA = (BooleanRA)theEObject;
        T result = caseBooleanRA(booleanRA);
        if (result == null) result = caseResourceAccess(booleanRA);
        if (result == null) result = caseAbstractResourceAccess(booleanRA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.COLOR_RA:
      {
        ColorRA colorRA = (ColorRA)theEObject;
        T result = caseColorRA(colorRA);
        if (result == null) result = caseResourceAccess(colorRA);
        if (result == null) result = caseAbstractResourceAccess(colorRA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.DIMENSION_RA:
      {
        DimensionRA dimensionRA = (DimensionRA)theEObject;
        T result = caseDimensionRA(dimensionRA);
        if (result == null) result = caseResourceAccess(dimensionRA);
        if (result == null) result = caseAbstractResourceAccess(dimensionRA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.DRAWABLE_RA:
      {
        DrawableRA drawableRA = (DrawableRA)theEObject;
        T result = caseDrawableRA(drawableRA);
        if (result == null) result = caseResourceAccess(drawableRA);
        if (result == null) result = caseAbstractResourceAccess(drawableRA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.ANIMATION_RA:
      {
        AnimationRA animationRA = (AnimationRA)theEObject;
        T result = caseAnimationRA(animationRA);
        if (result == null) result = caseResourceAccess(animationRA);
        if (result == null) result = caseAbstractResourceAccess(animationRA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.INTERPOLATOR_RA:
      {
        InterpolatorRA interpolatorRA = (InterpolatorRA)theEObject;
        T result = caseInterpolatorRA(interpolatorRA);
        if (result == null) result = caseResourceAccess(interpolatorRA);
        if (result == null) result = caseAbstractResourceAccess(interpolatorRA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.CHECK_BOX:
      {
        CheckBox checkBox = (CheckBox)theEObject;
        T result = caseCheckBox(checkBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.RADIO_BUTTON:
      {
        RadioButton radioButton = (RadioButton)theEObject;
        T result = caseRadioButton(radioButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.RADIO_GROUP:
      {
        RadioGroup radioGroup = (RadioGroup)theEObject;
        T result = caseRadioGroup(radioGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroidPackage.MENU_GROUP:
      {
        MenuGroup menuGroup = (MenuGroup)theEObject;
        T result = caseMenuGroup(menuGroup);
        if (result == null) result = caseMenuItemGroup(menuGroup);
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
   * Returns the result of interpreting the object as an instance of '<em>Abstract Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractActivity(AbstractActivity object)
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
   * Returns the result of interpreting the object as an instance of '<em>View Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewCollection(ViewCollection object)
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
   * Returns the result of interpreting the object as an instance of '<em>Action Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionSet(ActionSet object)
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
   * Returns the result of interpreting the object as an instance of '<em>Abstract Linear Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Linear Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractLinearLayout(AbstractLinearLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractView(AbstractView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseView(View object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linear Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linear Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinearLayout(LinearLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relative Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relative Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelativeLayout(RelativeLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Host</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Host</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabHost(TabHost object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Widget</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Widget</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabWidget(TabWidget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Frame Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Frame Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFrameLayout(FrameLayout object)
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
   * Returns the result of interpreting the object as an instance of '<em>Abstract Text View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Text View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractTextView(AbstractTextView object)
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
   * Returns the result of interpreting the object as an instance of '<em>Image View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageView(ImageView object)
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
   * Returns the result of interpreting the object as an instance of '<em>Value Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueAccess(ValueAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String VA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String VA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringVA(StringVA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer VA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer VA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerVA(IntegerVA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean VA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean VA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanVA(BooleanVA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color VA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color VA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorVA(ColorVA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimension VA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimension VA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimensionVA(DimensionVA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout Dimension VA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout Dimension VA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayoutDimensionVA(LayoutDimensionVA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Drawable VA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Drawable VA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyDrawableVA(AnyDrawableVA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drawable VA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drawable VA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDrawableVA(DrawableVA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Animation VA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Animation VA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnimationVA(AnimationVA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interpolator VA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interpolator VA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterpolatorVA(InterpolatorVA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueDefinition(ValueDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String VD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String VD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringVD(StringVD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer VD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer VD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerVD(IntegerVD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean VD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean VD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanVD(BooleanVD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color VD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color VD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorVD(ColorVD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimension VD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimension VD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimensionVD(DimensionVD object)
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
   * Returns the result of interpreting the object as an instance of '<em>String Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringResource(StringResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerResource(IntegerResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanResource(BooleanResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorResource(ColorResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimension Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimension Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimensionResource(DimensionResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayResource(ArrayResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Array Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Array Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerArrayResource(IntegerArrayResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Array Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Array Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringArrayResource(StringArrayResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Array Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Array Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedArrayResource(TypedArrayResource object)
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
   * Returns the result of interpreting the object as an instance of '<em>Menu Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menu Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenuItem(MenuItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menu Item Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menu Item Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenuItemGroup(MenuItemGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Menu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Menu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubMenu(SubMenu object)
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
   * Returns the result of interpreting the object as an instance of '<em>Frame Animation Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Frame Animation Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFrameAnimationElement(FrameAnimationElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminal Animation Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminal Animation Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminalAnimationElements(TerminalAnimationElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminal Animation Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminal Animation Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminalAnimationSet(TerminalAnimationSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alpha Animation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alpha Animation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlphaAnimation(AlphaAnimation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scale Animation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scale Animation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScaleAnimation(ScaleAnimation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Translate Animation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Translate Animation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTranslateAnimation(TranslateAnimation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rotate Animation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotate Animation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRotateAnimation(RotateAnimation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tween Animation Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tween Animation Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTweenAnimationResource(TweenAnimationResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Frame Animation Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Frame Animation Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFrameAnimationResource(FrameAnimationResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Animation Frame</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Animation Frame</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnimationFrame(AnimationFrame object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Resource Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Resource Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractResourceAccess(AbstractResourceAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceAccess(ResourceAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String RA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String RA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringRA(StringRA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer RA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer RA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerRA(IntegerRA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean RA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean RA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanRA(BooleanRA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color RA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color RA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorRA(ColorRA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimension RA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimension RA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimensionRA(DimensionRA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drawable RA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drawable RA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDrawableRA(DrawableRA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Animation RA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Animation RA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnimationRA(AnimationRA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interpolator RA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interpolator RA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterpolatorRA(InterpolatorRA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckBox(CheckBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Radio Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Radio Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRadioButton(RadioButton object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Radio Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Radio Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRadioGroup(RadioGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menu Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menu Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenuGroup(MenuGroup object)
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
