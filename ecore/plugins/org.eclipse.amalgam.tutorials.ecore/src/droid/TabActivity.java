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
 * A representation of the model object '<em><b>Tab Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.TabActivity#getTabs <em>Tabs</em>}</li>
 *   <li>{@link droid.TabActivity#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getTabActivity()
 * @model
 * @generated
 */
public interface TabActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link droid.Tab}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see droid.DroidPackage#getTabActivity_Tabs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tab> getTabs();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link droid.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see droid.DroidPackage#getTabActivity_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // TabActivity
