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
 * A representation of the model object '<em><b>String Array Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.StringArrayResource#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getStringArrayResource()
 * @model
 * @generated
 */
public interface StringArrayResource extends ArrayResource {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' attribute list.
	 * @see droid.DroidPackage#getStringArrayResource_Items()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getItems();

} // StringArrayResource
