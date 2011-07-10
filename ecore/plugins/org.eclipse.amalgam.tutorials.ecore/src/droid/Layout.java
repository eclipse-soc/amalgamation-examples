/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.Layout#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link droid.Layout#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link droid.Layout#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link droid.Layout#getNextFocusDown <em>Next Focus Down</em>}</li>
 *   <li>{@link droid.Layout#getNextFocusLeft <em>Next Focus Left</em>}</li>
 *   <li>{@link droid.Layout#getNextFocusRight <em>Next Focus Right</em>}</li>
 *   <li>{@link droid.Layout#getNextFocusUp <em>Next Focus Up</em>}</li>
 *   <li>{@link droid.Layout#getOnClick <em>On Click</em>}</li>
 *   <li>{@link droid.Layout#getPadding <em>Padding</em>}</li>
 *   <li>{@link droid.Layout#getPaddingBottom <em>Padding Bottom</em>}</li>
 *   <li>{@link droid.Layout#getPaddingLeft <em>Padding Left</em>}</li>
 *   <li>{@link droid.Layout#getPaddingRight <em>Padding Right</em>}</li>
 *   <li>{@link droid.Layout#getPaddingTop <em>Padding Top</em>}</li>
 *   <li>{@link droid.Layout#getScrollbars <em>Scrollbars</em>}</li>
 *   <li>{@link droid.Layout#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link droid.Layout#getLayoutAnimation <em>Layout Animation</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends View {
	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(Float)
	 * @see droid.DroidPackage#getLayout_Alpha()
	 * @model
	 * @generated
	 */
	Float getAlpha();

	/**
	 * Sets the value of the '{@link droid.Layout#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(Float value);

	/**
	 * Returns the value of the '<em><b>Min Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Height</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Height</em>' containment reference.
	 * @see #setMinHeight(DimensionVA)
	 * @see droid.DroidPackage#getLayout_MinHeight()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getMinHeight();

	/**
	 * Sets the value of the '{@link droid.Layout#getMinHeight <em>Min Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Height</em>' containment reference.
	 * @see #getMinHeight()
	 * @generated
	 */
	void setMinHeight(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Min Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Width</em>' containment reference.
	 * @see #setMinWidth(DimensionVA)
	 * @see droid.DroidPackage#getLayout_MinWidth()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getMinWidth();

	/**
	 * Sets the value of the '{@link droid.Layout#getMinWidth <em>Min Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Width</em>' containment reference.
	 * @see #getMinWidth()
	 * @generated
	 */
	void setMinWidth(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Next Focus Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Focus Down</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Focus Down</em>' reference.
	 * @see #setNextFocusDown(View)
	 * @see droid.DroidPackage#getLayout_NextFocusDown()
	 * @model
	 * @generated
	 */
	View getNextFocusDown();

	/**
	 * Sets the value of the '{@link droid.Layout#getNextFocusDown <em>Next Focus Down</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Focus Down</em>' reference.
	 * @see #getNextFocusDown()
	 * @generated
	 */
	void setNextFocusDown(View value);

	/**
	 * Returns the value of the '<em><b>Next Focus Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Focus Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Focus Left</em>' reference.
	 * @see #setNextFocusLeft(View)
	 * @see droid.DroidPackage#getLayout_NextFocusLeft()
	 * @model
	 * @generated
	 */
	View getNextFocusLeft();

	/**
	 * Sets the value of the '{@link droid.Layout#getNextFocusLeft <em>Next Focus Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Focus Left</em>' reference.
	 * @see #getNextFocusLeft()
	 * @generated
	 */
	void setNextFocusLeft(View value);

	/**
	 * Returns the value of the '<em><b>Next Focus Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Focus Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Focus Right</em>' reference.
	 * @see #setNextFocusRight(View)
	 * @see droid.DroidPackage#getLayout_NextFocusRight()
	 * @model
	 * @generated
	 */
	View getNextFocusRight();

	/**
	 * Sets the value of the '{@link droid.Layout#getNextFocusRight <em>Next Focus Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Focus Right</em>' reference.
	 * @see #getNextFocusRight()
	 * @generated
	 */
	void setNextFocusRight(View value);

	/**
	 * Returns the value of the '<em><b>Next Focus Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Focus Up</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Focus Up</em>' reference.
	 * @see #setNextFocusUp(View)
	 * @see droid.DroidPackage#getLayout_NextFocusUp()
	 * @model
	 * @generated
	 */
	View getNextFocusUp();

	/**
	 * Sets the value of the '{@link droid.Layout#getNextFocusUp <em>Next Focus Up</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Focus Up</em>' reference.
	 * @see #getNextFocusUp()
	 * @generated
	 */
	void setNextFocusUp(View value);

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
	 * @see droid.DroidPackage#getLayout_OnClick()
	 * @model containment="true"
	 * @generated
	 */
	Action getOnClick();

	/**
	 * Sets the value of the '{@link droid.Layout#getOnClick <em>On Click</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Click</em>' containment reference.
	 * @see #getOnClick()
	 * @generated
	 */
	void setOnClick(Action value);

	/**
	 * Returns the value of the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding</em>' containment reference.
	 * @see #setPadding(DimensionVA)
	 * @see droid.DroidPackage#getLayout_Padding()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getPadding();

	/**
	 * Sets the value of the '{@link droid.Layout#getPadding <em>Padding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' containment reference.
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Padding Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Bottom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Bottom</em>' containment reference.
	 * @see #setPaddingBottom(DimensionVA)
	 * @see droid.DroidPackage#getLayout_PaddingBottom()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getPaddingBottom();

	/**
	 * Sets the value of the '{@link droid.Layout#getPaddingBottom <em>Padding Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Bottom</em>' containment reference.
	 * @see #getPaddingBottom()
	 * @generated
	 */
	void setPaddingBottom(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Padding Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Left</em>' containment reference.
	 * @see #setPaddingLeft(DimensionVA)
	 * @see droid.DroidPackage#getLayout_PaddingLeft()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getPaddingLeft();

	/**
	 * Sets the value of the '{@link droid.Layout#getPaddingLeft <em>Padding Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Left</em>' containment reference.
	 * @see #getPaddingLeft()
	 * @generated
	 */
	void setPaddingLeft(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Padding Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Right</em>' containment reference.
	 * @see #setPaddingRight(DimensionVA)
	 * @see droid.DroidPackage#getLayout_PaddingRight()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getPaddingRight();

	/**
	 * Sets the value of the '{@link droid.Layout#getPaddingRight <em>Padding Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Right</em>' containment reference.
	 * @see #getPaddingRight()
	 * @generated
	 */
	void setPaddingRight(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Padding Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Top</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Top</em>' containment reference.
	 * @see #setPaddingTop(DimensionVA)
	 * @see droid.DroidPackage#getLayout_PaddingTop()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getPaddingTop();

	/**
	 * Sets the value of the '{@link droid.Layout#getPaddingTop <em>Padding Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Top</em>' containment reference.
	 * @see #getPaddingTop()
	 * @generated
	 */
	void setPaddingTop(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Scrollbars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scrollbars</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scrollbars</em>' containment reference.
	 * @see #setScrollbars(BooleanVA)
	 * @see droid.DroidPackage#getLayout_Scrollbars()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getScrollbars();

	/**
	 * Sets the value of the '{@link droid.Layout#getScrollbars <em>Scrollbars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scrollbars</em>' containment reference.
	 * @see #getScrollbars()
	 * @generated
	 */
	void setScrollbars(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link droid.LayoutVisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see droid.LayoutVisibilityKind
	 * @see #setVisibility(LayoutVisibilityKind)
	 * @see droid.DroidPackage#getLayout_Visibility()
	 * @model
	 * @generated
	 */
	LayoutVisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link droid.Layout#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see droid.LayoutVisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(LayoutVisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Layout Animation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Animation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Animation</em>' containment reference.
	 * @see #setLayoutAnimation(AnimationVA)
	 * @see droid.DroidPackage#getLayout_LayoutAnimation()
	 * @model containment="true"
	 * @generated
	 */
	AnimationVA getLayoutAnimation();

	/**
	 * Sets the value of the '{@link droid.Layout#getLayoutAnimation <em>Layout Animation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Animation</em>' containment reference.
	 * @see #getLayoutAnimation()
	 * @generated
	 */
	void setLayoutAnimation(AnimationVA value);

} // Layout
