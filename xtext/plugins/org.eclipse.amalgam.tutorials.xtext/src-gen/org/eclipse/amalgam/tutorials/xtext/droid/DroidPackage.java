/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidFactory
 * @model kind="package"
 * @generated
 */
public interface DroidPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "droid";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/amalgam/tutorials/xtext/Droid";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "droid";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DroidPackage eINSTANCE = org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Manifest</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__MANIFEST = 2;

  /**
   * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__LAYOUTS = 3;

  /**
   * The feature id for the '<em><b>Activities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__ACTIVITIES = 4;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationElementImpl <em>Application Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationElementImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getApplicationElement()
   * @generated
   */
  int APPLICATION_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Application Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ManifestFileImpl <em>Manifest File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ManifestFileImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getManifestFile()
   * @generated
   */
  int MANIFEST_FILE = 2;

  /**
   * The number of structural features of the '<em>Manifest File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIFEST_FILE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.LayoutImpl <em>Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.LayoutImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getLayout()
   * @generated
   */
  int LAYOUT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT__NAME = APPLICATION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT__WIDGETS = APPLICATION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_FEATURE_COUNT = APPLICATION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl <em>Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getWidget()
   * @generated
   */
  int WIDGET = 4;

  /**
   * The feature id for the '<em><b>Top</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__TOP = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__LEFT = 1;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__WIDTH = 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__ACTIONS = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__ID = 4;

  /**
   * The number of structural features of the '<em>Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericWidgetImpl <em>Generic Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericWidgetImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getGenericWidget()
   * @generated
   */
  int GENERIC_WIDGET = 5;

  /**
   * The feature id for the '<em><b>Top</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__TOP = WIDGET__TOP;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__LEFT = WIDGET__LEFT;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__WIDTH = WIDGET__WIDTH;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__ACTIONS = WIDGET__ACTIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__ID = WIDGET__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__NAME = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Generic Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ButtonImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 6;

  /**
   * The feature id for the '<em><b>Top</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__TOP = WIDGET__TOP;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__LEFT = WIDGET__LEFT;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__WIDTH = WIDGET__WIDTH;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ACTIONS = WIDGET__ACTIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ID = WIDGET__ID;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__LABEL = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.SpinnerImpl <em>Spinner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.SpinnerImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getSpinner()
   * @generated
   */
  int SPINNER = 7;

  /**
   * The feature id for the '<em><b>Top</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__TOP = WIDGET__TOP;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__LEFT = WIDGET__LEFT;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__WIDTH = WIDGET__WIDTH;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__ACTIONS = WIDGET__ACTIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__ID = WIDGET__ID;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__LABEL = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Spinner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.EditTextImpl <em>Edit Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.EditTextImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getEditText()
   * @generated
   */
  int EDIT_TEXT = 8;

  /**
   * The feature id for the '<em><b>Top</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__TOP = WIDGET__TOP;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__LEFT = WIDGET__LEFT;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__WIDTH = WIDGET__WIDTH;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__ACTIONS = WIDGET__ACTIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__ID = WIDGET__ID;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__LABEL = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Edit Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TextViewImpl <em>Text View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.TextViewImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getTextView()
   * @generated
   */
  int TEXT_VIEW = 9;

  /**
   * The feature id for the '<em><b>Top</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__TOP = WIDGET__TOP;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__LEFT = WIDGET__LEFT;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__WIDTH = WIDGET__WIDTH;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__ACTIONS = WIDGET__ACTIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__ID = WIDGET__ID;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__LABEL = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ActivityImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__NAME = APPLICATION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__ACTIONS = APPLICATION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = APPLICATION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericActivityImpl <em>Generic Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericActivityImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getGenericActivity()
   * @generated
   */
  int GENERIC_ACTIVITY = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ACTIVITY__NAME = ACTIVITY__NAME;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ACTIVITY__ACTIONS = ACTIVITY__ACTIONS;

  /**
   * The number of structural features of the '<em>Generic Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ListActivityImpl <em>List Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ListActivityImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getListActivity()
   * @generated
   */
  int LIST_ACTIVITY = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY__NAME = ACTIVITY__NAME;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY__ACTIONS = ACTIVITY__ACTIONS;

  /**
   * The feature id for the '<em><b>Data Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY__DATA_SOURCE = ACTIVITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY__LAYOUT = ACTIVITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Item Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY__ITEM_LAYOUT = ACTIVITY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>List Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TabActivityImpl <em>Tab Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.TabActivityImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getTabActivity()
   * @generated
   */
  int TAB_ACTIVITY = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ACTIVITY__NAME = ACTIVITY__NAME;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ACTIVITY__ACTIONS = ACTIVITY__ACTIONS;

  /**
   * The number of structural features of the '<em>Tab Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ActionImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getAction()
   * @generated
   */
  int ACTION = 14;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericActionImpl <em>Generic Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericActionImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getGenericAction()
   * @generated
   */
  int GENERIC_ACTION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ACTION__NAME = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Generic Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GoToURLActionImpl <em>Go To URL Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.GoToURLActionImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getGoToURLAction()
   * @generated
   */
  int GO_TO_URL_ACTION = 16;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO_URL_ACTION__URL = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Go To URL Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO_URL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ShowLayoutActionImpl <em>Show Layout Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ShowLayoutActionImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getShowLayoutAction()
   * @generated
   */
  int SHOW_LAYOUT_ACTION = 17;

  /**
   * The feature id for the '<em><b>Layout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_LAYOUT_ACTION__LAYOUT = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Show Layout Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_LAYOUT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.InvokeActivityActionImpl <em>Invoke Activity Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.InvokeActivityActionImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getInvokeActivityAction()
   * @generated
   */
  int INVOKE_ACTIVITY_ACTION = 18;

  /**
   * The feature id for the '<em><b>Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_ACTIVITY_ACTION__ACTIVITY = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Invoke Activity Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_ACTIVITY_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.LoadResourceActionImpl <em>Load Resource Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.LoadResourceActionImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getLoadResourceAction()
   * @generated
   */
  int LOAD_RESOURCE_ACTION = 19;

  /**
   * The feature id for the '<em><b>Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE_ACTION__RESOURCE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>To Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE_ACTION__TO_VAR = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>After Load</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE_ACTION__AFTER_LOAD = ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Load Resource Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Application#getName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Application#getPackage()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Package();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getManifest <em>Manifest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Manifest</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Application#getManifest()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Manifest();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getLayouts <em>Layouts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Layouts</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Application#getLayouts()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Layouts();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getActivities <em>Activities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Activities</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Application#getActivities()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Activities();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ApplicationElement <em>Application Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Element</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ApplicationElement
   * @generated
   */
  EClass getApplicationElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.ApplicationElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ApplicationElement#getName()
   * @see #getApplicationElement()
   * @generated
   */
  EAttribute getApplicationElement_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ManifestFile <em>Manifest File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Manifest File</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ManifestFile
   * @generated
   */
  EClass getManifestFile();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Layout
   * @generated
   */
  EClass getLayout();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.Layout#getWidgets <em>Widgets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Widgets</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Layout#getWidgets()
   * @see #getLayout()
   * @generated
   */
  EReference getLayout_Widgets();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Widget</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget
   * @generated
   */
  EClass getWidget();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getTop <em>Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Top</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget#getTop()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_Top();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget#getLeft()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget#getWidth()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_Width();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget#getActions()
   * @see #getWidget()
   * @generated
   */
  EReference getWidget_Actions();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget#getId()
   * @see #getWidget()
   * @generated
   */
  EAttribute getWidget_Id();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericWidget <em>Generic Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Widget</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GenericWidget
   * @generated
   */
  EClass getGenericWidget();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericWidget#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GenericWidget#getName()
   * @see #getGenericWidget()
   * @generated
   */
  EAttribute getGenericWidget_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.Button#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Button#getLabel()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Label();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Spinner <em>Spinner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spinner</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Spinner
   * @generated
   */
  EClass getSpinner();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.Spinner#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Spinner#getLabel()
   * @see #getSpinner()
   * @generated
   */
  EAttribute getSpinner_Label();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText <em>Edit Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edit Text</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.EditText
   * @generated
   */
  EClass getEditText();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.EditText#getLabel()
   * @see #getEditText()
   * @generated
   */
  EAttribute getEditText_Label();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.TextView <em>Text View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text View</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TextView
   * @generated
   */
  EClass getTextView();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.TextView#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TextView#getLabel()
   * @see #getTextView()
   * @generated
   */
  EAttribute getTextView_Label();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Activity
   * @generated
   */
  EClass getActivity();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.Activity#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Activity#getActions()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Actions();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericActivity <em>Generic Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Activity</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GenericActivity
   * @generated
   */
  EClass getGenericActivity();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ListActivity <em>List Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Activity</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ListActivity
   * @generated
   */
  EClass getListActivity();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.ListActivity#getDataSource <em>Data Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data Source</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ListActivity#getDataSource()
   * @see #getListActivity()
   * @generated
   */
  EAttribute getListActivity_DataSource();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.ListActivity#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Layout</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ListActivity#getLayout()
   * @see #getListActivity()
   * @generated
   */
  EReference getListActivity_Layout();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.ListActivity#getItemLayout <em>Item Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Item Layout</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ListActivity#getItemLayout()
   * @see #getListActivity()
   * @generated
   */
  EReference getListActivity_ItemLayout();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.TabActivity <em>Tab Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab Activity</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TabActivity
   * @generated
   */
  EClass getTabActivity();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericAction <em>Generic Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Action</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GenericAction
   * @generated
   */
  EClass getGenericAction();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericAction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GenericAction#getName()
   * @see #getGenericAction()
   * @generated
   */
  EAttribute getGenericAction_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.GoToURLAction <em>Go To URL Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Go To URL Action</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GoToURLAction
   * @generated
   */
  EClass getGoToURLAction();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.GoToURLAction#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GoToURLAction#getUrl()
   * @see #getGoToURLAction()
   * @generated
   */
  EAttribute getGoToURLAction_Url();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ShowLayoutAction <em>Show Layout Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Show Layout Action</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ShowLayoutAction
   * @generated
   */
  EClass getShowLayoutAction();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.ShowLayoutAction#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Layout</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ShowLayoutAction#getLayout()
   * @see #getShowLayoutAction()
   * @generated
   */
  EReference getShowLayoutAction_Layout();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.InvokeActivityAction <em>Invoke Activity Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invoke Activity Action</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.InvokeActivityAction
   * @generated
   */
  EClass getInvokeActivityAction();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.InvokeActivityAction#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Activity</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.InvokeActivityAction#getActivity()
   * @see #getInvokeActivityAction()
   * @generated
   */
  EReference getInvokeActivityAction_Activity();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction <em>Load Resource Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Resource Action</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction
   * @generated
   */
  EClass getLoadResourceAction();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction#getResource()
   * @see #getLoadResourceAction()
   * @generated
   */
  EAttribute getLoadResourceAction_Resource();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction#getToVar <em>To Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To Var</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction#getToVar()
   * @see #getLoadResourceAction()
   * @generated
   */
  EAttribute getLoadResourceAction_ToVar();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction#getAfterLoad <em>After Load</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>After Load</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.LoadResourceAction#getAfterLoad()
   * @see #getLoadResourceAction()
   * @generated
   */
  EReference getLoadResourceAction_AfterLoad();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DroidFactory getDroidFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__PACKAGE = eINSTANCE.getApplication_Package();

    /**
     * The meta object literal for the '<em><b>Manifest</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__MANIFEST = eINSTANCE.getApplication_Manifest();

    /**
     * The meta object literal for the '<em><b>Layouts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__LAYOUTS = eINSTANCE.getApplication_Layouts();

    /**
     * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__ACTIVITIES = eINSTANCE.getApplication_Activities();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationElementImpl <em>Application Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ApplicationElementImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getApplicationElement()
     * @generated
     */
    EClass APPLICATION_ELEMENT = eINSTANCE.getApplicationElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_ELEMENT__NAME = eINSTANCE.getApplicationElement_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ManifestFileImpl <em>Manifest File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ManifestFileImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getManifestFile()
     * @generated
     */
    EClass MANIFEST_FILE = eINSTANCE.getManifestFile();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.LayoutImpl <em>Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.LayoutImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getLayout()
     * @generated
     */
    EClass LAYOUT = eINSTANCE.getLayout();

    /**
     * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYOUT__WIDGETS = eINSTANCE.getLayout_Widgets();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl <em>Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getWidget()
     * @generated
     */
    EClass WIDGET = eINSTANCE.getWidget();

    /**
     * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__TOP = eINSTANCE.getWidget_Top();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__LEFT = eINSTANCE.getWidget_Left();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__WIDTH = eINSTANCE.getWidget_Width();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIDGET__ACTIONS = eINSTANCE.getWidget_Actions();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__ID = eINSTANCE.getWidget_Id();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericWidgetImpl <em>Generic Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericWidgetImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getGenericWidget()
     * @generated
     */
    EClass GENERIC_WIDGET = eINSTANCE.getGenericWidget();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERIC_WIDGET__NAME = eINSTANCE.getGenericWidget_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ButtonImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__LABEL = eINSTANCE.getButton_Label();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.SpinnerImpl <em>Spinner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.SpinnerImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getSpinner()
     * @generated
     */
    EClass SPINNER = eINSTANCE.getSpinner();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPINNER__LABEL = eINSTANCE.getSpinner_Label();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.EditTextImpl <em>Edit Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.EditTextImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getEditText()
     * @generated
     */
    EClass EDIT_TEXT = eINSTANCE.getEditText();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDIT_TEXT__LABEL = eINSTANCE.getEditText_Label();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TextViewImpl <em>Text View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.TextViewImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getTextView()
     * @generated
     */
    EClass TEXT_VIEW = eINSTANCE.getTextView();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_VIEW__LABEL = eINSTANCE.getTextView_Label();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ActivityImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getActivity()
     * @generated
     */
    EClass ACTIVITY = eINSTANCE.getActivity();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__ACTIONS = eINSTANCE.getActivity_Actions();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericActivityImpl <em>Generic Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericActivityImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getGenericActivity()
     * @generated
     */
    EClass GENERIC_ACTIVITY = eINSTANCE.getGenericActivity();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ListActivityImpl <em>List Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ListActivityImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getListActivity()
     * @generated
     */
    EClass LIST_ACTIVITY = eINSTANCE.getListActivity();

    /**
     * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST_ACTIVITY__DATA_SOURCE = eINSTANCE.getListActivity_DataSource();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ACTIVITY__LAYOUT = eINSTANCE.getListActivity_Layout();

    /**
     * The meta object literal for the '<em><b>Item Layout</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ACTIVITY__ITEM_LAYOUT = eINSTANCE.getListActivity_ItemLayout();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TabActivityImpl <em>Tab Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.TabActivityImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getTabActivity()
     * @generated
     */
    EClass TAB_ACTIVITY = eINSTANCE.getTabActivity();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ActionImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericActionImpl <em>Generic Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericActionImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getGenericAction()
     * @generated
     */
    EClass GENERIC_ACTION = eINSTANCE.getGenericAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERIC_ACTION__NAME = eINSTANCE.getGenericAction_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GoToURLActionImpl <em>Go To URL Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.GoToURLActionImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getGoToURLAction()
     * @generated
     */
    EClass GO_TO_URL_ACTION = eINSTANCE.getGoToURLAction();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GO_TO_URL_ACTION__URL = eINSTANCE.getGoToURLAction_Url();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ShowLayoutActionImpl <em>Show Layout Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ShowLayoutActionImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getShowLayoutAction()
     * @generated
     */
    EClass SHOW_LAYOUT_ACTION = eINSTANCE.getShowLayoutAction();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHOW_LAYOUT_ACTION__LAYOUT = eINSTANCE.getShowLayoutAction_Layout();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.InvokeActivityActionImpl <em>Invoke Activity Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.InvokeActivityActionImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getInvokeActivityAction()
     * @generated
     */
    EClass INVOKE_ACTIVITY_ACTION = eINSTANCE.getInvokeActivityAction();

    /**
     * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOKE_ACTIVITY_ACTION__ACTIVITY = eINSTANCE.getInvokeActivityAction_Activity();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.LoadResourceActionImpl <em>Load Resource Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.LoadResourceActionImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getLoadResourceAction()
     * @generated
     */
    EClass LOAD_RESOURCE_ACTION = eINSTANCE.getLoadResourceAction();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_RESOURCE_ACTION__RESOURCE = eINSTANCE.getLoadResourceAction_Resource();

    /**
     * The meta object literal for the '<em><b>To Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_RESOURCE_ACTION__TO_VAR = eINSTANCE.getLoadResourceAction_ToVar();

    /**
     * The meta object literal for the '<em><b>After Load</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD_RESOURCE_ACTION__AFTER_LOAD = eINSTANCE.getLoadResourceAction_AfterLoad();

  }

} //DroidPackage
