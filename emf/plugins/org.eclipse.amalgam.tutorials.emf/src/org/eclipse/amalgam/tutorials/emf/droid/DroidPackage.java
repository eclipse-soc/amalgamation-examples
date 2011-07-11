/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidFactory
 * @model kind="package"
 * @generated
 */
public interface DroidPackage extends EPackage {
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
	String eNS_URI = "http://www.eclipse.org/amalgam/tutorials/emf/Droid";

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
	DroidPackage eINSTANCE = org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ApplicationImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getApplication()
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
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PACKAGE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Version Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VERSION_CODE = 2;

	/**
	 * The feature id for the '<em><b>Version Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VERSION_NAME = 3;

	/**
	 * The feature id for the '<em><b>Sdk Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SDK_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RESOURCES = 5;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ACTIVITIES = 6;

	/**
	 * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LAYOUTS = 7;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ApplicationUsesSDKImpl <em>Application Uses SDK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ApplicationUsesSDKImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getApplicationUsesSDK()
	 * @generated
	 */
	int APPLICATION_USES_SDK = 1;

	/**
	 * The feature id for the '<em><b>Min Sdk Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_USES_SDK__MIN_SDK_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Max Sdk Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_USES_SDK__MAX_SDK_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Target Sdk Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_USES_SDK__TARGET_SDK_VERSION = 2;

	/**
	 * The number of structural features of the '<em>Application Uses SDK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_USES_SDK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.AbstractViewImpl <em>Abstract View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.AbstractViewImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getAbstractView()
	 * @generated
	 */
	int ABSTRACT_VIEW = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__WIDGETS = 1;

	/**
	 * The number of structural features of the '<em>Abstract View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ViewImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = ABSTRACT_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__WIDGETS = ABSTRACT_VIEW__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__BACKGROUND = ABSTRACT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = ABSTRACT_VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getLayout()
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
	int LAYOUT__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__WIDGETS = VIEW__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__BACKGROUND = VIEW__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ALPHA = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MIN_HEIGHT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MIN_WIDTH = VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Focus Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NEXT_FOCUS_DOWN = VIEW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Next Focus Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NEXT_FOCUS_LEFT = VIEW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Next Focus Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NEXT_FOCUS_RIGHT = VIEW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Next Focus Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NEXT_FOCUS_UP = VIEW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ON_CLICK = VIEW_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PADDING = VIEW_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Padding Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PADDING_BOTTOM = VIEW_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Padding Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PADDING_LEFT = VIEW_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Padding Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PADDING_RIGHT = VIEW_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Padding Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PADDING_TOP = VIEW_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Scrollbars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__SCROLLBARS = VIEW_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__VISIBILITY = VIEW_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Layout Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__LAYOUT_ANIMATION = VIEW_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = VIEW_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.AbstractActivityImpl <em>Abstract Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.AbstractActivityImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getAbstractActivity()
	 * @generated
	 */
	int ABSTRACT_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Referenced Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__REFERENCED_LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__WIDGETS = 1;

	/**
	 * The number of structural features of the '<em>Abstract Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ActivityImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Referenced Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REFERENCED_LAYOUT = ABSTRACT_ACTIVITY__REFERENCED_LAYOUT;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__WIDGETS = ABSTRACT_ACTIVITY__WIDGETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = ABSTRACT_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = ABSTRACT_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.GenericActivityImpl <em>Generic Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.GenericActivityImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getGenericActivity()
	 * @generated
	 */
	int GENERIC_ACTIVITY = 6;

	/**
	 * The feature id for the '<em><b>Referenced Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ACTIVITY__REFERENCED_LAYOUT = ACTIVITY__REFERENCED_LAYOUT;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ACTIVITY__WIDGETS = ACTIVITY__WIDGETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The number of structural features of the '<em>Generic Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ViewCollectionImpl <em>View Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ViewCollectionImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getViewCollection()
	 * @generated
	 */
	int VIEW_COLLECTION = 7;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLLECTION__VIEWS = 0;

	/**
	 * The number of structural features of the '<em>View Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ListActivityImpl <em>List Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ListActivityImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getListActivity()
	 * @generated
	 */
	int LIST_ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Referenced Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ACTIVITY__REFERENCED_LAYOUT = ACTIVITY__REFERENCED_LAYOUT;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ACTIVITY__WIDGETS = ACTIVITY__WIDGETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ACTIVITY__DATA_SOURCE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ACTIVITY__ITEM_LAYOUT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ACTIVITY__ACTIONS = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TabActivityImpl <em>Tab Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.TabActivityImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getTabActivity()
	 * @generated
	 */
	int TAB_ACTIVITY = 9;

	/**
	 * The feature id for the '<em><b>Referenced Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ACTIVITY__REFERENCED_LAYOUT = ACTIVITY__REFERENCED_LAYOUT;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ACTIVITY__WIDGETS = ACTIVITY__WIDGETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ACTIVITY__TABS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ACTIVITY__ACTIONS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tab Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.TabImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getTab()
	 * @generated
	 */
	int TAB = 10;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__CAPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__NAME = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__ICON = 2;

	/**
	 * The feature id for the '<em><b>Selected Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__SELECTED_ICON = 3;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__LAYOUT = 5;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__ACTIONS = 6;

	/**
	 * The number of structural features of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ActionSetImpl <em>Action Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ActionSetImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getActionSet()
	 * @generated
	 */
	int ACTION_SET = 11;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Action Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ActionImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 12;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.GoToURLActionImpl <em>Go To URL Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.GoToURLActionImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getGoToURLAction()
	 * @generated
	 */
	int GO_TO_URL_ACTION = 13;

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
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ShowLayoutActionImpl <em>Show Layout Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ShowLayoutActionImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getShowLayoutAction()
	 * @generated
	 */
	int SHOW_LAYOUT_ACTION = 14;

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
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.InvokeActivityActionImpl <em>Invoke Activity Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.InvokeActivityActionImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getInvokeActivityAction()
	 * @generated
	 */
	int INVOKE_ACTIVITY_ACTION = 15;

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
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.AbstractLinearLayoutImpl <em>Abstract Linear Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.AbstractLinearLayoutImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getAbstractLinearLayout()
	 * @generated
	 */
	int ABSTRACT_LINEAR_LAYOUT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__NAME = LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__WIDGETS = LAYOUT__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__BACKGROUND = LAYOUT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__ALPHA = LAYOUT__ALPHA;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__MIN_HEIGHT = LAYOUT__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__MIN_WIDTH = LAYOUT__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Next Focus Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__NEXT_FOCUS_DOWN = LAYOUT__NEXT_FOCUS_DOWN;

	/**
	 * The feature id for the '<em><b>Next Focus Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__NEXT_FOCUS_LEFT = LAYOUT__NEXT_FOCUS_LEFT;

	/**
	 * The feature id for the '<em><b>Next Focus Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__NEXT_FOCUS_RIGHT = LAYOUT__NEXT_FOCUS_RIGHT;

	/**
	 * The feature id for the '<em><b>Next Focus Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__NEXT_FOCUS_UP = LAYOUT__NEXT_FOCUS_UP;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__ON_CLICK = LAYOUT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__PADDING = LAYOUT__PADDING;

	/**
	 * The feature id for the '<em><b>Padding Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__PADDING_BOTTOM = LAYOUT__PADDING_BOTTOM;

	/**
	 * The feature id for the '<em><b>Padding Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__PADDING_LEFT = LAYOUT__PADDING_LEFT;

	/**
	 * The feature id for the '<em><b>Padding Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__PADDING_RIGHT = LAYOUT__PADDING_RIGHT;

	/**
	 * The feature id for the '<em><b>Padding Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__PADDING_TOP = LAYOUT__PADDING_TOP;

	/**
	 * The feature id for the '<em><b>Scrollbars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__SCROLLBARS = LAYOUT__SCROLLBARS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__VISIBILITY = LAYOUT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Layout Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__LAYOUT_ANIMATION = LAYOUT__LAYOUT_ANIMATION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT__ORIENTATION = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Linear Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LINEAR_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LinearLayoutImpl <em>Linear Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.LinearLayoutImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getLinearLayout()
	 * @generated
	 */
	int LINEAR_LAYOUT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__NAME = ABSTRACT_LINEAR_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__WIDGETS = ABSTRACT_LINEAR_LAYOUT__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__BACKGROUND = ABSTRACT_LINEAR_LAYOUT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__ALPHA = ABSTRACT_LINEAR_LAYOUT__ALPHA;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__MIN_HEIGHT = ABSTRACT_LINEAR_LAYOUT__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__MIN_WIDTH = ABSTRACT_LINEAR_LAYOUT__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Next Focus Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__NEXT_FOCUS_DOWN = ABSTRACT_LINEAR_LAYOUT__NEXT_FOCUS_DOWN;

	/**
	 * The feature id for the '<em><b>Next Focus Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__NEXT_FOCUS_LEFT = ABSTRACT_LINEAR_LAYOUT__NEXT_FOCUS_LEFT;

	/**
	 * The feature id for the '<em><b>Next Focus Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__NEXT_FOCUS_RIGHT = ABSTRACT_LINEAR_LAYOUT__NEXT_FOCUS_RIGHT;

	/**
	 * The feature id for the '<em><b>Next Focus Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__NEXT_FOCUS_UP = ABSTRACT_LINEAR_LAYOUT__NEXT_FOCUS_UP;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__ON_CLICK = ABSTRACT_LINEAR_LAYOUT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__PADDING = ABSTRACT_LINEAR_LAYOUT__PADDING;

	/**
	 * The feature id for the '<em><b>Padding Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__PADDING_BOTTOM = ABSTRACT_LINEAR_LAYOUT__PADDING_BOTTOM;

	/**
	 * The feature id for the '<em><b>Padding Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__PADDING_LEFT = ABSTRACT_LINEAR_LAYOUT__PADDING_LEFT;

	/**
	 * The feature id for the '<em><b>Padding Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__PADDING_RIGHT = ABSTRACT_LINEAR_LAYOUT__PADDING_RIGHT;

	/**
	 * The feature id for the '<em><b>Padding Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__PADDING_TOP = ABSTRACT_LINEAR_LAYOUT__PADDING_TOP;

	/**
	 * The feature id for the '<em><b>Scrollbars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__SCROLLBARS = ABSTRACT_LINEAR_LAYOUT__SCROLLBARS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__VISIBILITY = ABSTRACT_LINEAR_LAYOUT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Layout Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__LAYOUT_ANIMATION = ABSTRACT_LINEAR_LAYOUT__LAYOUT_ANIMATION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__ORIENTATION = ABSTRACT_LINEAR_LAYOUT__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT__LAYOUT_PARAMS = ABSTRACT_LINEAR_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linear Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_LAYOUT_FEATURE_COUNT = ABSTRACT_LINEAR_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.RelativeLayoutImpl <em>Relative Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.RelativeLayoutImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getRelativeLayout()
	 * @generated
	 */
	int RELATIVE_LAYOUT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__NAME = LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__WIDGETS = LAYOUT__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__BACKGROUND = LAYOUT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__ALPHA = LAYOUT__ALPHA;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__MIN_HEIGHT = LAYOUT__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__MIN_WIDTH = LAYOUT__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Next Focus Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__NEXT_FOCUS_DOWN = LAYOUT__NEXT_FOCUS_DOWN;

