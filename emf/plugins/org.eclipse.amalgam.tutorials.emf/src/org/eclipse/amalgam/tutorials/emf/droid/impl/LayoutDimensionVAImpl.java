/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.impl;

import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.LayoutDimensionKind;
import org.eclipse.amalgam.tutorials.emf.droid.LayoutDimensionVA;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout Dimension VA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LayoutDimensionVAImpl#getConstant_value <em>Constant value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutDimensionVAImpl extends EObjectImpl implements LayoutDimensionVA {
	/**
	 * The default value of the '{@link #getConstant_value() <em>Constant value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_value()
	 * @generated
	 * @ordered
	 */
	protected static final LayoutDimensionKind CONSTANT_VALUE_EDEFAULT = LayoutDimensionKind.FILL_PARENT;

	/**
	 * The cached value of the '{@link #getConstant_value() <em>Constant value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_value()
	 * @generated
	 * @ordered
	 */
	protected LayoutDimensionKind constant_value = CONSTANT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutDimensionVAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.eINSTANCE.getLayoutDimensionVA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutDimensionKind getConstant_value() {
		return constant_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_value(LayoutDimensionKind newConstant_value) {
		LayoutDimensionKind oldConstant_value = constant_value;
		constant_value = newConstant_value == null ? CONSTANT_VALUE_EDEFAULT : newConstant_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_DIMENSION_VA__CONSTANT_VALUE, oldConstant_value, constant_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DroidPackage.LAYOUT_DIMENSION_VA__CONSTANT_VALUE:
				return getConstant_value();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DroidPackage.LAYOUT_DIMENSION_VA__CONSTANT_VALUE:
				setConstant_value((LayoutDimensionKind)newValue);
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
			case DroidPackage.LAYOUT_DIMENSION_VA__CONSTANT_VALUE:
				setConstant_value(CONSTANT_VALUE_EDEFAULT);
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
			case DroidPackage.LAYOUT_DIMENSION_VA__CONSTANT_VALUE:
				return constant_value != CONSTANT_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (constant_value: ");
		result.append(constant_value);
		result.append(')');
		return result.toString();
	}

} //LayoutDimensionVAImpl
