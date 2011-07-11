/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.ImageView#getSrc <em>Src</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.ImageView#getFadeScrollBars <em>Fade Scroll Bars</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.ImageView#getIsScrollContainer <em>Is Scroll Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getImageView()
 * @model
 * @generated
 */
public interface ImageView extends Widget {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' containment reference.
	 * @see #setSrc(AnyDrawableVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getImageView_Src()
	 * @model containment="true"
	 * @generated
	 */
	AnyDrawableVA getSrc();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.ImageView#getSrc <em>Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' containment reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(AnyDrawableVA value);

	/**
	 * Returns the value of the '<em><b>Fade Scroll Bars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fade Scroll Bars</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fade Scroll Bars</em>' containment reference.
	 * @see #setFadeScrollBars(BooleanVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getImageView_FadeScrollBars()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getFadeScrollBars();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.ImageView#getFadeScrollBars <em>Fade Scroll Bars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fade Scroll Bars</em>' containment reference.
	 * @see #getFadeScrollBars()
	 * @generated
	 */
	void setFadeScrollBars(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Is Scroll Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Scroll Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Scroll Container</em>' containment reference.
	 * @see #setIsScrollContainer(BooleanVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getImageView_IsScrollContainer()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getIsScrollContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.ImageView#getIsScrollContainer <em>Is Scroll Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Scroll Container</em>' containment reference.
	 * @see #getIsScrollContainer()
	 * @generated
	 */
	void setIsScrollContainer(BooleanVA value);

} // ImageView
