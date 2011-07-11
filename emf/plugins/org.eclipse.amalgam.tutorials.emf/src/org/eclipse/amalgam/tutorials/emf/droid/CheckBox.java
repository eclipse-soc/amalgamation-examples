/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTop <em>Top</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getBackground <em>Background</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getClickable <em>Clickable</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getFadeScrollBars <em>Fade Scroll Bars</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getIsScrollContainer <em>Is Scroll Container</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getAutoLink <em>Auto Link</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getAutoText <em>Auto Text</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getCapitalize <em>Capitalize</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getDigits <em>Digits</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getEditable <em>Editable</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getGravity <em>Gravity</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getNumeric <em>Numeric</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getSingleLine <em>Single Line</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTypeface <em>Typeface</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTextSize <em>Text Size</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getOnCheck <em>On Check</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox()
 * @model
 * @generated
 */
public interface CheckBox extends EObject {
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Text()
	 * @model containment="true"
	 * @generated
	 */
	StringVA getText();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(StringVA value);

	/**
	 * Returns the value of the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' containment reference.
	 * @see #setTop(DimensionVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Top()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getTop();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTop <em>Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' containment reference.
	 * @see #getTop()
	 * @generated
	 */
	void setTop(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(DimensionVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Left()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(DimensionVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Width()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(DimensionVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Height()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' containment reference.
	 * @see #setBackground(AnyDrawableVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Background()
	 * @model containment="true"
	 * @generated
	 */
	AnyDrawableVA getBackground();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getBackground <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' containment reference.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(AnyDrawableVA value);

	/**
	 * Returns the value of the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clickable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clickable</em>' containment reference.
	 * @see #setClickable(BooleanVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Clickable()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getClickable();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getClickable <em>Clickable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clickable</em>' containment reference.
	 * @see #getClickable()
	 * @generated
	 */
	void setClickable(BooleanVA value);

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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_FadeScrollBars()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getFadeScrollBars();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getFadeScrollBars <em>Fade Scroll Bars</em>}' containment reference.
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_IsScrollContainer()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getIsScrollContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getIsScrollContainer <em>Is Scroll Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Scroll Container</em>' containment reference.
	 * @see #getIsScrollContainer()
	 * @generated
	 */
	void setIsScrollContainer(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Auto Link</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.tutorials.emf.droid.AutoLinkKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Link</em>' attribute.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AutoLinkKind
	 * @see #setAutoLink(AutoLinkKind)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_AutoLink()
	 * @model
	 * @generated
	 */
	AutoLinkKind getAutoLink();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getAutoLink <em>Auto Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Link</em>' attribute.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.AutoLinkKind
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_AutoText()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getAutoText();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getAutoText <em>Auto Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Text</em>' containment reference.
	 * @see #getAutoText()
	 * @generated
	 */
	void setAutoText(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Capitalize</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.tutorials.emf.droid.CapitalizeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capitalize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capitalize</em>' attribute.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CapitalizeKind
	 * @see #setCapitalize(CapitalizeKind)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Capitalize()
	 * @model
	 * @generated
	 */
	CapitalizeKind getCapitalize();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getCapitalize <em>Capitalize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capitalize</em>' attribute.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.CapitalizeKind
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Digits()
	 * @model containment="true"
	 * @generated
	 */
	StringVA getDigits();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getDigits <em>Digits</em>}' containment reference.
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Editable()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getEditable();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getEditable <em>Editable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' containment reference.
	 * @see #getEditable()
	 * @generated
	 */
	void setEditable(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Gravity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gravity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravity</em>' attribute.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind
	 * @see #setGravity(LayoutGravityKind)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Gravity()
	 * @model
	 * @generated
	 */
	LayoutGravityKind getGravity();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getGravity <em>Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravity</em>' attribute.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.LayoutGravityKind
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Hint()
	 * @model containment="true"
	 * @generated
	 */
	StringVA getHint();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getHint <em>Hint</em>}' containment reference.
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Numeric()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getNumeric();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getNumeric <em>Numeric</em>}' containment reference.
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Password()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getPassword <em>Password</em>}' containment reference.
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_PhoneNumber()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getPhoneNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getPhoneNumber <em>Phone Number</em>}' containment reference.
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_SingleLine()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getSingleLine();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getSingleLine <em>Single Line</em>}' containment reference.
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_TextColor()
	 * @model containment="true"
	 * @generated
	 */
	ColorVA getTextColor();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTextColor <em>Text Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' containment reference.
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(ColorVA value);

	/**
	 * Returns the value of the '<em><b>Typeface</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.tutorials.emf.droid.TypefaceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typeface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeface</em>' attribute.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TypefaceKind
	 * @see #setTypeface(TypefaceKind)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_Typeface()
	 * @model
	 * @generated
	 */
	TypefaceKind getTypeface();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTypeface <em>Typeface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeface</em>' attribute.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TypefaceKind
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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_TextSize()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getTextSize();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getTextSize <em>Text Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Size</em>' containment reference.
	 * @see #getTextSize()
	 * @generated
	 */
	void setTextSize(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Text Style</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.amalgam.tutorials.emf.droid.TextStyleKind}.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.tutorials.emf.droid.TextStyleKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Style</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Style</em>' attribute list.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.TextStyleKind
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_TextStyle()
	 * @model unique="false"
	 * @generated
	 */
	EList<TextStyleKind> getTextStyle();

	/**
	 * Returns the value of the '<em><b>On Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Check</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Check</em>' containment reference.
	 * @see #setOnCheck(Action)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getCheckBox_OnCheck()
	 * @model containment="true"
	 * @generated
	 */
	Action getOnCheck();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox#getOnCheck <em>On Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Check</em>' containment reference.
	 * @see #getOnCheck()
	 * @generated
	 */
	void setOnCheck(Action value);

} // CheckBox
