/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.impl;

import java.util.Collection;

import org.eclipse.amalgam.tutorials.emf.droid.AnimationFrame;
import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationResource;

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
 * An implementation of the model object '<em><b>Frame Animation Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.FrameAnimationResourceImpl#isOneShot <em>One Shot</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.FrameAnimationResourceImpl#getFrames <em>Frames</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrameAnimationResourceImpl extends AnimationResourceImpl implements FrameAnimationResource {
	/**
	 * The default value of the '{@link #isOneShot() <em>One Shot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOneShot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONE_SHOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOneShot() <em>One Shot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOneShot()
	 * @generated
	 * @ordered
	 */
	protected boolean oneShot = ONE_SHOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected EList<AnimationFrame> frames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameAnimationResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.eINSTANCE.getFrameAnimationResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOneShot() {
		return oneShot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneShot(boolean newOneShot) {
		boolean oldOneShot = oneShot;
		oneShot = newOneShot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.FRAME_ANIMATION_RESOURCE__ONE_SHOT, oldOneShot, oneShot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnimationFrame> getFrames() {
		if (frames == null) {
			frames = new EObjectContainmentEList<AnimationFrame>(AnimationFrame.class, this, DroidPackage.FRAME_ANIMATION_RESOURCE__FRAMES);
		}
		return frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DroidPackage.FRAME_ANIMATION_RESOURCE__FRAMES:
				return ((InternalEList<?>)getFrames()).basicRemove(otherEnd, msgs);
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
			case DroidPackage.FRAME_ANIMATION_RESOURCE__ONE_SHOT:
				return isOneShot();
			case DroidPackage.FRAME_ANIMATION_RESOURCE__FRAMES:
				return getFrames();
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
			case DroidPackage.FRAME_ANIMATION_RESOURCE__ONE_SHOT:
				setOneShot((Boolean)newValue);
				return;
			case DroidPackage.FRAME_ANIMATION_RESOURCE__FRAMES:
				getFrames().clear();
				getFrames().addAll((Collection<? extends AnimationFrame>)newValue);
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
			case DroidPackage.FRAME_ANIMATION_RESOURCE__ONE_SHOT:
				setOneShot(ONE_SHOT_EDEFAULT);
				return;
			case DroidPackage.FRAME_ANIMATION_RESOURCE__FRAMES:
				getFrames().clear();
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
			case DroidPackage.FRAME_ANIMATION_RESOURCE__ONE_SHOT:
				return oneShot != ONE_SHOT_EDEFAULT;
			case DroidPackage.FRAME_ANIMATION_RESOURCE__FRAMES:
				return frames != null && !frames.isEmpty();
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
		result.append(" (oneShot: ");
		result.append(oneShot);
		result.append(')');
		return result.toString();
	}

} //FrameAnimationResourceImpl