	/**
	 * The feature id for the '<em><b>Next Focus Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__NEXT_FOCUS_LEFT = LAYOUT__NEXT_FOCUS_LEFT;

	/**
	 * The feature id for the '<em><b>Next Focus Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__NEXT_FOCUS_RIGHT = LAYOUT__NEXT_FOCUS_RIGHT;

	/**
	 * The feature id for the '<em><b>Next Focus Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__NEXT_FOCUS_UP = LAYOUT__NEXT_FOCUS_UP;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__ON_CLICK = LAYOUT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__PADDING = LAYOUT__PADDING;

	/**
	 * The feature id for the '<em><b>Padding Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__PADDING_BOTTOM = LAYOUT__PADDING_BOTTOM;

	/**
	 * The feature id for the '<em><b>Padding Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__PADDING_LEFT = LAYOUT__PADDING_LEFT;

	/**
	 * The feature id for the '<em><b>Padding Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__PADDING_RIGHT = LAYOUT__PADDING_RIGHT;

	/**
	 * The feature id for the '<em><b>Padding Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__PADDING_TOP = LAYOUT__PADDING_TOP;

	/**
	 * The feature id for the '<em><b>Scrollbars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__SCROLLBARS = LAYOUT__SCROLLBARS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__VISIBILITY = LAYOUT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Layout Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__LAYOUT_ANIMATION = LAYOUT__LAYOUT_ANIMATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__LAYOUT_PARAMS = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT__ORIENTATION = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relative Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TabHostImpl <em>Tab Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.TabHostImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getTabHost()
	 * @generated
	 */
	int TAB_HOST = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__NAME = LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__WIDGETS = LAYOUT__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__BACKGROUND = LAYOUT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__ALPHA = LAYOUT__ALPHA;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__MIN_HEIGHT = LAYOUT__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__MIN_WIDTH = LAYOUT__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Next Focus Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__NEXT_FOCUS_DOWN = LAYOUT__NEXT_FOCUS_DOWN;

	/**
	 * The feature id for the '<em><b>Next Focus Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__NEXT_FOCUS_LEFT = LAYOUT__NEXT_FOCUS_LEFT;

	/**
	 * The feature id for the '<em><b>Next Focus Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__NEXT_FOCUS_RIGHT = LAYOUT__NEXT_FOCUS_RIGHT;

	/**
	 * The feature id for the '<em><b>Next Focus Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__NEXT_FOCUS_UP = LAYOUT__NEXT_FOCUS_UP;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__ON_CLICK = LAYOUT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__PADDING = LAYOUT__PADDING;

	/**
	 * The feature id for the '<em><b>Padding Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__PADDING_BOTTOM = LAYOUT__PADDING_BOTTOM;

	/**
	 * The feature id for the '<em><b>Padding Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__PADDING_LEFT = LAYOUT__PADDING_LEFT;

	/**
	 * The feature id for the '<em><b>Padding Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__PADDING_RIGHT = LAYOUT__PADDING_RIGHT;

	/**
	 * The feature id for the '<em><b>Padding Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__PADDING_TOP = LAYOUT__PADDING_TOP;

	/**
	 * The feature id for the '<em><b>Scrollbars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__SCROLLBARS = LAYOUT__SCROLLBARS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__VISIBILITY = LAYOUT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Layout Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__LAYOUT_ANIMATION = LAYOUT__LAYOUT_ANIMATION;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST__LAYOUT_PARAMS = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tab Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_HOST_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TabWidgetImpl <em>Tab Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.TabWidgetImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getTabWidget()
	 * @generated
	 */
	int TAB_WIDGET = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__NAME = ABSTRACT_LINEAR_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__WIDGETS = ABSTRACT_LINEAR_LAYOUT__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__BACKGROUND = ABSTRACT_LINEAR_LAYOUT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__ALPHA = ABSTRACT_LINEAR_LAYOUT__ALPHA;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__MIN_HEIGHT = ABSTRACT_LINEAR_LAYOUT__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__MIN_WIDTH = ABSTRACT_LINEAR_LAYOUT__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Next Focus Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__NEXT_FOCUS_DOWN = ABSTRACT_LINEAR_LAYOUT__NEXT_FOCUS_DOWN;

	/**
	 * The feature id for the '<em><b>Next Focus Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__NEXT_FOCUS_LEFT = ABSTRACT_LINEAR_LAYOUT__NEXT_FOCUS_LEFT;

	/**
	 * The feature id for the '<em><b>Next Focus Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__NEXT_FOCUS_RIGHT = ABSTRACT_LINEAR_LAYOUT__NEXT_FOCUS_RIGHT;

	/**
	 * The feature id for the '<em><b>Next Focus Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__NEXT_FOCUS_UP = ABSTRACT_LINEAR_LAYOUT__NEXT_FOCUS_UP;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__ON_CLICK = ABSTRACT_LINEAR_LAYOUT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__PADDING = ABSTRACT_LINEAR_LAYOUT__PADDING;

	/**
	 * The feature id for the '<em><b>Padding Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__PADDING_BOTTOM = ABSTRACT_LINEAR_LAYOUT__PADDING_BOTTOM;

	/**
	 * The feature id for the '<em><b>Padding Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__PADDING_LEFT = ABSTRACT_LINEAR_LAYOUT__PADDING_LEFT;

	/**
	 * The feature id for the '<em><b>Padding Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__PADDING_RIGHT = ABSTRACT_LINEAR_LAYOUT__PADDING_RIGHT;

	/**
	 * The feature id for the '<em><b>Padding Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__PADDING_TOP = ABSTRACT_LINEAR_LAYOUT__PADDING_TOP;

	/**
	 * The feature id for the '<em><b>Scrollbars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__SCROLLBARS = ABSTRACT_LINEAR_LAYOUT__SCROLLBARS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__VISIBILITY = ABSTRACT_LINEAR_LAYOUT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Layout Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__LAYOUT_ANIMATION = ABSTRACT_LINEAR_LAYOUT__LAYOUT_ANIMATION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__ORIENTATION = ABSTRACT_LINEAR_LAYOUT__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__GRAVITY = ABSTRACT_LINEAR_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Divider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__DIVIDER = ABSTRACT_LINEAR_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trab Strip Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__TRAB_STRIP_ENABLED = ABSTRACT_LINEAR_LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trab Strip Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__TRAB_STRIP_LEFT = ABSTRACT_LINEAR_LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tab Strip Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET__TAB_STRIP_RIGHT = ABSTRACT_LINEAR_LAYOUT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tab Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_WIDGET_FEATURE_COUNT = ABSTRACT_LINEAR_LAYOUT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.FrameLayoutImpl <em>Frame Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.FrameLayoutImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getFrameLayout()
	 * @generated
	 */
	int FRAME_LAYOUT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__NAME = LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__WIDGETS = LAYOUT__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__BACKGROUND = LAYOUT__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__ALPHA = LAYOUT__ALPHA;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__MIN_HEIGHT = LAYOUT__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__MIN_WIDTH = LAYOUT__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Next Focus Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__NEXT_FOCUS_DOWN = LAYOUT__NEXT_FOCUS_DOWN;

	/**
	 * The feature id for the '<em><b>Next Focus Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__NEXT_FOCUS_LEFT = LAYOUT__NEXT_FOCUS_LEFT;

	/**
	 * The feature id for the '<em><b>Next Focus Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__NEXT_FOCUS_RIGHT = LAYOUT__NEXT_FOCUS_RIGHT;

	/**
	 * The feature id for the '<em><b>Next Focus Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__NEXT_FOCUS_UP = LAYOUT__NEXT_FOCUS_UP;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__ON_CLICK = LAYOUT__ON_CLICK;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__PADDING = LAYOUT__PADDING;

	/**
	 * The feature id for the '<em><b>Padding Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__PADDING_BOTTOM = LAYOUT__PADDING_BOTTOM;

	/**
	 * The feature id for the '<em><b>Padding Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__PADDING_LEFT = LAYOUT__PADDING_LEFT;

	/**
	 * The feature id for the '<em><b>Padding Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__PADDING_RIGHT = LAYOUT__PADDING_RIGHT;

	/**
	 * The feature id for the '<em><b>Padding Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__PADDING_TOP = LAYOUT__PADDING_TOP;

	/**
	 * The feature id for the '<em><b>Scrollbars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__SCROLLBARS = LAYOUT__SCROLLBARS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__VISIBILITY = LAYOUT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Layout Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT__LAYOUT_ANIMATION = LAYOUT__LAYOUT_ANIMATION;

	/**
	 * The number of structural features of the '<em>Frame Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl <em>Layout Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutParamsImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getLayoutParams()
	 * @generated
	 */
	int LAYOUT_PARAMS = 24;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Layout weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Layout margin Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_MARGIN_BOTTOM = 3;

