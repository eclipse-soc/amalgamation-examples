/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Animation Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.TerminalAnimationElements#getFromAlpha <em>From Alpha</em>}</li>
 *   <li>{@link droid.TerminalAnimationElements#getToAlpha <em>To Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getTerminalAnimationElements()
 * @model
 * @generated
 */
public interface TerminalAnimationElements extends FrameAnimationElement {
	/**
	 * Returns the value of the '<em><b>From Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Alpha</em>' attribute.
	 * @see #setFromAlpha(Float)
	 * @see droid.DroidPackage#getTerminalAnimationElements_FromAlpha()
	 * @model
	 * @generated
	 */
	Float getFromAlpha();

	/**
	 * Sets the value of the '{@link droid.TerminalAnimationElements#getFromAlpha <em>From Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Alpha</em>' attribute.
	 * @see #getFromAlpha()
	 * @generated
	 */
	void setFromAlpha(Float value);

	/**
	 * Returns the value of the '<em><b>To Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Alpha</em>' attribute.
	 * @see #setToAlpha(Float)
	 * @see droid.DroidPackage#getTerminalAnimationElements_ToAlpha()
	 * @model
	 * @generated
	 */
	Float getToAlpha();

	/**
	 * Sets the value of the '{@link droid.TerminalAnimationElements#getToAlpha <em>To Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Alpha</em>' attribute.
	 * @see #getToAlpha()
	 * @generated
	 */
	void setToAlpha(Float value);

} // TerminalAnimationElements
