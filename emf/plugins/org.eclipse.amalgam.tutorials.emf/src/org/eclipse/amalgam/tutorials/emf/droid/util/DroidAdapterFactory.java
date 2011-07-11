/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.util;

import org.eclipse.amalgam.tutorials.emf.droid.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage
 * @generated
 */
public class DroidAdapterFactory extends AdapterFactoryImpl {
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
	public DroidAdapterFactory() {
		if (modelPackage == null) {
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
		new DroidSwitch<Adapter>() {
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseApplicationUsesSDK(ApplicationUsesSDK object) {
				return createApplicationUsesSDKAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseLayout(Layout object) {
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseAbstractActivity(AbstractActivity object) {
				return createAbstractActivityAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseGenericActivity(GenericActivity object) {
				return createGenericActivityAdapter();
			}
			@Override
			public Adapter caseViewCollection(ViewCollection object) {
				return createViewCollectionAdapter();
			}
			@Override
			public Adapter caseListActivity(ListActivity object) {
				return createListActivityAdapter();
			}
			@Override
			public Adapter caseTabActivity(TabActivity object) {
				return createTabActivityAdapter();
			}
			@Override
			public Adapter caseTab(Tab object) {
				return createTabAdapter();
			}
			@Override
			public Adapter caseActionSet(ActionSet object) {
				return createActionSetAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseGoToURLAction(GoToURLAction object) {
				return createGoToURLActionAdapter();
			}
			@Override
			public Adapter caseShowLayoutAction(ShowLayoutAction object) {
				return createShowLayoutActionAdapter();
			}
			@Override
			public Adapter caseInvokeActivityAction(InvokeActivityAction object) {
				return createInvokeActivityActionAdapter();
			}
			@Override
			public Adapter caseAbstractLinearLayout(AbstractLinearLayout object) {
				return createAbstractLinearLayoutAdapter();
			}
			@Override
			public Adapter caseAbstractView(AbstractView object) {
				return createAbstractViewAdapter();
			}
			@Override
			public Adapter caseView(View object) {
				return createViewAdapter();
			}
			@Override
			public Adapter caseLinearLayout(LinearLayout object) {
				return createLinearLayoutAdapter();
			}
			@Override
			public Adapter caseRelativeLayout(RelativeLayout object) {
				return createRelativeLayoutAdapter();
			}
			@Override
			public Adapter caseTabHost(TabHost object) {
				return createTabHostAdapter();
			}
			@Override
			public Adapter caseTabWidget(TabWidget object) {
				return createTabWidgetAdapter();
			}
			@Override
			public Adapter caseFrameLayout(FrameLayout object) {
				return createFrameLayoutAdapter();
			}
			@Override
			public Adapter caseLayoutParams(LayoutParams object) {
				return createLayoutParamsAdapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter caseAbstractTextView(AbstractTextView object) {
				return createAbstractTextViewAdapter();
			}
			@Override
			public Adapter caseTextView(TextView object) {
				return createTextViewAdapter();
			}
			@Override
			public Adapter caseImageView(ImageView object) {
				return createImageViewAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseSpinner(Spinner object) {
				return createSpinnerAdapter();
			}
			@Override
			public Adapter caseEditText(EditText object) {
				return createEditTextAdapter();
			}
			@Override
			public Adapter caseValueAccess(ValueAccess object) {
				return createValueAccessAdapter();
			}
			@Override
			public Adapter caseStringVA(StringVA object) {
				return createStringVAAdapter();
			}
			@Override
			public Adapter caseIntegerVA(IntegerVA object) {
				return createIntegerVAAdapter();
			}
			@Override
			public Adapter caseBooleanVA(BooleanVA object) {
				return createBooleanVAAdapter();
			}
			@Override
			public Adapter caseColorVA(ColorVA object) {
				return createColorVAAdapter();
			}
			@Override
			public Adapter caseDimensionVA(DimensionVA object) {
				return createDimensionVAAdapter();
			}
			@Override
			public Adapter caseLayoutDimensionVA(LayoutDimensionVA object) {
				return createLayoutDimensionVAAdapter();
			}
			@Override
			public Adapter caseAnyDrawableVA(AnyDrawableVA object) {
				return createAnyDrawableVAAdapter();
			}
			@Override
			public Adapter caseDrawableVA(DrawableVA object) {
				return createDrawableVAAdapter();
			}
			@Override
			public Adapter caseAnimationVA(AnimationVA object) {
				return createAnimationVAAdapter();
			}
			@Override
			public Adapter caseInterpolatorVA(InterpolatorVA object) {
				return createInterpolatorVAAdapter();
			}
			@Override
			public Adapter caseValueDefinition(ValueDefinition object) {
				return createValueDefinitionAdapter();
			}
			@Override
			public Adapter caseStringVD(StringVD object) {
				return createStringVDAdapter();
			}
			@Override
			public Adapter caseIntegerVD(IntegerVD object) {
				return createIntegerVDAdapter();
			}
			@Override
			public Adapter caseBooleanVD(BooleanVD object) {
				return createBooleanVDAdapter();
			}
			@Override
			public Adapter caseColorVD(ColorVD object) {
				return createColorVDAdapter();
			}
			@Override
			public Adapter caseDimensionVD(DimensionVD object) {
				return createDimensionVDAdapter();
			}
			@Override
			public Adapter caseValueResource(ValueResource object) {
				return createValueResourceAdapter();
			}
			@Override
			public Adapter caseStringResource(StringResource object) {
				return createStringResourceAdapter();
			}
			@Override
			public Adapter caseIntegerResource(IntegerResource object) {
				return createIntegerResourceAdapter();
			}
			@Override
			public Adapter caseBooleanResource(BooleanResource object) {
				return createBooleanResourceAdapter();
			}
			@Override
			public Adapter caseColorResource(ColorResource object) {
				return createColorResourceAdapter();
			}
			@Override
			public Adapter caseDimensionResource(DimensionResource object) {
				return createDimensionResourceAdapter();
			}
			@Override
			public Adapter caseArrayResource(ArrayResource object) {
				return createArrayResourceAdapter();
			}
			@Override
			public Adapter caseIntegerArrayResource(IntegerArrayResource object) {
				return createIntegerArrayResourceAdapter();
			}
			@Override
			public Adapter caseStringArrayResource(StringArrayResource object) {
				return createStringArrayResourceAdapter();
			}
			@Override
			public Adapter caseTypedArrayResource(TypedArrayResource object) {
				return createTypedArrayResourceAdapter();
			}
			@Override
			public Adapter caseDrawableResource(DrawableResource object) {
				return createDrawableResourceAdapter();
			}
			@Override
			public Adapter caseBitmapDrawableResource(BitmapDrawableResource object) {
				return createBitmapDrawableResourceAdapter();
			}
			@Override
			public Adapter caseTransitionDrawableResource(TransitionDrawableResource object) {
				return createTransitionDrawableResourceAdapter();
			}
			@Override
			public Adapter caseMenuResource(MenuResource object) {
				return createMenuResourceAdapter();
			}
			@Override
			public Adapter caseMenuItem(MenuItem object) {
				return createMenuItemAdapter();
			}
			@Override
			public Adapter caseMenuItemGroup(MenuItemGroup object) {
				return createMenuItemGroupAdapter();
			}
			@Override
			public Adapter caseSubMenu(SubMenu object) {
				return createSubMenuAdapter();
			}
			@Override
			public Adapter caseAnimationResource(AnimationResource object) {
				return createAnimationResourceAdapter();
			}
			@Override
			public Adapter caseFrameAnimationElement(FrameAnimationElement object) {
				return createFrameAnimationElementAdapter();
			}
			@Override
			public Adapter caseTerminalAnimationElements(TerminalAnimationElements object) {
				return createTerminalAnimationElementsAdapter();
			}
			@Override
			public Adapter caseTerminalAnimationSet(TerminalAnimationSet object) {
				return createTerminalAnimationSetAdapter();
			}
			@Override
			public Adapter caseAlphaAnimation(AlphaAnimation object) {
				return createAlphaAnimationAdapter();
			}
			@Override
			public Adapter caseScaleAnimation(ScaleAnimation object) {
				return createScaleAnimationAdapter();
			}
			@Override
			public Adapter caseTranslateAnimation(TranslateAnimation object) {
				return createTranslateAnimationAdapter();
			}
			@Override
			public Adapter caseRotateAnimation(RotateAnimation object) {
				return createRotateAnimationAdapter();
			}
			@Override
			public Adapter caseTweenAnimationResource(TweenAnimationResource object) {
				return createTweenAnimationResourceAdapter();
			}
			@Override
			public Adapter caseFrameAnimationResource(FrameAnimationResource object) {
				return createFrameAnimationResourceAdapter();
			}
			@Override
			public Adapter caseAnimationFrame(AnimationFrame object) {
				return createAnimationFrameAdapter();
			}
			@Override
			public Adapter caseAbstractResourceAccess(AbstractResourceAccess object) {
				return createAbstractResourceAccessAdapter();
			}
			@Override
			public Adapter caseResourceAccess(ResourceAccess object) {
				return createResourceAccessAdapter();
			}
			@Override
			public Adapter caseStringRA(StringRA object) {
				return createStringRAAdapter();
			}
			@Override
			public Adapter caseIntegerRA(IntegerRA object) {
				return createIntegerRAAdapter();
			}
			@Override
			public Adapter caseBooleanRA(BooleanRA object) {
				return createBooleanRAAdapter();
			}
			@Override
			public Adapter caseColorRA(ColorRA object) {
				return createColorRAAdapter();
			}
			@Override
			public Adapter caseDimensionRA(DimensionRA object) {
				return createDimensionRAAdapter();
			}
			@Override
			public Adapter caseDrawableRA(DrawableRA object) {
				return createDrawableRAAdapter();
			}
			@Override
			public Adapter caseAnimationRA(AnimationRA object) {
				return createAnimationRAAdapter();
			}
			@Override
			public Adapter caseInterpolatorRA(InterpolatorRA object) {
				return createInterpolatorRAAdapter();
			}
			@Override
			public Adapter caseCheckBox(CheckBox object) {
				return createCheckBoxAdapter();
			}
			@Override
			public Adapter caseRadioButton(RadioButton object) {
				return createRadioButtonAdapter();
			}
			@Override
			public Adapter caseRadioGroup(RadioGroup object) {
				return createRadioGroupAdapter();
			}
			@Override
			public Adapter caseMenuGroup(MenuGroup object) {
				return createMenuGroupAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ApplicationUsesSDK <em>Application Uses SDK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ApplicationUsesSDK
	 * @generated
	 */
	public Adapter createApplicationUsesSDKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractActivity <em>Abstract Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractActivity
	 * @generated
	 */
	public Adapter createAbstractActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.GenericActivity <em>Generic Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.GenericActivity
	 * @generated
	 */
	public Adapter createGenericActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ViewCollection <em>View Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ViewCollection
	 * @generated
	 */
	public Adapter createViewCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ListActivity <em>List Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ListActivity
	 * @generated
	 */
	public Adapter createListActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.TabActivity <em>Tab Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabActivity
	 * @generated
	 */
	public Adapter createTabActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Tab
	 * @generated
	 */
	public Adapter createTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ActionSet <em>Action Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ActionSet
	 * @generated
	 */
	public Adapter createActionSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.GoToURLAction <em>Go To URL Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.GoToURLAction
	 * @generated
	 */
	public Adapter createGoToURLActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ShowLayoutAction <em>Show Layout Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ShowLayoutAction
	 * @generated
	 */
	public Adapter createShowLayoutActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.InvokeActivityAction <em>Invoke Activity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.InvokeActivityAction
	 * @generated
	 */
	public Adapter createInvokeActivityActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractLinearLayout <em>Abstract Linear Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractLinearLayout
	 * @generated
	 */
	public Adapter createAbstractLinearLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractView <em>Abstract View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractView
	 * @generated
	 */
	public Adapter createAbstractViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.LinearLayout <em>Linear Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LinearLayout
	 * @generated
	 */
	public Adapter createLinearLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.RelativeLayout <em>Relative Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RelativeLayout
	 * @generated
	 */
	public Adapter createRelativeLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.TabHost <em>Tab Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabHost
	 * @generated
	 */
	public Adapter createTabHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget <em>Tab Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabWidget
	 * @generated
	 */
	public Adapter createTabWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.FrameLayout <em>Frame Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.FrameLayout
	 * @generated
	 */
	public Adapter createFrameLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams <em>Layout Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams
	 * @generated
	 */
	public Adapter createLayoutParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractTextView <em>Abstract Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractTextView
	 * @generated
	 */
	public Adapter createAbstractTextViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView <em>Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView
	 * @generated
	 */
	public Adapter createTextViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ImageView <em>Image View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ImageView
	 * @generated
	 */
	public Adapter createImageViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.Spinner <em>Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Spinner
	 * @generated
	 */
	public Adapter createSpinnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText <em>Edit Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText
	 * @generated
	 */
	public Adapter createEditTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ValueAccess <em>Value Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ValueAccess
	 * @generated
	 */
	public Adapter createValueAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.StringVA <em>String VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringVA
	 * @generated
	 */
	public Adapter createStringVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerVA <em>Integer VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerVA
	 * @generated
	 */
	public Adapter createIntegerVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.BooleanVA <em>Boolean VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BooleanVA
	 * @generated
	 */
	public Adapter createBooleanVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ColorVA <em>Color VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ColorVA
	 * @generated
	 */
	public Adapter createColorVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionVA <em>Dimension VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DimensionVA
	 * @generated
	 */
	public Adapter createDimensionVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutDimensionVA <em>Layout Dimension VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutDimensionVA
	 * @generated
	 */
	public Adapter createLayoutDimensionVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.AnyDrawableVA <em>Any Drawable VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnyDrawableVA
	 * @generated
	 */
	public Adapter createAnyDrawableVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.DrawableVA <em>Drawable VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DrawableVA
	 * @generated
	 */
	public Adapter createDrawableVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationVA <em>Animation VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnimationVA
	 * @generated
	 */
	public Adapter createAnimationVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.InterpolatorVA <em>Interpolator VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.InterpolatorVA
	 * @generated
	 */
	public Adapter createInterpolatorVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ValueDefinition <em>Value Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ValueDefinition
	 * @generated
	 */
	public Adapter createValueDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.StringVD <em>String VD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringVD
	 * @generated
	 */
	public Adapter createStringVDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerVD <em>Integer VD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerVD
	 * @generated
	 */
	public Adapter createIntegerVDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.BooleanVD <em>Boolean VD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BooleanVD
	 * @generated
	 */
	public Adapter createBooleanVDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ColorVD <em>Color VD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ColorVD
	 * @generated
	 */
	public Adapter createColorVDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionVD <em>Dimension VD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DimensionVD
	 * @generated
	 */
	public Adapter createDimensionVDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ValueResource <em>Value Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ValueResource
	 * @generated
	 */
	public Adapter createValueResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.StringResource <em>String Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringResource
	 * @generated
	 */
	public Adapter createStringResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerResource <em>Integer Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerResource
	 * @generated
	 */
	public Adapter createIntegerResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.BooleanResource <em>Boolean Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BooleanResource
	 * @generated
	 */
	public Adapter createBooleanResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ColorResource <em>Color Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ColorResource
	 * @generated
	 */
	public Adapter createColorResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionResource <em>Dimension Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DimensionResource
	 * @generated
	 */
	public Adapter createDimensionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ArrayResource <em>Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ArrayResource
	 * @generated
	 */
	public Adapter createArrayResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerArrayResource <em>Integer Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerArrayResource
	 * @generated
	 */
	public Adapter createIntegerArrayResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.StringArrayResource <em>String Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringArrayResource
	 * @generated
	 */
	public Adapter createStringArrayResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.TypedArrayResource <em>Typed Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TypedArrayResource
	 * @generated
	 */
	public Adapter createTypedArrayResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.DrawableResource <em>Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DrawableResource
	 * @generated
	 */
	public Adapter createDrawableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.BitmapDrawableResource <em>Bitmap Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BitmapDrawableResource
	 * @generated
	 */
	public Adapter createBitmapDrawableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.TransitionDrawableResource <em>Transition Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TransitionDrawableResource
	 * @generated
	 */
	public Adapter createTransitionDrawableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.MenuResource <em>Menu Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.MenuResource
	 * @generated
	 */
	public Adapter createMenuResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.MenuItem
	 * @generated
	 */
	public Adapter createMenuItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.MenuItemGroup <em>Menu Item Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.MenuItemGroup
	 * @generated
	 */
	public Adapter createMenuItemGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.SubMenu <em>Sub Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.SubMenu
	 * @generated
	 */
	public Adapter createSubMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationResource <em>Animation Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnimationResource
	 * @generated
	 */
	public Adapter createAnimationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationElement <em>Frame Animation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationElement
	 * @generated
	 */
	public Adapter createFrameAnimationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationElements <em>Terminal Animation Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationElements
	 * @generated
	 */
	public Adapter createTerminalAnimationElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet <em>Terminal Animation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet
	 * @generated
	 */
	public Adapter createTerminalAnimationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.AlphaAnimation <em>Alpha Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AlphaAnimation
	 * @generated
	 */
	public Adapter createAlphaAnimationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ScaleAnimation <em>Scale Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ScaleAnimation
	 * @generated
	 */
	public Adapter createScaleAnimationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.TranslateAnimation <em>Translate Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TranslateAnimation
	 * @generated
	 */
	public Adapter createTranslateAnimationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.RotateAnimation <em>Rotate Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RotateAnimation
	 * @generated
	 */
	public Adapter createRotateAnimationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.TweenAnimationResource <em>Tween Animation Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TweenAnimationResource
	 * @generated
	 */
	public Adapter createTweenAnimationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationResource <em>Frame Animation Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationResource
	 * @generated
	 */
	public Adapter createFrameAnimationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationFrame <em>Animation Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnimationFrame
	 * @generated
	 */
	public Adapter createAnimationFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractResourceAccess <em>Abstract Resource Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractResourceAccess
	 * @generated
	 */
	public Adapter createAbstractResourceAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ResourceAccess <em>Resource Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ResourceAccess
	 * @generated
	 */
	public Adapter createResourceAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.StringRA <em>String RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringRA
	 * @generated
	 */
	public Adapter createStringRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerRA <em>Integer RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerRA
	 * @generated
	 */
	public Adapter createIntegerRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.BooleanRA <em>Boolean RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BooleanRA
	 * @generated
	 */
	public Adapter createBooleanRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.ColorRA <em>Color RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ColorRA
	 * @generated
	 */
	public Adapter createColorRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionRA <em>Dimension RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DimensionRA
	 * @generated
	 */
	public Adapter createDimensionRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.DrawableRA <em>Drawable RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DrawableRA
	 * @generated
	 */
	public Adapter createDrawableRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationRA <em>Animation RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnimationRA
	 * @generated
	 */
	public Adapter createAnimationRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.InterpolatorRA <em>Interpolator RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.InterpolatorRA
	 * @generated
	 */
	public Adapter createInterpolatorRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox
	 * @generated
	 */
	public Adapter createCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RadioButton
	 * @generated
	 */
	public Adapter createRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.RadioGroup <em>Radio Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RadioGroup
	 * @generated
	 */
	public Adapter createRadioGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amalgam.tutorials.emf.droid.MenuGroup <em>Menu Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.MenuGroup
	 * @generated
	 */
	public Adapter createMenuGroupAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DroidAdapterFactory
