/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;

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
 * @see droid.DroidFactory
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
	DroidPackage eINSTANCE = droid.impl.DroidPackageImpl.init();

	/**
	 * The meta object id for the '{@link droid.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ApplicationImpl
	 * @see droid.impl.DroidPackageImpl#getApplication()
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
	 * The meta object id for the '{@link droid.impl.ApplicationUsesSDKImpl <em>Application Uses SDK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ApplicationUsesSDKImpl
	 * @see droid.impl.DroidPackageImpl#getApplicationUsesSDK()
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
	 * The meta object id for the '{@link droid.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ResourceImpl
	 * @see droid.impl.DroidPackageImpl#getResource()
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
	 * The meta object id for the '{@link droid.impl.AbstractViewImpl <em>Abstract View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.AbstractViewImpl
	 * @see droid.impl.DroidPackageImpl#getAbstractView()
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
	 * The meta object id for the '{@link droid.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ViewImpl
	 * @see droid.impl.DroidPackageImpl#getView()
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
	 * The meta object id for the '{@link droid.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.LayoutImpl
	 * @see droid.impl.DroidPackageImpl#getLayout()
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
	 * The meta object id for the '{@link droid.impl.AbstractActivityImpl <em>Abstract Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.AbstractActivityImpl
	 * @see droid.impl.DroidPackageImpl#getAbstractActivity()
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
	 * The meta object id for the '{@link droid.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ActivityImpl
	 * @see droid.impl.DroidPackageImpl#getActivity()
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
	 * The meta object id for the '{@link droid.impl.GenericActivityImpl <em>Generic Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.GenericActivityImpl
	 * @see droid.impl.DroidPackageImpl#getGenericActivity()
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
	 * The meta object id for the '{@link droid.impl.ViewCollectionImpl <em>View Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ViewCollectionImpl
	 * @see droid.impl.DroidPackageImpl#getViewCollection()
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
	 * The meta object id for the '{@link droid.impl.ListActivityImpl <em>List Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ListActivityImpl
	 * @see droid.impl.DroidPackageImpl#getListActivity()
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
	 * The meta object id for the '{@link droid.impl.TabActivityImpl <em>Tab Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.TabActivityImpl
	 * @see droid.impl.DroidPackageImpl#getTabActivity()
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
	 * The meta object id for the '{@link droid.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.TabImpl
	 * @see droid.impl.DroidPackageImpl#getTab()
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
	 * The meta object id for the '{@link droid.impl.ActionSetImpl <em>Action Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ActionSetImpl
	 * @see droid.impl.DroidPackageImpl#getActionSet()
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
	 * The meta object id for the '{@link droid.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ActionImpl
	 * @see droid.impl.DroidPackageImpl#getAction()
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
	 * The meta object id for the '{@link droid.impl.GoToURLActionImpl <em>Go To URL Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.GoToURLActionImpl
	 * @see droid.impl.DroidPackageImpl#getGoToURLAction()
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
	 * The meta object id for the '{@link droid.impl.ShowLayoutActionImpl <em>Show Layout Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ShowLayoutActionImpl
	 * @see droid.impl.DroidPackageImpl#getShowLayoutAction()
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
	 * The meta object id for the '{@link droid.impl.InvokeActivityActionImpl <em>Invoke Activity Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.InvokeActivityActionImpl
	 * @see droid.impl.DroidPackageImpl#getInvokeActivityAction()
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
	 * The meta object id for the '{@link droid.impl.AbstractLinearLayoutImpl <em>Abstract Linear Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.AbstractLinearLayoutImpl
	 * @see droid.impl.DroidPackageImpl#getAbstractLinearLayout()
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
	 * The meta object id for the '{@link droid.impl.LinearLayoutImpl <em>Linear Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.LinearLayoutImpl
	 * @see droid.impl.DroidPackageImpl#getLinearLayout()
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
	 * The meta object id for the '{@link droid.impl.RelativeLayoutImpl <em>Relative Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.RelativeLayoutImpl
	 * @see droid.impl.DroidPackageImpl#getRelativeLayout()
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
	 * The meta object id for the '{@link droid.impl.TabHostImpl <em>Tab Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.TabHostImpl
	 * @see droid.impl.DroidPackageImpl#getTabHost()
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
	 * The meta object id for the '{@link droid.impl.TabWidgetImpl <em>Tab Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.TabWidgetImpl
	 * @see droid.impl.DroidPackageImpl#getTabWidget()
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
	 * The meta object id for the '{@link droid.impl.FrameLayoutImpl <em>Frame Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.FrameLayoutImpl
	 * @see droid.impl.DroidPackageImpl#getFrameLayout()
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
	 * The meta object id for the '{@link droid.impl.LayoutParamsImpl <em>Layout Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.LayoutParamsImpl
	 * @see droid.impl.DroidPackageImpl#getLayoutParams()
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
	 * The meta object id for the '{@link droid.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.WidgetImpl
	 * @see droid.impl.DroidPackageImpl#getWidget()
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
	 * The meta object id for the '{@link droid.impl.AbstractTextViewImpl <em>Abstract Text View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.AbstractTextViewImpl
	 * @see droid.impl.DroidPackageImpl#getAbstractTextView()
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
	 * The meta object id for the '{@link droid.impl.TextViewImpl <em>Text View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.TextViewImpl
	 * @see droid.impl.DroidPackageImpl#getTextView()
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
	 * The meta object id for the '{@link droid.impl.ImageViewImpl <em>Image View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ImageViewImpl
	 * @see droid.impl.DroidPackageImpl#getImageView()
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
	 * The meta object id for the '{@link droid.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ButtonImpl
	 * @see droid.impl.DroidPackageImpl#getButton()
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
	 * The meta object id for the '{@link droid.impl.SpinnerImpl <em>Spinner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.SpinnerImpl
	 * @see droid.impl.DroidPackageImpl#getSpinner()
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
	 * The meta object id for the '{@link droid.impl.EditTextImpl <em>Edit Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.EditTextImpl
	 * @see droid.impl.DroidPackageImpl#getEditText()
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
	 * The meta object id for the '{@link droid.impl.ValueAccessImpl <em>Value Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ValueAccessImpl
	 * @see droid.impl.DroidPackageImpl#getValueAccess()
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
	 * The meta object id for the '{@link droid.impl.StringVAImpl <em>String VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.StringVAImpl
	 * @see droid.impl.DroidPackageImpl#getStringVA()
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
	 * The meta object id for the '{@link droid.impl.IntegerVAImpl <em>Integer VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.IntegerVAImpl
	 * @see droid.impl.DroidPackageImpl#getIntegerVA()
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
	 * The meta object id for the '{@link droid.impl.BooleanVAImpl <em>Boolean VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.BooleanVAImpl
	 * @see droid.impl.DroidPackageImpl#getBooleanVA()
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
	 * The meta object id for the '{@link droid.impl.ColorVAImpl <em>Color VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ColorVAImpl
	 * @see droid.impl.DroidPackageImpl#getColorVA()
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
	 * The meta object id for the '{@link droid.impl.DimensionVAImpl <em>Dimension VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.DimensionVAImpl
	 * @see droid.impl.DroidPackageImpl#getDimensionVA()
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
	 * The meta object id for the '{@link droid.impl.LayoutDimensionVAImpl <em>Layout Dimension VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.LayoutDimensionVAImpl
	 * @see droid.impl.DroidPackageImpl#getLayoutDimensionVA()
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
	 * The meta object id for the '{@link droid.impl.AnyDrawableVAImpl <em>Any Drawable VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.AnyDrawableVAImpl
	 * @see droid.impl.DroidPackageImpl#getAnyDrawableVA()
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
	 * The meta object id for the '{@link droid.impl.DrawableVAImpl <em>Drawable VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.DrawableVAImpl
	 * @see droid.impl.DroidPackageImpl#getDrawableVA()
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
	 * The meta object id for the '{@link droid.impl.AnimationVAImpl <em>Animation VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.AnimationVAImpl
	 * @see droid.impl.DroidPackageImpl#getAnimationVA()
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
	 * The meta object id for the '{@link droid.impl.InterpolatorVAImpl <em>Interpolator VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.InterpolatorVAImpl
	 * @see droid.impl.DroidPackageImpl#getInterpolatorVA()
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
	 * The meta object id for the '{@link droid.impl.ValueDefinitionImpl <em>Value Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ValueDefinitionImpl
	 * @see droid.impl.DroidPackageImpl#getValueDefinition()
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
	 * The meta object id for the '{@link droid.impl.StringVDImpl <em>String VD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.StringVDImpl
	 * @see droid.impl.DroidPackageImpl#getStringVD()
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
	 * The meta object id for the '{@link droid.impl.IntegerVDImpl <em>Integer VD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.IntegerVDImpl
	 * @see droid.impl.DroidPackageImpl#getIntegerVD()
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
	 * The meta object id for the '{@link droid.impl.BooleanVDImpl <em>Boolean VD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.BooleanVDImpl
	 * @see droid.impl.DroidPackageImpl#getBooleanVD()
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
	 * The meta object id for the '{@link droid.impl.ColorVDImpl <em>Color VD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ColorVDImpl
	 * @see droid.impl.DroidPackageImpl#getColorVD()
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
	 * The meta object id for the '{@link droid.impl.DimensionVDImpl <em>Dimension VD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.DimensionVDImpl
	 * @see droid.impl.DroidPackageImpl#getDimensionVD()
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
	 * The meta object id for the '{@link droid.impl.ValueResourceImpl <em>Value Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ValueResourceImpl
	 * @see droid.impl.DroidPackageImpl#getValueResource()
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
	 * The meta object id for the '{@link droid.impl.StringResourceImpl <em>String Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.StringResourceImpl
	 * @see droid.impl.DroidPackageImpl#getStringResource()
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
	 * The meta object id for the '{@link droid.impl.IntegerResourceImpl <em>Integer Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.IntegerResourceImpl
	 * @see droid.impl.DroidPackageImpl#getIntegerResource()
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
	 * The meta object id for the '{@link droid.impl.BooleanResourceImpl <em>Boolean Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.BooleanResourceImpl
	 * @see droid.impl.DroidPackageImpl#getBooleanResource()
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
	 * The meta object id for the '{@link droid.impl.ColorResourceImpl <em>Color Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ColorResourceImpl
	 * @see droid.impl.DroidPackageImpl#getColorResource()
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
	 * The meta object id for the '{@link droid.impl.DimensionResourceImpl <em>Dimension Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.DimensionResourceImpl
	 * @see droid.impl.DroidPackageImpl#getDimensionResource()
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
	 * The meta object id for the '{@link droid.impl.ArrayResourceImpl <em>Array Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ArrayResourceImpl
	 * @see droid.impl.DroidPackageImpl#getArrayResource()
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
	 * The meta object id for the '{@link droid.impl.IntegerArrayResourceImpl <em>Integer Array Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.IntegerArrayResourceImpl
	 * @see droid.impl.DroidPackageImpl#getIntegerArrayResource()
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
	 * The meta object id for the '{@link droid.impl.StringArrayResourceImpl <em>String Array Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.StringArrayResourceImpl
	 * @see droid.impl.DroidPackageImpl#getStringArrayResource()
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
	 * The meta object id for the '{@link droid.impl.TypedArrayResourceImpl <em>Typed Array Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.TypedArrayResourceImpl
	 * @see droid.impl.DroidPackageImpl#getTypedArrayResource()
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
	 * The meta object id for the '{@link droid.impl.DrawableResourceImpl <em>Drawable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.DrawableResourceImpl
	 * @see droid.impl.DroidPackageImpl#getDrawableResource()
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
	 * The meta object id for the '{@link droid.impl.BitmapDrawableResourceImpl <em>Bitmap Drawable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.BitmapDrawableResourceImpl
	 * @see droid.impl.DroidPackageImpl#getBitmapDrawableResource()
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
	 * The meta object id for the '{@link droid.impl.TransitionDrawableResourceImpl <em>Transition Drawable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.TransitionDrawableResourceImpl
	 * @see droid.impl.DroidPackageImpl#getTransitionDrawableResource()
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
	 * The meta object id for the '{@link droid.impl.MenuResourceImpl <em>Menu Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.MenuResourceImpl
	 * @see droid.impl.DroidPackageImpl#getMenuResource()
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
	 * The meta object id for the '{@link droid.impl.MenuItemImpl <em>Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.MenuItemImpl
	 * @see droid.impl.DroidPackageImpl#getMenuItem()
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
	 * The meta object id for the '{@link droid.impl.MenuItemGroupImpl <em>Menu Item Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.MenuItemGroupImpl
	 * @see droid.impl.DroidPackageImpl#getMenuItemGroup()
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
	 * The meta object id for the '{@link droid.impl.SubMenuImpl <em>Sub Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.SubMenuImpl
	 * @see droid.impl.DroidPackageImpl#getSubMenu()
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
	 * The meta object id for the '{@link droid.impl.AnimationResourceImpl <em>Animation Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.AnimationResourceImpl
	 * @see droid.impl.DroidPackageImpl#getAnimationResource()
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
	 * The meta object id for the '{@link droid.impl.FrameAnimationElementImpl <em>Frame Animation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.FrameAnimationElementImpl
	 * @see droid.impl.DroidPackageImpl#getFrameAnimationElement()
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
	 * The meta object id for the '{@link droid.impl.TerminalAnimationElementsImpl <em>Terminal Animation Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.TerminalAnimationElementsImpl
	 * @see droid.impl.DroidPackageImpl#getTerminalAnimationElements()
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
	 * The meta object id for the '{@link droid.impl.TerminalAnimationSetImpl <em>Terminal Animation Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.TerminalAnimationSetImpl
	 * @see droid.impl.DroidPackageImpl#getTerminalAnimationSet()
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
	 * The meta object id for the '{@link droid.impl.AlphaAnimationImpl <em>Alpha Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.AlphaAnimationImpl
	 * @see droid.impl.DroidPackageImpl#getAlphaAnimation()
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
	 * The meta object id for the '{@link droid.impl.ScaleAnimationImpl <em>Scale Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ScaleAnimationImpl
	 * @see droid.impl.DroidPackageImpl#getScaleAnimation()
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
	 * The meta object id for the '{@link droid.impl.TranslateAnimationImpl <em>Translate Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.TranslateAnimationImpl
	 * @see droid.impl.DroidPackageImpl#getTranslateAnimation()
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
	 * The meta object id for the '{@link droid.impl.RotateAnimationImpl <em>Rotate Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.RotateAnimationImpl
	 * @see droid.impl.DroidPackageImpl#getRotateAnimation()
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
	 * The meta object id for the '{@link droid.impl.TweenAnimationResourceImpl <em>Tween Animation Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.TweenAnimationResourceImpl
	 * @see droid.impl.DroidPackageImpl#getTweenAnimationResource()
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
	 * The meta object id for the '{@link droid.impl.FrameAnimationResourceImpl <em>Frame Animation Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.FrameAnimationResourceImpl
	 * @see droid.impl.DroidPackageImpl#getFrameAnimationResource()
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
	 * The meta object id for the '{@link droid.impl.AnimationFrameImpl <em>Animation Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.AnimationFrameImpl
	 * @see droid.impl.DroidPackageImpl#getAnimationFrame()
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
	 * The meta object id for the '{@link droid.impl.AbstractResourceAccessImpl <em>Abstract Resource Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.AbstractResourceAccessImpl
	 * @see droid.impl.DroidPackageImpl#getAbstractResourceAccess()
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
	 * The meta object id for the '{@link droid.impl.ResourceAccessImpl <em>Resource Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ResourceAccessImpl
	 * @see droid.impl.DroidPackageImpl#getResourceAccess()
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
	 * The meta object id for the '{@link droid.impl.StringRAImpl <em>String RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.StringRAImpl
	 * @see droid.impl.DroidPackageImpl#getStringRA()
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
	 * The meta object id for the '{@link droid.impl.IntegerRAImpl <em>Integer RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.IntegerRAImpl
	 * @see droid.impl.DroidPackageImpl#getIntegerRA()
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
	 * The meta object id for the '{@link droid.impl.BooleanRAImpl <em>Boolean RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.BooleanRAImpl
	 * @see droid.impl.DroidPackageImpl#getBooleanRA()
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
	 * The meta object id for the '{@link droid.impl.ColorRAImpl <em>Color RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ColorRAImpl
	 * @see droid.impl.DroidPackageImpl#getColorRA()
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
	 * The meta object id for the '{@link droid.impl.DimensionRAImpl <em>Dimension RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.DimensionRAImpl
	 * @see droid.impl.DroidPackageImpl#getDimensionRA()
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
	 * The meta object id for the '{@link droid.impl.DrawableRAImpl <em>Drawable RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.DrawableRAImpl
	 * @see droid.impl.DroidPackageImpl#getDrawableRA()
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
	 * The meta object id for the '{@link droid.impl.AnimationRAImpl <em>Animation RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.AnimationRAImpl
	 * @see droid.impl.DroidPackageImpl#getAnimationRA()
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
	 * The meta object id for the '{@link droid.impl.InterpolatorRAImpl <em>Interpolator RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.InterpolatorRAImpl
	 * @see droid.impl.DroidPackageImpl#getInterpolatorRA()
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
	 * The meta object id for the '{@link droid.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.CheckBoxImpl
	 * @see droid.impl.DroidPackageImpl#getCheckBox()
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
	 * The meta object id for the '{@link droid.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.RadioButtonImpl
	 * @see droid.impl.DroidPackageImpl#getRadioButton()
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
	 * The meta object id for the '{@link droid.impl.RadioGroupImpl <em>Radio Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.RadioGroupImpl
	 * @see droid.impl.DroidPackageImpl#getRadioGroup()
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
	 * The meta object id for the '{@link droid.impl.MenuGroupImpl <em>Menu Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.MenuGroupImpl
	 * @see droid.impl.DroidPackageImpl#getMenuGroup()
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
	 * The meta object id for the '{@link droid.BuiltInPermissionType <em>Built In Permission Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.BuiltInPermissionType
	 * @see droid.impl.DroidPackageImpl#getBuiltInPermissionType()
	 * @generated
	 */
	int BUILT_IN_PERMISSION_TYPE = 91;

	/**
	 * The meta object id for the '{@link droid.InterpolatorsKind <em>Interpolators Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.InterpolatorsKind
	 * @see droid.impl.DroidPackageImpl#getInterpolatorsKind()
	 * @generated
	 */
	int INTERPOLATORS_KIND = 92;

	/**
	 * The meta object id for the '{@link droid.LayoutDimensionKind <em>Layout Dimension Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.LayoutDimensionKind
	 * @see droid.impl.DroidPackageImpl#getLayoutDimensionKind()
	 * @generated
	 */
	int LAYOUT_DIMENSION_KIND = 93;

	/**
	 * The meta object id for the '{@link droid.LayoutGravityKind <em>Layout Gravity Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.LayoutGravityKind
	 * @see droid.impl.DroidPackageImpl#getLayoutGravityKind()
	 * @generated
	 */
	int LAYOUT_GRAVITY_KIND = 94;

	/**
	 * The meta object id for the '{@link droid.LayoutOrientationKind <em>Layout Orientation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.LayoutOrientationKind
	 * @see droid.impl.DroidPackageImpl#getLayoutOrientationKind()
	 * @generated
	 */
	int LAYOUT_ORIENTATION_KIND = 95;

	/**
	 * The meta object id for the '{@link droid.LayoutVisibilityKind <em>Layout Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.LayoutVisibilityKind
	 * @see droid.impl.DroidPackageImpl#getLayoutVisibilityKind()
	 * @generated
	 */
	int LAYOUT_VISIBILITY_KIND = 96;

	/**
	 * The meta object id for the '{@link droid.TypefaceKind <em>Typeface Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.TypefaceKind
	 * @see droid.impl.DroidPackageImpl#getTypefaceKind()
	 * @generated
	 */
	int TYPEFACE_KIND = 97;

	/**
	 * The meta object id for the '{@link droid.TextStyleKind <em>Text Style Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.TextStyleKind
	 * @see droid.impl.DroidPackageImpl#getTextStyleKind()
	 * @generated
	 */
	int TEXT_STYLE_KIND = 98;

	/**
	 * The meta object id for the '{@link droid.AutoLinkKind <em>Auto Link Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.AutoLinkKind
	 * @see droid.impl.DroidPackageImpl#getAutoLinkKind()
	 * @generated
	 */
	int AUTO_LINK_KIND = 99;

	/**
	 * The meta object id for the '{@link droid.CapitalizeKind <em>Capitalize Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.CapitalizeKind
	 * @see droid.impl.DroidPackageImpl#getCapitalizeKind()
	 * @generated
	 */
	int CAPITALIZE_KIND = 100;


	/**
	 * Returns the meta object for class '{@link droid.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see droid.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link droid.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see droid.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link droid.Application#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see droid.Application#getPackageName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link droid.Application#getVersionCode <em>Version Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Code</em>'.
	 * @see droid.Application#getVersionCode()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_VersionCode();

	/**
	 * Returns the meta object for the attribute '{@link droid.Application#getVersionName <em>Version Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Name</em>'.
	 * @see droid.Application#getVersionName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_VersionName();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Application#getSdkVersion <em>Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sdk Version</em>'.
	 * @see droid.Application#getSdkVersion()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_SdkVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.Application#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see droid.Application#getResources()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.Application#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see droid.Application#getActivities()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.Application#getLayouts <em>Layouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layouts</em>'.
	 * @see droid.Application#getLayouts()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Layouts();

	/**
	 * Returns the meta object for class '{@link droid.ApplicationUsesSDK <em>Application Uses SDK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Uses SDK</em>'.
	 * @see droid.ApplicationUsesSDK
	 * @generated
	 */
	EClass getApplicationUsesSDK();

	/**
	 * Returns the meta object for the attribute '{@link droid.ApplicationUsesSDK#getMinSdkVersion <em>Min Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Sdk Version</em>'.
	 * @see droid.ApplicationUsesSDK#getMinSdkVersion()
	 * @see #getApplicationUsesSDK()
	 * @generated
	 */
	EAttribute getApplicationUsesSDK_MinSdkVersion();

	/**
	 * Returns the meta object for the attribute '{@link droid.ApplicationUsesSDK#getMaxSdkVersion <em>Max Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Sdk Version</em>'.
	 * @see droid.ApplicationUsesSDK#getMaxSdkVersion()
	 * @see #getApplicationUsesSDK()
	 * @generated
	 */
	EAttribute getApplicationUsesSDK_MaxSdkVersion();

	/**
	 * Returns the meta object for the attribute '{@link droid.ApplicationUsesSDK#getTargetSdkVersion <em>Target Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Sdk Version</em>'.
	 * @see droid.ApplicationUsesSDK#getTargetSdkVersion()
	 * @see #getApplicationUsesSDK()
	 * @generated
	 */
	EAttribute getApplicationUsesSDK_TargetSdkVersion();

	/**
	 * Returns the meta object for class '{@link droid.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see droid.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see droid.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for class '{@link droid.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see droid.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the attribute '{@link droid.Layout#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see droid.Layout#getAlpha()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Alpha();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getMinHeight <em>Min Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Height</em>'.
	 * @see droid.Layout#getMinHeight()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_MinHeight();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getMinWidth <em>Min Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Width</em>'.
	 * @see droid.Layout#getMinWidth()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_MinWidth();

	/**
	 * Returns the meta object for the reference '{@link droid.Layout#getNextFocusDown <em>Next Focus Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Focus Down</em>'.
	 * @see droid.Layout#getNextFocusDown()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_NextFocusDown();

	/**
	 * Returns the meta object for the reference '{@link droid.Layout#getNextFocusLeft <em>Next Focus Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Focus Left</em>'.
	 * @see droid.Layout#getNextFocusLeft()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_NextFocusLeft();

	/**
	 * Returns the meta object for the reference '{@link droid.Layout#getNextFocusRight <em>Next Focus Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Focus Right</em>'.
	 * @see droid.Layout#getNextFocusRight()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_NextFocusRight();

	/**
	 * Returns the meta object for the reference '{@link droid.Layout#getNextFocusUp <em>Next Focus Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Focus Up</em>'.
	 * @see droid.Layout#getNextFocusUp()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_NextFocusUp();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getOnClick <em>On Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Click</em>'.
	 * @see droid.Layout#getOnClick()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_OnClick();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding</em>'.
	 * @see droid.Layout#getPadding()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Padding();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getPaddingBottom <em>Padding Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding Bottom</em>'.
	 * @see droid.Layout#getPaddingBottom()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_PaddingBottom();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getPaddingLeft <em>Padding Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding Left</em>'.
	 * @see droid.Layout#getPaddingLeft()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_PaddingLeft();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getPaddingRight <em>Padding Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding Right</em>'.
	 * @see droid.Layout#getPaddingRight()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_PaddingRight();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getPaddingTop <em>Padding Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding Top</em>'.
	 * @see droid.Layout#getPaddingTop()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_PaddingTop();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getScrollbars <em>Scrollbars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scrollbars</em>'.
	 * @see droid.Layout#getScrollbars()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Scrollbars();

	/**
	 * Returns the meta object for the attribute '{@link droid.Layout#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see droid.Layout#getVisibility()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Visibility();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getLayoutAnimation <em>Layout Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Animation</em>'.
	 * @see droid.Layout#getLayoutAnimation()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_LayoutAnimation();

	/**
	 * Returns the meta object for class '{@link droid.AbstractActivity <em>Abstract Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Activity</em>'.
	 * @see droid.AbstractActivity
	 * @generated
	 */
	EClass getAbstractActivity();

	/**
	 * Returns the meta object for the reference '{@link droid.AbstractActivity#getReferencedLayout <em>Referenced Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Layout</em>'.
	 * @see droid.AbstractActivity#getReferencedLayout()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EReference getAbstractActivity_ReferencedLayout();

	/**
	 * Returns the meta object for the containment reference '{@link droid.AbstractActivity#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Widgets</em>'.
	 * @see droid.AbstractActivity#getWidgets()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EReference getAbstractActivity_Widgets();

	/**
	 * Returns the meta object for class '{@link droid.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see droid.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link droid.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see droid.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for class '{@link droid.GenericActivity <em>Generic Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Activity</em>'.
	 * @see droid.GenericActivity
	 * @generated
	 */
	EClass getGenericActivity();

	/**
	 * Returns the meta object for class '{@link droid.ViewCollection <em>View Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Collection</em>'.
	 * @see droid.ViewCollection
	 * @generated
	 */
	EClass getViewCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.ViewCollection#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see droid.ViewCollection#getViews()
	 * @see #getViewCollection()
	 * @generated
	 */
	EReference getViewCollection_Views();

	/**
	 * Returns the meta object for class '{@link droid.ListActivity <em>List Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Activity</em>'.
	 * @see droid.ListActivity
	 * @generated
	 */
	EClass getListActivity();

	/**
	 * Returns the meta object for the attribute '{@link droid.ListActivity#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see droid.ListActivity#getDataSource()
	 * @see #getListActivity()
	 * @generated
	 */
	EAttribute getListActivity_DataSource();

	/**
	 * Returns the meta object for the reference '{@link droid.ListActivity#getItemLayout <em>Item Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Layout</em>'.
	 * @see droid.ListActivity#getItemLayout()
	 * @see #getListActivity()
	 * @generated
	 */
	EReference getListActivity_ItemLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.ListActivity#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see droid.ListActivity#getActions()
	 * @see #getListActivity()
	 * @generated
	 */
	EReference getListActivity_Actions();

	/**
	 * Returns the meta object for class '{@link droid.TabActivity <em>Tab Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Activity</em>'.
	 * @see droid.TabActivity
	 * @generated
	 */
	EClass getTabActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.TabActivity#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see droid.TabActivity#getTabs()
	 * @see #getTabActivity()
	 * @generated
	 */
	EReference getTabActivity_Tabs();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.TabActivity#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see droid.TabActivity#getActions()
	 * @see #getTabActivity()
	 * @generated
	 */
	EReference getTabActivity_Actions();

	/**
	 * Returns the meta object for class '{@link droid.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see droid.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Tab#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see droid.Tab#getCaption()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_Caption();

	/**
	 * Returns the meta object for the attribute '{@link droid.Tab#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see droid.Tab#getName()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_Name();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Tab#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see droid.Tab#getIcon()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Tab#getSelectedIcon <em>Selected Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selected Icon</em>'.
	 * @see droid.Tab#getSelectedIcon()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_SelectedIcon();

	/**
	 * Returns the meta object for the reference '{@link droid.Tab#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see droid.Tab#getActivity()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_Activity();

	/**
	 * Returns the meta object for the reference '{@link droid.Tab#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout</em>'.
	 * @see droid.Tab#getLayout()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_Layout();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.Tab#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see droid.Tab#getActions()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_Actions();

	/**
	 * Returns the meta object for class '{@link droid.ActionSet <em>Action Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Set</em>'.
	 * @see droid.ActionSet
	 * @generated
	 */
	EClass getActionSet();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.ActionSet#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see droid.ActionSet#getActions()
	 * @see #getActionSet()
	 * @generated
	 */
	EReference getActionSet_Actions();

	/**
	 * Returns the meta object for class '{@link droid.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see droid.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link droid.GoToURLAction <em>Go To URL Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To URL Action</em>'.
	 * @see droid.GoToURLAction
	 * @generated
	 */
	EClass getGoToURLAction();

	/**
	 * Returns the meta object for the attribute '{@link droid.GoToURLAction#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see droid.GoToURLAction#getUrl()
	 * @see #getGoToURLAction()
	 * @generated
	 */
	EAttribute getGoToURLAction_Url();

	/**
	 * Returns the meta object for class '{@link droid.ShowLayoutAction <em>Show Layout Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show Layout Action</em>'.
	 * @see droid.ShowLayoutAction
	 * @generated
	 */
	EClass getShowLayoutAction();

	/**
	 * Returns the meta object for the reference '{@link droid.ShowLayoutAction#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout</em>'.
	 * @see droid.ShowLayoutAction#getLayout()
	 * @see #getShowLayoutAction()
	 * @generated
	 */
	EReference getShowLayoutAction_Layout();

	/**
	 * Returns the meta object for class '{@link droid.InvokeActivityAction <em>Invoke Activity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke Activity Action</em>'.
	 * @see droid.InvokeActivityAction
	 * @generated
	 */
	EClass getInvokeActivityAction();

	/**
	 * Returns the meta object for the reference '{@link droid.InvokeActivityAction#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see droid.InvokeActivityAction#getActivity()
	 * @see #getInvokeActivityAction()
	 * @generated
	 */
	EReference getInvokeActivityAction_Activity();

	/**
	 * Returns the meta object for class '{@link droid.AbstractLinearLayout <em>Abstract Linear Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Linear Layout</em>'.
	 * @see droid.AbstractLinearLayout
	 * @generated
	 */
	EClass getAbstractLinearLayout();

	/**
	 * Returns the meta object for the attribute '{@link droid.AbstractLinearLayout#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see droid.AbstractLinearLayout#getOrientation()
	 * @see #getAbstractLinearLayout()
	 * @generated
	 */
	EAttribute getAbstractLinearLayout_Orientation();

	/**
	 * Returns the meta object for class '{@link droid.AbstractView <em>Abstract View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract View</em>'.
	 * @see droid.AbstractView
	 * @generated
	 */
	EClass getAbstractView();

	/**
	 * Returns the meta object for the attribute '{@link droid.AbstractView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see droid.AbstractView#getName()
	 * @see #getAbstractView()
	 * @generated
	 */
	EAttribute getAbstractView_Name();

	/**
	 * Returns the meta object for the containment reference '{@link droid.AbstractView#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Widgets</em>'.
	 * @see droid.AbstractView#getWidgets()
	 * @see #getAbstractView()
	 * @generated
	 */
	EReference getAbstractView_Widgets();

	/**
	 * Returns the meta object for class '{@link droid.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see droid.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the containment reference '{@link droid.View#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see droid.View#getBackground()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Background();

	/**
	 * Returns the meta object for class '{@link droid.LinearLayout <em>Linear Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Layout</em>'.
	 * @see droid.LinearLayout
	 * @generated
	 */
	EClass getLinearLayout();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LinearLayout#getLayoutParams <em>Layout Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Params</em>'.
	 * @see droid.LinearLayout#getLayoutParams()
	 * @see #getLinearLayout()
	 * @generated
	 */
	EReference getLinearLayout_LayoutParams();

	/**
	 * Returns the meta object for class '{@link droid.RelativeLayout <em>Relative Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Layout</em>'.
	 * @see droid.RelativeLayout
	 * @generated
	 */
	EClass getRelativeLayout();

	/**
	 * Returns the meta object for the containment reference '{@link droid.RelativeLayout#getLayoutParams <em>Layout Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Params</em>'.
	 * @see droid.RelativeLayout#getLayoutParams()
	 * @see #getRelativeLayout()
	 * @generated
	 */
	EReference getRelativeLayout_LayoutParams();

	/**
	 * Returns the meta object for the attribute '{@link droid.RelativeLayout#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see droid.RelativeLayout#getOrientation()
	 * @see #getRelativeLayout()
	 * @generated
	 */
	EAttribute getRelativeLayout_Orientation();

	/**
	 * Returns the meta object for class '{@link droid.TabHost <em>Tab Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Host</em>'.
	 * @see droid.TabHost
	 * @generated
	 */
	EClass getTabHost();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TabHost#getLayoutParams <em>Layout Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Params</em>'.
	 * @see droid.TabHost#getLayoutParams()
	 * @see #getTabHost()
	 * @generated
	 */
	EReference getTabHost_LayoutParams();

	/**
	 * Returns the meta object for class '{@link droid.TabWidget <em>Tab Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Widget</em>'.
	 * @see droid.TabWidget
	 * @generated
	 */
	EClass getTabWidget();

	/**
	 * Returns the meta object for the attribute list '{@link droid.TabWidget#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Gravity</em>'.
	 * @see droid.TabWidget#getGravity()
	 * @see #getTabWidget()
	 * @generated
	 */
	EAttribute getTabWidget_Gravity();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TabWidget#getDivider <em>Divider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Divider</em>'.
	 * @see droid.TabWidget#getDivider()
	 * @see #getTabWidget()
	 * @generated
	 */
	EReference getTabWidget_Divider();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TabWidget#getTrabStripEnabled <em>Trab Strip Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trab Strip Enabled</em>'.
	 * @see droid.TabWidget#getTrabStripEnabled()
	 * @see #getTabWidget()
	 * @generated
	 */
	EReference getTabWidget_TrabStripEnabled();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TabWidget#getTrabStripLeft <em>Trab Strip Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trab Strip Left</em>'.
	 * @see droid.TabWidget#getTrabStripLeft()
	 * @see #getTabWidget()
	 * @generated
	 */
	EReference getTabWidget_TrabStripLeft();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TabWidget#getTabStripRight <em>Tab Strip Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tab Strip Right</em>'.
	 * @see droid.TabWidget#getTabStripRight()
	 * @see #getTabWidget()
	 * @generated
	 */
	EReference getTabWidget_TabStripRight();

	/**
	 * Returns the meta object for class '{@link droid.FrameLayout <em>Frame Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Layout</em>'.
	 * @see droid.FrameLayout
	 * @generated
	 */
	EClass getFrameLayout();

	/**
	 * Returns the meta object for class '{@link droid.LayoutParams <em>Layout Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Params</em>'.
	 * @see droid.LayoutParams
	 * @generated
	 */
	EClass getLayoutParams();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_height <em>Layout height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout height</em>'.
	 * @see droid.LayoutParams#getLayout_height()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_height();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_width <em>Layout width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout width</em>'.
	 * @see droid.LayoutParams#getLayout_width()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_width();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_weight <em>Layout weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout weight</em>'.
	 * @see droid.LayoutParams#getLayout_weight()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_weight();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_marginBottom <em>Layout margin Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout margin Bottom</em>'.
	 * @see droid.LayoutParams#getLayout_marginBottom()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_marginBottom();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_marginLeft <em>Layout margin Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout margin Left</em>'.
	 * @see droid.LayoutParams#getLayout_marginLeft()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_marginLeft();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_marginRight <em>Layout margin Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout margin Right</em>'.
	 * @see droid.LayoutParams#getLayout_marginRight()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_marginRight();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_marginTop <em>Layout margin Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout margin Top</em>'.
	 * @see droid.LayoutParams#getLayout_marginTop()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_marginTop();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutParams#getLayout_above <em>Layout above</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout above</em>'.
	 * @see droid.LayoutParams#getLayout_above()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_above();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutParams#getLayout_alignBaseline <em>Layout align Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout align Baseline</em>'.
	 * @see droid.LayoutParams#getLayout_alignBaseline()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignBaseline();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutParams#getLayout_alignBottom <em>Layout align Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout align Bottom</em>'.
	 * @see droid.LayoutParams#getLayout_alignBottom()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignBottom();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutParams#getLayout_alignLeft <em>Layout align Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout align Left</em>'.
	 * @see droid.LayoutParams#getLayout_alignLeft()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignLeft();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_alignParentBottom <em>Layout align Parent Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align Parent Bottom</em>'.
	 * @see droid.LayoutParams#getLayout_alignParentBottom()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignParentBottom();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_alignParentLeft <em>Layout align Parent Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align Parent Left</em>'.
	 * @see droid.LayoutParams#getLayout_alignParentLeft()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignParentLeft();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_alignParentRight <em>Layout align Parent Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align Parent Right</em>'.
	 * @see droid.LayoutParams#getLayout_alignParentRight()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignParentRight();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_alignParentTop <em>Layout align Parent Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align Parent Top</em>'.
	 * @see droid.LayoutParams#getLayout_alignParentTop()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignParentTop();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutParams#getLayout_alignTop <em>Layout align Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout align Top</em>'.
	 * @see droid.LayoutParams#getLayout_alignTop()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignTop();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_alignWithParentIfMissing <em>Layout align With Parent If Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align With Parent If Missing</em>'.
	 * @see droid.LayoutParams#getLayout_alignWithParentIfMissing()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_alignWithParentIfMissing();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutParams#getLayout_below <em>Layout below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout below</em>'.
	 * @see droid.LayoutParams#getLayout_below()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_below();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_centerHorizontal <em>Layout center Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout center Horizontal</em>'.
	 * @see droid.LayoutParams#getLayout_centerHorizontal()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_centerHorizontal();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_centerInParent <em>Layout center In Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout center In Parent</em>'.
	 * @see droid.LayoutParams#getLayout_centerInParent()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_centerInParent();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutParams#getLayout_centerVertical <em>Layout center Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout center Vertical</em>'.
	 * @see droid.LayoutParams#getLayout_centerVertical()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_centerVertical();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutParams#getLayout_toLeftOf <em>Layout to Left Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout to Left Of</em>'.
	 * @see droid.LayoutParams#getLayout_toLeftOf()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_toLeftOf();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutParams#getLayout_toRightOf <em>Layout to Right Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout to Right Of</em>'.
	 * @see droid.LayoutParams#getLayout_toRightOf()
	 * @see #getLayoutParams()
	 * @generated
	 */
	EReference getLayoutParams_Layout_toRightOf();

	/**
	 * Returns the meta object for class '{@link droid.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see droid.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Widget#getLayoutParams <em>Layout Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Params</em>'.
	 * @see droid.Widget#getLayoutParams()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_LayoutParams();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Widget#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top</em>'.
	 * @see droid.Widget#getTop()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Top();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Widget#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see droid.Widget#getLeft()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Left();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Widget#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see droid.Widget#getWidth()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Width();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Widget#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height</em>'.
	 * @see droid.Widget#getHeight()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Height();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Widget#getClickable <em>Clickable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clickable</em>'.
	 * @see droid.Widget#getClickable()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Clickable();

	/**
	 * Returns the meta object for class '{@link droid.AbstractTextView <em>Abstract Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Text View</em>'.
	 * @see droid.AbstractTextView
	 * @generated
	 */
	EClass getAbstractTextView();

	/**
	 * Returns the meta object for class '{@link droid.TextView <em>Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text View</em>'.
	 * @see droid.TextView
	 * @generated
	 */
	EClass getTextView();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see droid.TextView#getText()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Text();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see droid.TextView#getFadeScrollBars()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see droid.TextView#getIsScrollContainer()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_IsScrollContainer();

	/**
	 * Returns the meta object for the attribute '{@link droid.TextView#getAutoLink <em>Auto Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Link</em>'.
	 * @see droid.TextView#getAutoLink()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_AutoLink();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getAutoText <em>Auto Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Text</em>'.
	 * @see droid.TextView#getAutoText()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_AutoText();

	/**
	 * Returns the meta object for the attribute '{@link droid.TextView#getCapitalize <em>Capitalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capitalize</em>'.
	 * @see droid.TextView#getCapitalize()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_Capitalize();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digits</em>'.
	 * @see droid.TextView#getDigits()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Digits();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editable</em>'.
	 * @see droid.TextView#getEditable()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Editable();

	/**
	 * Returns the meta object for the attribute '{@link droid.TextView#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see droid.TextView#getGravity()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_Gravity();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hint</em>'.
	 * @see droid.TextView#getHint()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Hint();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getNumeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numeric</em>'.
	 * @see droid.TextView#getNumeric()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Numeric();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see droid.TextView#getPassword()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Password();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone Number</em>'.
	 * @see droid.TextView#getPhoneNumber()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_PhoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getSingleLine <em>Single Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Line</em>'.
	 * @see droid.TextView#getSingleLine()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_SingleLine();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Color</em>'.
	 * @see droid.TextView#getTextColor()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link droid.TextView#getTypeface <em>Typeface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeface</em>'.
	 * @see droid.TextView#getTypeface()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_Typeface();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getTextSize <em>Text Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Size</em>'.
	 * @see droid.TextView#getTextSize()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_TextSize();

	/**
	 * Returns the meta object for the attribute list '{@link droid.TextView#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text Style</em>'.
	 * @see droid.TextView#getTextStyle()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_TextStyle();

	/**
	 * Returns the meta object for class '{@link droid.ImageView <em>Image View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image View</em>'.
	 * @see droid.ImageView
	 * @generated
	 */
	EClass getImageView();

	/**
	 * Returns the meta object for the containment reference '{@link droid.ImageView#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Src</em>'.
	 * @see droid.ImageView#getSrc()
	 * @see #getImageView()
	 * @generated
	 */
	EReference getImageView_Src();

	/**
	 * Returns the meta object for the containment reference '{@link droid.ImageView#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see droid.ImageView#getFadeScrollBars()
	 * @see #getImageView()
	 * @generated
	 */
	EReference getImageView_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link droid.ImageView#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see droid.ImageView#getIsScrollContainer()
	 * @see #getImageView()
	 * @generated
	 */
	EReference getImageView_IsScrollContainer();

	/**
	 * Returns the meta object for class '{@link droid.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see droid.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Button#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see droid.Button#getText()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Text();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Button#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Src</em>'.
	 * @see droid.Button#getSrc()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Src();

	/**
	 * Returns the meta object for the reference '{@link droid.Button#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see droid.Button#getTarget()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Target();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Button#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hint</em>'.
	 * @see droid.Button#getHint()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Hint();

	/**
	 * Returns the meta object for class '{@link droid.Spinner <em>Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spinner</em>'.
	 * @see droid.Spinner
	 * @generated
	 */
	EClass getSpinner();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Spinner#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prompt</em>'.
	 * @see droid.Spinner#getPrompt()
	 * @see #getSpinner()
	 * @generated
	 */
	EReference getSpinner_Prompt();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Spinner#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see droid.Spinner#getFadeScrollBars()
	 * @see #getSpinner()
	 * @generated
	 */
	EReference getSpinner_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Spinner#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see droid.Spinner#getIsScrollContainer()
	 * @see #getSpinner()
	 * @generated
	 */
	EReference getSpinner_IsScrollContainer();

	/**
	 * Returns the meta object for class '{@link droid.EditText <em>Edit Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Text</em>'.
	 * @see droid.EditText
	 * @generated
	 */
	EClass getEditText();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see droid.EditText#getText()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Text();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see droid.EditText#getFadeScrollBars()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see droid.EditText#getIsScrollContainer()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_IsScrollContainer();

	/**
	 * Returns the meta object for the attribute '{@link droid.EditText#getAutoLink <em>Auto Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Link</em>'.
	 * @see droid.EditText#getAutoLink()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_AutoLink();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getAutoText <em>Auto Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Text</em>'.
	 * @see droid.EditText#getAutoText()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_AutoText();

	/**
	 * Returns the meta object for the attribute '{@link droid.EditText#getCapitalize <em>Capitalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capitalize</em>'.
	 * @see droid.EditText#getCapitalize()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_Capitalize();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digits</em>'.
	 * @see droid.EditText#getDigits()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Digits();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editable</em>'.
	 * @see droid.EditText#getEditable()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Editable();

	/**
	 * Returns the meta object for the attribute '{@link droid.EditText#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see droid.EditText#getGravity()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_Gravity();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hint</em>'.
	 * @see droid.EditText#getHint()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Hint();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getNumeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numeric</em>'.
	 * @see droid.EditText#getNumeric()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Numeric();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see droid.EditText#getPassword()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Password();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone Number</em>'.
	 * @see droid.EditText#getPhoneNumber()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_PhoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getSingleLine <em>Single Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Line</em>'.
	 * @see droid.EditText#getSingleLine()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_SingleLine();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Color</em>'.
	 * @see droid.EditText#getTextColor()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link droid.EditText#getTypeface <em>Typeface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeface</em>'.
	 * @see droid.EditText#getTypeface()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_Typeface();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getTextSize <em>Text Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Size</em>'.
	 * @see droid.EditText#getTextSize()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_TextSize();

	/**
	 * Returns the meta object for the attribute list '{@link droid.EditText#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text Style</em>'.
	 * @see droid.EditText#getTextStyle()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_TextStyle();

	/**
	 * Returns the meta object for class '{@link droid.ValueAccess <em>Value Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Access</em>'.
	 * @see droid.ValueAccess
	 * @generated
	 */
	EClass getValueAccess();

	/**
	 * Returns the meta object for class '{@link droid.StringVA <em>String VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String VA</em>'.
	 * @see droid.StringVA
	 * @generated
	 */
	EClass getStringVA();

	/**
	 * Returns the meta object for the containment reference '{@link droid.StringVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see droid.StringVA#getAccess()
	 * @see #getStringVA()
	 * @generated
	 */
	EReference getStringVA_Access();

	/**
	 * Returns the meta object for the containment reference '{@link droid.StringVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see droid.StringVA#getValue()
	 * @see #getStringVA()
	 * @generated
	 */
	EReference getStringVA_Value();

	/**
	 * Returns the meta object for class '{@link droid.IntegerVA <em>Integer VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer VA</em>'.
	 * @see droid.IntegerVA
	 * @generated
	 */
	EClass getIntegerVA();

	/**
	 * Returns the meta object for the containment reference '{@link droid.IntegerVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see droid.IntegerVA#getAccess()
	 * @see #getIntegerVA()
	 * @generated
	 */
	EReference getIntegerVA_Access();

	/**
	 * Returns the meta object for the containment reference '{@link droid.IntegerVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see droid.IntegerVA#getValue()
	 * @see #getIntegerVA()
	 * @generated
	 */
	EReference getIntegerVA_Value();

	/**
	 * Returns the meta object for class '{@link droid.BooleanVA <em>Boolean VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean VA</em>'.
	 * @see droid.BooleanVA
	 * @generated
	 */
	EClass getBooleanVA();

	/**
	 * Returns the meta object for the containment reference '{@link droid.BooleanVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see droid.BooleanVA#getAccess()
	 * @see #getBooleanVA()
	 * @generated
	 */
	EReference getBooleanVA_Access();

	/**
	 * Returns the meta object for the containment reference '{@link droid.BooleanVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see droid.BooleanVA#getValue()
	 * @see #getBooleanVA()
	 * @generated
	 */
	EReference getBooleanVA_Value();

	/**
	 * Returns the meta object for class '{@link droid.ColorVA <em>Color VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color VA</em>'.
	 * @see droid.ColorVA
	 * @generated
	 */
	EClass getColorVA();

	/**
	 * Returns the meta object for the containment reference '{@link droid.ColorVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see droid.ColorVA#getAccess()
	 * @see #getColorVA()
	 * @generated
	 */
	EReference getColorVA_Access();

	/**
	 * Returns the meta object for the containment reference '{@link droid.ColorVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see droid.ColorVA#getValue()
	 * @see #getColorVA()
	 * @generated
	 */
	EReference getColorVA_Value();

	/**
	 * Returns the meta object for class '{@link droid.DimensionVA <em>Dimension VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension VA</em>'.
	 * @see droid.DimensionVA
	 * @generated
	 */
	EClass getDimensionVA();

	/**
	 * Returns the meta object for the containment reference '{@link droid.DimensionVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see droid.DimensionVA#getAccess()
	 * @see #getDimensionVA()
	 * @generated
	 */
	EReference getDimensionVA_Access();

	/**
	 * Returns the meta object for the containment reference '{@link droid.DimensionVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see droid.DimensionVA#getValue()
	 * @see #getDimensionVA()
	 * @generated
	 */
	EReference getDimensionVA_Value();

	/**
	 * Returns the meta object for class '{@link droid.LayoutDimensionVA <em>Layout Dimension VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Dimension VA</em>'.
	 * @see droid.LayoutDimensionVA
	 * @generated
	 */
	EClass getLayoutDimensionVA();

	/**
	 * Returns the meta object for the attribute '{@link droid.LayoutDimensionVA#getConstant_value <em>Constant value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant value</em>'.
	 * @see droid.LayoutDimensionVA#getConstant_value()
	 * @see #getLayoutDimensionVA()
	 * @generated
	 */
	EAttribute getLayoutDimensionVA_Constant_value();

	/**
	 * Returns the meta object for class '{@link droid.AnyDrawableVA <em>Any Drawable VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Drawable VA</em>'.
	 * @see droid.AnyDrawableVA
	 * @generated
	 */
	EClass getAnyDrawableVA();

	/**
	 * Returns the meta object for class '{@link droid.DrawableVA <em>Drawable VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawable VA</em>'.
	 * @see droid.DrawableVA
	 * @generated
	 */
	EClass getDrawableVA();

	/**
	 * Returns the meta object for the containment reference '{@link droid.DrawableVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see droid.DrawableVA#getAccess()
	 * @see #getDrawableVA()
	 * @generated
	 */
	EReference getDrawableVA_Access();

	/**
	 * Returns the meta object for class '{@link droid.AnimationVA <em>Animation VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation VA</em>'.
	 * @see droid.AnimationVA
	 * @generated
	 */
	EClass getAnimationVA();

	/**
	 * Returns the meta object for the containment reference '{@link droid.AnimationVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see droid.AnimationVA#getAccess()
	 * @see #getAnimationVA()
	 * @generated
	 */
	EReference getAnimationVA_Access();

	/**
	 * Returns the meta object for class '{@link droid.InterpolatorVA <em>Interpolator VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpolator VA</em>'.
	 * @see droid.InterpolatorVA
	 * @generated
	 */
	EClass getInterpolatorVA();

	/**
	 * Returns the meta object for the containment reference '{@link droid.InterpolatorVA#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access</em>'.
	 * @see droid.InterpolatorVA#getAccess()
	 * @see #getInterpolatorVA()
	 * @generated
	 */
	EReference getInterpolatorVA_Access();

	/**
	 * Returns the meta object for class '{@link droid.ValueDefinition <em>Value Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Definition</em>'.
	 * @see droid.ValueDefinition
	 * @generated
	 */
	EClass getValueDefinition();

	/**
	 * Returns the meta object for class '{@link droid.StringVD <em>String VD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String VD</em>'.
	 * @see droid.StringVD
	 * @generated
	 */
	EClass getStringVD();

	/**
	 * Returns the meta object for the attribute '{@link droid.StringVD#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.StringVD#getValue()
	 * @see #getStringVD()
	 * @generated
	 */
	EAttribute getStringVD_Value();

	/**
	 * Returns the meta object for class '{@link droid.IntegerVD <em>Integer VD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer VD</em>'.
	 * @see droid.IntegerVD
	 * @generated
	 */
	EClass getIntegerVD();

	/**
	 * Returns the meta object for the attribute '{@link droid.IntegerVD#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.IntegerVD#getValue()
	 * @see #getIntegerVD()
	 * @generated
	 */
	EAttribute getIntegerVD_Value();

	/**
	 * Returns the meta object for class '{@link droid.BooleanVD <em>Boolean VD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean VD</em>'.
	 * @see droid.BooleanVD
	 * @generated
	 */
	EClass getBooleanVD();

	/**
	 * Returns the meta object for the attribute '{@link droid.BooleanVD#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.BooleanVD#getValue()
	 * @see #getBooleanVD()
	 * @generated
	 */
	EAttribute getBooleanVD_Value();

	/**
	 * Returns the meta object for class '{@link droid.ColorVD <em>Color VD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color VD</em>'.
	 * @see droid.ColorVD
	 * @generated
	 */
	EClass getColorVD();

	/**
	 * Returns the meta object for the attribute '{@link droid.ColorVD#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.ColorVD#getValue()
	 * @see #getColorVD()
	 * @generated
	 */
	EAttribute getColorVD_Value();

	/**
	 * Returns the meta object for class '{@link droid.DimensionVD <em>Dimension VD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension VD</em>'.
	 * @see droid.DimensionVD
	 * @generated
	 */
	EClass getDimensionVD();

	/**
	 * Returns the meta object for the attribute '{@link droid.DimensionVD#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.DimensionVD#getValue()
	 * @see #getDimensionVD()
	 * @generated
	 */
	EAttribute getDimensionVD_Value();

	/**
	 * Returns the meta object for class '{@link droid.ValueResource <em>Value Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Resource</em>'.
	 * @see droid.ValueResource
	 * @generated
	 */
	EClass getValueResource();

	/**
	 * Returns the meta object for class '{@link droid.StringResource <em>String Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Resource</em>'.
	 * @see droid.StringResource
	 * @generated
	 */
	EClass getStringResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.StringResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.StringResource#getValue()
	 * @see #getStringResource()
	 * @generated
	 */
	EAttribute getStringResource_Value();

	/**
	 * Returns the meta object for class '{@link droid.IntegerResource <em>Integer Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Resource</em>'.
	 * @see droid.IntegerResource
	 * @generated
	 */
	EClass getIntegerResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.IntegerResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.IntegerResource#getValue()
	 * @see #getIntegerResource()
	 * @generated
	 */
	EAttribute getIntegerResource_Value();

	/**
	 * Returns the meta object for class '{@link droid.BooleanResource <em>Boolean Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Resource</em>'.
	 * @see droid.BooleanResource
	 * @generated
	 */
	EClass getBooleanResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.BooleanResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.BooleanResource#getValue()
	 * @see #getBooleanResource()
	 * @generated
	 */
	EAttribute getBooleanResource_Value();

	/**
	 * Returns the meta object for class '{@link droid.ColorResource <em>Color Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Resource</em>'.
	 * @see droid.ColorResource
	 * @generated
	 */
	EClass getColorResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.ColorResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.ColorResource#getValue()
	 * @see #getColorResource()
	 * @generated
	 */
	EAttribute getColorResource_Value();

	/**
	 * Returns the meta object for class '{@link droid.DimensionResource <em>Dimension Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Resource</em>'.
	 * @see droid.DimensionResource
	 * @generated
	 */
	EClass getDimensionResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.DimensionResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.DimensionResource#getValue()
	 * @see #getDimensionResource()
	 * @generated
	 */
	EAttribute getDimensionResource_Value();

	/**
	 * Returns the meta object for class '{@link droid.ArrayResource <em>Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Resource</em>'.
	 * @see droid.ArrayResource
	 * @generated
	 */
	EClass getArrayResource();

	/**
	 * Returns the meta object for class '{@link droid.IntegerArrayResource <em>Integer Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Array Resource</em>'.
	 * @see droid.IntegerArrayResource
	 * @generated
	 */
	EClass getIntegerArrayResource();

	/**
	 * Returns the meta object for the attribute list '{@link droid.IntegerArrayResource#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Items</em>'.
	 * @see droid.IntegerArrayResource#getItems()
	 * @see #getIntegerArrayResource()
	 * @generated
	 */
	EAttribute getIntegerArrayResource_Items();

	/**
	 * Returns the meta object for class '{@link droid.StringArrayResource <em>String Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Array Resource</em>'.
	 * @see droid.StringArrayResource
	 * @generated
	 */
	EClass getStringArrayResource();

	/**
	 * Returns the meta object for the attribute list '{@link droid.StringArrayResource#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Items</em>'.
	 * @see droid.StringArrayResource#getItems()
	 * @see #getStringArrayResource()
	 * @generated
	 */
	EAttribute getStringArrayResource_Items();

	/**
	 * Returns the meta object for class '{@link droid.TypedArrayResource <em>Typed Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Array Resource</em>'.
	 * @see droid.TypedArrayResource
	 * @generated
	 */
	EClass getTypedArrayResource();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.TypedArrayResource#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see droid.TypedArrayResource#getValues()
	 * @see #getTypedArrayResource()
	 * @generated
	 */
	EReference getTypedArrayResource_Values();

	/**
	 * Returns the meta object for class '{@link droid.DrawableResource <em>Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawable Resource</em>'.
	 * @see droid.DrawableResource
	 * @generated
	 */
	EClass getDrawableResource();

	/**
	 * Returns the meta object for class '{@link droid.BitmapDrawableResource <em>Bitmap Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitmap Drawable Resource</em>'.
	 * @see droid.BitmapDrawableResource
	 * @generated
	 */
	EClass getBitmapDrawableResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.BitmapDrawableResource#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see droid.BitmapDrawableResource#getFilename()
	 * @see #getBitmapDrawableResource()
	 * @generated
	 */
	EAttribute getBitmapDrawableResource_Filename();

	/**
	 * Returns the meta object for class '{@link droid.TransitionDrawableResource <em>Transition Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Drawable Resource</em>'.
	 * @see droid.TransitionDrawableResource
	 * @generated
	 */
	EClass getTransitionDrawableResource();

	/**
	 * Returns the meta object for the reference '{@link droid.TransitionDrawableResource#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see droid.TransitionDrawableResource#getFrom()
	 * @see #getTransitionDrawableResource()
	 * @generated
	 */
	EReference getTransitionDrawableResource_From();

	/**
	 * Returns the meta object for the reference '{@link droid.TransitionDrawableResource#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see droid.TransitionDrawableResource#getTo()
	 * @see #getTransitionDrawableResource()
	 * @generated
	 */
	EReference getTransitionDrawableResource_To();

	/**
	 * Returns the meta object for class '{@link droid.MenuResource <em>Menu Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Resource</em>'.
	 * @see droid.MenuResource
	 * @generated
	 */
	EClass getMenuResource();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.MenuResource#getMenuItems <em>Menu Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu Items</em>'.
	 * @see droid.MenuResource#getMenuItems()
	 * @see #getMenuResource()
	 * @generated
	 */
	EReference getMenuResource_MenuItems();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.MenuResource#getSubMenus <em>Sub Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Menus</em>'.
	 * @see droid.MenuResource#getSubMenus()
	 * @see #getMenuResource()
	 * @generated
	 */
	EReference getMenuResource_SubMenus();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.MenuResource#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see droid.MenuResource#getGroups()
	 * @see #getMenuResource()
	 * @generated
	 */
	EReference getMenuResource_Groups();

	/**
	 * Returns the meta object for class '{@link droid.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Item</em>'.
	 * @see droid.MenuItem
	 * @generated
	 */
	EClass getMenuItem();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.MenuItem#getSubMenus <em>Sub Menus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Menus</em>'.
	 * @see droid.MenuItem#getSubMenus()
	 * @see #getMenuItem()
	 * @generated
	 */
	EReference getMenuItem_SubMenus();

	/**
	 * Returns the meta object for class '{@link droid.MenuItemGroup <em>Menu Item Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Item Group</em>'.
	 * @see droid.MenuItemGroup
	 * @generated
	 */
	EClass getMenuItemGroup();

	/**
	 * Returns the meta object for class '{@link droid.SubMenu <em>Sub Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Menu</em>'.
	 * @see droid.SubMenu
	 * @generated
	 */
	EClass getSubMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.SubMenu#getMenuItems <em>Menu Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Menu Items</em>'.
	 * @see droid.SubMenu#getMenuItems()
	 * @see #getSubMenu()
	 * @generated
	 */
	EReference getSubMenu_MenuItems();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.SubMenu#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see droid.SubMenu#getGroups()
	 * @see #getSubMenu()
	 * @generated
	 */
	EReference getSubMenu_Groups();

	/**
	 * Returns the meta object for class '{@link droid.AnimationResource <em>Animation Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation Resource</em>'.
	 * @see droid.AnimationResource
	 * @generated
	 */
	EClass getAnimationResource();

	/**
	 * Returns the meta object for class '{@link droid.FrameAnimationElement <em>Frame Animation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Animation Element</em>'.
	 * @see droid.FrameAnimationElement
	 * @generated
	 */
	EClass getFrameAnimationElement();

	/**
	 * Returns the meta object for class '{@link droid.TerminalAnimationElements <em>Terminal Animation Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Animation Elements</em>'.
	 * @see droid.TerminalAnimationElements
	 * @generated
	 */
	EClass getTerminalAnimationElements();

	/**
	 * Returns the meta object for the attribute '{@link droid.TerminalAnimationElements#getFromAlpha <em>From Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Alpha</em>'.
	 * @see droid.TerminalAnimationElements#getFromAlpha()
	 * @see #getTerminalAnimationElements()
	 * @generated
	 */
	EAttribute getTerminalAnimationElements_FromAlpha();

	/**
	 * Returns the meta object for the attribute '{@link droid.TerminalAnimationElements#getToAlpha <em>To Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Alpha</em>'.
	 * @see droid.TerminalAnimationElements#getToAlpha()
	 * @see #getTerminalAnimationElements()
	 * @generated
	 */
	EAttribute getTerminalAnimationElements_ToAlpha();

	/**
	 * Returns the meta object for class '{@link droid.TerminalAnimationSet <em>Terminal Animation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Animation Set</em>'.
	 * @see droid.TerminalAnimationSet
	 * @generated
	 */
	EClass getTerminalAnimationSet();

	/**
	 * Returns the meta object for the attribute '{@link droid.TerminalAnimationSet#isShareInterpolator <em>Share Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Share Interpolator</em>'.
	 * @see droid.TerminalAnimationSet#isShareInterpolator()
	 * @see #getTerminalAnimationSet()
	 * @generated
	 */
	EAttribute getTerminalAnimationSet_ShareInterpolator();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TerminalAnimationSet#getInterpolator <em>Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interpolator</em>'.
	 * @see droid.TerminalAnimationSet#getInterpolator()
	 * @see #getTerminalAnimationSet()
	 * @generated
	 */
	EReference getTerminalAnimationSet_Interpolator();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.TerminalAnimationSet#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see droid.TerminalAnimationSet#getElements()
	 * @see #getTerminalAnimationSet()
	 * @generated
	 */
	EReference getTerminalAnimationSet_Elements();

	/**
	 * Returns the meta object for class '{@link droid.AlphaAnimation <em>Alpha Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alpha Animation</em>'.
	 * @see droid.AlphaAnimation
	 * @generated
	 */
	EClass getAlphaAnimation();

	/**
	 * Returns the meta object for class '{@link droid.ScaleAnimation <em>Scale Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale Animation</em>'.
	 * @see droid.ScaleAnimation
	 * @generated
	 */
	EClass getScaleAnimation();

	/**
	 * Returns the meta object for class '{@link droid.TranslateAnimation <em>Translate Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translate Animation</em>'.
	 * @see droid.TranslateAnimation
	 * @generated
	 */
	EClass getTranslateAnimation();

	/**
	 * Returns the meta object for class '{@link droid.RotateAnimation <em>Rotate Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate Animation</em>'.
	 * @see droid.RotateAnimation
	 * @generated
	 */
	EClass getRotateAnimation();

	/**
	 * Returns the meta object for class '{@link droid.TweenAnimationResource <em>Tween Animation Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tween Animation Resource</em>'.
	 * @see droid.TweenAnimationResource
	 * @generated
	 */
	EClass getTweenAnimationResource();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.TweenAnimationResource#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see droid.TweenAnimationResource#getElements()
	 * @see #getTweenAnimationResource()
	 * @generated
	 */
	EReference getTweenAnimationResource_Elements();

	/**
	 * Returns the meta object for class '{@link droid.FrameAnimationResource <em>Frame Animation Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Animation Resource</em>'.
	 * @see droid.FrameAnimationResource
	 * @generated
	 */
	EClass getFrameAnimationResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.FrameAnimationResource#isOneShot <em>One Shot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One Shot</em>'.
	 * @see droid.FrameAnimationResource#isOneShot()
	 * @see #getFrameAnimationResource()
	 * @generated
	 */
	EAttribute getFrameAnimationResource_OneShot();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.FrameAnimationResource#getFrames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frames</em>'.
	 * @see droid.FrameAnimationResource#getFrames()
	 * @see #getFrameAnimationResource()
	 * @generated
	 */
	EReference getFrameAnimationResource_Frames();

	/**
	 * Returns the meta object for class '{@link droid.AnimationFrame <em>Animation Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation Frame</em>'.
	 * @see droid.AnimationFrame
	 * @generated
	 */
	EClass getAnimationFrame();

	/**
	 * Returns the meta object for the containment reference '{@link droid.AnimationFrame#getDrawable <em>Drawable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drawable</em>'.
	 * @see droid.AnimationFrame#getDrawable()
	 * @see #getAnimationFrame()
	 * @generated
	 */
	EReference getAnimationFrame_Drawable();

	/**
	 * Returns the meta object for the attribute '{@link droid.AnimationFrame#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see droid.AnimationFrame#getDuration()
	 * @see #getAnimationFrame()
	 * @generated
	 */
	EAttribute getAnimationFrame_Duration();

	/**
	 * Returns the meta object for class '{@link droid.AbstractResourceAccess <em>Abstract Resource Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Resource Access</em>'.
	 * @see droid.AbstractResourceAccess
	 * @generated
	 */
	EClass getAbstractResourceAccess();

	/**
	 * Returns the meta object for the attribute '{@link droid.AbstractResourceAccess#getExternalResource <em>External Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Resource</em>'.
	 * @see droid.AbstractResourceAccess#getExternalResource()
	 * @see #getAbstractResourceAccess()
	 * @generated
	 */
	EAttribute getAbstractResourceAccess_ExternalResource();

	/**
	 * Returns the meta object for class '{@link droid.ResourceAccess <em>Resource Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Access</em>'.
	 * @see droid.ResourceAccess
	 * @generated
	 */
	EClass getResourceAccess();

	/**
	 * Returns the meta object for class '{@link droid.StringRA <em>String RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String RA</em>'.
	 * @see droid.StringRA
	 * @generated
	 */
	EClass getStringRA();

	/**
	 * Returns the meta object for the reference '{@link droid.StringRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.StringRA#getResource()
	 * @see #getStringRA()
	 * @generated
	 */
	EReference getStringRA_Resource();

	/**
	 * Returns the meta object for class '{@link droid.IntegerRA <em>Integer RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer RA</em>'.
	 * @see droid.IntegerRA
	 * @generated
	 */
	EClass getIntegerRA();

	/**
	 * Returns the meta object for the reference '{@link droid.IntegerRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.IntegerRA#getResource()
	 * @see #getIntegerRA()
	 * @generated
	 */
	EReference getIntegerRA_Resource();

	/**
	 * Returns the meta object for class '{@link droid.BooleanRA <em>Boolean RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean RA</em>'.
	 * @see droid.BooleanRA
	 * @generated
	 */
	EClass getBooleanRA();

	/**
	 * Returns the meta object for the reference '{@link droid.BooleanRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.BooleanRA#getResource()
	 * @see #getBooleanRA()
	 * @generated
	 */
	EReference getBooleanRA_Resource();

	/**
	 * Returns the meta object for class '{@link droid.ColorRA <em>Color RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color RA</em>'.
	 * @see droid.ColorRA
	 * @generated
	 */
	EClass getColorRA();

	/**
	 * Returns the meta object for the reference '{@link droid.ColorRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.ColorRA#getResource()
	 * @see #getColorRA()
	 * @generated
	 */
	EReference getColorRA_Resource();

	/**
	 * Returns the meta object for class '{@link droid.DimensionRA <em>Dimension RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension RA</em>'.
	 * @see droid.DimensionRA
	 * @generated
	 */
	EClass getDimensionRA();

	/**
	 * Returns the meta object for the reference '{@link droid.DimensionRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.DimensionRA#getResource()
	 * @see #getDimensionRA()
	 * @generated
	 */
	EReference getDimensionRA_Resource();

	/**
	 * Returns the meta object for class '{@link droid.DrawableRA <em>Drawable RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawable RA</em>'.
	 * @see droid.DrawableRA
	 * @generated
	 */
	EClass getDrawableRA();

	/**
	 * Returns the meta object for the reference '{@link droid.DrawableRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.DrawableRA#getResource()
	 * @see #getDrawableRA()
	 * @generated
	 */
	EReference getDrawableRA_Resource();

	/**
	 * Returns the meta object for class '{@link droid.AnimationRA <em>Animation RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation RA</em>'.
	 * @see droid.AnimationRA
	 * @generated
	 */
	EClass getAnimationRA();

	/**
	 * Returns the meta object for the reference '{@link droid.AnimationRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.AnimationRA#getResource()
	 * @see #getAnimationRA()
	 * @generated
	 */
	EReference getAnimationRA_Resource();

	/**
	 * Returns the meta object for class '{@link droid.InterpolatorRA <em>Interpolator RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpolator RA</em>'.
	 * @see droid.InterpolatorRA
	 * @generated
	 */
	EClass getInterpolatorRA();

	/**
	 * Returns the meta object for the attribute '{@link droid.InterpolatorRA#getInterpolatorName <em>Interpolator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolator Name</em>'.
	 * @see droid.InterpolatorRA#getInterpolatorName()
	 * @see #getInterpolatorRA()
	 * @generated
	 */
	EAttribute getInterpolatorRA_InterpolatorName();

	/**
	 * Returns the meta object for class '{@link droid.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see droid.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link droid.CheckBox#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see droid.CheckBox#getName()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Name();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see droid.CheckBox#getText()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Text();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top</em>'.
	 * @see droid.CheckBox#getTop()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Top();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see droid.CheckBox#getLeft()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Left();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see droid.CheckBox#getWidth()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Width();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height</em>'.
	 * @see droid.CheckBox#getHeight()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Height();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see droid.CheckBox#getBackground()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Background();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getClickable <em>Clickable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clickable</em>'.
	 * @see droid.CheckBox#getClickable()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Clickable();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see droid.CheckBox#getFadeScrollBars()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see droid.CheckBox#getIsScrollContainer()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_IsScrollContainer();

	/**
	 * Returns the meta object for the attribute '{@link droid.CheckBox#getAutoLink <em>Auto Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Link</em>'.
	 * @see droid.CheckBox#getAutoLink()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_AutoLink();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getAutoText <em>Auto Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Text</em>'.
	 * @see droid.CheckBox#getAutoText()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_AutoText();

	/**
	 * Returns the meta object for the attribute '{@link droid.CheckBox#getCapitalize <em>Capitalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capitalize</em>'.
	 * @see droid.CheckBox#getCapitalize()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Capitalize();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digits</em>'.
	 * @see droid.CheckBox#getDigits()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Digits();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editable</em>'.
	 * @see droid.CheckBox#getEditable()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Editable();

	/**
	 * Returns the meta object for the attribute '{@link droid.CheckBox#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see droid.CheckBox#getGravity()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Gravity();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hint</em>'.
	 * @see droid.CheckBox#getHint()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Hint();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getNumeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numeric</em>'.
	 * @see droid.CheckBox#getNumeric()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Numeric();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see droid.CheckBox#getPassword()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Password();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone Number</em>'.
	 * @see droid.CheckBox#getPhoneNumber()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_PhoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getSingleLine <em>Single Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Line</em>'.
	 * @see droid.CheckBox#getSingleLine()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_SingleLine();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Color</em>'.
	 * @see droid.CheckBox#getTextColor()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link droid.CheckBox#getTypeface <em>Typeface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeface</em>'.
	 * @see droid.CheckBox#getTypeface()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Typeface();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getTextSize <em>Text Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Size</em>'.
	 * @see droid.CheckBox#getTextSize()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_TextSize();

	/**
	 * Returns the meta object for the attribute list '{@link droid.CheckBox#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text Style</em>'.
	 * @see droid.CheckBox#getTextStyle()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_TextStyle();

	/**
	 * Returns the meta object for the containment reference '{@link droid.CheckBox#getOnCheck <em>On Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Check</em>'.
	 * @see droid.CheckBox#getOnCheck()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_OnCheck();

	/**
	 * Returns the meta object for class '{@link droid.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see droid.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link droid.RadioButton#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see droid.RadioButton#getName()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Name();

	/**
	 * Returns the meta object for the containment reference '{@link droid.RadioButton#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see droid.RadioButton#getText()
	 * @see #getRadioButton()
	 * @generated
	 */
	EReference getRadioButton_Text();

	/**
	 * Returns the meta object for the containment reference '{@link droid.RadioButton#getOnClick <em>On Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Click</em>'.
	 * @see droid.RadioButton#getOnClick()
	 * @see #getRadioButton()
	 * @generated
	 */
	EReference getRadioButton_OnClick();

	/**
	 * Returns the meta object for class '{@link droid.RadioGroup <em>Radio Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Group</em>'.
	 * @see droid.RadioGroup
	 * @generated
	 */
	EClass getRadioGroup();

	/**
	 * Returns the meta object for the attribute '{@link droid.RadioGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see droid.RadioGroup#getName()
	 * @see #getRadioGroup()
	 * @generated
	 */
	EAttribute getRadioGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link droid.RadioGroup#getRadioButtons <em>Radio Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Radio Buttons</em>'.
	 * @see droid.RadioGroup#getRadioButtons()
	 * @see #getRadioGroup()
	 * @generated
	 */
	EReference getRadioGroup_RadioButtons();

	/**
	 * Returns the meta object for class '{@link droid.MenuGroup <em>Menu Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Group</em>'.
	 * @see droid.MenuGroup
	 * @generated
	 */
	EClass getMenuGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.MenuGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see droid.MenuGroup#getItems()
	 * @see #getMenuGroup()
	 * @generated
	 */
	EReference getMenuGroup_Items();

	/**
	 * Returns the meta object for enum '{@link droid.BuiltInPermissionType <em>Built In Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Built In Permission Type</em>'.
	 * @see droid.BuiltInPermissionType
	 * @generated
	 */
	EEnum getBuiltInPermissionType();

	/**
	 * Returns the meta object for enum '{@link droid.InterpolatorsKind <em>Interpolators Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interpolators Kind</em>'.
	 * @see droid.InterpolatorsKind
	 * @generated
	 */
	EEnum getInterpolatorsKind();

	/**
	 * Returns the meta object for enum '{@link droid.LayoutDimensionKind <em>Layout Dimension Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Dimension Kind</em>'.
	 * @see droid.LayoutDimensionKind
	 * @generated
	 */
	EEnum getLayoutDimensionKind();

	/**
	 * Returns the meta object for enum '{@link droid.LayoutGravityKind <em>Layout Gravity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Gravity Kind</em>'.
	 * @see droid.LayoutGravityKind
	 * @generated
	 */
	EEnum getLayoutGravityKind();

	/**
	 * Returns the meta object for enum '{@link droid.LayoutOrientationKind <em>Layout Orientation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Orientation Kind</em>'.
	 * @see droid.LayoutOrientationKind
	 * @generated
	 */
	EEnum getLayoutOrientationKind();

	/**
	 * Returns the meta object for enum '{@link droid.LayoutVisibilityKind <em>Layout Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Visibility Kind</em>'.
	 * @see droid.LayoutVisibilityKind
	 * @generated
	 */
	EEnum getLayoutVisibilityKind();

	/**
	 * Returns the meta object for enum '{@link droid.TypefaceKind <em>Typeface Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Typeface Kind</em>'.
	 * @see droid.TypefaceKind
	 * @generated
	 */
	EEnum getTypefaceKind();

	/**
	 * Returns the meta object for enum '{@link droid.TextStyleKind <em>Text Style Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Style Kind</em>'.
	 * @see droid.TextStyleKind
	 * @generated
	 */
	EEnum getTextStyleKind();

	/**
	 * Returns the meta object for enum '{@link droid.AutoLinkKind <em>Auto Link Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auto Link Kind</em>'.
	 * @see droid.AutoLinkKind
	 * @generated
	 */
	EEnum getAutoLinkKind();

	/**
	 * Returns the meta object for enum '{@link droid.CapitalizeKind <em>Capitalize Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Capitalize Kind</em>'.
	 * @see droid.CapitalizeKind
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
