/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spinner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.Spinner#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.Spinner#getFadeScrollBars <em>Fade Scroll Bars</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.Spinner#getIsScrollContainer <em>Is Scroll Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getSpinner()
 * @model
 * @generated
 */
public interface Spinner extends Widget {
	/**
	 * Returns the value of the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prompt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt</em>' containment reference.
	 * @see #setPrompt(StringVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getSpinner_Prompt()
	 * @model containment="true"
	 * @generated
	 */
	StringVA getPrompt();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.Spinner#getPrompt <em>Prompt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt</em>' containment reference.
	 * @see #getPrompt()
	 * @generated
	 */
	void setPrompt(StringVA value);

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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getSpinner_FadeScrollBars()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getFadeScrollBars();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.Spinner#getFadeScrollBars <em>Fade Scroll Bars</em>}' containment reference.
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getSpinner_IsScrollContainer()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getIsScrollContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.Spinner#getIsScrollContainer <em>Is Scroll Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Scroll Container</em>' containment reference.
	 * @see #getIsScrollContainer()
	 * @generated
	 */
	void setIsScrollContainer(BooleanVA value);

} // Spinner
