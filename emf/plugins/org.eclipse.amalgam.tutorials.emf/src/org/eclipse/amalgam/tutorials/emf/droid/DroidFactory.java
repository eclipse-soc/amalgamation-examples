/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage
 * @generated
 */
public interface DroidFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DroidFactory eINSTANCE = org.eclipse.amalgam.tutorials.emf.droid.impl.DroidFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Application Uses SDK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Uses SDK</em>'.
	 * @generated
	 */
	ApplicationUsesSDK createApplicationUsesSDK();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layout</em>'.
	 * @generated
	 */
	Layout createLayout();

	/**
	 * Returns a new object of class '<em>Abstract Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Activity</em>'.
	 * @generated
	 */
	AbstractActivity createAbstractActivity();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Generic Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Activity</em>'.
	 * @generated
	 */
	GenericActivity createGenericActivity();

	/**
	 * Returns a new object of class '<em>View Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Collection</em>'.
	 * @generated
	 */
	ViewCollection createViewCollection();

	/**
	 * Returns a new object of class '<em>List Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Activity</em>'.
	 * @generated
	 */
	ListActivity createListActivity();

	/**
	 * Returns a new object of class '<em>Tab Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab Activity</em>'.
	 * @generated
	 */
	TabActivity createTabActivity();

	/**
	 * Returns a new object of class '<em>Tab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab</em>'.
	 * @generated
	 */
	Tab createTab();

	/**
	 * Returns a new object of class '<em>Action Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Set</em>'.
	 * @generated
	 */
	ActionSet createActionSet();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Go To URL Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go To URL Action</em>'.
	 * @generated
	 */
	GoToURLAction createGoToURLAction();

	/**
	 * Returns a new object of class '<em>Show Layout Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Show Layout Action</em>'.
	 * @generated
	 */
	ShowLayoutAction createShowLayoutAction();

	/**
	 * Returns a new object of class '<em>Invoke Activity Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoke Activity Action</em>'.
	 * @generated
	 */
	InvokeActivityAction createInvokeActivityAction();

	/**
	 * Returns a new object of class '<em>Abstract Linear Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Linear Layout</em>'.
	 * @generated
	 */
	AbstractLinearLayout createAbstractLinearLayout();

	/**
	 * Returns a new object of class '<em>Abstract View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract View</em>'.
	 * @generated
	 */
	AbstractView createAbstractView();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Linear Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Layout</em>'.
	 * @generated
	 */
	LinearLayout createLinearLayout();

	/**
	 * Returns a new object of class '<em>Relative Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Layout</em>'.
	 * @generated
	 */
	RelativeLayout createRelativeLayout();

	/**
	 * Returns a new object of class '<em>Tab Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab Host</em>'.
	 * @generated
	 */
	TabHost createTabHost();

	/**
	 * Returns a new object of class '<em>Tab Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab Widget</em>'.
	 * @generated
	 */
	TabWidget createTabWidget();

	/**
	 * Returns a new object of class '<em>Frame Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frame Layout</em>'.
	 * @generated
	 */
	FrameLayout createFrameLayout();

	/**
	 * Returns a new object of class '<em>Layout Params</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layout Params</em>'.
	 * @generated
	 */
	LayoutParams createLayoutParams();

	/**
	 * Returns a new object of class '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget</em>'.
	 * @generated
	 */
	Widget createWidget();

	/**
	 * Returns a new object of class '<em>Abstract Text View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Text View</em>'.
	 * @generated
	 */
	AbstractTextView createAbstractTextView();

	/**
	 * Returns a new object of class '<em>Text View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text View</em>'.
	 * @generated
	 */
	TextView createTextView();

	/**
	 * Returns a new object of class '<em>Image View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image View</em>'.
	 * @generated
	 */
	ImageView createImageView();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Spinner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spinner</em>'.
	 * @generated
	 */
	Spinner createSpinner();

	/**
	 * Returns a new object of class '<em>Edit Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edit Text</em>'.
	 * @generated
	 */
	EditText createEditText();

	/**
	 * Returns a new object of class '<em>Value Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Access</em>'.
	 * @generated
	 */
	ValueAccess createValueAccess();

	/**
	 * Returns a new object of class '<em>String VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String VA</em>'.
	 * @generated
	 */
	StringVA createStringVA();

	/**
	 * Returns a new object of class '<em>Integer VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer VA</em>'.
	 * @generated
	 */
	IntegerVA createIntegerVA();

	/**
	 * Returns a new object of class '<em>Boolean VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean VA</em>'.
	 * @generated
	 */
	BooleanVA createBooleanVA();

	/**
	 * Returns a new object of class '<em>Color VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color VA</em>'.
	 * @generated
	 */
	ColorVA createColorVA();

	/**
	 * Returns a new object of class '<em>Dimension VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension VA</em>'.
	 * @generated
	 */
	DimensionVA createDimensionVA();

	/**
	 * Returns a new object of class '<em>Layout Dimension VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layout Dimension VA</em>'.
	 * @generated
	 */
	LayoutDimensionVA createLayoutDimensionVA();

	/**
	 * Returns a new object of class '<em>Any Drawable VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Drawable VA</em>'.
	 * @generated
	 */
	AnyDrawableVA createAnyDrawableVA();

	/**
	 * Returns a new object of class '<em>Drawable VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drawable VA</em>'.
	 * @generated
	 */
	DrawableVA createDrawableVA();

	/**
	 * Returns a new object of class '<em>Animation VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animation VA</em>'.
	 * @generated
	 */
	AnimationVA createAnimationVA();

	/**
	 * Returns a new object of class '<em>Interpolator VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interpolator VA</em>'.
	 * @generated
	 */
	InterpolatorVA createInterpolatorVA();

	/**
	 * Returns a new object of class '<em>Value Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Definition</em>'.
	 * @generated
	 */
	ValueDefinition createValueDefinition();

	/**
	 * Returns a new object of class '<em>String VD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String VD</em>'.
	 * @generated
	 */
	StringVD createStringVD();

	/**
	 * Returns a new object of class '<em>Integer VD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer VD</em>'.
	 * @generated
	 */
	IntegerVD createIntegerVD();

	/**
	 * Returns a new object of class '<em>Boolean VD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean VD</em>'.
	 * @generated
	 */
	BooleanVD createBooleanVD();

	/**
	 * Returns a new object of class '<em>Color VD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color VD</em>'.
	 * @generated
	 */
	ColorVD createColorVD();

	/**
	 * Returns a new object of class '<em>Dimension VD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension VD</em>'.
	 * @generated
	 */
	DimensionVD createDimensionVD();

	/**
	 * Returns a new object of class '<em>Value Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Resource</em>'.
	 * @generated
	 */
	ValueResource createValueResource();

	/**
	 * Returns a new object of class '<em>String Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Resource</em>'.
	 * @generated
	 */
	StringResource createStringResource();

	/**
	 * Returns a new object of class '<em>Integer Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Resource</em>'.
	 * @generated
	 */
	IntegerResource createIntegerResource();

	/**
	 * Returns a new object of class '<em>Boolean Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Resource</em>'.
	 * @generated
	 */
	BooleanResource createBooleanResource();

	/**
	 * Returns a new object of class '<em>Color Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Resource</em>'.
	 * @generated
	 */
	ColorResource createColorResource();

	/**
	 * Returns a new object of class '<em>Dimension Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension Resource</em>'.
	 * @generated
	 */
	DimensionResource createDimensionResource();

	/**
	 * Returns a new object of class '<em>Array Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Resource</em>'.
	 * @generated
	 */
	ArrayResource createArrayResource();

	/**
	 * Returns a new object of class '<em>Integer Array Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Array Resource</em>'.
	 * @generated
	 */
	IntegerArrayResource createIntegerArrayResource();

	/**
	 * Returns a new object of class '<em>String Array Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Array Resource</em>'.
	 * @generated
	 */
	StringArrayResource createStringArrayResource();

	/**
	 * Returns a new object of class '<em>Typed Array Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Array Resource</em>'.
	 * @generated
	 */
	TypedArrayResource createTypedArrayResource();

	/**
	 * Returns a new object of class '<em>Drawable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drawable Resource</em>'.
	 * @generated
	 */
	DrawableResource createDrawableResource();

	/**
	 * Returns a new object of class '<em>Bitmap Drawable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bitmap Drawable Resource</em>'.
	 * @generated
	 */
	BitmapDrawableResource createBitmapDrawableResource();

	/**
	 * Returns a new object of class '<em>Transition Drawable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Drawable Resource</em>'.
	 * @generated
	 */
	TransitionDrawableResource createTransitionDrawableResource();

	/**
	 * Returns a new object of class '<em>Menu Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Resource</em>'.
	 * @generated
	 */
	MenuResource createMenuResource();

	/**
	 * Returns a new object of class '<em>Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Item</em>'.
	 * @generated
	 */
	MenuItem createMenuItem();

	/**
	 * Returns a new object of class '<em>Menu Item Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Item Group</em>'.
	 * @generated
	 */
	MenuItemGroup createMenuItemGroup();

	/**
	 * Returns a new object of class '<em>Sub Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Menu</em>'.
	 * @generated
	 */
	SubMenu createSubMenu();

	/**
	 * Returns a new object of class '<em>Animation Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animation Resource</em>'.
	 * @generated
	 */
	AnimationResource createAnimationResource();

	/**
	 * Returns a new object of class '<em>Frame Animation Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frame Animation Element</em>'.
	 * @generated
	 */
	FrameAnimationElement createFrameAnimationElement();

	/**
	 * Returns a new object of class '<em>Terminal Animation Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminal Animation Elements</em>'.
	 * @generated
	 */
	TerminalAnimationElements createTerminalAnimationElements();

	/**
	 * Returns a new object of class '<em>Terminal Animation Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminal Animation Set</em>'.
	 * @generated
	 */
	TerminalAnimationSet createTerminalAnimationSet();

	/**
	 * Returns a new object of class '<em>Alpha Animation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha Animation</em>'.
	 * @generated
	 */
	AlphaAnimation createAlphaAnimation();

	/**
	 * Returns a new object of class '<em>Scale Animation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scale Animation</em>'.
	 * @generated
	 */
	ScaleAnimation createScaleAnimation();

	/**
	 * Returns a new object of class '<em>Translate Animation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Translate Animation</em>'.
	 * @generated
	 */
	TranslateAnimation createTranslateAnimation();

	/**
	 * Returns a new object of class '<em>Rotate Animation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotate Animation</em>'.
	 * @generated
	 */
	RotateAnimation createRotateAnimation();

	/**
	 * Returns a new object of class '<em>Tween Animation Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tween Animation Resource</em>'.
	 * @generated
	 */
	TweenAnimationResource createTweenAnimationResource();

	/**
	 * Returns a new object of class '<em>Frame Animation Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frame Animation Resource</em>'.
	 * @generated
	 */
	FrameAnimationResource createFrameAnimationResource();

	/**
	 * Returns a new object of class '<em>Animation Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animation Frame</em>'.
	 * @generated
	 */
	AnimationFrame createAnimationFrame();

	/**
	 * Returns a new object of class '<em>Abstract Resource Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Resource Access</em>'.
	 * @generated
	 */
	AbstractResourceAccess createAbstractResourceAccess();

	/**
	 * Returns a new object of class '<em>Resource Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Access</em>'.
	 * @generated
	 */
	ResourceAccess createResourceAccess();

	/**
	 * Returns a new object of class '<em>String RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String RA</em>'.
	 * @generated
	 */
	StringRA createStringRA();

	/**
	 * Returns a new object of class '<em>Integer RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer RA</em>'.
	 * @generated
	 */
	IntegerRA createIntegerRA();

	/**
	 * Returns a new object of class '<em>Boolean RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean RA</em>'.
	 * @generated
	 */
	BooleanRA createBooleanRA();

	/**
	 * Returns a new object of class '<em>Color RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color RA</em>'.
	 * @generated
	 */
	ColorRA createColorRA();

	/**
	 * Returns a new object of class '<em>Dimension RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension RA</em>'.
	 * @generated
	 */
	DimensionRA createDimensionRA();

	/**
	 * Returns a new object of class '<em>Drawable RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drawable RA</em>'.
	 * @generated
	 */
	DrawableRA createDrawableRA();

	/**
	 * Returns a new object of class '<em>Animation RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animation RA</em>'.
	 * @generated
	 */
	AnimationRA createAnimationRA();

	/**
	 * Returns a new object of class '<em>Interpolator RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interpolator RA</em>'.
	 * @generated
	 */
	InterpolatorRA createInterpolatorRA();

	/**
	 * Returns a new object of class '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Box</em>'.
	 * @generated
	 */
	CheckBox createCheckBox();

	/**
	 * Returns a new object of class '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Button</em>'.
	 * @generated
	 */
	RadioButton createRadioButton();

	/**
	 * Returns a new object of class '<em>Radio Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Group</em>'.
	 * @generated
	 */
	RadioGroup createRadioGroup();

	/**
	 * Returns a new object of class '<em>Menu Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Group</em>'.
	 * @generated
	 */
	MenuGroup createMenuGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DroidPackage getDroidPackage();

} //DroidFactory