	/**
	 * The feature id for the '<em><b>Layout margin Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_MARGIN_LEFT = 4;

	/**
	 * The feature id for the '<em><b>Layout margin Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_MARGIN_RIGHT = 5;

	/**
	 * The feature id for the '<em><b>Layout margin Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_MARGIN_TOP = 6;

	/**
	 * The feature id for the '<em><b>Layout above</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_ABOVE = 7;

	/**
	 * The feature id for the '<em><b>Layout align Baseline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_ALIGN_BASELINE = 8;

	/**
	 * The feature id for the '<em><b>Layout align Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_ALIGN_BOTTOM = 9;

	/**
	 * The feature id for the '<em><b>Layout align Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_ALIGN_LEFT = 10;

	/**
	 * The feature id for the '<em><b>Layout align Parent Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_BOTTOM = 11;

	/**
	 * The feature id for the '<em><b>Layout align Parent Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_LEFT = 12;

	/**
	 * The feature id for the '<em><b>Layout align Parent Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_RIGHT = 13;

	/**
	 * The feature id for the '<em><b>Layout align Parent Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_TOP = 14;

	/**
	 * The feature id for the '<em><b>Layout align Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_ALIGN_TOP = 15;

	/**
	 * The feature id for the '<em><b>Layout align With Parent If Missing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING = 16;

	/**
	 * The feature id for the '<em><b>Layout below</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_BELOW = 17;

	/**
	 * The feature id for the '<em><b>Layout center Horizontal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_CENTER_HORIZONTAL = 18;

	/**
	 * The feature id for the '<em><b>Layout center In Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_CENTER_IN_PARENT = 19;

	/**
	 * The feature id for the '<em><b>Layout center Vertical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_CENTER_VERTICAL = 20;

	/**
	 * The feature id for the '<em><b>Layout to Left Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_TO_LEFT_OF = 21;

	/**
	 * The feature id for the '<em><b>Layout to Right Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS__LAYOUT_TO_RIGHT_OF = 22;

	/**
	 * The number of structural features of the '<em>Layout Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PARAMS_FEATURE_COUNT = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.WidgetImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDGETS = VIEW__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__BACKGROUND = VIEW__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LAYOUT_PARAMS = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TOP = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LEFT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDTH = VIEW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__HEIGHT = VIEW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__CLICKABLE = VIEW_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = VIEW_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.AbstractTextViewImpl <em>Abstract Text View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.AbstractTextViewImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getAbstractTextView()
	 * @generated
	 */
	int ABSTRACT_TEXT_VIEW = 26;

	/**
	 * The number of structural features of the '<em>Abstract Text View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXT_VIEW_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TextViewImpl <em>Text View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.TextViewImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getTextView()
	 * @generated
	 */
	int TEXT_VIEW = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__WIDGETS = WIDGET__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__BACKGROUND = WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TOP = WIDGET__TOP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__LEFT = WIDGET__LEFT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__CLICKABLE = WIDGET__CLICKABLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__FADE_SCROLL_BARS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__IS_SCROLL_CONTAINER = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Auto Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__AUTO_LINK = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auto Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__AUTO_TEXT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Capitalize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__CAPITALIZE = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__DIGITS = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__EDITABLE = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__GRAVITY = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__HINT = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__NUMERIC = WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__PASSWORD = WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__PHONE_NUMBER = WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Single Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__SINGLE_LINE = WIDGET_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TEXT_COLOR = WIDGET_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Typeface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TYPEFACE = WIDGET_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Text Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TEXT_SIZE = WIDGET_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Text Style</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TEXT_STYLE = WIDGET_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Text View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ImageViewImpl <em>Image View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ImageViewImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getImageView()
	 * @generated
	 */
	int IMAGE_VIEW = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__WIDGETS = WIDGET__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__BACKGROUND = WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__TOP = WIDGET__TOP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__LEFT = WIDGET__LEFT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__CLICKABLE = WIDGET__CLICKABLE;

	/**
	 * The feature id for the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__SRC = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__FADE_SCROLL_BARS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__IS_SCROLL_CONTAINER = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ButtonImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDGETS = WIDGET__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BACKGROUND = WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TOP = WIDGET__TOP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LEFT = WIDGET__LEFT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CLICKABLE = WIDGET__CLICKABLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SRC = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TARGET = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HINT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.SpinnerImpl <em>Spinner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.SpinnerImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getSpinner()
	 * @generated
	 */
	int SPINNER = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__WIDGETS = WIDGET__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__BACKGROUND = WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__TOP = WIDGET__TOP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__LEFT = WIDGET__LEFT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__CLICKABLE = WIDGET__CLICKABLE;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__PROMPT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__FADE_SCROLL_BARS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__IS_SCROLL_CONTAINER = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Spinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl <em>Edit Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.EditTextImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getEditText()
	 * @generated
	 */
	int EDIT_TEXT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__WIDGETS = WIDGET__WIDGETS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__BACKGROUND = WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Layout Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__LAYOUT_PARAMS = WIDGET__LAYOUT_PARAMS;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TOP = WIDGET__TOP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__LEFT = WIDGET__LEFT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__CLICKABLE = WIDGET__CLICKABLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__FADE_SCROLL_BARS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__IS_SCROLL_CONTAINER = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Auto Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__AUTO_LINK = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auto Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__AUTO_TEXT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Capitalize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__CAPITALIZE = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__DIGITS = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__EDITABLE = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__GRAVITY = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__HINT = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__NUMERIC = WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__PASSWORD = WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__PHONE_NUMBER = WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Single Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__SINGLE_LINE = WIDGET_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TEXT_COLOR = WIDGET_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Typeface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TYPEFACE = WIDGET_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Text Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TEXT_SIZE = WIDGET_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Text Style</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TEXT_STYLE = WIDGET_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Edit Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ValueAccessImpl <em>Value Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ValueAccessImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getValueAccess()
	 * @generated
	 */
	int VALUE_ACCESS = 32;

	/**
	 * The number of structural features of the '<em>Value Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACCESS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.StringVAImpl <em>String VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.StringVAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getStringVA()
	 * @generated
	 */
	int STRING_VA = 33;

	/**
	 * The feature id for the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VA__ACCESS = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VA__VALUE = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.IntegerVAImpl <em>Integer VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.IntegerVAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getIntegerVA()
	 * @generated
	 */
	int INTEGER_VA = 34;

	/**
	 * The feature id for the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VA__ACCESS = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VA__VALUE = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.BooleanVAImpl <em>Boolean VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.BooleanVAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getBooleanVA()
	 * @generated
	 */
	int BOOLEAN_VA = 35;

	/**
	 * The feature id for the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VA__ACCESS = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VA__VALUE = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ColorVAImpl <em>Color VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ColorVAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getColorVA()
	 * @generated
	 */
	int COLOR_VA = 36;

	/**
	 * The feature id for the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_VA__ACCESS = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_VA__VALUE = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Color VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.DimensionVAImpl <em>Dimension VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DimensionVAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getDimensionVA()
	 * @generated
	 */
	int DIMENSION_VA = 37;

	/**
	 * The feature id for the '<em><b>Constant value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_VA__CONSTANT_VALUE = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_VA__ACCESS = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_VA__VALUE = VALUE_ACCESS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dimension VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutDimensionVAImpl <em>Layout Dimension VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutDimensionVAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getLayoutDimensionVA()
	 * @generated
	 */
	int LAYOUT_DIMENSION_VA = 38;

	/**
	 * The feature id for the '<em><b>Constant value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DIMENSION_VA__CONSTANT_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Layout Dimension VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DIMENSION_VA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.AnyDrawableVAImpl <em>Any Drawable VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.AnyDrawableVAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getAnyDrawableVA()
	 * @generated
	 */
	int ANY_DRAWABLE_VA = 39;

	/**
	 * The number of structural features of the '<em>Any Drawable VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_DRAWABLE_VA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.DrawableVAImpl <em>Drawable VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DrawableVAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getDrawableVA()
	 * @generated
	 */
	int DRAWABLE_VA = 40;

	/**
	 * The feature id for the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_VA__ACCESS = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drawable VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.AnimationVAImpl <em>Animation VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.AnimationVAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getAnimationVA()
	 * @generated
	 */
	int ANIMATION_VA = 41;

	/**
	 * The feature id for the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_VA__ACCESS = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Animation VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.InterpolatorVAImpl <em>Interpolator VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.InterpolatorVAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getInterpolatorVA()
	 * @generated
	 */
	int INTERPOLATOR_VA = 42;

	/**
	 * The feature id for the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR_VA__ACCESS = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interpolator VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ValueDefinitionImpl <em>Value Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ValueDefinitionImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getValueDefinition()
	 * @generated
	 */
	int VALUE_DEFINITION = 43;

