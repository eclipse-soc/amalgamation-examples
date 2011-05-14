/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getEditable <em>Editable</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getNumeric <em>Numeric</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getPhoneNumber <em>Phone Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getEditText()
 * @model
 * @generated
 */
public interface EditText extends Widget
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(StringPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getEditText_Text()
   * @model containment="true"
   * @generated
   */
  StringPropertyValue getText();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(StringPropertyValue value);

  /**
   * Returns the value of the '<em><b>Hint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hint</em>' containment reference.
   * @see #setHint(StringPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getEditText_Hint()
   * @model containment="true"
   * @generated
   */
  StringPropertyValue getHint();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getHint <em>Hint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hint</em>' containment reference.
   * @see #getHint()
   * @generated
   */
  void setHint(StringPropertyValue value);

  /**
   * Returns the value of the '<em><b>Text Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Color</em>' containment reference.
   * @see #setTextColor(ColorPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getEditText_TextColor()
   * @model containment="true"
   * @generated
   */
  ColorPropertyValue getTextColor();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getTextColor <em>Text Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text Color</em>' containment reference.
   * @see #getTextColor()
   * @generated
   */
  void setTextColor(ColorPropertyValue value);

  /**
   * Returns the value of the '<em><b>Editable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Editable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Editable</em>' containment reference.
   * @see #setEditable(BooleanPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getEditText_Editable()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getEditable();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getEditable <em>Editable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Editable</em>' containment reference.
   * @see #getEditable()
   * @generated
   */
  void setEditable(BooleanPropertyValue value);

  /**
   * Returns the value of the '<em><b>Numeric</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numeric</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numeric</em>' containment reference.
   * @see #setNumeric(BooleanPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getEditText_Numeric()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getNumeric();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getNumeric <em>Numeric</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numeric</em>' containment reference.
   * @see #getNumeric()
   * @generated
   */
  void setNumeric(BooleanPropertyValue value);

  /**
   * Returns the value of the '<em><b>Password</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' containment reference.
   * @see #setPassword(BooleanPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getEditText_Password()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getPassword();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getPassword <em>Password</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' containment reference.
   * @see #getPassword()
   * @generated
   */
  void setPassword(BooleanPropertyValue value);

  /**
   * Returns the value of the '<em><b>Phone Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phone Number</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phone Number</em>' containment reference.
   * @see #setPhoneNumber(BooleanPropertyValue)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getEditText_PhoneNumber()
   * @model containment="true"
   * @generated
   */
  BooleanPropertyValue getPhoneNumber();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.EditText#getPhoneNumber <em>Phone Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Phone Number</em>' containment reference.
   * @see #getPhoneNumber()
   * @generated
   */
  void setPhoneNumber(BooleanPropertyValue value);

} // EditText
