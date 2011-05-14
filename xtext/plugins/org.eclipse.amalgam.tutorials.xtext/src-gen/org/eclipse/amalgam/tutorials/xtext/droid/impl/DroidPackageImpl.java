/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.Action;
import org.eclipse.amalgam.tutorials.xtext.droid.Activity;
import org.eclipse.amalgam.tutorials.xtext.droid.AnimationResource;
import org.eclipse.amalgam.tutorials.xtext.droid.Application;
import org.eclipse.amalgam.tutorials.xtext.droid.BitmapDrawableResource;
import org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.BooleanValueResource;
import org.eclipse.amalgam.tutorials.xtext.droid.Button;
import org.eclipse.amalgam.tutorials.xtext.droid.ColorPropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.ColorValueResource;
import org.eclipse.amalgam.tutorials.xtext.droid.DimensionKind;
import org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.DimensionValueResource;
import org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.DrawableResource;
import org.eclipse.amalgam.tutorials.xtext.droid.DrawableResourcePropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidFactory;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.EditText;
import org.eclipse.amalgam.tutorials.xtext.droid.GenericAction;
import org.eclipse.amalgam.tutorials.xtext.droid.GenericActivity;
import org.eclipse.amalgam.tutorials.xtext.droid.GenericResource;
import org.eclipse.amalgam.tutorials.xtext.droid.GenericWidget;
import org.eclipse.amalgam.tutorials.xtext.droid.GoToURLAction;
import org.eclipse.amalgam.tutorials.xtext.droid.ImageButton;
import org.eclipse.amalgam.tutorials.xtext.droid.IntegerPropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.IntegerValueResource;
import org.eclipse.amalgam.tutorials.xtext.droid.InvokeActivityAction;
import org.eclipse.amalgam.tutorials.xtext.droid.Layout;
import org.eclipse.amalgam.tutorials.xtext.droid.Link;
import org.eclipse.amalgam.tutorials.xtext.droid.ListActivity;
import org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction;
import org.eclipse.amalgam.tutorials.xtext.droid.ManifestFile;
import org.eclipse.amalgam.tutorials.xtext.droid.MenuResource;
import org.eclipse.amalgam.tutorials.xtext.droid.PropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.Resource;
import org.eclipse.amalgam.tutorials.xtext.droid.ShowLayoutAction;
import org.eclipse.amalgam.tutorials.xtext.droid.Spinner;
import org.eclipse.amalgam.tutorials.xtext.droid.StringPropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.StringValueResource;
import org.eclipse.amalgam.tutorials.xtext.droid.Tab;
import org.eclipse.amalgam.tutorials.xtext.droid.TabActivity;
import org.eclipse.amalgam.tutorials.xtext.droid.TextView;
import org.eclipse.amalgam.tutorials.xtext.droid.TransitionDrawableResource;
import org.eclipse.amalgam.tutorials.xtext.droid.ValueResource;
import org.eclipse.amalgam.tutorials.xtext.droid.Widget;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DroidPackageImpl extends EPackageImpl implements DroidPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manifestFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menuResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerValueResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanValueResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorValueResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionValueResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass drawableResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitmapDrawableResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionDrawableResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass animationResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass widgetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericWidgetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageButtonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spinnerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass editTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tabActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tabEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goToURLActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass showLayoutActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invokeActivityActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadResourceActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringPropertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerPropertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanPropertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorPropertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionPropertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass drawableResourcePropertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass drawableImageResourcePropertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dimensionKindEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DroidPackageImpl()
  {
    super(eNS_URI, DroidFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DroidPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DroidPackage init()
  {
    if (isInited) return (DroidPackage)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI);

    // Obtain or create and register package
    DroidPackageImpl theDroidPackage = (DroidPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DroidPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DroidPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDroidPackage.createPackageContents();

    // Initialize created meta-data
    theDroidPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDroidPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DroidPackage.eNS_URI, theDroidPackage);
    return theDroidPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplication()
  {
    return applicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplication_Name()
  {
    return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplication_Package()
  {
    return (EAttribute)applicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Manifest()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Resources()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Layouts()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Activities()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManifestFile()
  {
    return manifestFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResource()
  {
    return resourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericResource()
  {
    return genericResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericResource_Name()
  {
    return (EAttribute)genericResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenuResource()
  {
    return menuResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenuResource_Name()
  {
    return (EAttribute)menuResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueResource()
  {
    return valueResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueResource_Name()
  {
    return (EAttribute)valueResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringValueResource()
  {
    return stringValueResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringValueResource_Value()
  {
    return (EAttribute)stringValueResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerValueResource()
  {
    return integerValueResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerValueResource_Value()
  {
    return (EAttribute)integerValueResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanValueResource()
  {
    return booleanValueResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanValueResource_Value()
  {
    return (EAttribute)booleanValueResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorValueResource()
  {
    return colorValueResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorValueResource_Value()
  {
    return (EAttribute)colorValueResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionValueResource()
  {
    return dimensionValueResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionValueResource_Value()
  {
    return (EAttribute)dimensionValueResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionValueResource_Unit()
  {
    return (EAttribute)dimensionValueResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDrawableResource()
  {
    return drawableResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitmapDrawableResource()
  {
    return bitmapDrawableResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBitmapDrawableResource_Name()
  {
    return (EAttribute)bitmapDrawableResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBitmapDrawableResource_Filename()
  {
    return (EAttribute)bitmapDrawableResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionDrawableResource()
  {
    return transitionDrawableResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDrawableResource_From()
  {
    return (EReference)transitionDrawableResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDrawableResource_To()
  {
    return (EReference)transitionDrawableResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnimationResource()
  {
    return animationResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnimationResource_Name()
  {
    return (EAttribute)animationResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayout()
  {
    return layoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLayout_Name()
  {
    return (EAttribute)layoutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_Widgets()
  {
    return (EReference)layoutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWidget()
  {
    return widgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWidget_Id()
  {
    return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidget_Top()
  {
    return (EReference)widgetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidget_Left()
  {
    return (EReference)widgetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidget_Width()
  {
    return (EReference)widgetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidget_Height()
  {
    return (EReference)widgetEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidget_Background()
  {
    return (EReference)widgetEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidget_Clickable()
  {
    return (EReference)widgetEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidget_FadeScrollBars()
  {
    return (EReference)widgetEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidget_IsScrollContainer()
  {
    return (EReference)widgetEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericWidget()
  {
    return genericWidgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericWidget_Name()
  {
    return (EAttribute)genericWidgetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericWidget_Actions()
  {
    return (EReference)genericWidgetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextView()
  {
    return textViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_Text()
  {
    return (EReference)textViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_Hint()
  {
    return (EReference)textViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_TextColor()
  {
    return (EReference)textViewEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_Actions()
  {
    return (EReference)textViewEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButton()
  {
    return buttonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_Text()
  {
    return (EReference)buttonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_Hint()
  {
    return (EReference)buttonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_TextColor()
  {
    return (EReference)buttonEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_Actions()
  {
    return (EReference)buttonEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImageButton()
  {
    return imageButtonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageButton_Src()
  {
    return (EReference)imageButtonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageButton_Hint()
  {
    return (EReference)imageButtonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageButton_TextColor()
  {
    return (EReference)imageButtonEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageButton_Actions()
  {
    return (EReference)imageButtonEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLink()
  {
    return linkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Text()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Hint()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_TextColor()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Target()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Actions()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpinner()
  {
    return spinnerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpinner_Prompt()
  {
    return (EReference)spinnerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditText()
  {
    return editTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_Text()
  {
    return (EReference)editTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_Hint()
  {
    return (EReference)editTextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_TextColor()
  {
    return (EReference)editTextEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_Editable()
  {
    return (EReference)editTextEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_Numeric()
  {
    return (EReference)editTextEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_Password()
  {
    return (EReference)editTextEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_PhoneNumber()
  {
    return (EReference)editTextEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivity()
  {
    return activityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActivity_Name()
  {
    return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericActivity()
  {
    return genericActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericActivity_Actions()
  {
    return (EReference)genericActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListActivity()
  {
    return listActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListActivity_DataSource()
  {
    return (EAttribute)listActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListActivity_Layout()
  {
    return (EReference)listActivityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListActivity_ItemLayout()
  {
    return (EReference)listActivityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListActivity_Actions()
  {
    return (EReference)listActivityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTabActivity()
  {
    return tabActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabActivity_Tabs()
  {
    return (EReference)tabActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTab()
  {
    return tabEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTab_Activity()
  {
    return (EReference)tabEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericAction()
  {
    return genericActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericAction_Name()
  {
    return (EAttribute)genericActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoToURLAction()
  {
    return goToURLActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoToURLAction_Url()
  {
    return (EAttribute)goToURLActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShowLayoutAction()
  {
    return showLayoutActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShowLayoutAction_Layout()
  {
    return (EReference)showLayoutActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvokeActivityAction()
  {
    return invokeActivityActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvokeActivityAction_Activity()
  {
    return (EReference)invokeActivityActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoadResourceAction()
  {
    return loadResourceActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadResourceAction_Resource()
  {
    return (EAttribute)loadResourceActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadResourceAction_ToVar()
  {
    return (EAttribute)loadResourceActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoadResourceAction_AfterLoad()
  {
    return (EReference)loadResourceActionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyValue()
  {
    return propertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyValue_ExternalResource()
  {
    return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringPropertyValue()
  {
    return stringPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringPropertyValue_Value()
  {
    return (EAttribute)stringPropertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringPropertyValue_Resource()
  {
    return (EReference)stringPropertyValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerPropertyValue()
  {
    return integerPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerPropertyValue_Value()
  {
    return (EAttribute)integerPropertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerPropertyValue_Resource()
  {
    return (EReference)integerPropertyValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanPropertyValue()
  {
    return booleanPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanPropertyValue_Value()
  {
    return (EAttribute)booleanPropertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanPropertyValue_Resource()
  {
    return (EReference)booleanPropertyValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorPropertyValue()
  {
    return colorPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorPropertyValue_Value()
  {
    return (EAttribute)colorPropertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorPropertyValue_Resource()
  {
    return (EReference)colorPropertyValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionPropertyValue()
  {
    return dimensionPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionPropertyValue_Value()
  {
    return (EAttribute)dimensionPropertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensionPropertyValue_Resource()
  {
    return (EReference)dimensionPropertyValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDrawableResourcePropertyValue()
  {
    return drawableResourcePropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDrawableResourcePropertyValue_Value()
  {
    return (EAttribute)drawableResourcePropertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDrawableResourcePropertyValue_Resource()
  {
    return (EReference)drawableResourcePropertyValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDrawableImageResourcePropertyValue()
  {
    return drawableImageResourcePropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDrawableImageResourcePropertyValue_Resource()
  {
    return (EReference)drawableImageResourcePropertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDrawableImageResourcePropertyValue_ExternalResource()
  {
    return (EAttribute)drawableImageResourcePropertyValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDimensionKind()
  {
    return dimensionKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DroidFactory getDroidFactory()
  {
    return (DroidFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    applicationEClass = createEClass(APPLICATION);
    createEAttribute(applicationEClass, APPLICATION__NAME);
    createEAttribute(applicationEClass, APPLICATION__PACKAGE);
    createEReference(applicationEClass, APPLICATION__MANIFEST);
    createEReference(applicationEClass, APPLICATION__RESOURCES);
    createEReference(applicationEClass, APPLICATION__LAYOUTS);
    createEReference(applicationEClass, APPLICATION__ACTIVITIES);

    manifestFileEClass = createEClass(MANIFEST_FILE);

    resourceEClass = createEClass(RESOURCE);

    genericResourceEClass = createEClass(GENERIC_RESOURCE);
    createEAttribute(genericResourceEClass, GENERIC_RESOURCE__NAME);

    menuResourceEClass = createEClass(MENU_RESOURCE);
    createEAttribute(menuResourceEClass, MENU_RESOURCE__NAME);

    valueResourceEClass = createEClass(VALUE_RESOURCE);
    createEAttribute(valueResourceEClass, VALUE_RESOURCE__NAME);

    stringValueResourceEClass = createEClass(STRING_VALUE_RESOURCE);
    createEAttribute(stringValueResourceEClass, STRING_VALUE_RESOURCE__VALUE);

    integerValueResourceEClass = createEClass(INTEGER_VALUE_RESOURCE);
    createEAttribute(integerValueResourceEClass, INTEGER_VALUE_RESOURCE__VALUE);

    booleanValueResourceEClass = createEClass(BOOLEAN_VALUE_RESOURCE);
    createEAttribute(booleanValueResourceEClass, BOOLEAN_VALUE_RESOURCE__VALUE);

    colorValueResourceEClass = createEClass(COLOR_VALUE_RESOURCE);
    createEAttribute(colorValueResourceEClass, COLOR_VALUE_RESOURCE__VALUE);

    dimensionValueResourceEClass = createEClass(DIMENSION_VALUE_RESOURCE);
    createEAttribute(dimensionValueResourceEClass, DIMENSION_VALUE_RESOURCE__VALUE);
    createEAttribute(dimensionValueResourceEClass, DIMENSION_VALUE_RESOURCE__UNIT);

    drawableResourceEClass = createEClass(DRAWABLE_RESOURCE);

    bitmapDrawableResourceEClass = createEClass(BITMAP_DRAWABLE_RESOURCE);
    createEAttribute(bitmapDrawableResourceEClass, BITMAP_DRAWABLE_RESOURCE__NAME);
    createEAttribute(bitmapDrawableResourceEClass, BITMAP_DRAWABLE_RESOURCE__FILENAME);

    transitionDrawableResourceEClass = createEClass(TRANSITION_DRAWABLE_RESOURCE);
    createEReference(transitionDrawableResourceEClass, TRANSITION_DRAWABLE_RESOURCE__FROM);
    createEReference(transitionDrawableResourceEClass, TRANSITION_DRAWABLE_RESOURCE__TO);

    animationResourceEClass = createEClass(ANIMATION_RESOURCE);
    createEAttribute(animationResourceEClass, ANIMATION_RESOURCE__NAME);

    layoutEClass = createEClass(LAYOUT);
    createEAttribute(layoutEClass, LAYOUT__NAME);
    createEReference(layoutEClass, LAYOUT__WIDGETS);

    widgetEClass = createEClass(WIDGET);
    createEAttribute(widgetEClass, WIDGET__ID);
    createEReference(widgetEClass, WIDGET__TOP);
    createEReference(widgetEClass, WIDGET__LEFT);
    createEReference(widgetEClass, WIDGET__WIDTH);
    createEReference(widgetEClass, WIDGET__HEIGHT);
    createEReference(widgetEClass, WIDGET__BACKGROUND);
    createEReference(widgetEClass, WIDGET__CLICKABLE);
    createEReference(widgetEClass, WIDGET__FADE_SCROLL_BARS);
    createEReference(widgetEClass, WIDGET__IS_SCROLL_CONTAINER);

    genericWidgetEClass = createEClass(GENERIC_WIDGET);
    createEAttribute(genericWidgetEClass, GENERIC_WIDGET__NAME);
    createEReference(genericWidgetEClass, GENERIC_WIDGET__ACTIONS);

    textViewEClass = createEClass(TEXT_VIEW);
    createEReference(textViewEClass, TEXT_VIEW__TEXT);
    createEReference(textViewEClass, TEXT_VIEW__HINT);
    createEReference(textViewEClass, TEXT_VIEW__TEXT_COLOR);
    createEReference(textViewEClass, TEXT_VIEW__ACTIONS);

    buttonEClass = createEClass(BUTTON);
    createEReference(buttonEClass, BUTTON__TEXT);
    createEReference(buttonEClass, BUTTON__HINT);
    createEReference(buttonEClass, BUTTON__TEXT_COLOR);
    createEReference(buttonEClass, BUTTON__ACTIONS);

    imageButtonEClass = createEClass(IMAGE_BUTTON);
    createEReference(imageButtonEClass, IMAGE_BUTTON__SRC);
    createEReference(imageButtonEClass, IMAGE_BUTTON__HINT);
    createEReference(imageButtonEClass, IMAGE_BUTTON__TEXT_COLOR);
    createEReference(imageButtonEClass, IMAGE_BUTTON__ACTIONS);

    linkEClass = createEClass(LINK);
    createEReference(linkEClass, LINK__TEXT);
    createEReference(linkEClass, LINK__HINT);
    createEReference(linkEClass, LINK__TEXT_COLOR);
    createEReference(linkEClass, LINK__TARGET);
    createEReference(linkEClass, LINK__ACTIONS);

    spinnerEClass = createEClass(SPINNER);
    createEReference(spinnerEClass, SPINNER__PROMPT);

    editTextEClass = createEClass(EDIT_TEXT);
    createEReference(editTextEClass, EDIT_TEXT__TEXT);
    createEReference(editTextEClass, EDIT_TEXT__HINT);
    createEReference(editTextEClass, EDIT_TEXT__TEXT_COLOR);
    createEReference(editTextEClass, EDIT_TEXT__EDITABLE);
    createEReference(editTextEClass, EDIT_TEXT__NUMERIC);
    createEReference(editTextEClass, EDIT_TEXT__PASSWORD);
    createEReference(editTextEClass, EDIT_TEXT__PHONE_NUMBER);

    activityEClass = createEClass(ACTIVITY);
    createEAttribute(activityEClass, ACTIVITY__NAME);

    genericActivityEClass = createEClass(GENERIC_ACTIVITY);
    createEReference(genericActivityEClass, GENERIC_ACTIVITY__ACTIONS);

    listActivityEClass = createEClass(LIST_ACTIVITY);
    createEAttribute(listActivityEClass, LIST_ACTIVITY__DATA_SOURCE);
    createEReference(listActivityEClass, LIST_ACTIVITY__LAYOUT);
    createEReference(listActivityEClass, LIST_ACTIVITY__ITEM_LAYOUT);
    createEReference(listActivityEClass, LIST_ACTIVITY__ACTIONS);

    tabActivityEClass = createEClass(TAB_ACTIVITY);
    createEReference(tabActivityEClass, TAB_ACTIVITY__TABS);

    tabEClass = createEClass(TAB);
    createEReference(tabEClass, TAB__ACTIVITY);

    actionEClass = createEClass(ACTION);

    genericActionEClass = createEClass(GENERIC_ACTION);
    createEAttribute(genericActionEClass, GENERIC_ACTION__NAME);

    goToURLActionEClass = createEClass(GO_TO_URL_ACTION);
    createEAttribute(goToURLActionEClass, GO_TO_URL_ACTION__URL);

    showLayoutActionEClass = createEClass(SHOW_LAYOUT_ACTION);
    createEReference(showLayoutActionEClass, SHOW_LAYOUT_ACTION__LAYOUT);

    invokeActivityActionEClass = createEClass(INVOKE_ACTIVITY_ACTION);
    createEReference(invokeActivityActionEClass, INVOKE_ACTIVITY_ACTION__ACTIVITY);

    loadResourceActionEClass = createEClass(LOAD_RESOURCE_ACTION);
    createEAttribute(loadResourceActionEClass, LOAD_RESOURCE_ACTION__RESOURCE);
    createEAttribute(loadResourceActionEClass, LOAD_RESOURCE_ACTION__TO_VAR);
    createEReference(loadResourceActionEClass, LOAD_RESOURCE_ACTION__AFTER_LOAD);

    propertyValueEClass = createEClass(PROPERTY_VALUE);
    createEAttribute(propertyValueEClass, PROPERTY_VALUE__EXTERNAL_RESOURCE);

    stringPropertyValueEClass = createEClass(STRING_PROPERTY_VALUE);
    createEAttribute(stringPropertyValueEClass, STRING_PROPERTY_VALUE__VALUE);
    createEReference(stringPropertyValueEClass, STRING_PROPERTY_VALUE__RESOURCE);

    integerPropertyValueEClass = createEClass(INTEGER_PROPERTY_VALUE);
    createEAttribute(integerPropertyValueEClass, INTEGER_PROPERTY_VALUE__VALUE);
    createEReference(integerPropertyValueEClass, INTEGER_PROPERTY_VALUE__RESOURCE);

    booleanPropertyValueEClass = createEClass(BOOLEAN_PROPERTY_VALUE);
    createEAttribute(booleanPropertyValueEClass, BOOLEAN_PROPERTY_VALUE__VALUE);
    createEReference(booleanPropertyValueEClass, BOOLEAN_PROPERTY_VALUE__RESOURCE);

    colorPropertyValueEClass = createEClass(COLOR_PROPERTY_VALUE);
    createEAttribute(colorPropertyValueEClass, COLOR_PROPERTY_VALUE__VALUE);
    createEReference(colorPropertyValueEClass, COLOR_PROPERTY_VALUE__RESOURCE);

    dimensionPropertyValueEClass = createEClass(DIMENSION_PROPERTY_VALUE);
    createEAttribute(dimensionPropertyValueEClass, DIMENSION_PROPERTY_VALUE__VALUE);
    createEReference(dimensionPropertyValueEClass, DIMENSION_PROPERTY_VALUE__RESOURCE);

    drawableResourcePropertyValueEClass = createEClass(DRAWABLE_RESOURCE_PROPERTY_VALUE);
    createEAttribute(drawableResourcePropertyValueEClass, DRAWABLE_RESOURCE_PROPERTY_VALUE__VALUE);
    createEReference(drawableResourcePropertyValueEClass, DRAWABLE_RESOURCE_PROPERTY_VALUE__RESOURCE);

    drawableImageResourcePropertyValueEClass = createEClass(DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE);
    createEReference(drawableImageResourcePropertyValueEClass, DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__RESOURCE);
    createEAttribute(drawableImageResourcePropertyValueEClass, DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__EXTERNAL_RESOURCE);

    // Create enums
    dimensionKindEEnum = createEEnum(DIMENSION_KIND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    genericResourceEClass.getESuperTypes().add(this.getResource());
    menuResourceEClass.getESuperTypes().add(this.getResource());
    valueResourceEClass.getESuperTypes().add(this.getResource());
    stringValueResourceEClass.getESuperTypes().add(this.getValueResource());
    integerValueResourceEClass.getESuperTypes().add(this.getValueResource());
    booleanValueResourceEClass.getESuperTypes().add(this.getValueResource());
    colorValueResourceEClass.getESuperTypes().add(this.getValueResource());
    dimensionValueResourceEClass.getESuperTypes().add(this.getValueResource());
    drawableResourceEClass.getESuperTypes().add(this.getResource());
    bitmapDrawableResourceEClass.getESuperTypes().add(this.getDrawableResource());
    transitionDrawableResourceEClass.getESuperTypes().add(this.getDrawableResource());
    animationResourceEClass.getESuperTypes().add(this.getResource());
    genericWidgetEClass.getESuperTypes().add(this.getWidget());
    textViewEClass.getESuperTypes().add(this.getWidget());
    buttonEClass.getESuperTypes().add(this.getWidget());
    imageButtonEClass.getESuperTypes().add(this.getWidget());
    linkEClass.getESuperTypes().add(this.getWidget());
    spinnerEClass.getESuperTypes().add(this.getWidget());
    editTextEClass.getESuperTypes().add(this.getWidget());
    genericActivityEClass.getESuperTypes().add(this.getActivity());
    listActivityEClass.getESuperTypes().add(this.getActivity());
    tabActivityEClass.getESuperTypes().add(this.getActivity());
    genericActionEClass.getESuperTypes().add(this.getAction());
    goToURLActionEClass.getESuperTypes().add(this.getAction());
    showLayoutActionEClass.getESuperTypes().add(this.getAction());
    invokeActivityActionEClass.getESuperTypes().add(this.getAction());
    loadResourceActionEClass.getESuperTypes().add(this.getAction());
    stringPropertyValueEClass.getESuperTypes().add(this.getPropertyValue());
    integerPropertyValueEClass.getESuperTypes().add(this.getPropertyValue());
    booleanPropertyValueEClass.getESuperTypes().add(this.getPropertyValue());
    colorPropertyValueEClass.getESuperTypes().add(this.getPropertyValue());
    dimensionPropertyValueEClass.getESuperTypes().add(this.getPropertyValue());
    drawableResourcePropertyValueEClass.getESuperTypes().add(this.getPropertyValue());

    // Initialize classes and features; add operations and parameters
    initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplication_Package(), ecorePackage.getEString(), "package", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Manifest(), this.getManifestFile(), null, "manifest", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Resources(), this.getResource(), null, "resources", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Layouts(), this.getLayout(), null, "layouts", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Activities(), this.getActivity(), null, "activities", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(manifestFileEClass, ManifestFile.class, "ManifestFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(genericResourceEClass, GenericResource.class, "GenericResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGenericResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenericResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(menuResourceEClass, MenuResource.class, "MenuResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMenuResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, MenuResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueResourceEClass, ValueResource.class, "ValueResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValueResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValueResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringValueResourceEClass, StringValueResource.class, "StringValueResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringValueResource_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValueResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerValueResourceEClass, IntegerValueResource.class, "IntegerValueResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerValueResource_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerValueResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanValueResourceEClass, BooleanValueResource.class, "BooleanValueResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanValueResource_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, BooleanValueResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorValueResourceEClass, ColorValueResource.class, "ColorValueResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorValueResource_Value(), ecorePackage.getEString(), "value", null, 0, 1, ColorValueResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionValueResourceEClass, DimensionValueResource.class, "DimensionValueResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDimensionValueResource_Value(), ecorePackage.getEFloatObject(), "value", null, 0, 1, DimensionValueResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDimensionValueResource_Unit(), this.getDimensionKind(), "unit", null, 0, 1, DimensionValueResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(drawableResourceEClass, DrawableResource.class, "DrawableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bitmapDrawableResourceEClass, BitmapDrawableResource.class, "BitmapDrawableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBitmapDrawableResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, BitmapDrawableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBitmapDrawableResource_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, BitmapDrawableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionDrawableResourceEClass, TransitionDrawableResource.class, "TransitionDrawableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionDrawableResource_From(), this.getDrawableResource(), null, "from", null, 0, 1, TransitionDrawableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionDrawableResource_To(), this.getDrawableResource(), null, "to", null, 0, 1, TransitionDrawableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(animationResourceEClass, AnimationResource.class, "AnimationResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnimationResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, AnimationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLayout_Name(), ecorePackage.getEString(), "name", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayout_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWidget_Id(), ecorePackage.getEString(), "id", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWidget_Top(), this.getDimensionPropertyValue(), null, "top", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWidget_Left(), this.getDimensionPropertyValue(), null, "left", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWidget_Width(), this.getDimensionPropertyValue(), null, "width", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWidget_Height(), this.getDimensionPropertyValue(), null, "height", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWidget_Background(), this.getDrawableResourcePropertyValue(), null, "background", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWidget_Clickable(), this.getBooleanPropertyValue(), null, "clickable", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWidget_FadeScrollBars(), this.getBooleanPropertyValue(), null, "fadeScrollBars", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWidget_IsScrollContainer(), this.getBooleanPropertyValue(), null, "isScrollContainer", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genericWidgetEClass, GenericWidget.class, "GenericWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGenericWidget_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenericWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGenericWidget_Actions(), this.getAction(), null, "actions", null, 0, -1, GenericWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textViewEClass, TextView.class, "TextView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTextView_Text(), this.getStringPropertyValue(), null, "text", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextView_Hint(), this.getStringPropertyValue(), null, "hint", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextView_TextColor(), this.getColorPropertyValue(), null, "textColor", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextView_Actions(), this.getAction(), null, "actions", null, 0, -1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getButton_Text(), this.getStringPropertyValue(), null, "text", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButton_Hint(), this.getStringPropertyValue(), null, "hint", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButton_TextColor(), this.getColorPropertyValue(), null, "textColor", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButton_Actions(), this.getAction(), null, "actions", null, 0, -1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageButtonEClass, ImageButton.class, "ImageButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImageButton_Src(), this.getDrawableImageResourcePropertyValue(), null, "src", null, 0, 1, ImageButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageButton_Hint(), this.getStringPropertyValue(), null, "hint", null, 0, 1, ImageButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageButton_TextColor(), this.getColorPropertyValue(), null, "textColor", null, 0, 1, ImageButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageButton_Actions(), this.getAction(), null, "actions", null, 0, -1, ImageButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLink_Text(), this.getStringPropertyValue(), null, "text", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Hint(), this.getStringPropertyValue(), null, "hint", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_TextColor(), this.getColorPropertyValue(), null, "textColor", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Target(), this.getActivity(), null, "target", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Actions(), this.getAction(), null, "actions", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spinnerEClass, Spinner.class, "Spinner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpinner_Prompt(), this.getStringPropertyValue(), null, "prompt", null, 0, 1, Spinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(editTextEClass, EditText.class, "EditText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEditText_Text(), this.getStringPropertyValue(), null, "text", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditText_Hint(), this.getStringPropertyValue(), null, "hint", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditText_TextColor(), this.getColorPropertyValue(), null, "textColor", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditText_Editable(), this.getBooleanPropertyValue(), null, "editable", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditText_Numeric(), this.getBooleanPropertyValue(), null, "numeric", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditText_Password(), this.getBooleanPropertyValue(), null, "password", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEditText_PhoneNumber(), this.getBooleanPropertyValue(), null, "phoneNumber", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genericActivityEClass, GenericActivity.class, "GenericActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGenericActivity_Actions(), this.getAction(), null, "actions", null, 0, -1, GenericActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listActivityEClass, ListActivity.class, "ListActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getListActivity_DataSource(), ecorePackage.getEString(), "dataSource", null, 0, 1, ListActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListActivity_Layout(), this.getLayout(), null, "layout", null, 0, 1, ListActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListActivity_ItemLayout(), this.getLayout(), null, "itemLayout", null, 0, 1, ListActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListActivity_Actions(), this.getAction(), null, "actions", null, 0, -1, ListActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tabActivityEClass, TabActivity.class, "TabActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTabActivity_Tabs(), this.getTab(), null, "tabs", null, 0, -1, TabActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTab_Activity(), this.getActivity(), null, "activity", null, 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(genericActionEClass, GenericAction.class, "GenericAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGenericAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenericAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goToURLActionEClass, GoToURLAction.class, "GoToURLAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGoToURLAction_Url(), ecorePackage.getEString(), "url", null, 0, 1, GoToURLAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(showLayoutActionEClass, ShowLayoutAction.class, "ShowLayoutAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShowLayoutAction_Layout(), this.getLayout(), null, "layout", null, 0, 1, ShowLayoutAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(invokeActivityActionEClass, InvokeActivityAction.class, "InvokeActivityAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInvokeActivityAction_Activity(), this.getActivity(), null, "activity", null, 0, 1, InvokeActivityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loadResourceActionEClass, LoadResourceAction.class, "LoadResourceAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoadResourceAction_Resource(), ecorePackage.getEString(), "resource", null, 0, 1, LoadResourceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadResourceAction_ToVar(), ecorePackage.getEString(), "toVar", null, 0, 1, LoadResourceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoadResourceAction_AfterLoad(), this.getAction(), null, "afterLoad", null, 0, 1, LoadResourceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyValue_ExternalResource(), ecorePackage.getEString(), "externalResource", null, 0, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringPropertyValueEClass, StringPropertyValue.class, "StringPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringPropertyValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStringPropertyValue_Resource(), this.getStringValueResource(), null, "resource", null, 0, 1, StringPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerPropertyValueEClass, IntegerPropertyValue.class, "IntegerPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerPropertyValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntegerPropertyValue_Resource(), this.getIntegerValueResource(), null, "resource", null, 0, 1, IntegerPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanPropertyValueEClass, BooleanPropertyValue.class, "BooleanPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanPropertyValue_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, BooleanPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBooleanPropertyValue_Resource(), this.getBooleanValueResource(), null, "resource", null, 0, 1, BooleanPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorPropertyValueEClass, ColorPropertyValue.class, "ColorPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorPropertyValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ColorPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColorPropertyValue_Resource(), this.getColorValueResource(), null, "resource", null, 0, 1, ColorPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionPropertyValueEClass, DimensionPropertyValue.class, "DimensionPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDimensionPropertyValue_Value(), ecorePackage.getEFloatObject(), "value", null, 0, 1, DimensionPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDimensionPropertyValue_Resource(), this.getDimensionValueResource(), null, "resource", null, 0, 1, DimensionPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(drawableResourcePropertyValueEClass, DrawableResourcePropertyValue.class, "DrawableResourcePropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDrawableResourcePropertyValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, DrawableResourcePropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDrawableResourcePropertyValue_Resource(), this.getDrawableResource(), null, "resource", null, 0, 1, DrawableResourcePropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(drawableImageResourcePropertyValueEClass, DrawableImageResourcePropertyValue.class, "DrawableImageResourcePropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDrawableImageResourcePropertyValue_Resource(), this.getDrawableResource(), null, "resource", null, 0, 1, DrawableImageResourcePropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDrawableImageResourcePropertyValue_ExternalResource(), ecorePackage.getEString(), "externalResource", null, 0, 1, DrawableImageResourcePropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(dimensionKindEEnum, DimensionKind.class, "DimensionKind");
    addEEnumLiteral(dimensionKindEEnum, DimensionKind.DP);
    addEEnumLiteral(dimensionKindEEnum, DimensionKind.SP);
    addEEnumLiteral(dimensionKindEEnum, DimensionKind.PT);
    addEEnumLiteral(dimensionKindEEnum, DimensionKind.PX);
    addEEnumLiteral(dimensionKindEEnum, DimensionKind.MM);
    addEEnumLiteral(dimensionKindEEnum, DimensionKind.IN);

    // Create resource
    createResource(eNS_URI);
  }

} //DroidPackageImpl
