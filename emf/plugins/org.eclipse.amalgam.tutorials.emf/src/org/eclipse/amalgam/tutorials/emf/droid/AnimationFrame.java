/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationFrame#getDrawable <em>Drawable</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationFrame#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getAnimationFrame()
 * @model
 * @generated
 */
public interface AnimationFrame extends EObject {
	/**
	 * Returns the value of the '<em><b>Drawable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drawable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawable</em>' containment reference.
	 * @see #setDrawable(AnyDrawableVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getAnimationFrame_Drawable()
	 * @model containment="true"
	 * @generated
	 */
	AnyDrawableVA getDrawable();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationFrame#getDrawable <em>Drawable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawable</em>' containment reference.
	 * @see #getDrawable()
	 * @generated
	 */
	void setDrawable(AnyDrawableVA value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getAnimationFrame_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.AnimationFrame#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // AnimationFrame
