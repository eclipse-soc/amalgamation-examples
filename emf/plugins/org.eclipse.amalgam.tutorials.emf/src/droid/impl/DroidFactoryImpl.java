/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.impl;

import droid.*;

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
public class DroidFactoryImpl extends EFactoryImpl implements DroidFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DroidFactory init() {
		try {
			DroidFactory theDroidFactory = (DroidFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/amalgam/tutorials/xtext/Droid"); 
			if (theDroidFactory != null) {
				return theDroidFactory;
			}
		}
		catch (Exception exception) {
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
	public DroidFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DroidPackage.APPLICATION: return createApplication();
			case DroidPackage.APPLICATION_USES_SDK: return createApplicationUsesSDK();
			case DroidPackage.RESOURCE: return createResource();
			case DroidPackage.LAYOUT: return createLayout();
			case DroidPackage.ABSTRACT_ACTIVITY: return createAbstractActivity();
			case DroidPackage.ACTIVITY: return createActivity();
			case DroidPackage.GENERIC_ACTIVITY: return createGenericActivity();
			case DroidPackage.VIEW_COLLECTION: return createViewCollection();
			case DroidPackage.LIST_ACTIVITY: return createListActivity();
			case DroidPackage.TAB_ACTIVITY: return createTabActivity();
			case DroidPackage.TAB: return createTab();
			case DroidPackage.ACTION_SET: return createActionSet();
			case DroidPackage.ACTION: return createAction();
			case DroidPackage.GO_TO_URL_ACTION: return createGoToURLAction();
			case DroidPackage.SHOW_LAYOUT_ACTION: return createShowLayoutAction();
			case DroidPackage.INVOKE_ACTIVITY_ACTION: return createInvokeActivityAction();
			case DroidPackage.ABSTRACT_LINEAR_LAYOUT: return createAbstractLinearLayout();
			case DroidPackage.ABSTRACT_VIEW: return createAbstractView();
			case DroidPackage.VIEW: return createView();
			case DroidPackage.LINEAR_LAYOUT: return createLinearLayout();
			case DroidPackage.RELATIVE_LAYOUT: return createRelativeLayout();
			case DroidPackage.TAB_HOST: return createTabHost();
			case DroidPackage.TAB_WIDGET: return createTabWidget();
			case DroidPackage.FRAME_LAYOUT: return createFrameLayout();
			case DroidPackage.LAYOUT_PARAMS: return createLayoutParams();
			case DroidPackage.WIDGET: return createWidget();
			case DroidPackage.ABSTRACT_TEXT_VIEW: return createAbstractTextView();
			case DroidPackage.TEXT_VIEW: return createTextView();
			case DroidPackage.IMAGE_VIEW: return createImageView();
			case DroidPackage.BUTTON: return createButton();
			case DroidPackage.SPINNER: return createSpinner();
			case DroidPackage.EDIT_TEXT: return createEditText();
			case DroidPackage.VALUE_ACCESS: return createValueAccess();
			case DroidPackage.STRING_VA: return createStringVA();
			case DroidPackage.INTEGER_VA: return createIntegerVA();
			case DroidPackage.BOOLEAN_VA: return createBooleanVA();
			case DroidPackage.COLOR_VA: return createColorVA();
			case DroidPackage.DIMENSION_VA: return createDimensionVA();
			case DroidPackage.LAYOUT_DIMENSION_VA: return createLayoutDimensionVA();
			case DroidPackage.ANY_DRAWABLE_VA: return createAnyDrawableVA();
			case DroidPackage.DRAWABLE_VA: return createDrawableVA();
			case DroidPackage.ANIMATION_VA: return createAnimationVA();
			case DroidPackage.INTERPOLATOR_VA: return createInterpolatorVA();
			case DroidPackage.VALUE_DEFINITION: return createValueDefinition();
			case DroidPackage.STRING_VD: return createStringVD();
			case DroidPackage.INTEGER_VD: return createIntegerVD();
			case DroidPackage.BOOLEAN_VD: return createBooleanVD();
			case DroidPackage.COLOR_VD: return createColorVD();
			case DroidPackage.DIMENSION_VD: return createDimensionVD();
			case DroidPackage.VALUE_RESOURCE: return createValueResource();
			case DroidPackage.STRING_RESOURCE: return createStringResource();
			case DroidPackage.INTEGER_RESOURCE: return createIntegerResource();
			case DroidPackage.BOOLEAN_RESOURCE: return createBooleanResource();
			case DroidPackage.COLOR_RESOURCE: return createColorResource();
			case DroidPackage.DIMENSION_RESOURCE: return createDimensionResource();
			case DroidPackage.ARRAY_RESOURCE: return createArrayResource();
			case DroidPackage.INTEGER_ARRAY_RESOURCE: return createIntegerArrayResource();
			case DroidPackage.STRING_ARRAY_RESOURCE: return createStringArrayResource();
			case DroidPackage.TYPED_ARRAY_RESOURCE: return createTypedArrayResource();
			case DroidPackage.DRAWABLE_RESOURCE: return createDrawableResource();
			case DroidPackage.BITMAP_DRAWABLE_RESOURCE: return createBitmapDrawableResource();
			case DroidPackage.TRANSITION_DRAWABLE_RESOURCE: return createTransitionDrawableResource();
			case DroidPackage.MENU_RESOURCE: return createMenuResource();
			case DroidPackage.MENU_ITEM: return createMenuItem();
			case DroidPackage.MENU_ITEM_GROUP: return createMenuItemGroup();
			case DroidPackage.SUB_MENU: return createSubMenu();
			case DroidPackage.ANIMATION_RESOURCE: return createAnimationResource();
			case DroidPackage.FRAME_ANIMATION_ELEMENT: return createFrameAnimationElement();
			case DroidPackage.TERMINAL_ANIMATION_ELEMENTS: return createTerminalAnimationElements();
			case DroidPackage.TERMINAL_ANIMATION_SET: return createTerminalAnimationSet();
			case DroidPackage.ALPHA_ANIMATION: return createAlphaAnimation();
			case DroidPackage.SCALE_ANIMATION: return createScaleAnimation();
			case DroidPackage.TRANSLATE_ANIMATION: return createTranslateAnimation();
			case DroidPackage.ROTATE_ANIMATION: return createRotateAnimation();
			case DroidPackage.TWEEN_ANIMATION_RESOURCE: return createTweenAnimationResource();
			case DroidPackage.FRAME_ANIMATION_RESOURCE: return createFrameAnimationResource();
			case DroidPackage.ANIMATION_FRAME: return createAnimationFrame();
			case DroidPackage.ABSTRACT_RESOURCE_ACCESS: return createAbstractResourceAccess();
			case DroidPackage.RESOURCE_ACCESS: return createResourceAccess();
			case DroidPackage.STRING_RA: return createStringRA();
			case DroidPackage.INTEGER_RA: return createIntegerRA();
			case DroidPackage.BOOLEAN_RA: return createBooleanRA();
			case DroidPackage.COLOR_RA: return createColorRA();
			case DroidPackage.DIMENSION_RA: return createDimensionRA();
			case DroidPackage.DRAWABLE_RA: return createDrawableRA();
			case DroidPackage.ANIMATION_RA: return createAnimationRA();
			case DroidPackage.INTERPOLATOR_RA: return createInterpolatorRA();
			case DroidPackage.CHECK_BOX: return createCheckBox();
			case DroidPackage.RADIO_BUTTON: return createRadioButton();
			case DroidPackage.RADIO_GROUP: return createRadioGroup();
			case DroidPackage.MENU_GROUP: return createMenuGroup();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DroidPackage.BUILT_IN_PERMISSION_TYPE:
				return createBuiltInPermissionTypeFromString(eDataType, initialValue);
			case DroidPackage.INTERPOLATORS_KIND:
				return createInterpolatorsKindFromString(eDataType, initialValue);
			case DroidPackage.LAYOUT_DIMENSION_KIND:
				return createLayoutDimensionKindFromString(eDataType, initialValue);
			case DroidPackage.LAYOUT_GRAVITY_KIND:
				return createLayoutGravityKindFromString(eDataType, initialValue);
			case DroidPackage.LAYOUT_ORIENTATION_KIND:
				return createLayoutOrientationKindFromString(eDataType, initialValue);
			case DroidPackage.LAYOUT_VISIBILITY_KIND:
				return createLayoutVisibilityKindFromString(eDataType, initialValue);
			case DroidPackage.TYPEFACE_KIND:
				return createTypefaceKindFromString(eDataType, initialValue);
			case DroidPackage.TEXT_STYLE_KIND:
				return createTextStyleKindFromString(eDataType, initialValue);
			case DroidPackage.AUTO_LINK_KIND:
				return createAutoLinkKindFromString(eDataType, initialValue);
			case DroidPackage.CAPITALIZE_KIND:
				return createCapitalizeKindFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DroidPackage.BUILT_IN_PERMISSION_TYPE:
				return convertBuiltInPermissionTypeToString(eDataType, instanceValue);
			case DroidPackage.INTERPOLATORS_KIND:
				return convertInterpolatorsKindToString(eDataType, instanceValue);
			case DroidPackage.LAYOUT_DIMENSION_KIND:
				return convertLayoutDimensionKindToString(eDataType, instanceValue);
			case DroidPackage.LAYOUT_GRAVITY_KIND:
				return convertLayoutGravityKindToString(eDataType, instanceValue);
			case DroidPackage.LAYOUT_ORIENTATION_KIND:
				return convertLayoutOrientationKindToString(eDataType, instanceValue);
			case DroidPackage.LAYOUT_VISIBILITY_KIND:
				return convertLayoutVisibilityKindToString(eDataType, instanceValue);
			case DroidPackage.TYPEFACE_KIND:
				return convertTypefaceKindToString(eDataType, instanceValue);
			case DroidPackage.TEXT_STYLE_KIND:
				return convertTextStyleKindToString(eDataType, instanceValue);
			case DroidPackage.AUTO_LINK_KIND:
				return convertAutoLinkKindToString(eDataType, instanceValue);
			case DroidPackage.CAPITALIZE_KIND:
				return convertCapitalizeKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationUsesSDK createApplicationUsesSDK() {
		ApplicationUsesSDKImpl applicationUsesSDK = new ApplicationUsesSDKImpl();
		return applicationUsesSDK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractActivity createAbstractActivity() {
		AbstractActivityImpl abstractActivity = new AbstractActivityImpl();
		return abstractActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericActivity createGenericActivity() {
		GenericActivityImpl genericActivity = new GenericActivityImpl();
		return genericActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewCollection createViewCollection() {
		ViewCollectionImpl viewCollection = new ViewCollectionImpl();
		return viewCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListActivity createListActivity() {
		ListActivityImpl listActivity = new ListActivityImpl();
		return listActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabActivity createTabActivity() {
		TabActivityImpl tabActivity = new TabActivityImpl();
		return tabActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tab createTab() {
		TabImpl tab = new TabImpl();
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSet createActionSet() {
		ActionSetImpl actionSet = new ActionSetImpl();
		return actionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoToURLAction createGoToURLAction() {
		GoToURLActionImpl goToURLAction = new GoToURLActionImpl();
		return goToURLAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowLayoutAction createShowLayoutAction() {
		ShowLayoutActionImpl showLayoutAction = new ShowLayoutActionImpl();
		return showLayoutAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokeActivityAction createInvokeActivityAction() {
		InvokeActivityActionImpl invokeActivityAction = new InvokeActivityActionImpl();
		return invokeActivityAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractLinearLayout createAbstractLinearLayout() {
		AbstractLinearLayoutImpl abstractLinearLayout = new AbstractLinearLayoutImpl();
		return abstractLinearLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractView createAbstractView() {
		AbstractViewImpl abstractView = new AbstractViewImpl();
		return abstractView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearLayout createLinearLayout() {
		LinearLayoutImpl linearLayout = new LinearLayoutImpl();
		return linearLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeLayout createRelativeLayout() {
		RelativeLayoutImpl relativeLayout = new RelativeLayoutImpl();
		return relativeLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabHost createTabHost() {
		TabHostImpl tabHost = new TabHostImpl();
		return tabHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabWidget createTabWidget() {
		TabWidgetImpl tabWidget = new TabWidgetImpl();
		return tabWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameLayout createFrameLayout() {
		FrameLayoutImpl frameLayout = new FrameLayoutImpl();
		return frameLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutParams createLayoutParams() {
		LayoutParamsImpl layoutParams = new LayoutParamsImpl();
		return layoutParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTextView createAbstractTextView() {
		AbstractTextViewImpl abstractTextView = new AbstractTextViewImpl();
		return abstractTextView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextView createTextView() {
		TextViewImpl textView = new TextViewImpl();
		return textView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageView createImageView() {
		ImageViewImpl imageView = new ImageViewImpl();
		return imageView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spinner createSpinner() {
		SpinnerImpl spinner = new SpinnerImpl();
		return spinner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditText createEditText() {
		EditTextImpl editText = new EditTextImpl();
		return editText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAccess createValueAccess() {
		ValueAccessImpl valueAccess = new ValueAccessImpl();
		return valueAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVA createStringVA() {
		StringVAImpl stringVA = new StringVAImpl();
		return stringVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVA createIntegerVA() {
		IntegerVAImpl integerVA = new IntegerVAImpl();
		return integerVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA createBooleanVA() {
		BooleanVAImpl booleanVA = new BooleanVAImpl();
		return booleanVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorVA createColorVA() {
		ColorVAImpl colorVA = new ColorVAImpl();
		return colorVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA createDimensionVA() {
		DimensionVAImpl dimensionVA = new DimensionVAImpl();
		return dimensionVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutDimensionVA createLayoutDimensionVA() {
		LayoutDimensionVAImpl layoutDimensionVA = new LayoutDimensionVAImpl();
		return layoutDimensionVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyDrawableVA createAnyDrawableVA() {
		AnyDrawableVAImpl anyDrawableVA = new AnyDrawableVAImpl();
		return anyDrawableVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawableVA createDrawableVA() {
		DrawableVAImpl drawableVA = new DrawableVAImpl();
		return drawableVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationVA createAnimationVA() {
		AnimationVAImpl animationVA = new AnimationVAImpl();
		return animationVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolatorVA createInterpolatorVA() {
		InterpolatorVAImpl interpolatorVA = new InterpolatorVAImpl();
		return interpolatorVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueDefinition createValueDefinition() {
		ValueDefinitionImpl valueDefinition = new ValueDefinitionImpl();
		return valueDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVD createStringVD() {
		StringVDImpl stringVD = new StringVDImpl();
		return stringVD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVD createIntegerVD() {
		IntegerVDImpl integerVD = new IntegerVDImpl();
		return integerVD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVD createBooleanVD() {
		BooleanVDImpl booleanVD = new BooleanVDImpl();
		return booleanVD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorVD createColorVD() {
		ColorVDImpl colorVD = new ColorVDImpl();
		return colorVD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVD createDimensionVD() {
		DimensionVDImpl dimensionVD = new DimensionVDImpl();
		return dimensionVD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueResource createValueResource() {
		ValueResourceImpl valueResource = new ValueResourceImpl();
		return valueResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringResource createStringResource() {
		StringResourceImpl stringResource = new StringResourceImpl();
		return stringResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerResource createIntegerResource() {
		IntegerResourceImpl integerResource = new IntegerResourceImpl();
		return integerResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanResource createBooleanResource() {
		BooleanResourceImpl booleanResource = new BooleanResourceImpl();
		return booleanResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorResource createColorResource() {
		ColorResourceImpl colorResource = new ColorResourceImpl();
		return colorResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionResource createDimensionResource() {
		DimensionResourceImpl dimensionResource = new DimensionResourceImpl();
		return dimensionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayResource createArrayResource() {
		ArrayResourceImpl arrayResource = new ArrayResourceImpl();
		return arrayResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerArrayResource createIntegerArrayResource() {
		IntegerArrayResourceImpl integerArrayResource = new IntegerArrayResourceImpl();
		return integerArrayResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringArrayResource createStringArrayResource() {
		StringArrayResourceImpl stringArrayResource = new StringArrayResourceImpl();
		return stringArrayResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedArrayResource createTypedArrayResource() {
		TypedArrayResourceImpl typedArrayResource = new TypedArrayResourceImpl();
		return typedArrayResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawableResource createDrawableResource() {
		DrawableResourceImpl drawableResource = new DrawableResourceImpl();
		return drawableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitmapDrawableResource createBitmapDrawableResource() {
		BitmapDrawableResourceImpl bitmapDrawableResource = new BitmapDrawableResourceImpl();
		return bitmapDrawableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionDrawableResource createTransitionDrawableResource() {
		TransitionDrawableResourceImpl transitionDrawableResource = new TransitionDrawableResourceImpl();
		return transitionDrawableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuResource createMenuResource() {
		MenuResourceImpl menuResource = new MenuResourceImpl();
		return menuResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItem createMenuItem() {
		MenuItemImpl menuItem = new MenuItemImpl();
		return menuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItemGroup createMenuItemGroup() {
		MenuItemGroupImpl menuItemGroup = new MenuItemGroupImpl();
		return menuItemGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubMenu createSubMenu() {
		SubMenuImpl subMenu = new SubMenuImpl();
		return subMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationResource createAnimationResource() {
		AnimationResourceImpl animationResource = new AnimationResourceImpl();
		return animationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameAnimationElement createFrameAnimationElement() {
		FrameAnimationElementImpl frameAnimationElement = new FrameAnimationElementImpl();
		return frameAnimationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalAnimationElements createTerminalAnimationElements() {
		TerminalAnimationElementsImpl terminalAnimationElements = new TerminalAnimationElementsImpl();
		return terminalAnimationElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalAnimationSet createTerminalAnimationSet() {
		TerminalAnimationSetImpl terminalAnimationSet = new TerminalAnimationSetImpl();
		return terminalAnimationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaAnimation createAlphaAnimation() {
		AlphaAnimationImpl alphaAnimation = new AlphaAnimationImpl();
		return alphaAnimation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleAnimation createScaleAnimation() {
		ScaleAnimationImpl scaleAnimation = new ScaleAnimationImpl();
		return scaleAnimation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslateAnimation createTranslateAnimation() {
		TranslateAnimationImpl translateAnimation = new TranslateAnimationImpl();
		return translateAnimation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotateAnimation createRotateAnimation() {
		RotateAnimationImpl rotateAnimation = new RotateAnimationImpl();
		return rotateAnimation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TweenAnimationResource createTweenAnimationResource() {
		TweenAnimationResourceImpl tweenAnimationResource = new TweenAnimationResourceImpl();
		return tweenAnimationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameAnimationResource createFrameAnimationResource() {
		FrameAnimationResourceImpl frameAnimationResource = new FrameAnimationResourceImpl();
		return frameAnimationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationFrame createAnimationFrame() {
		AnimationFrameImpl animationFrame = new AnimationFrameImpl();
		return animationFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractResourceAccess createAbstractResourceAccess() {
		AbstractResourceAccessImpl abstractResourceAccess = new AbstractResourceAccessImpl();
		return abstractResourceAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAccess createResourceAccess() {
		ResourceAccessImpl resourceAccess = new ResourceAccessImpl();
		return resourceAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringRA createStringRA() {
		StringRAImpl stringRA = new StringRAImpl();
		return stringRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerRA createIntegerRA() {
		IntegerRAImpl integerRA = new IntegerRAImpl();
		return integerRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanRA createBooleanRA() {
		BooleanRAImpl booleanRA = new BooleanRAImpl();
		return booleanRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorRA createColorRA() {
		ColorRAImpl colorRA = new ColorRAImpl();
		return colorRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionRA createDimensionRA() {
		DimensionRAImpl dimensionRA = new DimensionRAImpl();
		return dimensionRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawableRA createDrawableRA() {
		DrawableRAImpl drawableRA = new DrawableRAImpl();
		return drawableRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationRA createAnimationRA() {
		AnimationRAImpl animationRA = new AnimationRAImpl();
		return animationRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolatorRA createInterpolatorRA() {
		InterpolatorRAImpl interpolatorRA = new InterpolatorRAImpl();
		return interpolatorRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioGroup createRadioGroup() {
		RadioGroupImpl radioGroup = new RadioGroupImpl();
		return radioGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuGroup createMenuGroup() {
		MenuGroupImpl menuGroup = new MenuGroupImpl();
		return menuGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInPermissionType createBuiltInPermissionTypeFromString(EDataType eDataType, String initialValue) {
		BuiltInPermissionType result = BuiltInPermissionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuiltInPermissionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolatorsKind createInterpolatorsKindFromString(EDataType eDataType, String initialValue) {
		InterpolatorsKind result = InterpolatorsKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterpolatorsKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutDimensionKind createLayoutDimensionKindFromString(EDataType eDataType, String initialValue) {
		LayoutDimensionKind result = LayoutDimensionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutDimensionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutGravityKind createLayoutGravityKindFromString(EDataType eDataType, String initialValue) {
		LayoutGravityKind result = LayoutGravityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutGravityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutOrientationKind createLayoutOrientationKindFromString(EDataType eDataType, String initialValue) {
		LayoutOrientationKind result = LayoutOrientationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutOrientationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutVisibilityKind createLayoutVisibilityKindFromString(EDataType eDataType, String initialValue) {
		LayoutVisibilityKind result = LayoutVisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypefaceKind createTypefaceKindFromString(EDataType eDataType, String initialValue) {
		TypefaceKind result = TypefaceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypefaceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextStyleKind createTextStyleKindFromString(EDataType eDataType, String initialValue) {
		TextStyleKind result = TextStyleKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextStyleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoLinkKind createAutoLinkKindFromString(EDataType eDataType, String initialValue) {
		AutoLinkKind result = AutoLinkKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAutoLinkKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapitalizeKind createCapitalizeKindFromString(EDataType eDataType, String initialValue) {
		CapitalizeKind result = CapitalizeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapitalizeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroidPackage getDroidPackage() {
		return (DroidPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DroidPackage getPackage() {
		return DroidPackage.eINSTANCE;
	}

} //DroidFactoryImpl
