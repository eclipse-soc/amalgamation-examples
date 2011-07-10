/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.RadioGroup#getName <em>Name</em>}</li>
 *   <li>{@link droid.RadioGroup#getRadioButtons <em>Radio Buttons</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getRadioGroup()
 * @model
 * @generated
 */
public interface RadioGroup extends EObject {
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
	 * @see droid.DroidPackage#getRadioGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link droid.RadioGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Radio Buttons</b></em>' reference list.
	 * The list contents are of type {@link droid.RadioButton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radio Buttons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio Buttons</em>' reference list.
	 * @see droid.DroidPackage#getRadioGroup_RadioButtons()
	 * @model
	 * @generated
	 */
	EList<RadioButton> getRadioButtons();

} // RadioGroup
