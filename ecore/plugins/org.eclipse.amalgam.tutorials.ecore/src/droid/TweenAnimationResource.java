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
 * A representation of the model object '<em><b>Tween Animation Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.TweenAnimationResource#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getTweenAnimationResource()
 * @model
 * @generated
 */
public interface TweenAnimationResource extends AnimationResource {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link droid.FrameAnimationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see droid.DroidPackage#getTweenAnimationResource_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FrameAnimationElement> getElements();

} // TweenAnimationResource
