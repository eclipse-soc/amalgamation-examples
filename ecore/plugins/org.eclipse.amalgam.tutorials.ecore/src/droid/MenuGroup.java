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
 * A representation of the model object '<em><b>Menu Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.MenuGroup#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getMenuGroup()
 * @model
 * @generated
 */
public interface MenuGroup extends MenuItemGroup {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link droid.MenuItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see droid.DroidPackage#getMenuGroup_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuItem> getItems();

} // MenuGroup
