/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage
 * @generated
 */
public interface DroidFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DroidFactory eINSTANCE = org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  Application createApplication();

  /**
   * Returns a new object of class '<em>Manifest File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Manifest File</em>'.
   * @generated
   */
  ManifestFile createManifestFile();

  /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
  Resource createResource();

  /**
   * Returns a new object of class '<em>Generic Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Resource</em>'.
   * @generated
   */
  GenericResource createGenericResource();

  /**
   * Returns a new object of class '<em>Menu Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Menu Resource</em>'.
   * @generated
   */
  MenuResource createMenuResource();

  /**
   * Returns a new object of class '<em>Value Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Resource</em>'.
   * @generated
   */
  ValueResource createValueResource();

  /**
   * Returns a new object of class '<em>String Value Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value Resource</em>'.
   * @generated
   */
  StringValueResource createStringValueResource();

  /**
   * Returns a new object of class '<em>Integer Value Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Value Resource</em>'.
   * @generated
   */
  IntegerValueResource createIntegerValueResource();

  /**
   * Returns a new object of class '<em>Boolean Value Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Value Resource</em>'.
   * @generated
   */
  BooleanValueResource createBooleanValueResource();

  /**
   * Returns a new object of class '<em>Color Value Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Value Resource</em>'.
   * @generated
   */
  ColorValueResource createColorValueResource();

  /**
   * Returns a new object of class '<em>Dimension Value Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dimension Value Resource</em>'.
   * @generated
   */
  DimensionValueResource createDimensionValueResource();

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
   * Returns a new object of class '<em>Animation Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Animation Resource</em>'.
   * @generated
   */
  AnimationResource createAnimationResource();

  /**
   * Returns a new object of class '<em>Layout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Layout</em>'.
   * @generated
   */
  Layout createLayout();

  /**
   * Returns a new object of class '<em>Widget</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Widget</em>'.
   * @generated
   */
  Widget createWidget();

  /**
   * Returns a new object of class '<em>Generic Widget</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Widget</em>'.
   * @generated
   */
  GenericWidget createGenericWidget();

  /**
   * Returns a new object of class '<em>Text View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text View</em>'.
   * @generated
   */
  TextView createTextView();

  /**
   * Returns a new object of class '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button</em>'.
   * @generated
   */
  Button createButton();

  /**
   * Returns a new object of class '<em>Image Button</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image Button</em>'.
   * @generated
   */
  ImageButton createImageButton();

  /**
   * Returns a new object of class '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link</em>'.
   * @generated
   */
  Link createLink();

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
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Generic Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Action</em>'.
   * @generated
   */
  GenericAction createGenericAction();

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
   * Returns a new object of class '<em>Load Resource Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load Resource Action</em>'.
   * @generated
   */
  LoadResourceAction createLoadResourceAction();

  /**
   * Returns a new object of class '<em>Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Value</em>'.
   * @generated
   */
  PropertyValue createPropertyValue();

  /**
   * Returns a new object of class '<em>String Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Property Value</em>'.
   * @generated
   */
  StringPropertyValue createStringPropertyValue();

  /**
   * Returns a new object of class '<em>Integer Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Property Value</em>'.
   * @generated
   */
  IntegerPropertyValue createIntegerPropertyValue();

  /**
   * Returns a new object of class '<em>Boolean Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Property Value</em>'.
   * @generated
   */
  BooleanPropertyValue createBooleanPropertyValue();

  /**
   * Returns a new object of class '<em>Color Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Property Value</em>'.
   * @generated
   */
  ColorPropertyValue createColorPropertyValue();

  /**
   * Returns a new object of class '<em>Dimension Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dimension Property Value</em>'.
   * @generated
   */
  DimensionPropertyValue createDimensionPropertyValue();

  /**
   * Returns a new object of class '<em>Drawable Resource Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drawable Resource Property Value</em>'.
   * @generated
   */
  DrawableResourcePropertyValue createDrawableResourcePropertyValue();

  /**
   * Returns a new object of class '<em>Drawable Image Resource Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drawable Image Resource Property Value</em>'.
   * @generated
   */
  DrawableImageResourcePropertyValue createDrawableImageResourcePropertyValue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DroidPackage getDroidPackage();

} //DroidFactory
