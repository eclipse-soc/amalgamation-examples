/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.impl;

import droid.DroidPackage;
import droid.MenuItem;
import droid.MenuItemGroup;
import droid.MenuResource;
import droid.SubMenu;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link droid.impl.MenuResourceImpl#getMenuItems <em>Menu Items</em>}</li>
 *   <li>{@link droid.impl.MenuResourceImpl#getSubMenus <em>Sub Menus</em>}</li>
 *   <li>{@link droid.impl.MenuResourceImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuResourceImpl extends ResourceImpl implements MenuResource {
	/**
	 * The cached value of the '{@link #getMenuItems() <em>Menu Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MenuItem> menuItems;

	/**
	 * The cached value of the '{@link #getSubMenus() <em>Sub Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<SubMenu> subMenus;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<MenuItemGroup> groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.eINSTANCE.getMenuResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MenuItem> getMenuItems() {
		if (menuItems == null) {
			menuItems = new EObjectContainmentEList<MenuItem>(MenuItem.class, this, DroidPackage.MENU_RESOURCE__MENU_ITEMS);
		}
		return menuItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubMenu> getSubMenus() {
		if (subMenus == null) {
			subMenus = new EObjectContainmentEList<SubMenu>(SubMenu.class, this, DroidPackage.MENU_RESOURCE__SUB_MENUS);
		}
		return subMenus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MenuItemGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<MenuItemGroup>(MenuItemGroup.class, this, DroidPackage.MENU_RESOURCE__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DroidPackage.MENU_RESOURCE__MENU_ITEMS:
				return ((InternalEList<?>)getMenuItems()).basicRemove(otherEnd, msgs);
			case DroidPackage.MENU_RESOURCE__SUB_MENUS:
				return ((InternalEList<?>)getSubMenus()).basicRemove(otherEnd, msgs);
			case DroidPackage.MENU_RESOURCE__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DroidPackage.MENU_RESOURCE__MENU_ITEMS:
				return getMenuItems();
			case DroidPackage.MENU_RESOURCE__SUB_MENUS:
				return getSubMenus();
			case DroidPackage.MENU_RESOURCE__GROUPS:
				return getGroups();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DroidPackage.MENU_RESOURCE__MENU_ITEMS:
				getMenuItems().clear();
				getMenuItems().addAll((Collection<? extends MenuItem>)newValue);
				return;
			case DroidPackage.MENU_RESOURCE__SUB_MENUS:
				getSubMenus().clear();
				getSubMenus().addAll((Collection<? extends SubMenu>)newValue);
				return;
			case DroidPackage.MENU_RESOURCE__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends MenuItemGroup>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DroidPackage.MENU_RESOURCE__MENU_ITEMS:
				getMenuItems().clear();
				return;
			case DroidPackage.MENU_RESOURCE__SUB_MENUS:
				getSubMenus().clear();
				return;
			case DroidPackage.MENU_RESOURCE__GROUPS:
				getGroups().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DroidPackage.MENU_RESOURCE__MENU_ITEMS:
				return menuItems != null && !menuItems.isEmpty();
			case DroidPackage.MENU_RESOURCE__SUB_MENUS:
				return subMenus != null && !subMenus.isEmpty();
			case DroidPackage.MENU_RESOURCE__GROUPS:
				return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MenuResourceImpl
