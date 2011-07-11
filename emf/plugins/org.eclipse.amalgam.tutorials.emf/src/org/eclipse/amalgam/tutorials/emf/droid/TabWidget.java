/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getGravity <em>Gravity</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getDivider <em>Divider</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getTrabStripEnabled <em>Trab Strip Enabled</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getTrabStripLeft <em>Trab Strip Left</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getTabStripRight <em>Tab Strip Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTabWidget()
 * @model
 * @generated
 */
public interface TabWidget extends AbstractLinearLayout {
	/**
	 * Returns the value of the '<em><b>Gravity</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind}.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gravity</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravity</em>' attribute list.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTabWidget_Gravity()
	 * @model unique="false"
	 * @generated
	 */
	EList<LayoutGravityKind> getGravity();

	/**
	 * Returns the value of the '<em><b>Divider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Divider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divider</em>' containment reference.
	 * @see #setDivider(AnyDrawableVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTabWidget_Divider()
	 * @model containment="true"
	 * @generated
	 */
	AnyDrawableVA getDivider();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getDivider <em>Divider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Divider</em>' containment reference.
	 * @see #getDivider()
	 * @generated
	 */
	void setDivider(AnyDrawableVA value);

	/**
	 * Returns the value of the '<em><b>Trab Strip Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trab Strip Enabled</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trab Strip Enabled</em>' containment reference.
	 * @see #setTrabStripEnabled(BooleanVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTabWidget_TrabStripEnabled()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getTrabStripEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getTrabStripEnabled <em>Trab Strip Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trab Strip Enabled</em>' containment reference.
	 * @see #getTrabStripEnabled()
	 * @generated
	 */
	void setTrabStripEnabled(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Trab Strip Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trab Strip Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trab Strip Left</em>' containment reference.
	 * @see #setTrabStripLeft(AnyDrawableVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTabWidget_TrabStripLeft()
	 * @model containment="true"
	 * @generated
	 */
	AnyDrawableVA getTrabStripLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getTrabStripLeft <em>Trab Strip Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trab Strip Left</em>' containment reference.
	 * @see #getTrabStripLeft()
	 * @generated
	 */
	void setTrabStripLeft(AnyDrawableVA value);

	/**
	 * Returns the value of the '<em><b>Tab Strip Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Strip Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Strip Right</em>' containment reference.
	 * @see #setTabStripRight(AnyDrawableVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTabWidget_TabStripRight()
	 * @model containment="true"
	 * @generated
	 */
	AnyDrawableVA getTabStripRight();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget#getTabStripRight <em>Tab Strip Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Strip Right</em>' containment reference.
	 * @see #getTabStripRight()
	 * @generated
	 */
	void setTabStripRight(AnyDrawableVA value);

} // TabWidget
