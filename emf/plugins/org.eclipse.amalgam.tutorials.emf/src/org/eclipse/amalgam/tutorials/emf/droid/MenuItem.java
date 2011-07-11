/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.MenuItem#getSubMenus <em>Sub Menus</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getMenuItem()
 * @model
 * @generated
 */
public interface MenuItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Menus</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.tutorials.emf.droid.SubMenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Menus</em>' containment reference list.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getMenuItem_SubMenus()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubMenu> getSubMenus();

} // MenuItem
