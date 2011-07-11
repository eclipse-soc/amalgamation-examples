/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.impl;

import org.eclipse.amalgam.tutorials.emf.droid.BooleanVA;
import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.Spinner;
import org.eclipse.amalgam.tutorials.emf.droid.StringVA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spinner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.SpinnerImpl#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.SpinnerImpl#getFadeScrollBars <em>Fade Scroll Bars</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.SpinnerImpl#getIsScrollContainer <em>Is Scroll Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpinnerImpl extends WidgetImpl implements Spinner {
	/**
	 * The cached value of the '{@link #getPrompt() <em>Prompt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrompt()
	 * @generated
	 * @ordered
	 */
	protected StringVA prompt;

	/**
	 * The cached value of the '{@link #getFadeScrollBars() <em>Fade Scroll Bars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFadeScrollBars()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA fadeScrollBars;

	/**
	 * The cached value of the '{@link #getIsScrollContainer() <em>Is Scroll Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsScrollContainer()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA isScrollContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpinnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.eINSTANCE.getSpinner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVA getPrompt() {
		return prompt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrompt(StringVA newPrompt, NotificationChain msgs) {
		StringVA oldPrompt = prompt;
		prompt = newPrompt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.SPINNER__PROMPT, oldPrompt, newPrompt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrompt(StringVA newPrompt) {
		if (newPrompt != prompt) {
			NotificationChain msgs = null;
			if (prompt != null)
				msgs = ((InternalEObject)prompt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.SPINNER__PROMPT, null, msgs);
			if (newPrompt != null)
				msgs = ((InternalEObject)newPrompt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.SPINNER__PROMPT, null, msgs);
			msgs = basicSetPrompt(newPrompt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.SPINNER__PROMPT, newPrompt, newPrompt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getFadeScrollBars() {
		return fadeScrollBars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFadeScrollBars(BooleanVA newFadeScrollBars, NotificationChain msgs) {
		BooleanVA oldFadeScrollBars = fadeScrollBars;
		fadeScrollBars = newFadeScrollBars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.SPINNER__FADE_SCROLL_BARS, oldFadeScrollBars, newFadeScrollBars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFadeScrollBars(BooleanVA newFadeScrollBars) {
		if (newFadeScrollBars != fadeScrollBars) {
			NotificationChain msgs = null;
			if (fadeScrollBars != null)
				msgs = ((InternalEObject)fadeScrollBars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.SPINNER__FADE_SCROLL_BARS, null, msgs);
			if (newFadeScrollBars != null)
				msgs = ((InternalEObject)newFadeScrollBars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.SPINNER__FADE_SCROLL_BARS, null, msgs);
			msgs = basicSetFadeScrollBars(newFadeScrollBars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.SPINNER__FADE_SCROLL_BARS, newFadeScrollBars, newFadeScrollBars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getIsScrollContainer() {
		return isScrollContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsScrollContainer(BooleanVA newIsScrollContainer, NotificationChain msgs) {
		BooleanVA oldIsScrollContainer = isScrollContainer;
		isScrollContainer = newIsScrollContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.SPINNER__IS_SCROLL_CONTAINER, oldIsScrollContainer, newIsScrollContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsScrollContainer(BooleanVA newIsScrollContainer) {
		if (newIsScrollContainer != isScrollContainer) {
			NotificationChain msgs = null;
			if (isScrollContainer != null)
				msgs = ((InternalEObject)isScrollContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.SPINNER__IS_SCROLL_CONTAINER, null, msgs);
			if (newIsScrollContainer != null)
				msgs = ((InternalEObject)newIsScrollContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.SPINNER__IS_SCROLL_CONTAINER, null, msgs);
			msgs = basicSetIsScrollContainer(newIsScrollContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.SPINNER__IS_SCROLL_CONTAINER, newIsScrollContainer, newIsScrollContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DroidPackage.SPINNER__PROMPT:
				return basicSetPrompt(null, msgs);
			case DroidPackage.SPINNER__FADE_SCROLL_BARS:
				return basicSetFadeScrollBars(null, msgs);
			case DroidPackage.SPINNER__IS_SCROLL_CONTAINER:
				return basicSetIsScrollContainer(null, msgs);
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
			case DroidPackage.SPINNER__PROMPT:
				return getPrompt();
			case DroidPackage.SPINNER__FADE_SCROLL_BARS:
				return getFadeScrollBars();
			case DroidPackage.SPINNER__IS_SCROLL_CONTAINER:
				return getIsScrollContainer();
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
			case DroidPackage.SPINNER__PROMPT:
				setPrompt((StringVA)newValue);
				return;
			case DroidPackage.SPINNER__FADE_SCROLL_BARS:
				setFadeScrollBars((BooleanVA)newValue);
				return;
			case DroidPackage.SPINNER__IS_SCROLL_CONTAINER:
				setIsScrollContainer((BooleanVA)newValue);
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
			case DroidPackage.SPINNER__PROMPT:
				setPrompt((StringVA)null);
				return;
			case DroidPackage.SPINNER__FADE_SCROLL_BARS:
				setFadeScrollBars((BooleanVA)null);
				return;
			case DroidPackage.SPINNER__IS_SCROLL_CONTAINER:
				setIsScrollContainer((BooleanVA)null);
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
			case DroidPackage.SPINNER__PROMPT:
				return prompt != null;
			case DroidPackage.SPINNER__FADE_SCROLL_BARS:
				return fadeScrollBars != null;
			case DroidPackage.SPINNER__IS_SCROLL_CONTAINER:
				return isScrollContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //SpinnerImpl
