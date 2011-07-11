/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.ListActivity#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.ListActivity#getItemLayout <em>Item Layout</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.emf.droid.ListActivity#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getListActivity()
 * @model
 * @generated
 */
public interface ListActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see #setDataSource(String)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getListActivity_DataSource()
	 * @model
	 * @generated
	 */
	String getDataSource();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.ListActivity#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(String value);

	/**
	 * Returns the value of the '<em><b>Item Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Layout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Layout</em>' reference.
	 * @see #setItemLayout(Layout)
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getListActivity_ItemLayout()
	 * @model
	 * @generated
	 */
	Layout getItemLayout();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.tutorials.emf.droid.ListActivity#getItemLayout <em>Item Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Layout</em>' reference.
	 * @see #getItemLayout()
	 * @generated
	 */
	void setItemLayout(Layout value);

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
	 * @see org.eclipse.amalgam.tutorials.emf.droid.DroidPackage#getListActivity_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // ListActivity
