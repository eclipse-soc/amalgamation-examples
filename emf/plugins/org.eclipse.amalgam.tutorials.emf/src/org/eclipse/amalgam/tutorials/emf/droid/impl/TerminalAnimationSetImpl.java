/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.impl;

import java.util.Collection;

import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationElement;
import org.eclipse.amalgam.tutorials.emf.droid.InterpolatorVA;
import org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal Animation Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TerminalAnimationSetImpl#isShareInterpolator <em>Share Interpolator</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TerminalAnimationSetImpl#getInterpolator <em>Interpolator</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TerminalAnimationSetImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalAnimationSetImpl extends FrameAnimationElementImpl implements TerminalAnimationSet {
	/**
	 * The default value of the '{@link #isShareInterpolator() <em>Share Interpolator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShareInterpolator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHARE_INTERPOLATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShareInterpolator() <em>Share Interpolator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShareInterpolator()
	 * @generated
	 * @ordered
	 */
	protected boolean shareInterpolator = SHARE_INTERPOLATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterpolator() <em>Interpolator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolator()
	 * @generated
	 * @ordered
	 */
	protected InterpolatorVA interpolator;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FrameAnimationElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalAnimationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.eINSTANCE.getTerminalAnimationSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShareInterpolator() {
		return shareInterpolator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShareInterpolator(boolean newShareInterpolator) {
		boolean oldShareInterpolator = shareInterpolator;
		shareInterpolator = newShareInterpolator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TERMINAL_ANIMATION_SET__SHARE_INTERPOLATOR, oldShareInterpolator, shareInterpolator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolatorVA getInterpolator() {
		return interpolator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterpolator(InterpolatorVA newInterpolator, NotificationChain msgs) {
		InterpolatorVA oldInterpolator = interpolator;
		interpolator = newInterpolator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.TERMINAL_ANIMATION_SET__INTERPOLATOR, oldInterpolator, newInterpolator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpolator(InterpolatorVA newInterpolator) {
		if (newInterpolator != interpolator) {
			NotificationChain msgs = null;
			if (interpolator != null)
				msgs = ((InternalEObject)interpolator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TERMINAL_ANIMATION_SET__INTERPOLATOR, null, msgs);
			if (newInterpolator != null)
				msgs = ((InternalEObject)newInterpolator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TERMINAL_ANIMATION_SET__INTERPOLATOR, null, msgs);
			msgs = basicSetInterpolator(newInterpolator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TERMINAL_ANIMATION_SET__INTERPOLATOR, newInterpolator, newInterpolator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameAnimationElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<FrameAnimationElement>(FrameAnimationElement.class, this, DroidPackage.TERMINAL_ANIMATION_SET__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DroidPackage.TERMINAL_ANIMATION_SET__INTERPOLATOR:
				return basicSetInterpolator(null, msgs);
			case DroidPackage.TERMINAL_ANIMATION_SET__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case DroidPackage.TERMINAL_ANIMATION_SET__SHARE_INTERPOLATOR:
				return isShareInterpolator();
			case DroidPackage.TERMINAL_ANIMATION_SET__INTERPOLATOR:
				return getInterpolator();
			case DroidPackage.TERMINAL_ANIMATION_SET__ELEMENTS:
				return getElements();
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
			case DroidPackage.TERMINAL_ANIMATION_SET__SHARE_INTERPOLATOR:
				setShareInterpolator((Boolean)newValue);
				return;
			case DroidPackage.TERMINAL_ANIMATION_SET__INTERPOLATOR:
				setInterpolator((InterpolatorVA)newValue);
				return;
			case DroidPackage.TERMINAL_ANIMATION_SET__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends FrameAnimationElement>)newValue);
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
			case DroidPackage.TERMINAL_ANIMATION_SET__SHARE_INTERPOLATOR:
				setShareInterpolator(SHARE_INTERPOLATOR_EDEFAULT);
				return;
			case DroidPackage.TERMINAL_ANIMATION_SET__INTERPOLATOR:
				setInterpolator((InterpolatorVA)null);
				return;
			case DroidPackage.TERMINAL_ANIMATION_SET__ELEMENTS:
				getElements().clear();
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
			case DroidPackage.TERMINAL_ANIMATION_SET__SHARE_INTERPOLATOR:
				return shareInterpolator != SHARE_INTERPOLATOR_EDEFAULT;
			case DroidPackage.TERMINAL_ANIMATION_SET__INTERPOLATOR:
				return interpolator != null;
			case DroidPackage.TERMINAL_ANIMATION_SET__ELEMENTS:
				return elements != null && !elements.isEmpty();
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
		result.append(" (shareInterpolator: ");
		result.append(shareInterpolator);
		result.append(')');
		return result.toString();
	}

} //TerminalAnimationSetImpl
