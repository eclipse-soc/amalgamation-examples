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
 * A representation of the model object '<em><b>View Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.ViewCollection#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getViewCollection()
 * @model
 * @generated
 */
public interface ViewCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link droid.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see droid.DroidPackage#getViewCollection_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getViews();

} // ViewCollection
