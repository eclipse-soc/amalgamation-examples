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
 * A representation of the model object '<em><b>Integer Array Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.IntegerArrayResource#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getIntegerArrayResource()
 * @model
 * @generated
 */
public interface IntegerArrayResource extends ArrayResource {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' attribute list.
	 * @see droid.DroidPackage#getIntegerArrayResource_Items()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getItems();

} // IntegerArrayResource
