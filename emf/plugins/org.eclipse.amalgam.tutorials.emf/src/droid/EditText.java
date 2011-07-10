/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.EditText#getText <em>Text</em>}</li>
 *   <li>{@link droid.EditText#getFadeScrollBars <em>Fade Scroll Bars</em>}</li>
 *   <li>{@link droid.EditText#getIsScrollContainer <em>Is Scroll Container</em>}</li>
 *   <li>{@link droid.EditText#getAutoLink <em>Auto Link</em>}</li>
 *   <li>{@link droid.EditText#getAutoText <em>Auto Text</em>}</li>
 *   <li>{@link droid.EditText#getCapitalize <em>Capitalize</em>}</li>
 *   <li>{@link droid.EditText#getDigits <em>Digits</em>}</li>
 *   <li>{@link droid.EditText#getEditable <em>Editable</em>}</li>
 *   <li>{@link droid.EditText#getGravity <em>Gravity</em>}</li>
 *   <li>{@link droid.EditText#getHint <em>Hint</em>}</li>
 *   <li>{@link droid.EditText#getNumeric <em>Numeric</em>}</li>
 *   <li>{@link droid.EditText#getPassword <em>Password</em>}</li>
 *   <li>{@link droid.EditText#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link droid.EditText#getSingleLine <em>Single Line</em>}</li>
 *   <li>{@link droid.EditText#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link droid.EditText#getTypeface <em>Typeface</em>}</li>
 *   <li>{@link droid.EditText#getTextSize <em>Text Size</em>}</li>
 *   <li>{@link droid.EditText#getTextStyle <em>Text Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getEditText()
 * @model
 * @generated
 */
public interface EditText extends Widget, AbstractTextView {
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
	 * @see droid.DroidPackage#getEditText_Text()
	 * @model containment="true"
	 * @generated
	 */
	StringVA getText();

	/**
	 * Sets the value of the '{@link droid.EditText#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(StringVA value);

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
	 * @see droid.DroidPackage#getEditText_FadeScrollBars()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getFadeScrollBars();

	/**
	 * Sets the value of the '{@link droid.EditText#getFadeScrollBars <em>Fade Scroll Bars</em>}' containment reference.
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
	 * @see droid.DroidPackage#getEditText_IsScrollContainer()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getIsScrollContainer();

	/**
	 * Sets the value of the '{@link droid.EditText#getIsScrollContainer <em>Is Scroll Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Scroll Container</em>' containment reference.
	 * @see #getIsScrollContainer()
	 * @generated
	 */
	void setIsScrollContainer(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Auto Link</b></em>' attribute.
	 * The literals are from the enumeration {@link droid.AutoLinkKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Link</em>' attribute.
	 * @see droid.AutoLinkKind
	 * @see #setAutoLink(AutoLinkKind)
	 * @see droid.DroidPackage#getEditText_AutoLink()
	 * @model
	 * @generated
	 */
	AutoLinkKind getAutoLink();

	/**
	 * Sets the value of the '{@link droid.EditText#getAutoLink <em>Auto Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Link</em>' attribute.
	 * @see droid.AutoLinkKind
	 * @see #getAutoLink()
	 * @generated
	 */
	void setAutoLink(AutoLinkKind value);

	/**
	 * Returns the value of the '<em><b>Auto Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Text</em>' containment reference.
	 * @see #setAutoText(BooleanVA)
	 * @see droid.DroidPackage#getEditText_AutoText()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getAutoText();

	/**
	 * Sets the value of the '{@link droid.EditText#getAutoText <em>Auto Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Text</em>' containment reference.
	 * @see #getAutoText()
	 * @generated
	 */
	void setAutoText(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Capitalize</b></em>' attribute.
	 * The literals are from the enumeration {@link droid.CapitalizeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capitalize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capitalize</em>' attribute.
	 * @see droid.CapitalizeKind
	 * @see #setCapitalize(CapitalizeKind)
	 * @see droid.DroidPackage#getEditText_Capitalize()
	 * @model
	 * @generated
	 */
	CapitalizeKind getCapitalize();

	/**
	 * Sets the value of the '{@link droid.EditText#getCapitalize <em>Capitalize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capitalize</em>' attribute.
	 * @see droid.CapitalizeKind
	 * @see #getCapitalize()
	 * @generated
	 */
	void setCapitalize(CapitalizeKind value);

	/**
	 * Returns the value of the '<em><b>Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digits</em>' containment reference.
	 * @see #setDigits(StringVA)
	 * @see droid.DroidPackage#getEditText_Digits()
	 * @model containment="true"
	 * @generated
	 */
	StringVA getDigits();

	/**
	 * Sets the value of the '{@link droid.EditText#getDigits <em>Digits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digits</em>' containment reference.
	 * @see #getDigits()
	 * @generated
	 */
	void setDigits(StringVA value);

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' containment reference.
	 * @see #setEditable(BooleanVA)
	 * @see droid.DroidPackage#getEditText_Editable()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getEditable();

	/**
	 * Sets the value of the '{@link droid.EditText#getEditable <em>Editable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' containment reference.
	 * @see #getEditable()
	 * @generated
	 */
	void setEditable(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Gravity</b></em>' attribute.
	 * The literals are from the enumeration {@link droid.LayoutGravityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gravity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravity</em>' attribute.
	 * @see droid.LayoutGravityKind
	 * @see #setGravity(LayoutGravityKind)
	 * @see droid.DroidPackage#getEditText_Gravity()
	 * @model
	 * @generated
	 */
	LayoutGravityKind getGravity();

	/**
	 * Sets the value of the '{@link droid.EditText#getGravity <em>Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravity</em>' attribute.
	 * @see droid.LayoutGravityKind
	 * @see #getGravity()
	 * @generated
	 */
	void setGravity(LayoutGravityKind value);

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
	 * @see droid.DroidPackage#getEditText_Hint()
	 * @model containment="true"
	 * @generated
	 */
	StringVA getHint();

	/**
	 * Sets the value of the '{@link droid.EditText#getHint <em>Hint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' containment reference.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(StringVA value);

	/**
	 * Returns the value of the '<em><b>Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numeric</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric</em>' containment reference.
	 * @see #setNumeric(BooleanVA)
	 * @see droid.DroidPackage#getEditText_Numeric()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getNumeric();

	/**
	 * Sets the value of the '{@link droid.EditText#getNumeric <em>Numeric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric</em>' containment reference.
	 * @see #getNumeric()
	 * @generated
	 */
	void setNumeric(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' containment reference.
	 * @see #setPassword(BooleanVA)
	 * @see droid.DroidPackage#getEditText_Password()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getPassword();

	/**
	 * Sets the value of the '{@link droid.EditText#getPassword <em>Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' containment reference.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' containment reference.
	 * @see #setPhoneNumber(BooleanVA)
	 * @see droid.DroidPackage#getEditText_PhoneNumber()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getPhoneNumber();

	/**
	 * Sets the value of the '{@link droid.EditText#getPhoneNumber <em>Phone Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' containment reference.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Single Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Line</em>' containment reference.
	 * @see #setSingleLine(BooleanVA)
	 * @see droid.DroidPackage#getEditText_SingleLine()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getSingleLine();

	/**
	 * Sets the value of the '{@link droid.EditText#getSingleLine <em>Single Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Line</em>' containment reference.
	 * @see #getSingleLine()
	 * @generated
	 */
	void setSingleLine(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' containment reference.
	 * @see #setTextColor(ColorVA)
	 * @see droid.DroidPackage#getEditText_TextColor()
	 * @model containment="true"
	 * @generated
	 */
	ColorVA getTextColor();

	/**
	 * Sets the value of the '{@link droid.EditText#getTextColor <em>Text Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' containment reference.
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(ColorVA value);

	/**
	 * Returns the value of the '<em><b>Typeface</b></em>' attribute.
	 * The literals are from the enumeration {@link droid.TypefaceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typeface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeface</em>' attribute.
	 * @see droid.TypefaceKind
	 * @see #setTypeface(TypefaceKind)
	 * @see droid.DroidPackage#getEditText_Typeface()
	 * @model
	 * @generated
	 */
	TypefaceKind getTypeface();

	/**
	 * Sets the value of the '{@link droid.EditText#getTypeface <em>Typeface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeface</em>' attribute.
	 * @see droid.TypefaceKind
	 * @see #getTypeface()
	 * @generated
	 */
	void setTypeface(TypefaceKind value);

	/**
	 * Returns the value of the '<em><b>Text Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Size</em>' containment reference.
	 * @see #setTextSize(DimensionVA)
	 * @see droid.DroidPackage#getEditText_TextSize()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getTextSize();

	/**
	 * Sets the value of the '{@link droid.EditText#getTextSize <em>Text Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Size</em>' containment reference.
	 * @see #getTextSize()
	 * @generated
	 */
	void setTextSize(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Text Style</b></em>' attribute list.
	 * The list contents are of type {@link droid.TextStyleKind}.
	 * The literals are from the enumeration {@link droid.TextStyleKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Style</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Style</em>' attribute list.
	 * @see droid.TextStyleKind
	 * @see droid.DroidPackage#getEditText_TextStyle()
	 * @model unique="false"
	 * @generated
	 */
	EList<TextStyleKind> getTextStyle();

} // EditText
