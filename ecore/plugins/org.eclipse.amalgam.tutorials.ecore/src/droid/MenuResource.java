/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.MenuResource#getMenuItems <em>Menu Items</em>}</li>
 *   <li>{@link droid.MenuResource#getSubMenus <em>Sub Menus</em>}</li>
 *   <li>{@link droid.MenuResource#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getMenuResource()
 * @model
 * @generated
 */
public interface MenuResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Menu Items</b></em>' containment reference list.
	 * The list contents are of type {@link droid.MenuItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Items</em>' containment reference list.
	 * @see droid.DroidPackage#getMenuResource_MenuItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuItem> getMenuItems();

	/**
	 * Returns the value of the '<em><b>Sub Menus</b></em>' containment reference list.
	 * The list contents are of type {@link droid.SubMenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Menus</em>' containment reference list.
	 * @see droid.DroidPackage#getMenuResource_SubMenus()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubMenu> getSubMenus();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link droid.MenuItemGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see droid.DroidPackage#getMenuResource_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuItemGroup> getGroups();

} // MenuResource
