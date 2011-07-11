/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.impl;

import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationElements;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal Animation Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TerminalAnimationElementsImpl#getFromAlpha <em>From Alpha</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TerminalAnimationElementsImpl#getToAlpha <em>To Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalAnimationElementsImpl extends FrameAnimationElementImpl implements TerminalAnimationElements {
	/**
	 * The default value of the '{@link #getFromAlpha() <em>From Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final Float FROM_ALPHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromAlpha() <em>From Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAlpha()
	 * @generated
	 * @ordered
	 */
	protected Float fromAlpha = FROM_ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getToAlpha() <em>To Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final Float TO_ALPHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToAlpha() <em>To Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAlpha()
	 * @generated
	 * @ordered
	 */
	protected Float toAlpha = TO_ALPHA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalAnimationElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.eINSTANCE.getTerminalAnimationElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getFromAlpha() {
		return fromAlpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromAlpha(Float newFromAlpha) {
		Float oldFromAlpha = fromAlpha;
		fromAlpha = newFromAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TERMINAL_ANIMATION_ELEMENTS__FROM_ALPHA, oldFromAlpha, fromAlpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getToAlpha() {
		return toAlpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAlpha(Float newToAlpha) {
		Float oldToAlpha = toAlpha;
		toAlpha = newToAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TERMINAL_ANIMATION_ELEMENTS__TO_ALPHA, oldToAlpha, toAlpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DroidPackage.TERMINAL_ANIMATION_ELEMENTS__FROM_ALPHA:
				return getFromAlpha();
			case DroidPackage.TERMINAL_ANIMATION_ELEMENTS__TO_ALPHA:
				return getToAlpha();
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
			case DroidPackage.TERMINAL_ANIMATION_ELEMENTS__FROM_ALPHA:
				setFromAlpha((Float)newValue);
				return;
			case DroidPackage.TERMINAL_ANIMATION_ELEMENTS__TO_ALPHA:
				setToAlpha((Float)newValue);
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
			case DroidPackage.TERMINAL_ANIMATION_ELEMENTS__FROM_ALPHA:
				setFromAlpha(FROM_ALPHA_EDEFAULT);
				return;
			case DroidPackage.TERMINAL_ANIMATION_ELEMENTS__TO_ALPHA:
				setToAlpha(TO_ALPHA_EDEFAULT);
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
			case DroidPackage.TERMINAL_ANIMATION_ELEMENTS__FROM_ALPHA:
				return FROM_ALPHA_EDEFAULT == null ? fromAlpha != null : !FROM_ALPHA_EDEFAULT.equals(fromAlpha);
			case DroidPackage.TERMINAL_ANIMATION_ELEMENTS__TO_ALPHA:
				return TO_ALPHA_EDEFAULT == null ? toAlpha != null : !TO_ALPHA_EDEFAULT.equals(toAlpha);
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
		result.append(" (fromAlpha: ");
		result.append(fromAlpha);
		result.append(", toAlpha: ");
		result.append(toAlpha);
		result.append(')');
		return result.toString();
	}

} //TerminalAnimationElementsImpl
