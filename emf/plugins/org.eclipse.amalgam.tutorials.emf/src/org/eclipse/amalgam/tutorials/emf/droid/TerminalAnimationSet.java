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
 * A representation of the model object '<em><b>Terminal Animation Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet#isShareInterpolator <em>Share Interpolator</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet#getInterpolator <em>Interpolator</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTerminalAnimationSet()
 * @model
 * @generated
 */
public interface TerminalAnimationSet extends FrameAnimationElement {
	/**
	 * Returns the value of the '<em><b>Share Interpolator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Share Interpolator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share Interpolator</em>' attribute.
	 * @see #setShareInterpolator(boolean)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTerminalAnimationSet_ShareInterpolator()
	 * @model
	 * @generated
	 */
	boolean isShareInterpolator();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet#isShareInterpolator <em>Share Interpolator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share Interpolator</em>' attribute.
	 * @see #isShareInterpolator()
	 * @generated
	 */
	void setShareInterpolator(boolean value);

	/**
	 * Returns the value of the '<em><b>Interpolator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpolator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpolator</em>' containment reference.
	 * @see #setInterpolator(InterpolatorVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTerminalAnimationSet_Interpolator()
	 * @model containment="true"
	 * @generated
	 */
	InterpolatorVA getInterpolator();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet#getInterpolator <em>Interpolator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolator</em>' containment reference.
	 * @see #getInterpolator()
	 * @generated
	 */
	void setInterpolator(InterpolatorVA value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.tutorials.emf.droid.FrameAnimationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTerminalAnimationSet_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FrameAnimationElement> getElements();

} // TerminalAnimationSet
