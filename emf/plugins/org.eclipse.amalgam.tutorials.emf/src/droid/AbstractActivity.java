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
 * A representation of the model object '<em><b>Abstract Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.AbstractActivity#getReferencedLayout <em>Referenced Layout</em>}</li>
 *   <li>{@link droid.AbstractActivity#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getAbstractActivity()
 * @model
 * @generated
 */
public interface AbstractActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Layout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Layout</em>' reference.
	 * @see #setReferencedLayout(Layout)
	 * @see droid.DroidPackage#getAbstractActivity_ReferencedLayout()
	 * @model
	 * @generated
	 */
	Layout getReferencedLayout();

	/**
	 * Sets the value of the '{@link droid.AbstractActivity#getReferencedLayout <em>Referenced Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Layout</em>' reference.
	 * @see #getReferencedLayout()
	 * @generated
	 */
	void setReferencedLayout(Layout value);

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference.
	 * @see #setWidgets(ViewCollection)
	 * @see droid.DroidPackage#getAbstractActivity_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	ViewCollection getWidgets();

	/**
	 * Sets the value of the '{@link droid.AbstractActivity#getWidgets <em>Widgets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widgets</em>' containment reference.
	 * @see #getWidgets()
	 * @generated
	 */
	void setWidgets(ViewCollection value);

} // AbstractActivity