	/**
	 * The number of structural features of the '<em>Value Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.StringVDImpl <em>String VD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.StringVDImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getStringVD()
	 * @generated
	 */
	int STRING_VD = 44;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VD__VALUE = VALUE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String VD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VD_FEATURE_COUNT = VALUE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.IntegerVDImpl <em>Integer VD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.IntegerVDImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getIntegerVD()
	 * @generated
	 */
	int INTEGER_VD = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VD__VALUE = VALUE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer VD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VD_FEATURE_COUNT = VALUE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.BooleanVDImpl <em>Boolean VD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.BooleanVDImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getBooleanVD()
	 * @generated
	 */
	int BOOLEAN_VD = 46;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VD__VALUE = VALUE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean VD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VD_FEATURE_COUNT = VALUE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ColorVDImpl <em>Color VD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ColorVDImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getColorVD()
	 * @generated
	 */
	int COLOR_VD = 47;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_VD__VALUE = VALUE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color VD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_VD_FEATURE_COUNT = VALUE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.DimensionVDImpl <em>Dimension VD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DimensionVDImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getDimensionVD()
	 * @generated
	 */
	int DIMENSION_VD = 48;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_VD__VALUE = VALUE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dimension VD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_VD_FEATURE_COUNT = VALUE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ValueResourceImpl <em>Value Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ValueResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getValueResource()
	 * @generated
	 */
	int VALUE_RESOURCE = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Value Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.StringResourceImpl <em>String Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.StringResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getStringResource()
	 * @generated
	 */
	int STRING_RESOURCE = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RESOURCE__NAME = VALUE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RESOURCE__VALUE = VALUE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RESOURCE_FEATURE_COUNT = VALUE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.IntegerResourceImpl <em>Integer Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.IntegerResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getIntegerResource()
	 * @generated
	 */
	int INTEGER_RESOURCE = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RESOURCE__NAME = VALUE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RESOURCE__VALUE = VALUE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RESOURCE_FEATURE_COUNT = VALUE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.BooleanResourceImpl <em>Boolean Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.BooleanResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getBooleanResource()
	 * @generated
	 */
	int BOOLEAN_RESOURCE = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RESOURCE__NAME = VALUE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RESOURCE__VALUE = VALUE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RESOURCE_FEATURE_COUNT = VALUE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ColorResourceImpl <em>Color Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ColorResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getColorResource()
	 * @generated
	 */
	int COLOR_RESOURCE = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RESOURCE__NAME = VALUE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RESOURCE__VALUE = VALUE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RESOURCE_FEATURE_COUNT = VALUE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.DimensionResourceImpl <em>Dimension Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DimensionResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getDimensionResource()
	 * @generated
	 */
	int DIMENSION_RESOURCE = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RESOURCE__NAME = VALUE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RESOURCE__VALUE = VALUE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dimension Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RESOURCE_FEATURE_COUNT = VALUE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ArrayResourceImpl <em>Array Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ArrayResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getArrayResource()
	 * @generated
	 */
	int ARRAY_RESOURCE = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_RESOURCE__NAME = VALUE_RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Array Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_RESOURCE_FEATURE_COUNT = VALUE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.IntegerArrayResourceImpl <em>Integer Array Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.IntegerArrayResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getIntegerArrayResource()
	 * @generated
	 */
	int INTEGER_ARRAY_RESOURCE = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARRAY_RESOURCE__NAME = ARRAY_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARRAY_RESOURCE__ITEMS = ARRAY_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Array Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARRAY_RESOURCE_FEATURE_COUNT = ARRAY_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.StringArrayResourceImpl <em>String Array Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.StringArrayResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getStringArrayResource()
	 * @generated
	 */
	int STRING_ARRAY_RESOURCE = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_RESOURCE__NAME = ARRAY_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_RESOURCE__ITEMS = ARRAY_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Array Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_RESOURCE_FEATURE_COUNT = ARRAY_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TypedArrayResourceImpl <em>Typed Array Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.TypedArrayResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getTypedArrayResource()
	 * @generated
	 */
	int TYPED_ARRAY_RESOURCE = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ARRAY_RESOURCE__NAME = ARRAY_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ARRAY_RESOURCE__VALUES = ARRAY_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Array Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ARRAY_RESOURCE_FEATURE_COUNT = ARRAY_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.DrawableResourceImpl <em>Drawable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DrawableResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getDrawableResource()
	 * @generated
	 */
	int DRAWABLE_RESOURCE = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_RESOURCE__NAME = VALUE_RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Drawable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_RESOURCE_FEATURE_COUNT = VALUE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.BitmapDrawableResourceImpl <em>Bitmap Drawable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.BitmapDrawableResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getBitmapDrawableResource()
	 * @generated
	 */
	int BITMAP_DRAWABLE_RESOURCE = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_DRAWABLE_RESOURCE__NAME = DRAWABLE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_DRAWABLE_RESOURCE__FILENAME = DRAWABLE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bitmap Drawable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_DRAWABLE_RESOURCE_FEATURE_COUNT = DRAWABLE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TransitionDrawableResourceImpl <em>Transition Drawable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.TransitionDrawableResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getTransitionDrawableResource()
	 * @generated
	 */
	int TRANSITION_DRAWABLE_RESOURCE = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DRAWABLE_RESOURCE__NAME = DRAWABLE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DRAWABLE_RESOURCE__FROM = DRAWABLE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DRAWABLE_RESOURCE__TO = DRAWABLE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition Drawable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DRAWABLE_RESOURCE_FEATURE_COUNT = DRAWABLE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.MenuResourceImpl <em>Menu Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.MenuResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getMenuResource()
	 * @generated
	 */
	int MENU_RESOURCE = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Menu Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_RESOURCE__MENU_ITEMS = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_RESOURCE__SUB_MENUS = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_RESOURCE__GROUPS = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Menu Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.MenuItemImpl <em>Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.MenuItemImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getMenuItem()
	 * @generated
	 */
	int MENU_ITEM = 63;

	/**
	 * The feature id for the '<em><b>Sub Menus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__SUB_MENUS = 0;

	/**
	 * The number of structural features of the '<em>Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.MenuItemGroupImpl <em>Menu Item Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.MenuItemGroupImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getMenuItemGroup()
	 * @generated
	 */
	int MENU_ITEM_GROUP = 64;

	/**
	 * The number of structural features of the '<em>Menu Item Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_GROUP_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.SubMenuImpl <em>Sub Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.SubMenuImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getSubMenu()
	 * @generated
	 */
	int SUB_MENU = 65;

	/**
	 * The feature id for the '<em><b>Menu Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU__MENU_ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU__GROUPS = 1;

	/**
	 * The number of structural features of the '<em>Sub Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MENU_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.AnimationResourceImpl <em>Animation Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.AnimationResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getAnimationResource()
	 * @generated
	 */
	int ANIMATION_RESOURCE = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_RESOURCE__NAME = VALUE_RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Animation Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_RESOURCE_FEATURE_COUNT = VALUE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.FrameAnimationElementImpl <em>Frame Animation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.FrameAnimationElementImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getFrameAnimationElement()
	 * @generated
	 */
	int FRAME_ANIMATION_ELEMENT = 67;

	/**
	 * The number of structural features of the '<em>Frame Animation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ANIMATION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TerminalAnimationElementsImpl <em>Terminal Animation Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.TerminalAnimationElementsImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getTerminalAnimationElements()
	 * @generated
	 */
	int TERMINAL_ANIMATION_ELEMENTS = 68;

	/**
	 * The feature id for the '<em><b>From Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ANIMATION_ELEMENTS__FROM_ALPHA = FRAME_ANIMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ANIMATION_ELEMENTS__TO_ALPHA = FRAME_ANIMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Terminal Animation Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ANIMATION_ELEMENTS_FEATURE_COUNT = FRAME_ANIMATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TerminalAnimationSetImpl <em>Terminal Animation Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.TerminalAnimationSetImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getTerminalAnimationSet()
	 * @generated
	 */
	int TERMINAL_ANIMATION_SET = 69;

	/**
	 * The feature id for the '<em><b>Share Interpolator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ANIMATION_SET__SHARE_INTERPOLATOR = FRAME_ANIMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interpolator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ANIMATION_SET__INTERPOLATOR = FRAME_ANIMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ANIMATION_SET__ELEMENTS = FRAME_ANIMATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Terminal Animation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ANIMATION_SET_FEATURE_COUNT = FRAME_ANIMATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.AlphaAnimationImpl <em>Alpha Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.AlphaAnimationImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getAlphaAnimation()
	 * @generated
	 */
	int ALPHA_ANIMATION = 70;

	/**
	 * The feature id for the '<em><b>From Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_ANIMATION__FROM_ALPHA = TERMINAL_ANIMATION_ELEMENTS__FROM_ALPHA;

	/**
	 * The feature id for the '<em><b>To Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_ANIMATION__TO_ALPHA = TERMINAL_ANIMATION_ELEMENTS__TO_ALPHA;

	/**
	 * The number of structural features of the '<em>Alpha Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_ANIMATION_FEATURE_COUNT = TERMINAL_ANIMATION_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ScaleAnimationImpl <em>Scale Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ScaleAnimationImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getScaleAnimation()
	 * @generated
	 */
	int SCALE_ANIMATION = 71;

	/**
	 * The feature id for the '<em><b>From Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_ANIMATION__FROM_ALPHA = TERMINAL_ANIMATION_ELEMENTS__FROM_ALPHA;

	/**
	 * The feature id for the '<em><b>To Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_ANIMATION__TO_ALPHA = TERMINAL_ANIMATION_ELEMENTS__TO_ALPHA;

	/**
	 * The number of structural features of the '<em>Scale Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_ANIMATION_FEATURE_COUNT = TERMINAL_ANIMATION_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TranslateAnimationImpl <em>Translate Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.TranslateAnimationImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getTranslateAnimation()
	 * @generated
	 */
	int TRANSLATE_ANIMATION = 72;

	/**
	 * The feature id for the '<em><b>From Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_ANIMATION__FROM_ALPHA = TERMINAL_ANIMATION_ELEMENTS__FROM_ALPHA;

	/**
	 * The feature id for the '<em><b>To Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_ANIMATION__TO_ALPHA = TERMINAL_ANIMATION_ELEMENTS__TO_ALPHA;

	/**
	 * The number of structural features of the '<em>Translate Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_ANIMATION_FEATURE_COUNT = TERMINAL_ANIMATION_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.RotateAnimationImpl <em>Rotate Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.RotateAnimationImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getRotateAnimation()
	 * @generated
	 */
	int ROTATE_ANIMATION = 73;

	/**
	 * The feature id for the '<em><b>From Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_ANIMATION__FROM_ALPHA = TERMINAL_ANIMATION_ELEMENTS__FROM_ALPHA;

	/**
	 * The feature id for the '<em><b>To Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_ANIMATION__TO_ALPHA = TERMINAL_ANIMATION_ELEMENTS__TO_ALPHA;

	/**
	 * The number of structural features of the '<em>Rotate Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_ANIMATION_FEATURE_COUNT = TERMINAL_ANIMATION_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TweenAnimationResourceImpl <em>Tween Animation Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.TweenAnimationResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getTweenAnimationResource()
	 * @generated
	 */
	int TWEEN_ANIMATION_RESOURCE = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEEN_ANIMATION_RESOURCE__NAME = ANIMATION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEEN_ANIMATION_RESOURCE__ELEMENTS = ANIMATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tween Animation Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEEN_ANIMATION_RESOURCE_FEATURE_COUNT = ANIMATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.FrameAnimationResourceImpl <em>Frame Animation Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.FrameAnimationResourceImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getFrameAnimationResource()
	 * @generated
	 */
	int FRAME_ANIMATION_RESOURCE = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ANIMATION_RESOURCE__NAME = ANIMATION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>One Shot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ANIMATION_RESOURCE__ONE_SHOT = ANIMATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frames</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ANIMATION_RESOURCE__FRAMES = ANIMATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Frame Animation Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_ANIMATION_RESOURCE_FEATURE_COUNT = ANIMATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.AnimationFrameImpl <em>Animation Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.AnimationFrameImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getAnimationFrame()
	 * @generated
	 */
	int ANIMATION_FRAME = 76;

	/**
	 * The feature id for the '<em><b>Drawable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FRAME__DRAWABLE = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FRAME__DURATION = 1;

	/**
	 * The number of structural features of the '<em>Animation Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FRAME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.AbstractResourceAccessImpl <em>Abstract Resource Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.AbstractResourceAccessImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getAbstractResourceAccess()
	 * @generated
	 */
	int ABSTRACT_RESOURCE_ACCESS = 77;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_ACCESS__EXTERNAL_RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Abstract Resource Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESOURCE_ACCESS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ResourceAccessImpl <em>Resource Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ResourceAccessImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getResourceAccess()
	 * @generated
	 */
	int RESOURCE_ACCESS = 78;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS__EXTERNAL_RESOURCE = ABSTRACT_RESOURCE_ACCESS__EXTERNAL_RESOURCE;

