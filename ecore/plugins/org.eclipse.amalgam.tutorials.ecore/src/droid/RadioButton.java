/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.RadioButton#getName <em>Name</em>}</li>
 *   <li>{@link droid.RadioButton#getText <em>Text</em>}</li>
 *   <li>{@link droid.RadioButton#getOnClick <em>On Click</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getRadioButton()
 * @model
 * @generated
 */
public interface RadioButton extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see droid.DroidPackage#getRadioButton_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link droid.RadioButton#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see droid.DroidPackage#getRadioButton_Text()
	 * @model containment="true"
	 * @generated
	 */
	StringVA getText();

	/**
	 * Sets the value of the '{@link droid.RadioButton#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(StringVA value);

	/**
	 * Returns the value of the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Click</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Click</em>' containment reference.
	 * @see #setOnClick(Action)
	 * @see droid.DroidPackage#getRadioButton_OnClick()
	 * @model containment="true"
	 * @generated
	 */
	Action getOnClick();

	/**
	 * Sets the value of the '{@link droid.RadioButton#getOnClick <em>On Click</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Click</em>' containment reference.
	 * @see #getOnClick()
	 * @generated
	 */
	void setOnClick(Action value);

} // RadioButton
