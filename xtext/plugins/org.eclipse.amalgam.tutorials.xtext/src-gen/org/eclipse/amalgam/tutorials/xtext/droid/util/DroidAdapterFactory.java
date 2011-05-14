/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.util;

import org.eclipse.amalgam.tutorials.xtext.droid.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage
 * @generated
 */
public class DroidAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DroidPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DroidAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DroidPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DroidSwitch<Adapter> modelSwitch =
    new DroidSwitch<Adapter>()
    {
      @Override
      public Adapter caseApplication(Application object)
      {
        return createApplicationAdapter();
      }
      @Override
      public Adapter caseManifestFile(ManifestFile object)
      {
        return createManifestFileAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseGenericResource(GenericResource object)
      {
        return createGenericResourceAdapter();
      }
      @Override
      public Adapter caseMenuResource(MenuResource object)
      {
        return createMenuResourceAdapter();
      }
      @Override
      public Adapter caseValueResource(ValueResource object)
      {
        return createValueResourceAdapter();
      }
      @Override
      public Adapter caseStringValueResource(StringValueResource object)
      {
        return createStringValueResourceAdapter();
      }
      @Override
      public Adapter caseIntegerValueResource(IntegerValueResource object)
      {
        return createIntegerValueResourceAdapter();
      }
      @Override
      public Adapter caseBooleanValueResource(BooleanValueResource object)
      {
        return createBooleanValueResourceAdapter();
      }
      @Override
      public Adapter caseColorValueResource(ColorValueResource object)
      {
        return createColorValueResourceAdapter();
      }
      @Override
      public Adapter caseDimensionValueResource(DimensionValueResource object)
      {
        return createDimensionValueResourceAdapter();
      }
      @Override
      public Adapter caseDrawableResource(DrawableResource object)
      {
        return createDrawableResourceAdapter();
      }
      @Override
      public Adapter caseBitmapDrawableResource(BitmapDrawableResource object)
      {
        return createBitmapDrawableResourceAdapter();
      }
      @Override
      public Adapter caseTransitionDrawableResource(TransitionDrawableResource object)
      {
        return createTransitionDrawableResourceAdapter();
      }
      @Override
      public Adapter caseAnimationResource(AnimationResource object)
      {
        return createAnimationResourceAdapter();
      }
      @Override
      public Adapter caseLayout(Layout object)
      {
        return createLayoutAdapter();
      }
      @Override
      public Adapter caseWidget(Widget object)
      {
        return createWidgetAdapter();
      }
      @Override
      public Adapter caseGenericWidget(GenericWidget object)
      {
        return createGenericWidgetAdapter();
      }
      @Override
      public Adapter caseTextView(TextView object)
      {
        return createTextViewAdapter();
      }
      @Override
      public Adapter caseButton(Button object)
      {
        return createButtonAdapter();
      }
      @Override
      public Adapter caseImageButton(ImageButton object)
      {
        return createImageButtonAdapter();
      }
      @Override
      public Adapter caseLink(Link object)
      {
        return createLinkAdapter();
      }
      @Override
      public Adapter caseSpinner(Spinner object)
      {
        return createSpinnerAdapter();
      }
      @Override
      public Adapter caseEditText(EditText object)
      {
        return createEditTextAdapter();
      }
      @Override
      public Adapter caseActivity(Activity object)
      {
        return createActivityAdapter();
      }
      @Override
      public Adapter caseGenericActivity(GenericActivity object)
      {
        return createGenericActivityAdapter();
      }
      @Override
      public Adapter caseListActivity(ListActivity object)
      {
        return createListActivityAdapter();
      }
      @Override
      public Adapter caseTabActivity(TabActivity object)
      {
        return createTabActivityAdapter();
      }
      @Override
      public Adapter caseTab(Tab object)
      {
        return createTabAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseGenericAction(GenericAction object)
      {
        return createGenericActionAdapter();
      }
      @Override
      public Adapter caseGoToURLAction(GoToURLAction object)
      {
        return createGoToURLActionAdapter();
      }
      @Override
      public Adapter caseShowLayoutAction(ShowLayoutAction object)
      {
        return createShowLayoutActionAdapter();
      }
      @Override
      public Adapter caseInvokeActivityAction(InvokeActivityAction object)
      {
        return createInvokeActivityActionAdapter();
      }
      @Override
      public Adapter caseLoadResourceAction(LoadResourceAction object)
      {
        return createLoadResourceActionAdapter();
      }
      @Override
      public Adapter casePropertyValue(PropertyValue object)
      {
        return createPropertyValueAdapter();
      }
      @Override
      public Adapter caseStringPropertyValue(StringPropertyValue object)
      {
        return createStringPropertyValueAdapter();
      }
      @Override
      public Adapter caseIntegerPropertyValue(IntegerPropertyValue object)
      {
        return createIntegerPropertyValueAdapter();
      }
      @Override
      public Adapter caseBooleanPropertyValue(BooleanPropertyValue object)
      {
        return createBooleanPropertyValueAdapter();
      }
      @Override
      public Adapter caseColorPropertyValue(ColorPropertyValue object)
      {
        return createColorPropertyValueAdapter();
      }
      @Override
      public Adapter caseDimensionPropertyValue(DimensionPropertyValue object)
      {
        return createDimensionPropertyValueAdapter();
      }
      @Override
      public Adapter caseDrawableResourcePropertyValue(DrawableResourcePropertyValue object)
      {
        return createDrawableResourcePropertyValueAdapter();
      }
      @Override
      public Adapter caseDrawableImageResourcePropertyValue(DrawableImageResourcePropertyValue object)
      {
        return createDrawableImageResourcePropertyValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Application
   * @generated
   */
  public Adapter createApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ManifestFile <em>Manifest File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ManifestFile
   * @generated
   */
  public Adapter createManifestFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericResource <em>Generic Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GenericResource
   * @generated
   */
  public Adapter createGenericResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.MenuResource <em>Menu Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.MenuResource
   * @generated
   */
  public Adapter createMenuResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ValueResource <em>Value Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ValueResource
   * @generated
   */
  public Adapter createValueResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.StringValueResource <em>String Value Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.StringValueResource
   * @generated
   */
  public Adapter createStringValueResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.IntegerValueResource <em>Integer Value Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.IntegerValueResource
   * @generated
   */
  public Adapter createIntegerValueResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.BooleanValueResource <em>Boolean Value Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.BooleanValueResource
   * @generated
   */
  public Adapter createBooleanValueResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ColorValueResource <em>Color Value Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ColorValueResource
   * @generated
   */
  public Adapter createColorValueResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionValueResource <em>Dimension Value Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DimensionValueResource
   * @generated
   */
  public Adapter createDimensionValueResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableResource <em>Drawable Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DrawableResource
   * @generated
   */
  public Adapter createDrawableResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.BitmapDrawableResource <em>Bitmap Drawable Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.BitmapDrawableResource
   * @generated
   */
  public Adapter createBitmapDrawableResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.TransitionDrawableResource <em>Transition Drawable Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TransitionDrawableResource
   * @generated
   */
  public Adapter createTransitionDrawableResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.AnimationResource <em>Animation Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.AnimationResource
   * @generated
   */
  public Adapter createAnimationResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Layout
   * @generated
   */
  public Adapter createLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget
   * @generated
   */
  public Adapter createWidgetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericWidget <em>Generic Widget</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GenericWidget
   * @generated
   */
  public Adapter createGenericWidgetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.TextView <em>Text View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TextView
   * @generated
   */
  public Adapter createTextViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Button
   * @generated
   */
  public Adapter createButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ImageButton <em>Image Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ImageButton
   * @generated
   */
  public Adapter createImageButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Link
   * @generated
   */
  public Adapter createLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Spinner <em>Spinner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Spinner
   * @generated
   */
  public Adapter createSpinnerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText <em>Edit Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.EditText
   * @generated
   */
  public Adapter createEditTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Activity
   * @generated
   */
  public Adapter createActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericActivity <em>Generic Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GenericActivity
   * @generated
   */
  public Adapter createGenericActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ListActivity <em>List Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ListActivity
   * @generated
   */
  public Adapter createListActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.TabActivity <em>Tab Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TabActivity
   * @generated
   */
  public Adapter createTabActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Tab <em>Tab</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Tab
   * @generated
   */
  public Adapter createTabAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericAction <em>Generic Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GenericAction
   * @generated
   */
  public Adapter createGenericActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.GoToURLAction <em>Go To URL Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GoToURLAction
   * @generated
   */
  public Adapter createGoToURLActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ShowLayoutAction <em>Show Layout Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ShowLayoutAction
   * @generated
   */
  public Adapter createShowLayoutActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.InvokeActivityAction <em>Invoke Activity Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.InvokeActivityAction
   * @generated
   */
  public Adapter createInvokeActivityActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction <em>Load Resource Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction
   * @generated
   */
  public Adapter createLoadResourceActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.PropertyValue
   * @generated
   */
  public Adapter createPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.StringPropertyValue <em>String Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.StringPropertyValue
   * @generated
   */
  public Adapter createStringPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.IntegerPropertyValue <em>Integer Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.IntegerPropertyValue
   * @generated
   */
  public Adapter createIntegerPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue <em>Boolean Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue
   * @generated
   */
  public Adapter createBooleanPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ColorPropertyValue <em>Color Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ColorPropertyValue
   * @generated
   */
  public Adapter createColorPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue <em>Dimension Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue
   * @generated
   */
  public Adapter createDimensionPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableResourcePropertyValue <em>Drawable Resource Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DrawableResourcePropertyValue
   * @generated
   */
  public Adapter createDrawableResourcePropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue <em>Drawable Image Resource Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue
   * @generated
   */
  public Adapter createDrawableImageResourcePropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DroidAdapterFactory