	/**
	 * The number of structural features of the '<em>Resource Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_FEATURE_COUNT = ABSTRACT_RESOURCE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.StringRAImpl <em>String RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.StringRAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getStringRA()
	 * @generated
	 */
	int STRING_RA = 79;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RA__EXTERNAL_RESOURCE = RESOURCE_ACCESS__EXTERNAL_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RA__RESOURCE = RESOURCE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RA_FEATURE_COUNT = RESOURCE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.IntegerRAImpl <em>Integer RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.IntegerRAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getIntegerRA()
	 * @generated
	 */
	int INTEGER_RA = 80;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RA__EXTERNAL_RESOURCE = RESOURCE_ACCESS__EXTERNAL_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RA__RESOURCE = RESOURCE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RA_FEATURE_COUNT = RESOURCE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.BooleanRAImpl <em>Boolean RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.BooleanRAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getBooleanRA()
	 * @generated
	 */
	int BOOLEAN_RA = 81;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RA__EXTERNAL_RESOURCE = RESOURCE_ACCESS__EXTERNAL_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RA__RESOURCE = RESOURCE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RA_FEATURE_COUNT = RESOURCE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.ColorRAImpl <em>Color RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.ColorRAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getColorRA()
	 * @generated
	 */
	int COLOR_RA = 82;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RA__EXTERNAL_RESOURCE = RESOURCE_ACCESS__EXTERNAL_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RA__RESOURCE = RESOURCE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RA_FEATURE_COUNT = RESOURCE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.DimensionRAImpl <em>Dimension RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DimensionRAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getDimensionRA()
	 * @generated
	 */
	int DIMENSION_RA = 83;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RA__EXTERNAL_RESOURCE = RESOURCE_ACCESS__EXTERNAL_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RA__RESOURCE = RESOURCE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dimension RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RA_FEATURE_COUNT = RESOURCE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.DrawableRAImpl <em>Drawable RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DrawableRAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getDrawableRA()
	 * @generated
	 */
	int DRAWABLE_RA = 84;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_RA__EXTERNAL_RESOURCE = RESOURCE_ACCESS__EXTERNAL_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_RA__RESOURCE = RESOURCE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drawable RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_RA_FEATURE_COUNT = RESOURCE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.AnimationRAImpl <em>Animation RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.AnimationRAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getAnimationRA()
	 * @generated
	 */
	int ANIMATION_RA = 85;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_RA__EXTERNAL_RESOURCE = RESOURCE_ACCESS__EXTERNAL_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_RA__RESOURCE = RESOURCE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Animation RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_RA_FEATURE_COUNT = RESOURCE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.InterpolatorRAImpl <em>Interpolator RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.InterpolatorRAImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getInterpolatorRA()
	 * @generated
	 */
	int INTERPOLATOR_RA = 86;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR_RA__EXTERNAL_RESOURCE = RESOURCE_ACCESS__EXTERNAL_RESOURCE;

	/**
	 * The feature id for the '<em><b>Interpolator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR_RA__INTERPOLATOR_NAME = RESOURCE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interpolator RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATOR_RA_FEATURE_COUNT = RESOURCE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.CheckBoxImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 87;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TOP = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__LEFT = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__BACKGROUND = 6;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__CLICKABLE = 7;

	/**
	 * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__FADE_SCROLL_BARS = 8;

	/**
	 * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__IS_SCROLL_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Auto Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__AUTO_LINK = 10;

	/**
	 * The feature id for the '<em><b>Auto Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__AUTO_TEXT = 11;

	/**
	 * The feature id for the '<em><b>Capitalize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__CAPITALIZE = 12;

	/**
	 * The feature id for the '<em><b>Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__DIGITS = 13;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__EDITABLE = 14;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__GRAVITY = 15;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__HINT = 16;

	/**
	 * The feature id for the '<em><b>Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NUMERIC = 17;

	/**
	 * The feature id for the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__PASSWORD = 18;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__PHONE_NUMBER = 19;

	/**
	 * The feature id for the '<em><b>Single Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__SINGLE_LINE = 20;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TEXT_COLOR = 21;

	/**
	 * The feature id for the '<em><b>Typeface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TYPEFACE = 22;

	/**
	 * The feature id for the '<em><b>Text Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TEXT_SIZE = 23;

	/**
	 * The feature id for the '<em><b>Text Style</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TEXT_STYLE = 24;

	/**
	 * The feature id for the '<em><b>On Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__ON_CHECK = 25;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.RadioButtonImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 88;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TEXT = 1;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ON_CLICK = 2;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.RadioGroupImpl <em>Radio Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.RadioGroupImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getRadioGroup()
	 * @generated
	 */
	int RADIO_GROUP = 89;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Radio Buttons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__RADIO_BUTTONS = 1;

