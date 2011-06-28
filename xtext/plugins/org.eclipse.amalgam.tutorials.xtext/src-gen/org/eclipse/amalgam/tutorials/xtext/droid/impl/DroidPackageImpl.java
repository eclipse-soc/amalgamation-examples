/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.amalgam.tutorials.xtext.droid.DroidFactory;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

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
  protected String packageFilename = "droid.ecore";

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
  private EClass resourceEClass = null;

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
  private EClass abstractActivityEClass = null;

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
  private EClass viewCollectionEClass = null;

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
  private EClass actionSetEClass = null;

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
  private EClass abstractLinearLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linearLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relativeLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tabHostEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tabWidgetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass frameLayoutEClass = null;

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
  private EClass abstractTextViewEClass = null;

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
  private EClass imageViewEClass = null;

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
  private EClass valueAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringVAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerVAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanVAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorVAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionVAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layoutDimensionVAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyDrawableVAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass drawableVAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass animationVAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interpolatorVAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringVDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerVDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanVDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorVDEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionVDEClass = null;

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
  private EClass stringResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerArrayResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringArrayResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedArrayResourceEClass = null;

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
  private EClass menuResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menuItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menuItemGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subMenuEClass = null;

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
  private EClass frameAnimationElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass terminalAnimationElementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass terminalAnimationSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alphaAnimationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleAnimationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass translateAnimationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rotateAnimationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tweenAnimationResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass frameAnimationResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass animationFrameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractResourceAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringRAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerRAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanRAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorRAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionRAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass drawableRAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass animationRAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interpolatorRAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass radioButtonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass radioGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menuGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum builtInPermissionTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum interpolatorsKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum layoutDimensionKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum layoutGravityKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum layoutOrientationKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum layoutVisibilityKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typefaceKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum textStyleKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum autoLinkKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum capitalizeKindEEnum = null;

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
   * @generated
   */
  public static DroidPackage init()
  {
    if (isInited) return (DroidPackage)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI);

    // Obtain or create and register package
    DroidPackageImpl theDroidPackage = (DroidPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DroidPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DroidPackageImpl());

    isInited = true;

    // Load packages
    theDroidPackage.loadPackage();

    // Fix loaded packages
    theDroidPackage.fixPackageContents();

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
    if (applicationEClass == null)
    {
      applicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(0);
    }
    return applicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplication_Name()
  {
        return (EAttribute)getApplication().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplication_PackageName()
  {
        return (EAttribute)getApplication().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Resources()
  {
        return (EReference)getApplication().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Activities()
  {
        return (EReference)getApplication().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Layouts()
  {
        return (EReference)getApplication().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResource()
  {
    if (resourceEClass == null)
    {
      resourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(1);
    }
    return resourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResource_Name()
  {
        return (EAttribute)getResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayout()
  {
    if (layoutEClass == null)
    {
      layoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(2);
    }
    return layoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLayout_Alpha()
  {
        return (EAttribute)getLayout().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_MinHeight()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_MinWidth()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_NextFocusDown()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_NextFocusLeft()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_NextFocusRight()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_NextFocusUp()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_OnClick()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_Padding()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_PaddingBottom()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_PaddingLeft()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_PaddingRight()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_PaddingTop()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_Scrollbars()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLayout_Visibility()
  {
        return (EAttribute)getLayout().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayout_LayoutAnimation()
  {
        return (EReference)getLayout().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractActivity()
  {
    if (abstractActivityEClass == null)
    {
      abstractActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(3);
    }
    return abstractActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractActivity_ReferencedLayout()
  {
        return (EReference)getAbstractActivity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractActivity_Widgets()
  {
        return (EReference)getAbstractActivity().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivity()
  {
    if (activityEClass == null)
    {
      activityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(4);
    }
    return activityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActivity_Name()
  {
        return (EAttribute)getActivity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericActivity()
  {
    if (genericActivityEClass == null)
    {
      genericActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(5);
    }
    return genericActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewCollection()
  {
    if (viewCollectionEClass == null)
    {
      viewCollectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(6);
    }
    return viewCollectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewCollection_Views()
  {
        return (EReference)getViewCollection().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListActivity()
  {
    if (listActivityEClass == null)
    {
      listActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(7);
    }
    return listActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListActivity_DataSource()
  {
        return (EAttribute)getListActivity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListActivity_ItemLayout()
  {
        return (EReference)getListActivity().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListActivity_Actions()
  {
        return (EReference)getListActivity().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTabActivity()
  {
    if (tabActivityEClass == null)
    {
      tabActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(8);
    }
    return tabActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabActivity_Tabs()
  {
        return (EReference)getTabActivity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabActivity_Actions()
  {
        return (EReference)getTabActivity().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTab()
  {
    if (tabEClass == null)
    {
      tabEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(9);
    }
    return tabEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTab_Caption()
  {
        return (EReference)getTab().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTab_Name()
  {
        return (EAttribute)getTab().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTab_Icon()
  {
        return (EReference)getTab().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTab_SelectedIcon()
  {
        return (EReference)getTab().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTab_Activity()
  {
        return (EReference)getTab().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTab_Layout()
  {
        return (EReference)getTab().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTab_Actions()
  {
        return (EReference)getTab().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionSet()
  {
    if (actionSetEClass == null)
    {
      actionSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(10);
    }
    return actionSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionSet_Actions()
  {
        return (EReference)getActionSet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    if (actionEClass == null)
    {
      actionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(11);
    }
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoToURLAction()
  {
    if (goToURLActionEClass == null)
    {
      goToURLActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(12);
    }
    return goToURLActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoToURLAction_Url()
  {
        return (EAttribute)getGoToURLAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShowLayoutAction()
  {
    if (showLayoutActionEClass == null)
    {
      showLayoutActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(13);
    }
    return showLayoutActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShowLayoutAction_Layout()
  {
        return (EReference)getShowLayoutAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvokeActivityAction()
  {
    if (invokeActivityActionEClass == null)
    {
      invokeActivityActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(14);
    }
    return invokeActivityActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvokeActivityAction_Activity()
  {
        return (EReference)getInvokeActivityAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractLinearLayout()
  {
    if (abstractLinearLayoutEClass == null)
    {
      abstractLinearLayoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(15);
    }
    return abstractLinearLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractLinearLayout_Orientation()
  {
        return (EAttribute)getAbstractLinearLayout().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractView()
  {
    if (abstractViewEClass == null)
    {
      abstractViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(16);
    }
    return abstractViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractView_Name()
  {
        return (EAttribute)getAbstractView().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractView_Widgets()
  {
        return (EReference)getAbstractView().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getView()
  {
    if (viewEClass == null)
    {
      viewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(17);
    }
    return viewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getView_Background()
  {
        return (EReference)getView().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinearLayout()
  {
    if (linearLayoutEClass == null)
    {
      linearLayoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(18);
    }
    return linearLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelativeLayout()
  {
    if (relativeLayoutEClass == null)
    {
      relativeLayoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(19);
    }
    return relativeLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelativeLayout_Orientation()
  {
        return (EAttribute)getRelativeLayout().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTabHost()
  {
    if (tabHostEClass == null)
    {
      tabHostEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(20);
    }
    return tabHostEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTabWidget()
  {
    if (tabWidgetEClass == null)
    {
      tabWidgetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(21);
    }
    return tabWidgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTabWidget_Gravity()
  {
        return (EAttribute)getTabWidget().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabWidget_Divider()
  {
        return (EReference)getTabWidget().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabWidget_TrabStripEnabled()
  {
        return (EReference)getTabWidget().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabWidget_TrabStripLeft()
  {
        return (EReference)getTabWidget().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabWidget_TabStripRight()
  {
        return (EReference)getTabWidget().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFrameLayout()
  {
    if (frameLayoutEClass == null)
    {
      frameLayoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(22);
    }
    return frameLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWidget()
  {
    if (widgetEClass == null)
    {
      widgetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(23);
    }
    return widgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidget_Top()
  {
        return (EReference)getWidget().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidget_Left()
  {
        return (EReference)getWidget().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidget_Width()
  {
        return (EReference)getWidget().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidget_Height()
  {
        return (EReference)getWidget().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWidget_Clickable()
  {
        return (EReference)getWidget().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractTextView()
  {
    if (abstractTextViewEClass == null)
    {
      abstractTextViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(24);
    }
    return abstractTextViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextView()
  {
    if (textViewEClass == null)
    {
      textViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(25);
    }
    return textViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_Text()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_FadeScrollBars()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_IsScrollContainer()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextView_AutoLink()
  {
        return (EAttribute)getTextView().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_AutoText()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextView_Capitalize()
  {
        return (EAttribute)getTextView().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_Digits()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_Editable()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextView_Gravity()
  {
        return (EAttribute)getTextView().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_Hint()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_Numeric()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_Password()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_PhoneNumber()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_SingleLine()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_TextColor()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextView_Typeface()
  {
        return (EAttribute)getTextView().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextView_TextSize()
  {
        return (EReference)getTextView().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextView_TextStyle()
  {
        return (EAttribute)getTextView().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImageView()
  {
    if (imageViewEClass == null)
    {
      imageViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(26);
    }
    return imageViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageView_Src()
  {
        return (EReference)getImageView().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageView_FadeScrollBars()
  {
        return (EReference)getImageView().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageView_IsScrollContainer()
  {
        return (EReference)getImageView().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButton()
  {
    if (buttonEClass == null)
    {
      buttonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(27);
    }
    return buttonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_Text()
  {
        return (EReference)getButton().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_Src()
  {
        return (EReference)getButton().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_Target()
  {
        return (EReference)getButton().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_Hint()
  {
        return (EReference)getButton().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpinner()
  {
    if (spinnerEClass == null)
    {
      spinnerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(28);
    }
    return spinnerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpinner_Prompt()
  {
        return (EReference)getSpinner().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpinner_FadeScrollBars()
  {
        return (EReference)getSpinner().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpinner_IsScrollContainer()
  {
        return (EReference)getSpinner().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditText()
  {
    if (editTextEClass == null)
    {
      editTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(29);
    }
    return editTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_Text()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_FadeScrollBars()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_IsScrollContainer()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditText_AutoLink()
  {
        return (EAttribute)getEditText().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_AutoText()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditText_Capitalize()
  {
        return (EAttribute)getEditText().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_Digits()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_Editable()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditText_Gravity()
  {
        return (EAttribute)getEditText().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_Hint()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_Numeric()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_Password()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_PhoneNumber()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_SingleLine()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_TextColor()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditText_Typeface()
  {
        return (EAttribute)getEditText().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEditText_TextSize()
  {
        return (EReference)getEditText().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditText_TextStyle()
  {
        return (EAttribute)getEditText().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueAccess()
  {
    if (valueAccessEClass == null)
    {
      valueAccessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(30);
    }
    return valueAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringVA()
  {
    if (stringVAEClass == null)
    {
      stringVAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(31);
    }
    return stringVAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringVA_Access()
  {
        return (EReference)getStringVA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringVA_Value()
  {
        return (EReference)getStringVA().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerVA()
  {
    if (integerVAEClass == null)
    {
      integerVAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(32);
    }
    return integerVAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerVA_Access()
  {
        return (EReference)getIntegerVA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerVA_Value()
  {
        return (EReference)getIntegerVA().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanVA()
  {
    if (booleanVAEClass == null)
    {
      booleanVAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(33);
    }
    return booleanVAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanVA_Access()
  {
        return (EReference)getBooleanVA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanVA_Value()
  {
        return (EReference)getBooleanVA().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorVA()
  {
    if (colorVAEClass == null)
    {
      colorVAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(34);
    }
    return colorVAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorVA_Access()
  {
        return (EReference)getColorVA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorVA_Value()
  {
        return (EReference)getColorVA().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionVA()
  {
    if (dimensionVAEClass == null)
    {
      dimensionVAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(35);
    }
    return dimensionVAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensionVA_Access()
  {
        return (EReference)getDimensionVA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensionVA_Value()
  {
        return (EReference)getDimensionVA().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayoutDimensionVA()
  {
    if (layoutDimensionVAEClass == null)
    {
      layoutDimensionVAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(36);
    }
    return layoutDimensionVAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLayoutDimensionVA_Constant_value()
  {
        return (EAttribute)getLayoutDimensionVA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyDrawableVA()
  {
    if (anyDrawableVAEClass == null)
    {
      anyDrawableVAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(37);
    }
    return anyDrawableVAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDrawableVA()
  {
    if (drawableVAEClass == null)
    {
      drawableVAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(38);
    }
    return drawableVAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDrawableVA_Access()
  {
        return (EReference)getDrawableVA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnimationVA()
  {
    if (animationVAEClass == null)
    {
      animationVAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(39);
    }
    return animationVAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnimationVA_Access()
  {
        return (EReference)getAnimationVA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterpolatorVA()
  {
    if (interpolatorVAEClass == null)
    {
      interpolatorVAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(40);
    }
    return interpolatorVAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterpolatorVA_Access()
  {
        return (EReference)getInterpolatorVA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueDefinition()
  {
    if (valueDefinitionEClass == null)
    {
      valueDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(41);
    }
    return valueDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringVD()
  {
    if (stringVDEClass == null)
    {
      stringVDEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(42);
    }
    return stringVDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringVD_Value()
  {
        return (EAttribute)getStringVD().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerVD()
  {
    if (integerVDEClass == null)
    {
      integerVDEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(43);
    }
    return integerVDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerVD_Value()
  {
        return (EAttribute)getIntegerVD().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanVD()
  {
    if (booleanVDEClass == null)
    {
      booleanVDEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(44);
    }
    return booleanVDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanVD_Value()
  {
        return (EAttribute)getBooleanVD().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorVD()
  {
    if (colorVDEClass == null)
    {
      colorVDEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(45);
    }
    return colorVDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorVD_Value()
  {
        return (EAttribute)getColorVD().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionVD()
  {
    if (dimensionVDEClass == null)
    {
      dimensionVDEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(46);
    }
    return dimensionVDEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionVD_Value()
  {
        return (EAttribute)getDimensionVD().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueResource()
  {
    if (valueResourceEClass == null)
    {
      valueResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(47);
    }
    return valueResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringResource()
  {
    if (stringResourceEClass == null)
    {
      stringResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(48);
    }
    return stringResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringResource_Value()
  {
        return (EAttribute)getStringResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerResource()
  {
    if (integerResourceEClass == null)
    {
      integerResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(49);
    }
    return integerResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerResource_Value()
  {
        return (EAttribute)getIntegerResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanResource()
  {
    if (booleanResourceEClass == null)
    {
      booleanResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(50);
    }
    return booleanResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanResource_Value()
  {
        return (EAttribute)getBooleanResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorResource()
  {
    if (colorResourceEClass == null)
    {
      colorResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(51);
    }
    return colorResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorResource_Value()
  {
        return (EAttribute)getColorResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionResource()
  {
    if (dimensionResourceEClass == null)
    {
      dimensionResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(52);
    }
    return dimensionResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionResource_Value()
  {
        return (EAttribute)getDimensionResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayResource()
  {
    if (arrayResourceEClass == null)
    {
      arrayResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(53);
    }
    return arrayResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerArrayResource()
  {
    if (integerArrayResourceEClass == null)
    {
      integerArrayResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(54);
    }
    return integerArrayResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerArrayResource_Items()
  {
        return (EAttribute)getIntegerArrayResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringArrayResource()
  {
    if (stringArrayResourceEClass == null)
    {
      stringArrayResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(55);
    }
    return stringArrayResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringArrayResource_Items()
  {
        return (EAttribute)getStringArrayResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypedArrayResource()
  {
    if (typedArrayResourceEClass == null)
    {
      typedArrayResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(56);
    }
    return typedArrayResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypedArrayResource_Values()
  {
        return (EReference)getTypedArrayResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDrawableResource()
  {
    if (drawableResourceEClass == null)
    {
      drawableResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(57);
    }
    return drawableResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitmapDrawableResource()
  {
    if (bitmapDrawableResourceEClass == null)
    {
      bitmapDrawableResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(58);
    }
    return bitmapDrawableResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBitmapDrawableResource_Filename()
  {
        return (EAttribute)getBitmapDrawableResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionDrawableResource()
  {
    if (transitionDrawableResourceEClass == null)
    {
      transitionDrawableResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(59);
    }
    return transitionDrawableResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDrawableResource_From()
  {
        return (EReference)getTransitionDrawableResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionDrawableResource_To()
  {
        return (EReference)getTransitionDrawableResource().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenuResource()
  {
    if (menuResourceEClass == null)
    {
      menuResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(60);
    }
    return menuResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenuResource_MenuItems()
  {
        return (EReference)getMenuResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenuResource_SubMenus()
  {
        return (EReference)getMenuResource().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenuResource_Groups()
  {
        return (EReference)getMenuResource().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenuItem()
  {
    if (menuItemEClass == null)
    {
      menuItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(61);
    }
    return menuItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenuItem_SubMenus()
  {
        return (EReference)getMenuItem().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenuItemGroup()
  {
    if (menuItemGroupEClass == null)
    {
      menuItemGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(62);
    }
    return menuItemGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubMenu()
  {
    if (subMenuEClass == null)
    {
      subMenuEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(63);
    }
    return subMenuEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubMenu_MenuItems()
  {
        return (EReference)getSubMenu().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubMenu_Groups()
  {
        return (EReference)getSubMenu().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnimationResource()
  {
    if (animationResourceEClass == null)
    {
      animationResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(64);
    }
    return animationResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFrameAnimationElement()
  {
    if (frameAnimationElementEClass == null)
    {
      frameAnimationElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(65);
    }
    return frameAnimationElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerminalAnimationElements()
  {
    if (terminalAnimationElementsEClass == null)
    {
      terminalAnimationElementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(66);
    }
    return terminalAnimationElementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTerminalAnimationElements_FromAlpha()
  {
        return (EAttribute)getTerminalAnimationElements().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTerminalAnimationElements_ToAlpha()
  {
        return (EAttribute)getTerminalAnimationElements().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerminalAnimationSet()
  {
    if (terminalAnimationSetEClass == null)
    {
      terminalAnimationSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(67);
    }
    return terminalAnimationSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTerminalAnimationSet_ShareInterpolator()
  {
        return (EAttribute)getTerminalAnimationSet().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalAnimationSet_Interpolator()
  {
        return (EReference)getTerminalAnimationSet().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalAnimationSet_Elements()
  {
        return (EReference)getTerminalAnimationSet().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlphaAnimation()
  {
    if (alphaAnimationEClass == null)
    {
      alphaAnimationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(68);
    }
    return alphaAnimationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScaleAnimation()
  {
    if (scaleAnimationEClass == null)
    {
      scaleAnimationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(69);
    }
    return scaleAnimationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTranslateAnimation()
  {
    if (translateAnimationEClass == null)
    {
      translateAnimationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(70);
    }
    return translateAnimationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRotateAnimation()
  {
    if (rotateAnimationEClass == null)
    {
      rotateAnimationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(71);
    }
    return rotateAnimationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTweenAnimationResource()
  {
    if (tweenAnimationResourceEClass == null)
    {
      tweenAnimationResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(72);
    }
    return tweenAnimationResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTweenAnimationResource_Elements()
  {
        return (EReference)getTweenAnimationResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFrameAnimationResource()
  {
    if (frameAnimationResourceEClass == null)
    {
      frameAnimationResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(73);
    }
    return frameAnimationResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFrameAnimationResource_OneShot()
  {
        return (EAttribute)getFrameAnimationResource().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFrameAnimationResource_Frames()
  {
        return (EReference)getFrameAnimationResource().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnimationFrame()
  {
    if (animationFrameEClass == null)
    {
      animationFrameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(74);
    }
    return animationFrameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnimationFrame_Drawable()
  {
        return (EReference)getAnimationFrame().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnimationFrame_Duration()
  {
        return (EAttribute)getAnimationFrame().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractResourceAccess()
  {
    if (abstractResourceAccessEClass == null)
    {
      abstractResourceAccessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(75);
    }
    return abstractResourceAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractResourceAccess_ExternalResource()
  {
        return (EAttribute)getAbstractResourceAccess().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceAccess()
  {
    if (resourceAccessEClass == null)
    {
      resourceAccessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(76);
    }
    return resourceAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringRA()
  {
    if (stringRAEClass == null)
    {
      stringRAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(77);
    }
    return stringRAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringRA_Resource()
  {
        return (EReference)getStringRA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerRA()
  {
    if (integerRAEClass == null)
    {
      integerRAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(78);
    }
    return integerRAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerRA_Resource()
  {
        return (EReference)getIntegerRA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanRA()
  {
    if (booleanRAEClass == null)
    {
      booleanRAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(79);
    }
    return booleanRAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanRA_Resource()
  {
        return (EReference)getBooleanRA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorRA()
  {
    if (colorRAEClass == null)
    {
      colorRAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(80);
    }
    return colorRAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorRA_Resource()
  {
        return (EReference)getColorRA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionRA()
  {
    if (dimensionRAEClass == null)
    {
      dimensionRAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(81);
    }
    return dimensionRAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensionRA_Resource()
  {
        return (EReference)getDimensionRA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDrawableRA()
  {
    if (drawableRAEClass == null)
    {
      drawableRAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(82);
    }
    return drawableRAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDrawableRA_Resource()
  {
        return (EReference)getDrawableRA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnimationRA()
  {
    if (animationRAEClass == null)
    {
      animationRAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(83);
    }
    return animationRAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnimationRA_Resource()
  {
        return (EReference)getAnimationRA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterpolatorRA()
  {
    if (interpolatorRAEClass == null)
    {
      interpolatorRAEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(84);
    }
    return interpolatorRAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterpolatorRA_InterpolatorName()
  {
        return (EAttribute)getInterpolatorRA().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckBox()
  {
    if (checkBoxEClass == null)
    {
      checkBoxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(85);
    }
    return checkBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckBox_Name()
  {
        return (EAttribute)getCheckBox().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_Text()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_Top()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_Left()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_Width()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_Height()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_Background()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_Clickable()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_FadeScrollBars()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_IsScrollContainer()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckBox_AutoLink()
  {
        return (EAttribute)getCheckBox().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_AutoText()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckBox_Capitalize()
  {
        return (EAttribute)getCheckBox().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_Digits()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_Editable()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckBox_Gravity()
  {
        return (EAttribute)getCheckBox().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_Hint()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_Numeric()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_Password()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_PhoneNumber()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_SingleLine()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_TextColor()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckBox_Typeface()
  {
        return (EAttribute)getCheckBox().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_TextSize()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheckBox_TextStyle()
  {
        return (EAttribute)getCheckBox().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBox_OnCheck()
  {
        return (EReference)getCheckBox().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRadioButton()
  {
    if (radioButtonEClass == null)
    {
      radioButtonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(86);
    }
    return radioButtonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadioButton_Name()
  {
        return (EAttribute)getRadioButton().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadioButton_Text()
  {
        return (EReference)getRadioButton().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadioButton_OnClick()
  {
        return (EReference)getRadioButton().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRadioGroup()
  {
    if (radioGroupEClass == null)
    {
      radioGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(87);
    }
    return radioGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadioGroup_Name()
  {
        return (EAttribute)getRadioGroup().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadioGroup_RadioButtons()
  {
        return (EReference)getRadioGroup().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenuGroup()
  {
    if (menuGroupEClass == null)
    {
      menuGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(98);
    }
    return menuGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenuGroup_Items()
  {
        return (EReference)getMenuGroup().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBuiltInPermissionType()
  {
    if (builtInPermissionTypeEEnum == null)
    {
      builtInPermissionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(88);
    }
    return builtInPermissionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getInterpolatorsKind()
  {
    if (interpolatorsKindEEnum == null)
    {
      interpolatorsKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(89);
    }
    return interpolatorsKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLayoutDimensionKind()
  {
    if (layoutDimensionKindEEnum == null)
    {
      layoutDimensionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(90);
    }
    return layoutDimensionKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLayoutGravityKind()
  {
    if (layoutGravityKindEEnum == null)
    {
      layoutGravityKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(91);
    }
    return layoutGravityKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLayoutOrientationKind()
  {
    if (layoutOrientationKindEEnum == null)
    {
      layoutOrientationKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(92);
    }
    return layoutOrientationKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLayoutVisibilityKind()
  {
    if (layoutVisibilityKindEEnum == null)
    {
      layoutVisibilityKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(93);
    }
    return layoutVisibilityKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypefaceKind()
  {
    if (typefaceKindEEnum == null)
    {
      typefaceKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(94);
    }
    return typefaceKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTextStyleKind()
  {
    if (textStyleKindEEnum == null)
    {
      textStyleKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(95);
    }
    return textStyleKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAutoLinkKind()
  {
    if (autoLinkKindEEnum == null)
    {
      autoLinkKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(96);
    }
    return autoLinkKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCapitalizeKind()
  {
    if (capitalizeKindEEnum == null)
    {
      capitalizeKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI).getEClassifiers().get(97);
    }
    return capitalizeKindEEnum;
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
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage()
  {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null)
    {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try
    {
      resource.load(null);
    }
    catch (IOException exception)
    {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents()
  {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
    if (eClassifier.getInstanceClassName() == null)
    {
      eClassifier.setInstanceClassName("org.eclipse.amalgam.tutorials.xtext.droid." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //DroidPackageImpl
