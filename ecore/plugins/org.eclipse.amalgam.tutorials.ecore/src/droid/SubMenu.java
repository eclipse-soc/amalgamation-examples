/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.SubMenu#getMenuItems <em>Menu Items</em>}</li>
 *   <li>{@link droid.SubMenu#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getSubMenu()
 * @model
 * @generated
 */
public interface SubMenu extends EObject {
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
	 * @see droid.DroidPackage#getSubMenu_MenuItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuItem> getMenuItems();

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
	 * @see droid.DroidPackage#getSubMenu_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuItemGroup> getGroups();

} // SubMenu