	/**
	 * The number of structural features of the '<em>Radio Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.impl.MenuGroupImpl <em>Menu Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.MenuGroupImpl
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getMenuGroup()
	 * @generated
	 */
	int MENU_GROUP = 90;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_GROUP__ITEMS = MENU_ITEM_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Menu Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_GROUP_FEATURE_COUNT = MENU_ITEM_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.BuiltInPermissionType <em>Built In Permission Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BuiltInPermissionType
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getBuiltInPermissionType()
	 * @generated
	 */
	int BUILT_IN_PERMISSION_TYPE = 91;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.InterpolatorsKind <em>Interpolators Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.InterpolatorsKind
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getInterpolatorsKind()
	 * @generated
	 */
	int INTERPOLATORS_KIND = 92;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutDimensionKind <em>Layout Dimension Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutDimensionKind
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getLayoutDimensionKind()
	 * @generated
	 */
	int LAYOUT_DIMENSION_KIND = 93;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind <em>Layout Gravity Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getLayoutGravityKind()
	 * @generated
	 */
	int LAYOUT_GRAVITY_KIND = 94;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutOrientationKind <em>Layout Orientation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutOrientationKind
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getLayoutOrientationKind()
	 * @generated
	 */
	int LAYOUT_ORIENTATION_KIND = 95;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutVisibilityKind <em>Layout Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutVisibilityKind
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getLayoutVisibilityKind()
	 * @generated
	 */
	int LAYOUT_VISIBILITY_KIND = 96;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.TypefaceKind <em>Typeface Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TypefaceKind
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getTypefaceKind()
	 * @generated
	 */
	int TYPEFACE_KIND = 97;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.TextStyleKind <em>Text Style Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextStyleKind
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getTextStyleKind()
	 * @generated
	 */
	int TEXT_STYLE_KIND = 98;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.AutoLinkKind <em>Auto Link Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AutoLinkKind
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getAutoLinkKind()
	 * @generated
	 */
	int AUTO_LINK_KIND = 99;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.tutorials.emf.droid.CapitalizeKind <em>Capitalize Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CapitalizeKind
	 * @see org.eclipse.amalgam.tutorials.emf.droid.impl.DroidPackageImpl#getCapitalizeKind()
	 * @generated
	 */
	int CAPITALIZE_KIND = 100;


	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.Application#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Application#getPackageName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.Application#getVersionCode <em>Version Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Code</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Application#getVersionCode()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_VersionCode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.Application#getVersionName <em>Version Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Name</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Application#getVersionName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_VersionName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Application#getSdkVersion <em>Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sdk Version</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Application#getSdkVersion()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_SdkVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.Application#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Application#getResources()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.Application#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Application#getActivities()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.Application#getLayouts <em>Layouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layouts</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Application#getLayouts()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Layouts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ApplicationUsesSDK <em>Application Uses SDK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Uses SDK</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ApplicationUsesSDK
	 * @generated
	 */
	EClass getApplicationUsesSDK();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.ApplicationUsesSDK#getMinSdkVersion <em>Min Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Sdk Version</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ApplicationUsesSDK#getMinSdkVersion()
	 * @see #getApplicationUsesSDK()
	 * @generated
	 */
	EAttribute getApplicationUsesSDK_MinSdkVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.ApplicationUsesSDK#getMaxSdkVersion <em>Max Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Sdk Version</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ApplicationUsesSDK#getMaxSdkVersion()
	 * @see #getApplicationUsesSDK()
	 * @generated
	 */
	EAttribute getApplicationUsesSDK_MaxSdkVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.ApplicationUsesSDK#getTargetSdkVersion <em>Target Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Sdk Version</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ApplicationUsesSDK#getTargetSdkVersion()
	 * @see #getApplicationUsesSDK()
	 * @generated
	 */
	EAttribute getApplicationUsesSDK_TargetSdkVersion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getAlpha()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Alpha();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getMinHeight <em>Min Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Height</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getMinHeight()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_MinHeight();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getMinWidth <em>Min Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Width</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getMinWidth()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_MinWidth();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getNextFocusDown <em>Next Focus Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Focus Down</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getNextFocusDown()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_NextFocusDown();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getNextFocusLeft <em>Next Focus Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Focus Left</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getNextFocusLeft()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_NextFocusLeft();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getNextFocusRight <em>Next Focus Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Focus Right</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getNextFocusRight()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_NextFocusRight();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getNextFocusUp <em>Next Focus Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Focus Up</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getNextFocusUp()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_NextFocusUp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getOnClick <em>On Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Click</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getOnClick()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_OnClick();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getPadding()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Padding();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getPaddingBottom <em>Padding Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding Bottom</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getPaddingBottom()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_PaddingBottom();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getPaddingLeft <em>Padding Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding Left</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getPaddingLeft()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_PaddingLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getPaddingRight <em>Padding Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding Right</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getPaddingRight()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_PaddingRight();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getPaddingTop <em>Padding Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding Top</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getPaddingTop()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_PaddingTop();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getScrollbars <em>Scrollbars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scrollbars</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getScrollbars()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Scrollbars();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getVisibility()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Visibility();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Layout#getLayoutAnimation <em>Layout Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Animation</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Layout#getLayoutAnimation()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_LayoutAnimation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractActivity <em>Abstract Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Activity</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractActivity
	 * @generated
	 */
	EClass getAbstractActivity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractActivity#getReferencedLayout <em>Referenced Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Layout</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractActivity#getReferencedLayout()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EReference getAbstractActivity_ReferencedLayout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractActivity#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Widgets</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractActivity#getWidgets()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EReference getAbstractActivity_Widgets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.GenericActivity <em>Generic Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Activity</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.GenericActivity
	 * @generated
	 */
	EClass getGenericActivity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ViewCollection <em>View Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Collection</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ViewCollection
	 * @generated
	 */
	EClass getViewCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.ViewCollection#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ViewCollection#getViews()
	 * @see #getViewCollection()
	 * @generated
	 */
	EReference getViewCollection_Views();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ListActivity <em>List Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Activity</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ListActivity
	 * @generated
	 */
	EClass getListActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.ListActivity#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ListActivity#getDataSource()
	 * @see #getListActivity()
	 * @generated
	 */
	EAttribute getListActivity_DataSource();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.ListActivity#getItemLayout <em>Item Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Layout</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ListActivity#getItemLayout()
	 * @see #getListActivity()
	 * @generated
	 */
	EReference getListActivity_ItemLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.ListActivity#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ListActivity#getActions()
	 * @see #getListActivity()
	 * @generated
	 */
	EReference getListActivity_Actions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.TabActivity <em>Tab Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Activity</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabActivity
	 * @generated
	 */
	EClass getTabActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.TabActivity#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabActivity#getTabs()
	 * @see #getTabActivity()
	 * @generated
	 */
	EReference getTabActivity_Tabs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.TabActivity#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabActivity#getActions()
	 * @see #getTabActivity()
	 * @generated
	 */
	EReference getTabActivity_Actions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Tab#getCaption()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_Caption();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Tab#getName()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Tab#getIcon()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getSelectedIcon <em>Selected Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selected Icon</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Tab#getSelectedIcon()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_SelectedIcon();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Tab#getActivity()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_Activity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Tab#getLayout()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Tab#getActions()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_Actions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ActionSet <em>Action Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Set</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ActionSet
	 * @generated
	 */
	EClass getActionSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.ActionSet#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ActionSet#getActions()
	 * @see #getActionSet()
	 * @generated
	 */
	EReference getActionSet_Actions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.GoToURLAction <em>Go To URL Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To URL Action</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.GoToURLAction
	 * @generated
	 */
	EClass getGoToURLAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.GoToURLAction#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.GoToURLAction#getUrl()
	 * @see #getGoToURLAction()
	 * @generated
	 */
	EAttribute getGoToURLAction_Url();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ShowLayoutAction <em>Show Layout Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show Layout Action</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ShowLayoutAction
	 * @generated
	 */
	EClass getShowLayoutAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.ShowLayoutAction#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ShowLayoutAction#getLayout()
	 * @see #getShowLayoutAction()
	 * @generated
	 */
	EReference getShowLayoutAction_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.InvokeActivityAction <em>Invoke Activity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke Activity Action</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.InvokeActivityAction
	 * @generated
	 */
	EClass getInvokeActivityAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.InvokeActivityAction#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.InvokeActivityAction#getActivity()
	 * @see #getInvokeActivityAction()
	 * @generated
	 */
	EReference getInvokeActivityAction_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractLinearLayout <em>Abstract Linear Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Linear Layout</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractLinearLayout
	 * @generated
	 */
	EClass getAbstractLinearLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractLinearLayout#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractLinearLayout#getOrientation()
	 * @see #getAbstractLinearLayout()
	 * @generated
	 */
	EAttribute getAbstractLinearLayout_Orientation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractView <em>Abstract View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract View</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractView
	 * @generated
	 */
	EClass getAbstractView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractView#getName()
	 * @see #getAbstractView()
	 * @generated
	 */
	EAttribute getAbstractView_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractView#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Widgets</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractView#getWidgets()
	 * @see #getAbstractView()
	 * @generated
	 */
	EReference getAbstractView_Widgets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.View#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.View#getBackground()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Background();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.LinearLayout <em>Linear Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Layout</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LinearLayout
	 * @generated
	 */
	EClass getLinearLayout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LinearLayout#getLayoutParams <em>Layout Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Params</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LinearLayout#getLayoutParams()
	 * @see #getLinearLayout()
	 * @generated
	 */
	EReference getLinearLayout_LayoutParams();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.RelativeLayout <em>Relative Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Layout</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RelativeLayout
	 * @generated
	 */
	EClass getRelativeLayout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.RelativeLayout#getLayoutParams <em>Layout Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Params</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RelativeLayout#getLayoutParams()
	 * @see #getRelativeLayout()
	 * @generated
	 */
	EReference getRelativeLayout_LayoutParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.RelativeLayout#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RelativeLayout#getOrientation()
	 * @see #getRelativeLayout()
	 * @generated
	 */
	EAttribute getRelativeLayout_Orientation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.TabHost <em>Tab Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Host</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabHost
	 * @generated
	 */
	EClass getTabHost();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TabHost#getLayoutParams <em>Layout Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Params</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabHost#getLayoutParams()
	 * @see #getTabHost()
	 * @generated
	 */
	EReference getTabHost_LayoutParams();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget <em>Tab Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Widget</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabWidget
	 * @generated
	 */
	EClass getTabWidget();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Gravity</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getGravity()
	 * @see #getTabWidget()
	 * @generated
	 */
	EAttribute getTabWidget_Gravity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getDivider <em>Divider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Divider</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getDivider()
	 * @see #getTabWidget()
	 * @generated
	 */
	EReference getTabWidget_Divider();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getTrabStripEnabled <em>Trab Strip Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trab Strip Enabled</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getTrabStripEnabled()
	 * @see #getTabWidget()
	 * @generated
	 */
	EReference getTabWidget_TrabStripEnabled();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getTrabStripLeft <em>Trab Strip Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trab Strip Left</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getTrabStripLeft()
	 * @see #getTabWidget()
	 * @generated
	 */
	EReference getTabWidget_TrabStripLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getTabStripRight <em>Tab Strip Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tab Strip Right</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getTabStripRight()
	 * @see #getTabWidget()
	 * @generated
	 */
	EReference getTabWidget_TabStripRight();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.FrameLayout <em>Frame Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Layout</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.FrameLayout
	 * @generated
	 */
	EClass getFrameLayout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams <em>Layout Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Params</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams
	 * @generated
	 */
	EClass getLayoutParams();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_height <em>Layout height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout height</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_height()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_height();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_width <em>Layout width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout width</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_width()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_width();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_weight <em>Layout weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout weight</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_weight()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_weight();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_marginBottom <em>Layout margin Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout margin Bottom</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_marginBottom()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_marginBottom();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_marginLeft <em>Layout margin Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout margin Left</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_marginLeft()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_marginLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_marginRight <em>Layout margin Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout margin Right</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_marginRight()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_marginRight();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_marginTop <em>Layout margin Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout margin Top</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_marginTop()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_marginTop();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_above <em>Layout above</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout above</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_above()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_above();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignBaseline <em>Layout align Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout align Baseline</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignBaseline()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignBaseline();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignBottom <em>Layout align Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout align Bottom</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignBottom()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignBottom();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignLeft <em>Layout align Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout align Left</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignLeft()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignParentBottom <em>Layout align Parent Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align Parent Bottom</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignParentBottom()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignParentBottom();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignParentLeft <em>Layout align Parent Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align Parent Left</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignParentLeft()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignParentLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignParentRight <em>Layout align Parent Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align Parent Right</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignParentRight()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignParentRight();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignParentTop <em>Layout align Parent Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align Parent Top</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignParentTop()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignParentTop();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignTop <em>Layout align Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout align Top</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignTop()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignTop();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignWithParentIfMissing <em>Layout align With Parent If Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align With Parent If Missing</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_alignWithParentIfMissing()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignWithParentIfMissing();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_below <em>Layout below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout below</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_below()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_below();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_centerHorizontal <em>Layout center Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout center Horizontal</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_centerHorizontal()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_centerHorizontal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_centerInParent <em>Layout center In Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout center In Parent</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_centerInParent()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_centerInParent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_centerVertical <em>Layout center Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout center Vertical</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_centerVertical()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_centerVertical();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_toLeftOf <em>Layout to Left Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout to Left Of</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_toLeftOf()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_toLeftOf();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_toRightOf <em>Layout to Right Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout to Right Of</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutParams#getLayout_toRightOf()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_toRightOf();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Widget#getLayoutParams <em>Layout Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Params</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Widget#getLayoutParams()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_LayoutParams();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Widget#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Widget#getTop()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Top();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Widget#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Widget#getLeft()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Widget#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Widget#getWidth()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Width();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Widget#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Widget#getHeight()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Height();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Widget#getClickable <em>Clickable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clickable</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Widget#getClickable()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Clickable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractTextView <em>Abstract Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Text View</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractTextView
	 * @generated
	 */
	EClass getAbstractTextView();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView <em>Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text View</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView
	 * @generated
	 */
	EClass getTextView();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getText()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getFadeScrollBars()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getIsScrollContainer()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_IsScrollContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getAutoLink <em>Auto Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Link</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getAutoLink()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_AutoLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getAutoText <em>Auto Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Text</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getAutoText()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_AutoText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getCapitalize <em>Capitalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capitalize</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getCapitalize()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_Capitalize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digits</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getDigits()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Digits();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editable</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getEditable()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Editable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getGravity()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_Gravity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hint</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getHint()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Hint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getNumeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numeric</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getNumeric()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Numeric();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getPassword()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Password();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone Number</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getPhoneNumber()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_PhoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getSingleLine <em>Single Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Line</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getSingleLine()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_SingleLine();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Color</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getTextColor()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getTypeface <em>Typeface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeface</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getTypeface()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_Typeface();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getTextSize <em>Text Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Size</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getTextSize()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_TextSize();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.amalgam.tutorials.emf.droid.TextView#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text Style</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextView#getTextStyle()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_TextStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ImageView <em>Image View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image View</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ImageView
	 * @generated
	 */
	EClass getImageView();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.ImageView#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Src</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ImageView#getSrc()
	 * @see #getImageView()
	 * @generated
	 */
	EReference getImageView_Src();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.ImageView#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ImageView#getFadeScrollBars()
	 * @see #getImageView()
	 * @generated
	 */
	EReference getImageView_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.ImageView#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ImageView#getIsScrollContainer()
	 * @see #getImageView()
	 * @generated
	 */
	EReference getImageView_IsScrollContainer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Button#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Button#getText()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Button#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Src</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Button#getSrc()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Src();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Button#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Button#getTarget()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Button#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hint</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Button#getHint()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Hint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.Spinner <em>Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spinner</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Spinner
	 * @generated
	 */
	EClass getSpinner();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Spinner#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prompt</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Spinner#getPrompt()
	 * @see #getSpinner()
	 * @generated
	 */
	EReference getSpinner_Prompt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Spinner#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Spinner#getFadeScrollBars()
	 * @see #getSpinner()
	 * @generated
	 */
	EReference getSpinner_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.Spinner#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.Spinner#getIsScrollContainer()
	 * @see #getSpinner()
	 * @generated
	 */
	EReference getSpinner_IsScrollContainer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText <em>Edit Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Text</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText
	 * @generated
	 */
	EClass getEditText();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getText()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getFadeScrollBars()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getIsScrollContainer()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_IsScrollContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getAutoLink <em>Auto Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Link</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getAutoLink()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_AutoLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getAutoText <em>Auto Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Text</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getAutoText()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_AutoText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getCapitalize <em>Capitalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capitalize</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getCapitalize()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_Capitalize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digits</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getDigits()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Digits();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editable</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getEditable()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Editable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getGravity()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_Gravity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hint</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getHint()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Hint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getNumeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numeric</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getNumeric()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Numeric();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getPassword()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Password();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone Number</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getPhoneNumber()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_PhoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getSingleLine <em>Single Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Line</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getSingleLine()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_SingleLine();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Color</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getTextColor()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getTypeface <em>Typeface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeface</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getTypeface()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_Typeface();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getTextSize <em>Text Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Size</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getTextSize()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_TextSize();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.amalgam.tutorials.emf.droid.EditText#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text Style</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.EditText#getTextStyle()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_TextStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ValueAccess <em>Value Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Access</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ValueAccess
	 * @generated
	 */
	EClass getValueAccess();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.StringVA <em>String VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String VA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringVA
	 * @generated
	 */
	EClass getStringVA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.StringVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringVA#getAccess()
	 * @see #getStringVA()
	 * @generated
	 */
	EReference getStringVA_Access();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.StringVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringVA#getValue()
	 * @see #getStringVA()
	 * @generated
	 */
	EReference getStringVA_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerVA <em>Integer VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer VA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerVA
	 * @generated
	 */
	EClass getIntegerVA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerVA#getAccess()
	 * @see #getIntegerVA()
	 * @generated
	 */
	EReference getIntegerVA_Access();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerVA#getValue()
	 * @see #getIntegerVA()
	 * @generated
	 */
	EReference getIntegerVA_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.BooleanVA <em>Boolean VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean VA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BooleanVA
	 * @generated
	 */
	EClass getBooleanVA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.BooleanVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BooleanVA#getAccess()
	 * @see #getBooleanVA()
	 * @generated
	 */
	EReference getBooleanVA_Access();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.BooleanVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BooleanVA#getValue()
	 * @see #getBooleanVA()
	 * @generated
	 */
	EReference getBooleanVA_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ColorVA <em>Color VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color VA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ColorVA
	 * @generated
	 */
	EClass getColorVA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.ColorVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ColorVA#getAccess()
	 * @see #getColorVA()
	 * @generated
	 */
	EReference getColorVA_Access();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.ColorVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ColorVA#getValue()
	 * @see #getColorVA()
	 * @generated
	 */
	EReference getColorVA_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionVA <em>Dimension VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension VA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DimensionVA
	 * @generated
	 */
	EClass getDimensionVA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DimensionVA#getAccess()
	 * @see #getDimensionVA()
	 * @generated
	 */
	EReference getDimensionVA_Access();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DimensionVA#getValue()
	 * @see #getDimensionVA()
	 * @generated
	 */
	EReference getDimensionVA_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutDimensionVA <em>Layout Dimension VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Dimension VA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutDimensionVA
	 * @generated
	 */
	EClass getLayoutDimensionVA();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutDimensionVA#getConstant_value <em>Constant value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutDimensionVA#getConstant_value()
	 * @see #getLayoutDimensionVA()
	 * @generated
	 */
	EAttribute getLayoutDimensionVA_Constant_value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.AnyDrawableVA <em>Any Drawable VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Drawable VA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnyDrawableVA
	 * @generated
	 */
	EClass getAnyDrawableVA();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.DrawableVA <em>Drawable VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawable VA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DrawableVA
	 * @generated
	 */
	EClass getDrawableVA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.DrawableVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DrawableVA#getAccess()
	 * @see #getDrawableVA()
	 * @generated
	 */
	EReference getDrawableVA_Access();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationVA <em>Animation VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation VA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnimationVA
	 * @generated
	 */
	EClass getAnimationVA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnimationVA#getAccess()
	 * @see #getAnimationVA()
	 * @generated
	 */
	EReference getAnimationVA_Access();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.InterpolatorVA <em>Interpolator VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpolator VA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.InterpolatorVA
	 * @generated
	 */
	EClass getInterpolatorVA();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.InterpolatorVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.InterpolatorVA#getAccess()
	 * @see #getInterpolatorVA()
	 * @generated
	 */
	EReference getInterpolatorVA_Access();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ValueDefinition <em>Value Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Definition</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ValueDefinition
	 * @generated
	 */
	EClass getValueDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.StringVD <em>String VD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String VD</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringVD
	 * @generated
	 */
	EClass getStringVD();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.StringVD#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringVD#getValue()
	 * @see #getStringVD()
	 * @generated
	 */
	EAttribute getStringVD_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerVD <em>Integer VD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer VD</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerVD
	 * @generated
	 */
	EClass getIntegerVD();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerVD#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerVD#getValue()
	 * @see #getIntegerVD()
	 * @generated
	 */
	EAttribute getIntegerVD_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.BooleanVD <em>Boolean VD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean VD</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BooleanVD
	 * @generated
	 */
	EClass getBooleanVD();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.BooleanVD#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BooleanVD#getValue()
	 * @see #getBooleanVD()
	 * @generated
	 */
	EAttribute getBooleanVD_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ColorVD <em>Color VD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color VD</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ColorVD
	 * @generated
	 */
	EClass getColorVD();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.ColorVD#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ColorVD#getValue()
	 * @see #getColorVD()
	 * @generated
	 */
	EAttribute getColorVD_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionVD <em>Dimension VD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension VD</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DimensionVD
	 * @generated
	 */
	EClass getDimensionVD();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionVD#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DimensionVD#getValue()
	 * @see #getDimensionVD()
	 * @generated
	 */
	EAttribute getDimensionVD_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ValueResource <em>Value Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ValueResource
	 * @generated
	 */
	EClass getValueResource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.StringResource <em>String Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringResource
	 * @generated
	 */
	EClass getStringResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.StringResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringResource#getValue()
	 * @see #getStringResource()
	 * @generated
	 */
	EAttribute getStringResource_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerResource <em>Integer Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerResource
	 * @generated
	 */
	EClass getIntegerResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerResource#getValue()
	 * @see #getIntegerResource()
	 * @generated
	 */
	EAttribute getIntegerResource_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.BooleanResource <em>Boolean Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BooleanResource
	 * @generated
	 */
	EClass getBooleanResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.BooleanResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BooleanResource#getValue()
	 * @see #getBooleanResource()
	 * @generated
	 */
	EAttribute getBooleanResource_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ColorResource <em>Color Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ColorResource
	 * @generated
	 */
	EClass getColorResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.ColorResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ColorResource#getValue()
	 * @see #getColorResource()
	 * @generated
	 */
	EAttribute getColorResource_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionResource <em>Dimension Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DimensionResource
	 * @generated
	 */
	EClass getDimensionResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DimensionResource#getValue()
	 * @see #getDimensionResource()
	 * @generated
	 */
	EAttribute getDimensionResource_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ArrayResource <em>Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ArrayResource
	 * @generated
	 */
	EClass getArrayResource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerArrayResource <em>Integer Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Array Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerArrayResource
	 * @generated
	 */
	EClass getIntegerArrayResource();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerArrayResource#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Items</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerArrayResource#getItems()
	 * @see #getIntegerArrayResource()
	 * @generated
	 */
	EAttribute getIntegerArrayResource_Items();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.StringArrayResource <em>String Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Array Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringArrayResource
	 * @generated
	 */
	EClass getStringArrayResource();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.amalgam.tutorials.emf.droid.StringArrayResource#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Items</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringArrayResource#getItems()
	 * @see #getStringArrayResource()
	 * @generated
	 */
	EAttribute getStringArrayResource_Items();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.TypedArrayResource <em>Typed Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Array Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TypedArrayResource
	 * @generated
	 */
	EClass getTypedArrayResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.TypedArrayResource#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TypedArrayResource#getValues()
	 * @see #getTypedArrayResource()
	 * @generated
	 */
	EReference getTypedArrayResource_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.DrawableResource <em>Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawable Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DrawableResource
	 * @generated
	 */
	EClass getDrawableResource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.BitmapDrawableResource <em>Bitmap Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitmap Drawable Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BitmapDrawableResource
	 * @generated
	 */
	EClass getBitmapDrawableResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.BitmapDrawableResource#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BitmapDrawableResource#getFilename()
	 * @see #getBitmapDrawableResource()
	 * @generated
	 */
	EAttribute getBitmapDrawableResource_Filename();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.TransitionDrawableResource <em>Transition Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Drawable Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TransitionDrawableResource
	 * @generated
	 */
	EClass getTransitionDrawableResource();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TransitionDrawableResource#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TransitionDrawableResource#getFrom()
	 * @see #getTransitionDrawableResource()
	 * @generated
	 */
	EReference getTransitionDrawableResource_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TransitionDrawableResource#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TransitionDrawableResource#getTo()
	 * @see #getTransitionDrawableResource()
	 * @generated
	 */
	EReference getTransitionDrawableResource_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.MenuResource <em>Menu Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.MenuResource
	 * @generated
	 */
	EClass getMenuResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.MenuResource#getMenuItems <em>Menu Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu Items</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.MenuResource#getMenuItems()
	 * @see #getMenuResource()
	 * @generated
	 */
	EReference getMenuResource_MenuItems();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.MenuResource#getSubMenus <em>Sub Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Menus</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.MenuResource#getSubMenus()
	 * @see #getMenuResource()
	 * @generated
	 */
	EReference getMenuResource_SubMenus();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.MenuResource#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.MenuResource#getGroups()
	 * @see #getMenuResource()
	 * @generated
	 */
	EReference getMenuResource_Groups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Item</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.MenuItem
	 * @generated
	 */
	EClass getMenuItem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.MenuItem#getSubMenus <em>Sub Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Menus</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.MenuItem#getSubMenus()
	 * @see #getMenuItem()
	 * @generated
	 */
	EReference getMenuItem_SubMenus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.MenuItemGroup <em>Menu Item Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Item Group</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.MenuItemGroup
	 * @generated
	 */
	EClass getMenuItemGroup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.SubMenu <em>Sub Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Menu</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.SubMenu
	 * @generated
	 */
	EClass getSubMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.SubMenu#getMenuItems <em>Menu Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu Items</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.SubMenu#getMenuItems()
	 * @see #getSubMenu()
	 * @generated
	 */
	EReference getSubMenu_MenuItems();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.SubMenu#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.SubMenu#getGroups()
	 * @see #getSubMenu()
	 * @generated
	 */
	EReference getSubMenu_Groups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationResource <em>Animation Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnimationResource
	 * @generated
	 */
	EClass getAnimationResource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationElement <em>Frame Animation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Animation Element</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationElement
	 * @generated
	 */
	EClass getFrameAnimationElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationElements <em>Terminal Animation Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Animation Elements</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationElements
	 * @generated
	 */
	EClass getTerminalAnimationElements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationElements#getFromAlpha <em>From Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Alpha</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationElements#getFromAlpha()
	 * @see #getTerminalAnimationElements()
	 * @generated
	 */
	EAttribute getTerminalAnimationElements_FromAlpha();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationElements#getToAlpha <em>To Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Alpha</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationElements#getToAlpha()
	 * @see #getTerminalAnimationElements()
	 * @generated
	 */
	EAttribute getTerminalAnimationElements_ToAlpha();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet <em>Terminal Animation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Animation Set</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet
	 * @generated
	 */
	EClass getTerminalAnimationSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet#isShareInterpolator <em>Share Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Share Interpolator</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet#isShareInterpolator()
	 * @see #getTerminalAnimationSet()
	 * @generated
	 */
	EAttribute getTerminalAnimationSet_ShareInterpolator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet#getInterpolator <em>Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interpolator</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet#getInterpolator()
	 * @see #getTerminalAnimationSet()
	 * @generated
	 */
	EReference getTerminalAnimationSet_Interpolator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet#getElements()
	 * @see #getTerminalAnimationSet()
	 * @generated
	 */
	EReference getTerminalAnimationSet_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.AlphaAnimation <em>Alpha Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alpha Animation</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AlphaAnimation
	 * @generated
	 */
	EClass getAlphaAnimation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ScaleAnimation <em>Scale Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale Animation</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ScaleAnimation
	 * @generated
	 */
	EClass getScaleAnimation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.TranslateAnimation <em>Translate Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translate Animation</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TranslateAnimation
	 * @generated
	 */
	EClass getTranslateAnimation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.RotateAnimation <em>Rotate Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate Animation</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RotateAnimation
	 * @generated
	 */
	EClass getRotateAnimation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.TweenAnimationResource <em>Tween Animation Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tween Animation Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TweenAnimationResource
	 * @generated
	 */
	EClass getTweenAnimationResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.TweenAnimationResource#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TweenAnimationResource#getElements()
	 * @see #getTweenAnimationResource()
	 * @generated
	 */
	EReference getTweenAnimationResource_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationResource <em>Frame Animation Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Animation Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationResource
	 * @generated
	 */
	EClass getFrameAnimationResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationResource#isOneShot <em>One Shot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One Shot</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationResource#isOneShot()
	 * @see #getFrameAnimationResource()
	 * @generated
	 */
	EAttribute getFrameAnimationResource_OneShot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationResource#getFrames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frames</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationResource#getFrames()
	 * @see #getFrameAnimationResource()
	 * @generated
	 */
	EReference getFrameAnimationResource_Frames();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationFrame <em>Animation Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation Frame</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnimationFrame
	 * @generated
	 */
	EClass getAnimationFrame();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationFrame#getDrawable <em>Drawable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drawable</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnimationFrame#getDrawable()
	 * @see #getAnimationFrame()
	 * @generated
	 */
	EReference getAnimationFrame_Drawable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationFrame#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnimationFrame#getDuration()
	 * @see #getAnimationFrame()
	 * @generated
	 */
	EAttribute getAnimationFrame_Duration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractResourceAccess <em>Abstract Resource Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Resource Access</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractResourceAccess
	 * @generated
	 */
	EClass getAbstractResourceAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.AbstractResourceAccess#getExternalResource <em>External Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AbstractResourceAccess#getExternalResource()
	 * @see #getAbstractResourceAccess()
	 * @generated
	 */
	EAttribute getAbstractResourceAccess_ExternalResource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ResourceAccess <em>Resource Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Access</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ResourceAccess
	 * @generated
	 */
	EClass getResourceAccess();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.StringRA <em>String RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String RA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringRA
	 * @generated
	 */
	EClass getStringRA();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.StringRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.StringRA#getResource()
	 * @see #getStringRA()
	 * @generated
	 */
	EReference getStringRA_Resource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerRA <em>Integer RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer RA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerRA
	 * @generated
	 */
	EClass getIntegerRA();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.IntegerRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.IntegerRA#getResource()
	 * @see #getIntegerRA()
	 * @generated
	 */
	EReference getIntegerRA_Resource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.BooleanRA <em>Boolean RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean RA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BooleanRA
	 * @generated
	 */
	EClass getBooleanRA();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.BooleanRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BooleanRA#getResource()
	 * @see #getBooleanRA()
	 * @generated
	 */
	EReference getBooleanRA_Resource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.ColorRA <em>Color RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color RA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ColorRA
	 * @generated
	 */
	EClass getColorRA();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.ColorRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.ColorRA#getResource()
	 * @see #getColorRA()
	 * @generated
	 */
	EReference getColorRA_Resource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionRA <em>Dimension RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension RA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DimensionRA
	 * @generated
	 */
	EClass getDimensionRA();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.DimensionRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DimensionRA#getResource()
	 * @see #getDimensionRA()
	 * @generated
	 */
	EReference getDimensionRA_Resource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.DrawableRA <em>Drawable RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawable RA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DrawableRA
	 * @generated
	 */
	EClass getDrawableRA();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.DrawableRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DrawableRA#getResource()
	 * @see #getDrawableRA()
	 * @generated
	 */
	EReference getDrawableRA_Resource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationRA <em>Animation RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation RA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnimationRA
	 * @generated
	 */
	EClass getAnimationRA();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AnimationRA#getResource()
	 * @see #getAnimationRA()
	 * @generated
	 */
	EReference getAnimationRA_Resource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.InterpolatorRA <em>Interpolator RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpolator RA</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.InterpolatorRA
	 * @generated
	 */
	EClass getInterpolatorRA();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.InterpolatorRA#getInterpolatorName <em>Interpolator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolator Name</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.InterpolatorRA#getInterpolatorName()
	 * @see #getInterpolatorRA()
	 * @generated
	 */
	EAttribute getInterpolatorRA_InterpolatorName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getName()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getText()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTop()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Top();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getLeft()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getWidth()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Width();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getHeight()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Height();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getBackground()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Background();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getClickable <em>Clickable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clickable</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getClickable()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Clickable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getFadeScrollBars()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getIsScrollContainer()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_IsScrollContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getAutoLink <em>Auto Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Link</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getAutoLink()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_AutoLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getAutoText <em>Auto Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Text</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getAutoText()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_AutoText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getCapitalize <em>Capitalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capitalize</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getCapitalize()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Capitalize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digits</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getDigits()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Digits();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editable</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getEditable()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Editable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getGravity()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Gravity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hint</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getHint()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Hint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getNumeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numeric</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getNumeric()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Numeric();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getPassword()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Password();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone Number</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getPhoneNumber()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_PhoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getSingleLine <em>Single Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Line</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getSingleLine()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_SingleLine();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Color</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTextColor()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTypeface <em>Typeface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeface</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTypeface()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Typeface();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTextSize <em>Text Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Size</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTextSize()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_TextSize();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text Style</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTextStyle()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_TextStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getOnCheck <em>On Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Check</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getOnCheck()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_OnCheck();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.RadioButton#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RadioButton#getName()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.RadioButton#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RadioButton#getText()
	 * @see #getRadioButton()
	 * @generated
	 */
	EReference getRadioButton_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.emf.droid.RadioButton#getOnClick <em>On Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Click</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RadioButton#getOnClick()
	 * @see #getRadioButton()
	 * @generated
	 */
	EReference getRadioButton_OnClick();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.RadioGroup <em>Radio Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Group</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RadioGroup
	 * @generated
	 */
	EClass getRadioGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.emf.droid.RadioGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RadioGroup#getName()
	 * @see #getRadioGroup()
	 * @generated
	 */
	EAttribute getRadioGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.RadioGroup#getRadioButtons <em>Radio Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Radio Buttons</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.RadioGroup#getRadioButtons()
	 * @see #getRadioGroup()
	 * @generated
	 */
	EReference getRadioGroup_RadioButtons();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.emf.droid.MenuGroup <em>Menu Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Group</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.MenuGroup
	 * @generated
	 */
	EClass getMenuGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.emf.droid.MenuGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.MenuGroup#getItems()
	 * @see #getMenuGroup()
	 * @generated
	 */
	EReference getMenuGroup_Items();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.tutorials.emf.droid.BuiltInPermissionType <em>Built In Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Built In Permission Type</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.BuiltInPermissionType
	 * @generated
	 */
	EEnum getBuiltInPermissionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.tutorials.emf.droid.InterpolatorsKind <em>Interpolators Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interpolators Kind</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.InterpolatorsKind
	 * @generated
	 */
	EEnum getInterpolatorsKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutDimensionKind <em>Layout Dimension Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Dimension Kind</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutDimensionKind
	 * @generated
	 */
	EEnum getLayoutDimensionKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind <em>Layout Gravity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Gravity Kind</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind
	 * @generated
	 */
	EEnum getLayoutGravityKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutOrientationKind <em>Layout Orientation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Orientation Kind</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutOrientationKind
	 * @generated
	 */
	EEnum getLayoutOrientationKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.tutorials.emf.droid.LayoutVisibilityKind <em>Layout Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Visibility Kind</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutVisibilityKind
	 * @generated
	 */
	EEnum getLayoutVisibilityKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.tutorials.emf.droid.TypefaceKind <em>Typeface Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Typeface Kind</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TypefaceKind
	 * @generated
	 */
	EEnum getTypefaceKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.tutorials.emf.droid.TextStyleKind <em>Text Style Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Style Kind</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextStyleKind
	 * @generated
	 */
	EEnum getTextStyleKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.tutorials.emf.droid.AutoLinkKind <em>Auto Link Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auto Link Kind</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AutoLinkKind
	 * @generated
	 */
	EEnum getAutoLinkKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.tutorials.emf.droid.CapitalizeKind <em>Capitalize Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Capitalize Kind</em>'.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CapitalizeKind
	 * @generated
	 */
	EEnum getCapitalizeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DroidFactory getDroidFactory();

} //DroidPackage
