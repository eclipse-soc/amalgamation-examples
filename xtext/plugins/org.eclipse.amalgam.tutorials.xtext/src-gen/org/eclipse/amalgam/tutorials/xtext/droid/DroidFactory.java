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
   * Returns a new object of class '<em>Application Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Element</em>'.
   * @generated
   */
  ApplicationElement createApplicationElement();

  /**
   * Returns a new object of class '<em>Manifest File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Manifest File</em>'.
   * @generated
   */
  ManifestFile createManifestFile();

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
   * Returns a new object of class '<em>Text View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text View</em>'.
   * @generated
   */
  TextView createTextView();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DroidPackage getDroidPackage();

} //DroidFactory
