/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.impl;

import java.util.Collection;

import org.eclipse.amalgam.tutorials.emf.droid.Action;
import org.eclipse.amalgam.tutorials.emf.droid.Activity;
import org.eclipse.amalgam.tutorials.emf.droid.DrawableRA;
import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.Layout;
import org.eclipse.amalgam.tutorials.emf.droid.StringVA;
import org.eclipse.amalgam.tutorials.emf.droid.Tab;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TabImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TabImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TabImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TabImpl#getSelectedIcon <em>Selected Icon</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TabImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TabImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.impl.TabImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabImpl extends EObjectImpl implements Tab {
	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected StringVA caption;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected DrawableRA icon;

	/**
	 * The cached value of the '{@link #getSelectedIcon() <em>Selected Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedIcon()
	 * @generated
	 * @ordered
	 */
	protected DrawableRA selectedIcon;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.eINSTANCE.getTab();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVA getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(StringVA newCaption, NotificationChain msgs) {
		StringVA oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.TAB__CAPTION, oldCaption, newCaption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(StringVA newCaption) {
		if (newCaption != caption) {
			NotificationChain msgs = null;
			if (caption != null)
				msgs = ((InternalEObject)caption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB__CAPTION, null, msgs);
			if (newCaption != null)
				msgs = ((InternalEObject)newCaption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB__CAPTION, null, msgs);
			msgs = basicSetCaption(newCaption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TAB__CAPTION, newCaption, newCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TAB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawableRA getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(DrawableRA newIcon, NotificationChain msgs) {
		DrawableRA oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.TAB__ICON, oldIcon, newIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(DrawableRA newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TAB__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawableRA getSelectedIcon() {
		return selectedIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedIcon(DrawableRA newSelectedIcon, NotificationChain msgs) {
		DrawableRA oldSelectedIcon = selectedIcon;
		selectedIcon = newSelectedIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.TAB__SELECTED_ICON, oldSelectedIcon, newSelectedIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedIcon(DrawableRA newSelectedIcon) {
		if (newSelectedIcon != selectedIcon) {
			NotificationChain msgs = null;
			if (selectedIcon != null)
				msgs = ((InternalEObject)selectedIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB__SELECTED_ICON, null, msgs);
			if (newSelectedIcon != null)
				msgs = ((InternalEObject)newSelectedIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.TAB__SELECTED_ICON, null, msgs);
			msgs = basicSetSelectedIcon(newSelectedIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TAB__SELECTED_ICON, newSelectedIcon, newSelectedIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (Activity)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.TAB__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TAB__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getLayout() {
		if (layout != null && layout.eIsProxy()) {
			InternalEObject oldLayout = (InternalEObject)layout;
			layout = (Layout)eResolveProxy(oldLayout);
			if (layout != oldLayout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.TAB__LAYOUT, oldLayout, layout));
			}
		}
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout basicGetLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(Layout newLayout) {
		Layout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.TAB__LAYOUT, oldLayout, layout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, DroidPackage.TAB__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DroidPackage.TAB__CAPTION:
				return basicSetCaption(null, msgs);
			case DroidPackage.TAB__ICON:
				return basicSetIcon(null, msgs);
			case DroidPackage.TAB__SELECTED_ICON:
				return basicSetSelectedIcon(null, msgs);
			case DroidPackage.TAB__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case DroidPackage.TAB__CAPTION:
				return getCaption();
			case DroidPackage.TAB__NAME:
				return getName();
			case DroidPackage.TAB__ICON:
				return getIcon();
			case DroidPackage.TAB__SELECTED_ICON:
				return getSelectedIcon();
			case DroidPackage.TAB__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case DroidPackage.TAB__LAYOUT:
				if (resolve) return getLayout();
				return basicGetLayout();
			case DroidPackage.TAB__ACTIONS:
				return getActions();
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
			case DroidPackage.TAB__CAPTION:
				setCaption((StringVA)newValue);
				return;
			case DroidPackage.TAB__NAME:
				setName((String)newValue);
				return;
			case DroidPackage.TAB__ICON:
				setIcon((DrawableRA)newValue);
				return;
			case DroidPackage.TAB__SELECTED_ICON:
				setSelectedIcon((DrawableRA)newValue);
				return;
			case DroidPackage.TAB__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case DroidPackage.TAB__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case DroidPackage.TAB__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
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
			case DroidPackage.TAB__CAPTION:
				setCaption((StringVA)null);
				return;
			case DroidPackage.TAB__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DroidPackage.TAB__ICON:
				setIcon((DrawableRA)null);
				return;
			case DroidPackage.TAB__SELECTED_ICON:
				setSelectedIcon((DrawableRA)null);
				return;
			case DroidPackage.TAB__ACTIVITY:
				setActivity((Activity)null);
				return;
			case DroidPackage.TAB__LAYOUT:
				setLayout((Layout)null);
				return;
			case DroidPackage.TAB__ACTIONS:
				getActions().clear();
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
			case DroidPackage.TAB__CAPTION:
				return caption != null;
			case DroidPackage.TAB__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DroidPackage.TAB__ICON:
				return icon != null;
			case DroidPackage.TAB__SELECTED_ICON:
				return selectedIcon != null;
			case DroidPackage.TAB__ACTIVITY:
				return activity != null;
			case DroidPackage.TAB__LAYOUT:
				return layout != null;
			case DroidPackage.TAB__ACTIONS:
				return actions != null && !actions.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TabImpl
