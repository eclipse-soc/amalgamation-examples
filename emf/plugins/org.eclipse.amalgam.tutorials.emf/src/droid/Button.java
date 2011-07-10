/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.Button#getText <em>Text</em>}</li>
 *   <li>{@link droid.Button#getSrc <em>Src</em>}</li>
 *   <li>{@link droid.Button#getTarget <em>Target</em>}</li>
 *   <li>{@link droid.Button#getHint <em>Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Widget, AbstractTextView {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(StringVA)
	 * @see droid.DroidPackage#getButton_Text()
	 * @model containment="true"
	 * @generated
	 */
	StringVA getText();

	/**
	 * Sets the value of the '{@link droid.Button#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(StringVA value);

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
	 * @see droid.DroidPackage#getButton_Src()
	 * @model containment="true"
	 * @generated
	 */
	AnyDrawableVA getSrc();

	/**
	 * Sets the value of the '{@link droid.Button#getSrc <em>Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' containment reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(AnyDrawableVA value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Activity)
	 * @see droid.DroidPackage#getButton_Target()
	 * @model
	 * @generated
	 */
	Activity getTarget();

	/**
	 * Sets the value of the '{@link droid.Button#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Activity value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' containment reference.
	 * @see #setHint(StringVA)
	 * @see droid.DroidPackage#getButton_Hint()
	 * @model containment="true"
	 * @generated
	 */
	StringVA getHint();

	/**
	 * Sets the value of the '{@link droid.Button#getHint <em>Hint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' containment reference.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(StringVA value);

} // Button
