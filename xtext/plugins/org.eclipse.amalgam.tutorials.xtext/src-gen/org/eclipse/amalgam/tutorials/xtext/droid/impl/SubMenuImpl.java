/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import java.util.Collection;

import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.xtext.droid.MenuItem;
import org.eclipse.amalgam.tutorials.xtext.droid.MenuItemGroup;
import org.eclipse.amalgam.tutorials.xtext.droid.SubMenu;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.SubMenuImpl#getMenuItems <em>Menu Items</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.SubMenuImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubMenuImpl extends MinimalEObjectImpl.Container implements SubMenu
{
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
  protected SubMenuImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DroidPackage.eINSTANCE.getSubMenu();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MenuItem> getMenuItems()
  {
    if (menuItems == null)
    {
      menuItems = new EObjectContainmentEList<MenuItem>(MenuItem.class, this, DroidPackage.SUB_MENU__MENU_ITEMS);
    }
    return menuItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MenuItemGroup> getGroups()
  {
    if (groups == null)
    {
      groups = new EObjectContainmentEList<MenuItemGroup>(MenuItemGroup.class, this, DroidPackage.SUB_MENU__GROUPS);
    }
    return groups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DroidPackage.SUB_MENU__MENU_ITEMS:
        return ((InternalEList<?>)getMenuItems()).basicRemove(otherEnd, msgs);
      case DroidPackage.SUB_MENU__GROUPS:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DroidPackage.SUB_MENU__MENU_ITEMS:
        return getMenuItems();
      case DroidPackage.SUB_MENU__GROUPS:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DroidPackage.SUB_MENU__MENU_ITEMS:
        getMenuItems().clear();
        getMenuItems().addAll((Collection<? extends MenuItem>)newValue);
        return;
      case DroidPackage.SUB_MENU__GROUPS:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DroidPackage.SUB_MENU__MENU_ITEMS:
        getMenuItems().clear();
        return;
      case DroidPackage.SUB_MENU__GROUPS:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DroidPackage.SUB_MENU__MENU_ITEMS:
        return menuItems != null && !menuItems.isEmpty();
      case DroidPackage.SUB_MENU__GROUPS:
        return groups != null && !groups.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SubMenuImpl
