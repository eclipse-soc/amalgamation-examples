/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.impl;

import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.LayoutParams;
import org.eclipse.amalgam.tutorials.emf.droid.LinearLayout;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.LinearLayoutImpl#getLayoutParams <em>Layout Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinearLayoutImpl extends AbstractLinearLayoutImpl implements LinearLayout {
	/**
	 * The cached value of the '{@link #getLayoutParams() <em>Layout Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutParams()
	 * @generated
	 * @ordered
	 */
	protected LayoutParams layoutParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.eINSTANCE.getLinearLayout();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutParams getLayoutParams() {
		return layoutParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutParams(LayoutParams newLayoutParams, NotificationChain msgs) {
		LayoutParams oldLayoutParams = layoutParams;
		layoutParams = newLayoutParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LINEAR_LAYOUT__LAYOUT_PARAMS, oldLayoutParams, newLayoutParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutParams(LayoutParams newLayoutParams) {
		if (newLayoutParams != layoutParams) {
			NotificationChain msgs = null;
			if (layoutParams != null)
				msgs = ((InternalEObject)layoutParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LINEAR_LAYOUT__LAYOUT_PARAMS, null, msgs);
			if (newLayoutParams != null)
				msgs = ((InternalEObject)newLayoutParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LINEAR_LAYOUT__LAYOUT_PARAMS, null, msgs);
			msgs = basicSetLayoutParams(newLayoutParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LINEAR_LAYOUT__LAYOUT_PARAMS, newLayoutParams, newLayoutParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DroidPackage.LINEAR_LAYOUT__LAYOUT_PARAMS:
				return basicSetLayoutParams(null, msgs);
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
			case DroidPackage.LINEAR_LAYOUT__LAYOUT_PARAMS:
				return getLayoutParams();
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
			case DroidPackage.LINEAR_LAYOUT__LAYOUT_PARAMS:
				setLayoutParams((LayoutParams)newValue);
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
			case DroidPackage.LINEAR_LAYOUT__LAYOUT_PARAMS:
				setLayoutParams((LayoutParams)null);
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
			case DroidPackage.LINEAR_LAYOUT__LAYOUT_PARAMS:
				return layoutParams != null;
		}
		return super.eIsSet(featureID);
	}

} //LinearLayoutImpl
