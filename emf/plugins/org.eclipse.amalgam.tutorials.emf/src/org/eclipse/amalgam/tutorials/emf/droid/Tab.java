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
 * A representation of the model object '<em><b>Tab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getSelectedIcon <em>Selected Icon</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTab()
 * @model
 * @generated
 */
public interface Tab extends EObject {
	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference.
	 * @see #setCaption(StringVA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTab_Caption()
	 * @model containment="true"
	 * @generated
	 */
	StringVA getCaption();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getCaption <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' containment reference.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(StringVA value);

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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTab_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(DrawableRA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTab_Icon()
	 * @model containment="true"
	 * @generated
	 */
	DrawableRA getIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(DrawableRA value);

	/**
	 * Returns the value of the '<em><b>Selected Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Icon</em>' containment reference.
	 * @see #setSelectedIcon(DrawableRA)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTab_SelectedIcon()
	 * @model containment="true"
	 * @generated
	 */
	DrawableRA getSelectedIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getSelectedIcon <em>Selected Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Icon</em>' containment reference.
	 * @see #getSelectedIcon()
	 * @generated
	 */
	void setSelectedIcon(DrawableRA value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTab_Activity()
	 * @model
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' reference.
	 * @see #setLayout(Layout)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTab_Layout()
	 * @model
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.Tab#getLayout <em>Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.tutorials.emf.droid.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getTab_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Tab
