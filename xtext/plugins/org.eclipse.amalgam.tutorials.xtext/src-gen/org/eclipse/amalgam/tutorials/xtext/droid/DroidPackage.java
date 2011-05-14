/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;

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
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__RESOURCES = 3;

  /**
   * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__LAYOUTS = 4;

  /**
   * The feature id for the '<em><b>Activities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__ACTIVITIES = 5;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ManifestFileImpl <em>Manifest File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ManifestFileImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getManifestFile()
   * @generated
   */
  int MANIFEST_FILE = 1;

  /**
   * The number of structural features of the '<em>Manifest File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIFEST_FILE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ResourceImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 2;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericResourceImpl <em>Generic Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericResourceImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getGenericResource()
   * @generated
   */
  int GENERIC_RESOURCE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE__NAME = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Generic Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.MenuResourceImpl <em>Menu Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.MenuResourceImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getMenuResource()
   * @generated
   */
  int MENU_RESOURCE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_RESOURCE__NAME = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Menu Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ValueResourceImpl <em>Value Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ValueResourceImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getValueResource()
   * @generated
   */
  int VALUE_RESOURCE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_RESOURCE__NAME = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.StringValueResourceImpl <em>String Value Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.StringValueResourceImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getStringValueResource()
   * @generated
   */
  int STRING_VALUE_RESOURCE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_RESOURCE__NAME = VALUE_RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_RESOURCE__VALUE = VALUE_RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_RESOURCE_FEATURE_COUNT = VALUE_RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.IntegerValueResourceImpl <em>Integer Value Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.IntegerValueResourceImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getIntegerValueResource()
   * @generated
   */
  int INTEGER_VALUE_RESOURCE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE_RESOURCE__NAME = VALUE_RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE_RESOURCE__VALUE = VALUE_RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Value Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE_RESOURCE_FEATURE_COUNT = VALUE_RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.BooleanValueResourceImpl <em>Boolean Value Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.BooleanValueResourceImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getBooleanValueResource()
   * @generated
   */
  int BOOLEAN_VALUE_RESOURCE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_RESOURCE__NAME = VALUE_RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_RESOURCE__VALUE = VALUE_RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Value Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_RESOURCE_FEATURE_COUNT = VALUE_RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ColorValueResourceImpl <em>Color Value Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ColorValueResourceImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getColorValueResource()
   * @generated
   */
  int COLOR_VALUE_RESOURCE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_VALUE_RESOURCE__NAME = VALUE_RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_VALUE_RESOURCE__VALUE = VALUE_RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Color Value Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_VALUE_RESOURCE_FEATURE_COUNT = VALUE_RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.DimensionValueResourceImpl <em>Dimension Value Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DimensionValueResourceImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getDimensionValueResource()
   * @generated
   */
  int DIMENSION_VALUE_RESOURCE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_VALUE_RESOURCE__NAME = VALUE_RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_VALUE_RESOURCE__VALUE = VALUE_RESOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_VALUE_RESOURCE__UNIT = VALUE_RESOURCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dimension Value Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_VALUE_RESOURCE_FEATURE_COUNT = VALUE_RESOURCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableResourceImpl <em>Drawable Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableResourceImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getDrawableResource()
   * @generated
   */
  int DRAWABLE_RESOURCE = 11;

  /**
   * The number of structural features of the '<em>Drawable Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWABLE_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.BitmapDrawableResourceImpl <em>Bitmap Drawable Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.BitmapDrawableResourceImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getBitmapDrawableResource()
   * @generated
   */
  int BITMAP_DRAWABLE_RESOURCE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITMAP_DRAWABLE_RESOURCE__NAME = DRAWABLE_RESOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITMAP_DRAWABLE_RESOURCE__FILENAME = DRAWABLE_RESOURCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bitmap Drawable Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITMAP_DRAWABLE_RESOURCE_FEATURE_COUNT = DRAWABLE_RESOURCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TransitionDrawableResourceImpl <em>Transition Drawable Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.TransitionDrawableResourceImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getTransitionDrawableResource()
   * @generated
   */
  int TRANSITION_DRAWABLE_RESOURCE = 13;

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
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.AnimationResourceImpl <em>Animation Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.AnimationResourceImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getAnimationResource()
   * @generated
   */
  int ANIMATION_RESOURCE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANIMATION_RESOURCE__NAME = RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Animation Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANIMATION_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.LayoutImpl <em>Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.LayoutImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getLayout()
   * @generated
   */
  int LAYOUT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT__NAME = 0;

  /**
   * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT__WIDGETS = 1;

  /**
   * The number of structural features of the '<em>Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl <em>Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.WidgetImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getWidget()
   * @generated
   */
  int WIDGET = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__ID = 0;

  /**
   * The feature id for the '<em><b>Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__TOP = 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__LEFT = 2;

  /**
   * The feature id for the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__WIDTH = 3;

  /**
   * The feature id for the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__HEIGHT = 4;

  /**
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__BACKGROUND = 5;

  /**
   * The feature id for the '<em><b>Clickable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__CLICKABLE = 6;

  /**
   * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__FADE_SCROLL_BARS = 7;

  /**
   * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET__IS_SCROLL_CONTAINER = 8;

  /**
   * The number of structural features of the '<em>Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericWidgetImpl <em>Generic Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericWidgetImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getGenericWidget()
   * @generated
   */
  int GENERIC_WIDGET = 17;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__ID = WIDGET__ID;

  /**
   * The feature id for the '<em><b>Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__TOP = WIDGET__TOP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__LEFT = WIDGET__LEFT;

  /**
   * The feature id for the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__WIDTH = WIDGET__WIDTH;

  /**
   * The feature id for the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__HEIGHT = WIDGET__HEIGHT;

  /**
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__BACKGROUND = WIDGET__BACKGROUND;

  /**
   * The feature id for the '<em><b>Clickable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__CLICKABLE = WIDGET__CLICKABLE;

  /**
   * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__FADE_SCROLL_BARS = WIDGET__FADE_SCROLL_BARS;

  /**
   * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__IS_SCROLL_CONTAINER = WIDGET__IS_SCROLL_CONTAINER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__NAME = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET__ACTIONS = WIDGET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Generic Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TextViewImpl <em>Text View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.TextViewImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getTextView()
   * @generated
   */
  int TEXT_VIEW = 18;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__ID = WIDGET__ID;

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
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__BACKGROUND = WIDGET__BACKGROUND;

  /**
   * The feature id for the '<em><b>Clickable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__CLICKABLE = WIDGET__CLICKABLE;

  /**
   * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__FADE_SCROLL_BARS = WIDGET__FADE_SCROLL_BARS;

  /**
   * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__IS_SCROLL_CONTAINER = WIDGET__IS_SCROLL_CONTAINER;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__TEXT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Hint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__HINT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Text Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__TEXT_COLOR = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW__ACTIONS = WIDGET_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Text View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_VIEW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ButtonImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 19;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ID = WIDGET__ID;

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
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__BACKGROUND = WIDGET__BACKGROUND;

  /**
   * The feature id for the '<em><b>Clickable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__CLICKABLE = WIDGET__CLICKABLE;

  /**
   * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__FADE_SCROLL_BARS = WIDGET__FADE_SCROLL_BARS;

  /**
   * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__IS_SCROLL_CONTAINER = WIDGET__IS_SCROLL_CONTAINER;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__TEXT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Hint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__HINT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Text Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__TEXT_COLOR = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ACTIONS = WIDGET_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ImageButtonImpl <em>Image Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ImageButtonImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getImageButton()
   * @generated
   */
  int IMAGE_BUTTON = 20;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON__ID = WIDGET__ID;

  /**
   * The feature id for the '<em><b>Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON__TOP = WIDGET__TOP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON__LEFT = WIDGET__LEFT;

  /**
   * The feature id for the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON__WIDTH = WIDGET__WIDTH;

  /**
   * The feature id for the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON__HEIGHT = WIDGET__HEIGHT;

  /**
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON__BACKGROUND = WIDGET__BACKGROUND;

  /**
   * The feature id for the '<em><b>Clickable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON__CLICKABLE = WIDGET__CLICKABLE;

  /**
   * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON__FADE_SCROLL_BARS = WIDGET__FADE_SCROLL_BARS;

  /**
   * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON__IS_SCROLL_CONTAINER = WIDGET__IS_SCROLL_CONTAINER;

  /**
   * The feature id for the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON__SRC = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Hint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON__HINT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Text Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON__TEXT_COLOR = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON__ACTIONS = WIDGET_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Image Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.LinkImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getLink()
   * @generated
   */
  int LINK = 21;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__ID = WIDGET__ID;

  /**
   * The feature id for the '<em><b>Top</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TOP = WIDGET__TOP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__LEFT = WIDGET__LEFT;

  /**
   * The feature id for the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__WIDTH = WIDGET__WIDTH;

  /**
   * The feature id for the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__HEIGHT = WIDGET__HEIGHT;

  /**
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__BACKGROUND = WIDGET__BACKGROUND;

  /**
   * The feature id for the '<em><b>Clickable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__CLICKABLE = WIDGET__CLICKABLE;

  /**
   * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__FADE_SCROLL_BARS = WIDGET__FADE_SCROLL_BARS;

  /**
   * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__IS_SCROLL_CONTAINER = WIDGET__IS_SCROLL_CONTAINER;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TEXT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Hint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__HINT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Text Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TEXT_COLOR = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TARGET = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__ACTIONS = WIDGET_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.SpinnerImpl <em>Spinner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.SpinnerImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getSpinner()
   * @generated
   */
  int SPINNER = 22;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__ID = WIDGET__ID;

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
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__BACKGROUND = WIDGET__BACKGROUND;

  /**
   * The feature id for the '<em><b>Clickable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__CLICKABLE = WIDGET__CLICKABLE;

  /**
   * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__FADE_SCROLL_BARS = WIDGET__FADE_SCROLL_BARS;

  /**
   * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__IS_SCROLL_CONTAINER = WIDGET__IS_SCROLL_CONTAINER;

  /**
   * The feature id for the '<em><b>Prompt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPINNER__PROMPT = WIDGET_FEATURE_COUNT + 0;

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
  int EDIT_TEXT = 23;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__ID = WIDGET__ID;

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
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__BACKGROUND = WIDGET__BACKGROUND;

  /**
   * The feature id for the '<em><b>Clickable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__CLICKABLE = WIDGET__CLICKABLE;

  /**
   * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__FADE_SCROLL_BARS = WIDGET__FADE_SCROLL_BARS;

  /**
   * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__IS_SCROLL_CONTAINER = WIDGET__IS_SCROLL_CONTAINER;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__TEXT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Hint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__HINT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Text Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__TEXT_COLOR = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Editable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__EDITABLE = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Numeric</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__NUMERIC = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Password</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__PASSWORD = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Phone Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT__PHONE_NUMBER = WIDGET_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Edit Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_TEXT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ActivityImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__NAME = 0;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericActivityImpl <em>Generic Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericActivityImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getGenericActivity()
   * @generated
   */
  int GENERIC_ACTIVITY = 25;

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
  int GENERIC_ACTIVITY__ACTIONS = ACTIVITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Generic Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ListActivityImpl <em>List Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ListActivityImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getListActivity()
   * @generated
   */
  int LIST_ACTIVITY = 26;

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
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY__ACTIONS = ACTIVITY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>List Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TabActivityImpl <em>Tab Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.TabActivityImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getTabActivity()
   * @generated
   */
  int TAB_ACTIVITY = 27;

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
   * The number of structural features of the '<em>Tab Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TabImpl <em>Tab</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.TabImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getTab()
   * @generated
   */
  int TAB = 28;

  /**
   * The feature id for the '<em><b>Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB__ACTIVITY = 0;

  /**
   * The number of structural features of the '<em>Tab</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ActionImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getAction()
   * @generated
   */
  int ACTION = 29;

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
  int GENERIC_ACTION = 30;

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
  int GO_TO_URL_ACTION = 31;

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
  int SHOW_LAYOUT_ACTION = 32;

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
  int INVOKE_ACTIVITY_ACTION = 33;

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
  int LOAD_RESOURCE_ACTION = 34;

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
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.PropertyValueImpl <em>Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.PropertyValueImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getPropertyValue()
   * @generated
   */
  int PROPERTY_VALUE = 35;

  /**
   * The feature id for the '<em><b>External Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE__EXTERNAL_RESOURCE = 0;

  /**
   * The number of structural features of the '<em>Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.StringPropertyValueImpl <em>String Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.StringPropertyValueImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getStringPropertyValue()
   * @generated
   */
  int STRING_PROPERTY_VALUE = 36;

  /**
   * The feature id for the '<em><b>External Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PROPERTY_VALUE__EXTERNAL_RESOURCE = PROPERTY_VALUE__EXTERNAL_RESOURCE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PROPERTY_VALUE__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PROPERTY_VALUE__RESOURCE = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PROPERTY_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.IntegerPropertyValueImpl <em>Integer Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.IntegerPropertyValueImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getIntegerPropertyValue()
   * @generated
   */
  int INTEGER_PROPERTY_VALUE = 37;

  /**
   * The feature id for the '<em><b>External Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PROPERTY_VALUE__EXTERNAL_RESOURCE = PROPERTY_VALUE__EXTERNAL_RESOURCE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PROPERTY_VALUE__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PROPERTY_VALUE__RESOURCE = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Integer Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PROPERTY_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.BooleanPropertyValueImpl <em>Boolean Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.BooleanPropertyValueImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getBooleanPropertyValue()
   * @generated
   */
  int BOOLEAN_PROPERTY_VALUE = 38;

  /**
   * The feature id for the '<em><b>External Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PROPERTY_VALUE__EXTERNAL_RESOURCE = PROPERTY_VALUE__EXTERNAL_RESOURCE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PROPERTY_VALUE__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PROPERTY_VALUE__RESOURCE = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Boolean Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PROPERTY_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ColorPropertyValueImpl <em>Color Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ColorPropertyValueImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getColorPropertyValue()
   * @generated
   */
  int COLOR_PROPERTY_VALUE = 39;

  /**
   * The feature id for the '<em><b>External Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_PROPERTY_VALUE__EXTERNAL_RESOURCE = PROPERTY_VALUE__EXTERNAL_RESOURCE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_PROPERTY_VALUE__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_PROPERTY_VALUE__RESOURCE = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Color Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_PROPERTY_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.DimensionPropertyValueImpl <em>Dimension Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DimensionPropertyValueImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getDimensionPropertyValue()
   * @generated
   */
  int DIMENSION_PROPERTY_VALUE = 40;

  /**
   * The feature id for the '<em><b>External Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_PROPERTY_VALUE__EXTERNAL_RESOURCE = PROPERTY_VALUE__EXTERNAL_RESOURCE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_PROPERTY_VALUE__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_PROPERTY_VALUE__RESOURCE = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dimension Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_PROPERTY_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableResourcePropertyValueImpl <em>Drawable Resource Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableResourcePropertyValueImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getDrawableResourcePropertyValue()
   * @generated
   */
  int DRAWABLE_RESOURCE_PROPERTY_VALUE = 41;

  /**
   * The feature id for the '<em><b>External Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWABLE_RESOURCE_PROPERTY_VALUE__EXTERNAL_RESOURCE = PROPERTY_VALUE__EXTERNAL_RESOURCE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWABLE_RESOURCE_PROPERTY_VALUE__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWABLE_RESOURCE_PROPERTY_VALUE__RESOURCE = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Drawable Resource Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWABLE_RESOURCE_PROPERTY_VALUE_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableImageResourcePropertyValueImpl <em>Drawable Image Resource Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableImageResourcePropertyValueImpl
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getDrawableImageResourcePropertyValue()
   * @generated
   */
  int DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE = 42;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__RESOURCE = 0;

  /**
   * The feature id for the '<em><b>External Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__EXTERNAL_RESOURCE = 1;

  /**
   * The number of structural features of the '<em>Drawable Image Resource Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionKind <em>Dimension Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DimensionKind
   * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getDimensionKind()
   * @generated
   */
  int DIMENSION_KIND = 43;


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
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.Application#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Application#getResources()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Resources();

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
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ManifestFile <em>Manifest File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Manifest File</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ManifestFile
   * @generated
   */
  EClass getManifestFile();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericResource <em>Generic Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GenericResource
   * @generated
   */
  EClass getGenericResource();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericResource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GenericResource#getName()
   * @see #getGenericResource()
   * @generated
   */
  EAttribute getGenericResource_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.MenuResource <em>Menu Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Menu Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.MenuResource
   * @generated
   */
  EClass getMenuResource();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.MenuResource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.MenuResource#getName()
   * @see #getMenuResource()
   * @generated
   */
  EAttribute getMenuResource_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ValueResource <em>Value Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ValueResource
   * @generated
   */
  EClass getValueResource();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.ValueResource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ValueResource#getName()
   * @see #getValueResource()
   * @generated
   */
  EAttribute getValueResource_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.StringValueResource <em>String Value Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.StringValueResource
   * @generated
   */
  EClass getStringValueResource();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.StringValueResource#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.StringValueResource#getValue()
   * @see #getStringValueResource()
   * @generated
   */
  EAttribute getStringValueResource_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.IntegerValueResource <em>Integer Value Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Value Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.IntegerValueResource
   * @generated
   */
  EClass getIntegerValueResource();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.IntegerValueResource#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.IntegerValueResource#getValue()
   * @see #getIntegerValueResource()
   * @generated
   */
  EAttribute getIntegerValueResource_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.BooleanValueResource <em>Boolean Value Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.BooleanValueResource
   * @generated
   */
  EClass getBooleanValueResource();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.BooleanValueResource#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.BooleanValueResource#getValue()
   * @see #getBooleanValueResource()
   * @generated
   */
  EAttribute getBooleanValueResource_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ColorValueResource <em>Color Value Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Value Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ColorValueResource
   * @generated
   */
  EClass getColorValueResource();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.ColorValueResource#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ColorValueResource#getValue()
   * @see #getColorValueResource()
   * @generated
   */
  EAttribute getColorValueResource_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionValueResource <em>Dimension Value Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimension Value Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DimensionValueResource
   * @generated
   */
  EClass getDimensionValueResource();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionValueResource#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DimensionValueResource#getValue()
   * @see #getDimensionValueResource()
   * @generated
   */
  EAttribute getDimensionValueResource_Value();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionValueResource#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DimensionValueResource#getUnit()
   * @see #getDimensionValueResource()
   * @generated
   */
  EAttribute getDimensionValueResource_Unit();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableResource <em>Drawable Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drawable Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DrawableResource
   * @generated
   */
  EClass getDrawableResource();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.BitmapDrawableResource <em>Bitmap Drawable Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bitmap Drawable Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.BitmapDrawableResource
   * @generated
   */
  EClass getBitmapDrawableResource();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.BitmapDrawableResource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.BitmapDrawableResource#getName()
   * @see #getBitmapDrawableResource()
   * @generated
   */
  EAttribute getBitmapDrawableResource_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.BitmapDrawableResource#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.BitmapDrawableResource#getFilename()
   * @see #getBitmapDrawableResource()
   * @generated
   */
  EAttribute getBitmapDrawableResource_Filename();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.TransitionDrawableResource <em>Transition Drawable Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Drawable Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TransitionDrawableResource
   * @generated
   */
  EClass getTransitionDrawableResource();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.TransitionDrawableResource#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TransitionDrawableResource#getFrom()
   * @see #getTransitionDrawableResource()
   * @generated
   */
  EReference getTransitionDrawableResource_From();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.TransitionDrawableResource#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TransitionDrawableResource#getTo()
   * @see #getTransitionDrawableResource()
   * @generated
   */
  EReference getTransitionDrawableResource_To();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.AnimationResource <em>Animation Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Animation Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.AnimationResource
   * @generated
   */
  EClass getAnimationResource();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.AnimationResource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.AnimationResource#getName()
   * @see #getAnimationResource()
   * @generated
   */
  EAttribute getAnimationResource_Name();

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
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.Layout#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Layout#getName()
   * @see #getLayout()
   * @generated
   */
  EAttribute getLayout_Name();

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
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getTop <em>Top</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Top</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget#getTop()
   * @see #getWidget()
   * @generated
   */
  EReference getWidget_Top();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget#getLeft()
   * @see #getWidget()
   * @generated
   */
  EReference getWidget_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget#getWidth()
   * @see #getWidget()
   * @generated
   */
  EReference getWidget_Width();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget#getHeight()
   * @see #getWidget()
   * @generated
   */
  EReference getWidget_Height();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getBackground <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget#getBackground()
   * @see #getWidget()
   * @generated
   */
  EReference getWidget_Background();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getClickable <em>Clickable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clickable</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget#getClickable()
   * @see #getWidget()
   * @generated
   */
  EReference getWidget_Clickable();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget#getFadeScrollBars()
   * @see #getWidget()
   * @generated
   */
  EReference getWidget_FadeScrollBars();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Widget#getIsScrollContainer <em>Is Scroll Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Widget#getIsScrollContainer()
   * @see #getWidget()
   * @generated
   */
  EReference getWidget_IsScrollContainer();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericWidget#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GenericWidget#getActions()
   * @see #getGenericWidget()
   * @generated
   */
  EReference getGenericWidget_Actions();

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
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.TextView#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TextView#getText()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_Text();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.TextView#getHint <em>Hint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hint</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TextView#getHint()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_Hint();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.TextView#getTextColor <em>Text Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Color</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TextView#getTextColor()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_TextColor();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.TextView#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TextView#getActions()
   * @see #getTextView()
   * @generated
   */
  EReference getTextView_Actions();

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
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Button#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Button#getText()
   * @see #getButton()
   * @generated
   */
  EReference getButton_Text();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Button#getHint <em>Hint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hint</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Button#getHint()
   * @see #getButton()
   * @generated
   */
  EReference getButton_Hint();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Button#getTextColor <em>Text Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Color</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Button#getTextColor()
   * @see #getButton()
   * @generated
   */
  EReference getButton_TextColor();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.Button#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Button#getActions()
   * @see #getButton()
   * @generated
   */
  EReference getButton_Actions();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ImageButton <em>Image Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image Button</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ImageButton
   * @generated
   */
  EClass getImageButton();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.ImageButton#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Src</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ImageButton#getSrc()
   * @see #getImageButton()
   * @generated
   */
  EReference getImageButton_Src();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.ImageButton#getHint <em>Hint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hint</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ImageButton#getHint()
   * @see #getImageButton()
   * @generated
   */
  EReference getImageButton_Hint();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.ImageButton#getTextColor <em>Text Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Color</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ImageButton#getTextColor()
   * @see #getImageButton()
   * @generated
   */
  EReference getImageButton_TextColor();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.ImageButton#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ImageButton#getActions()
   * @see #getImageButton()
   * @generated
   */
  EReference getImageButton_Actions();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Link#getText()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Text();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getHint <em>Hint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hint</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Link#getHint()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Hint();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getTextColor <em>Text Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Color</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Link#getTextColor()
   * @see #getLink()
   * @generated
   */
  EReference getLink_TextColor();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Link#getTarget()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Target();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.Link#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Link#getActions()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Actions();

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
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Spinner#getPrompt <em>Prompt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prompt</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Spinner#getPrompt()
   * @see #getSpinner()
   * @generated
   */
  EReference getSpinner_Prompt();

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
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.EditText#getText()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_Text();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getHint <em>Hint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hint</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.EditText#getHint()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_Hint();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getTextColor <em>Text Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Color</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.EditText#getTextColor()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_TextColor();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getEditable <em>Editable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Editable</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.EditText#getEditable()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_Editable();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getNumeric <em>Numeric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Numeric</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.EditText#getNumeric()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_Numeric();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Password</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.EditText#getPassword()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_Password();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getPhoneNumber <em>Phone Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Phone Number</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.EditText#getPhoneNumber()
   * @see #getEditText()
   * @generated
   */
  EReference getEditText_PhoneNumber();

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
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.Activity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Activity#getName()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_Name();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.GenericActivity#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.GenericActivity#getActions()
   * @see #getGenericActivity()
   * @generated
   */
  EReference getGenericActivity_Actions();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.ListActivity#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ListActivity#getActions()
   * @see #getListActivity()
   * @generated
   */
  EReference getListActivity_Actions();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.tutorials.xtext.droid.TabActivity#getTabs <em>Tabs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tabs</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.TabActivity#getTabs()
   * @see #getTabActivity()
   * @generated
   */
  EReference getTabActivity_Tabs();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.Tab <em>Tab</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Tab
   * @generated
   */
  EClass getTab();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.Tab#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Activity</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.Tab#getActivity()
   * @see #getTab()
   * @generated
   */
  EReference getTab_Activity();

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
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.PropertyValue
   * @generated
   */
  EClass getPropertyValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.PropertyValue#getExternalResource <em>External Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>External Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.PropertyValue#getExternalResource()
   * @see #getPropertyValue()
   * @generated
   */
  EAttribute getPropertyValue_ExternalResource();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.StringPropertyValue <em>String Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Property Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.StringPropertyValue
   * @generated
   */
  EClass getStringPropertyValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.StringPropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.StringPropertyValue#getValue()
   * @see #getStringPropertyValue()
   * @generated
   */
  EAttribute getStringPropertyValue_Value();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.StringPropertyValue#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.StringPropertyValue#getResource()
   * @see #getStringPropertyValue()
   * @generated
   */
  EReference getStringPropertyValue_Resource();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.IntegerPropertyValue <em>Integer Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Property Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.IntegerPropertyValue
   * @generated
   */
  EClass getIntegerPropertyValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.IntegerPropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.IntegerPropertyValue#getValue()
   * @see #getIntegerPropertyValue()
   * @generated
   */
  EAttribute getIntegerPropertyValue_Value();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.IntegerPropertyValue#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.IntegerPropertyValue#getResource()
   * @see #getIntegerPropertyValue()
   * @generated
   */
  EReference getIntegerPropertyValue_Resource();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue <em>Boolean Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Property Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue
   * @generated
   */
  EClass getBooleanPropertyValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue#getValue()
   * @see #getBooleanPropertyValue()
   * @generated
   */
  EAttribute getBooleanPropertyValue_Value();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.BooleanPropertyValue#getResource()
   * @see #getBooleanPropertyValue()
   * @generated
   */
  EReference getBooleanPropertyValue_Resource();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.ColorPropertyValue <em>Color Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Property Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ColorPropertyValue
   * @generated
   */
  EClass getColorPropertyValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.ColorPropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ColorPropertyValue#getValue()
   * @see #getColorPropertyValue()
   * @generated
   */
  EAttribute getColorPropertyValue_Value();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.ColorPropertyValue#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.ColorPropertyValue#getResource()
   * @see #getColorPropertyValue()
   * @generated
   */
  EReference getColorPropertyValue_Resource();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue <em>Dimension Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimension Property Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue
   * @generated
   */
  EClass getDimensionPropertyValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue#getValue()
   * @see #getDimensionPropertyValue()
   * @generated
   */
  EAttribute getDimensionPropertyValue_Value();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DimensionPropertyValue#getResource()
   * @see #getDimensionPropertyValue()
   * @generated
   */
  EReference getDimensionPropertyValue_Resource();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableResourcePropertyValue <em>Drawable Resource Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drawable Resource Property Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DrawableResourcePropertyValue
   * @generated
   */
  EClass getDrawableResourcePropertyValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableResourcePropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DrawableResourcePropertyValue#getValue()
   * @see #getDrawableResourcePropertyValue()
   * @generated
   */
  EAttribute getDrawableResourcePropertyValue_Value();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableResourcePropertyValue#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DrawableResourcePropertyValue#getResource()
   * @see #getDrawableResourcePropertyValue()
   * @generated
   */
  EReference getDrawableResourcePropertyValue_Resource();

  /**
   * Returns the meta object for class '{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue <em>Drawable Image Resource Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drawable Image Resource Property Value</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue
   * @generated
   */
  EClass getDrawableImageResourcePropertyValue();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue#getResource()
   * @see #getDrawableImageResourcePropertyValue()
   * @generated
   */
  EReference getDrawableImageResourcePropertyValue_Resource();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue#getExternalResource <em>External Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>External Resource</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue#getExternalResource()
   * @see #getDrawableImageResourcePropertyValue()
   * @generated
   */
  EAttribute getDrawableImageResourcePropertyValue_ExternalResource();

  /**
   * Returns the meta object for enum '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionKind <em>Dimension Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dimension Kind</em>'.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DimensionKind
   * @generated
   */
  EEnum getDimensionKind();

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
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__RESOURCES = eINSTANCE.getApplication_Resources();

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
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ManifestFileImpl <em>Manifest File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ManifestFileImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getManifestFile()
     * @generated
     */
    EClass MANIFEST_FILE = eINSTANCE.getManifestFile();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ResourceImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericResourceImpl <em>Generic Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.GenericResourceImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getGenericResource()
     * @generated
     */
    EClass GENERIC_RESOURCE = eINSTANCE.getGenericResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERIC_RESOURCE__NAME = eINSTANCE.getGenericResource_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.MenuResourceImpl <em>Menu Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.MenuResourceImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getMenuResource()
     * @generated
     */
    EClass MENU_RESOURCE = eINSTANCE.getMenuResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU_RESOURCE__NAME = eINSTANCE.getMenuResource_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ValueResourceImpl <em>Value Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ValueResourceImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getValueResource()
     * @generated
     */
    EClass VALUE_RESOURCE = eINSTANCE.getValueResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_RESOURCE__NAME = eINSTANCE.getValueResource_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.StringValueResourceImpl <em>String Value Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.StringValueResourceImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getStringValueResource()
     * @generated
     */
    EClass STRING_VALUE_RESOURCE = eINSTANCE.getStringValueResource();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE_RESOURCE__VALUE = eINSTANCE.getStringValueResource_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.IntegerValueResourceImpl <em>Integer Value Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.IntegerValueResourceImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getIntegerValueResource()
     * @generated
     */
    EClass INTEGER_VALUE_RESOURCE = eINSTANCE.getIntegerValueResource();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_VALUE_RESOURCE__VALUE = eINSTANCE.getIntegerValueResource_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.BooleanValueResourceImpl <em>Boolean Value Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.BooleanValueResourceImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getBooleanValueResource()
     * @generated
     */
    EClass BOOLEAN_VALUE_RESOURCE = eINSTANCE.getBooleanValueResource();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE_RESOURCE__VALUE = eINSTANCE.getBooleanValueResource_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ColorValueResourceImpl <em>Color Value Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ColorValueResourceImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getColorValueResource()
     * @generated
     */
    EClass COLOR_VALUE_RESOURCE = eINSTANCE.getColorValueResource();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_VALUE_RESOURCE__VALUE = eINSTANCE.getColorValueResource_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.DimensionValueResourceImpl <em>Dimension Value Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DimensionValueResourceImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getDimensionValueResource()
     * @generated
     */
    EClass DIMENSION_VALUE_RESOURCE = eINSTANCE.getDimensionValueResource();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIMENSION_VALUE_RESOURCE__VALUE = eINSTANCE.getDimensionValueResource_Value();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIMENSION_VALUE_RESOURCE__UNIT = eINSTANCE.getDimensionValueResource_Unit();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableResourceImpl <em>Drawable Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableResourceImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getDrawableResource()
     * @generated
     */
    EClass DRAWABLE_RESOURCE = eINSTANCE.getDrawableResource();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.BitmapDrawableResourceImpl <em>Bitmap Drawable Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.BitmapDrawableResourceImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getBitmapDrawableResource()
     * @generated
     */
    EClass BITMAP_DRAWABLE_RESOURCE = eINSTANCE.getBitmapDrawableResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BITMAP_DRAWABLE_RESOURCE__NAME = eINSTANCE.getBitmapDrawableResource_Name();

    /**
     * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BITMAP_DRAWABLE_RESOURCE__FILENAME = eINSTANCE.getBitmapDrawableResource_Filename();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TransitionDrawableResourceImpl <em>Transition Drawable Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.TransitionDrawableResourceImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getTransitionDrawableResource()
     * @generated
     */
    EClass TRANSITION_DRAWABLE_RESOURCE = eINSTANCE.getTransitionDrawableResource();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_DRAWABLE_RESOURCE__FROM = eINSTANCE.getTransitionDrawableResource_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_DRAWABLE_RESOURCE__TO = eINSTANCE.getTransitionDrawableResource_To();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.AnimationResourceImpl <em>Animation Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.AnimationResourceImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getAnimationResource()
     * @generated
     */
    EClass ANIMATION_RESOURCE = eINSTANCE.getAnimationResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANIMATION_RESOURCE__NAME = eINSTANCE.getAnimationResource_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYOUT__NAME = eINSTANCE.getLayout_Name();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WIDGET__ID = eINSTANCE.getWidget_Id();

    /**
     * The meta object literal for the '<em><b>Top</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIDGET__TOP = eINSTANCE.getWidget_Top();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIDGET__LEFT = eINSTANCE.getWidget_Left();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIDGET__WIDTH = eINSTANCE.getWidget_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIDGET__HEIGHT = eINSTANCE.getWidget_Height();

    /**
     * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIDGET__BACKGROUND = eINSTANCE.getWidget_Background();

    /**
     * The meta object literal for the '<em><b>Clickable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIDGET__CLICKABLE = eINSTANCE.getWidget_Clickable();

    /**
     * The meta object literal for the '<em><b>Fade Scroll Bars</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIDGET__FADE_SCROLL_BARS = eINSTANCE.getWidget_FadeScrollBars();

    /**
     * The meta object literal for the '<em><b>Is Scroll Container</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WIDGET__IS_SCROLL_CONTAINER = eINSTANCE.getWidget_IsScrollContainer();

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
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC_WIDGET__ACTIONS = eINSTANCE.getGenericWidget_Actions();

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
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_VIEW__TEXT = eINSTANCE.getTextView_Text();

    /**
     * The meta object literal for the '<em><b>Hint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_VIEW__HINT = eINSTANCE.getTextView_Hint();

    /**
     * The meta object literal for the '<em><b>Text Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_VIEW__TEXT_COLOR = eINSTANCE.getTextView_TextColor();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_VIEW__ACTIONS = eINSTANCE.getTextView_Actions();

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
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__TEXT = eINSTANCE.getButton_Text();

    /**
     * The meta object literal for the '<em><b>Hint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__HINT = eINSTANCE.getButton_Hint();

    /**
     * The meta object literal for the '<em><b>Text Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__TEXT_COLOR = eINSTANCE.getButton_TextColor();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__ACTIONS = eINSTANCE.getButton_Actions();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ImageButtonImpl <em>Image Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ImageButtonImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getImageButton()
     * @generated
     */
    EClass IMAGE_BUTTON = eINSTANCE.getImageButton();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE_BUTTON__SRC = eINSTANCE.getImageButton_Src();

    /**
     * The meta object literal for the '<em><b>Hint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE_BUTTON__HINT = eINSTANCE.getImageButton_Hint();

    /**
     * The meta object literal for the '<em><b>Text Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE_BUTTON__TEXT_COLOR = eINSTANCE.getImageButton_TextColor();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE_BUTTON__ACTIONS = eINSTANCE.getImageButton_Actions();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.LinkImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__TEXT = eINSTANCE.getLink_Text();

    /**
     * The meta object literal for the '<em><b>Hint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__HINT = eINSTANCE.getLink_Hint();

    /**
     * The meta object literal for the '<em><b>Text Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__TEXT_COLOR = eINSTANCE.getLink_TextColor();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__TARGET = eINSTANCE.getLink_Target();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__ACTIONS = eINSTANCE.getLink_Actions();

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
     * The meta object literal for the '<em><b>Prompt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPINNER__PROMPT = eINSTANCE.getSpinner_Prompt();

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
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDIT_TEXT__TEXT = eINSTANCE.getEditText_Text();

    /**
     * The meta object literal for the '<em><b>Hint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDIT_TEXT__HINT = eINSTANCE.getEditText_Hint();

    /**
     * The meta object literal for the '<em><b>Text Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDIT_TEXT__TEXT_COLOR = eINSTANCE.getEditText_TextColor();

    /**
     * The meta object literal for the '<em><b>Editable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDIT_TEXT__EDITABLE = eINSTANCE.getEditText_Editable();

    /**
     * The meta object literal for the '<em><b>Numeric</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDIT_TEXT__NUMERIC = eINSTANCE.getEditText_Numeric();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDIT_TEXT__PASSWORD = eINSTANCE.getEditText_Password();

    /**
     * The meta object literal for the '<em><b>Phone Number</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDIT_TEXT__PHONE_NUMBER = eINSTANCE.getEditText_PhoneNumber();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

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
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC_ACTIVITY__ACTIONS = eINSTANCE.getGenericActivity_Actions();

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
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ACTIVITY__ACTIONS = eINSTANCE.getListActivity_Actions();

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
     * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_ACTIVITY__TABS = eINSTANCE.getTabActivity_Tabs();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.TabImpl <em>Tab</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.TabImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getTab()
     * @generated
     */
    EClass TAB = eINSTANCE.getTab();

    /**
     * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB__ACTIVITY = eINSTANCE.getTab_Activity();

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

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.PropertyValueImpl <em>Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.PropertyValueImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getPropertyValue()
     * @generated
     */
    EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

    /**
     * The meta object literal for the '<em><b>External Resource</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_VALUE__EXTERNAL_RESOURCE = eINSTANCE.getPropertyValue_ExternalResource();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.StringPropertyValueImpl <em>String Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.StringPropertyValueImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getStringPropertyValue()
     * @generated
     */
    EClass STRING_PROPERTY_VALUE = eINSTANCE.getStringPropertyValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_PROPERTY_VALUE__VALUE = eINSTANCE.getStringPropertyValue_Value();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_PROPERTY_VALUE__RESOURCE = eINSTANCE.getStringPropertyValue_Resource();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.IntegerPropertyValueImpl <em>Integer Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.IntegerPropertyValueImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getIntegerPropertyValue()
     * @generated
     */
    EClass INTEGER_PROPERTY_VALUE = eINSTANCE.getIntegerPropertyValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_PROPERTY_VALUE__VALUE = eINSTANCE.getIntegerPropertyValue_Value();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_PROPERTY_VALUE__RESOURCE = eINSTANCE.getIntegerPropertyValue_Resource();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.BooleanPropertyValueImpl <em>Boolean Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.BooleanPropertyValueImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getBooleanPropertyValue()
     * @generated
     */
    EClass BOOLEAN_PROPERTY_VALUE = eINSTANCE.getBooleanPropertyValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_PROPERTY_VALUE__VALUE = eINSTANCE.getBooleanPropertyValue_Value();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_PROPERTY_VALUE__RESOURCE = eINSTANCE.getBooleanPropertyValue_Resource();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.ColorPropertyValueImpl <em>Color Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.ColorPropertyValueImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getColorPropertyValue()
     * @generated
     */
    EClass COLOR_PROPERTY_VALUE = eINSTANCE.getColorPropertyValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_PROPERTY_VALUE__VALUE = eINSTANCE.getColorPropertyValue_Value();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_PROPERTY_VALUE__RESOURCE = eINSTANCE.getColorPropertyValue_Resource();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.DimensionPropertyValueImpl <em>Dimension Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DimensionPropertyValueImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getDimensionPropertyValue()
     * @generated
     */
    EClass DIMENSION_PROPERTY_VALUE = eINSTANCE.getDimensionPropertyValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIMENSION_PROPERTY_VALUE__VALUE = eINSTANCE.getDimensionPropertyValue_Value();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIMENSION_PROPERTY_VALUE__RESOURCE = eINSTANCE.getDimensionPropertyValue_Resource();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableResourcePropertyValueImpl <em>Drawable Resource Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableResourcePropertyValueImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getDrawableResourcePropertyValue()
     * @generated
     */
    EClass DRAWABLE_RESOURCE_PROPERTY_VALUE = eINSTANCE.getDrawableResourcePropertyValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DRAWABLE_RESOURCE_PROPERTY_VALUE__VALUE = eINSTANCE.getDrawableResourcePropertyValue_Value();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DRAWABLE_RESOURCE_PROPERTY_VALUE__RESOURCE = eINSTANCE.getDrawableResourcePropertyValue_Resource();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableImageResourcePropertyValueImpl <em>Drawable Image Resource Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableImageResourcePropertyValueImpl
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getDrawableImageResourcePropertyValue()
     * @generated
     */
    EClass DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE = eINSTANCE.getDrawableImageResourcePropertyValue();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__RESOURCE = eINSTANCE.getDrawableImageResourcePropertyValue_Resource();

    /**
     * The meta object literal for the '<em><b>External Resource</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__EXTERNAL_RESOURCE = eINSTANCE.getDrawableImageResourcePropertyValue_ExternalResource();

    /**
     * The meta object literal for the '{@link org.eclipse.amalgam.tutorials.xtext.droid.DimensionKind <em>Dimension Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amalgam.tutorials.xtext.droid.DimensionKind
     * @see org.eclipse.amalgam.tutorials.xtext.droid.impl.DroidPackageImpl#getDimensionKind()
     * @generated
     */
    EEnum DIMENSION_KIND = eINSTANCE.getDimensionKind();

  }

} //DroidPackage
