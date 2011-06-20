/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame Animation Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.FrameAnimationResource#isOneShot <em>One Shot</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.FrameAnimationResource#getFrames <em>Frames</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getFrameAnimationResource()
 * @model
 * @generated
 */
public interface FrameAnimationResource extends AnimationResource
{
  /**
   * Returns the value of the '<em><b>One Shot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>One Shot</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>One Shot</em>' attribute.
   * @see #setOneShot(boolean)
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getFrameAnimationResource_OneShot()
   * @model
   * @generated
   */
  boolean isOneShot();

  /**
   * Sets the value of the '{@link org.eclipse.amalgam.tutorials.xtext.droid.FrameAnimationResource#isOneShot <em>One Shot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>One Shot</em>' attribute.
   * @see #isOneShot()
   * @generated
   */
  void setOneShot(boolean value);

  /**
   * Returns the value of the '<em><b>Frames</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.amalgam.tutorials.xtext.droid.AnimationFrame}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frames</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frames</em>' containment reference list.
   * @see org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage#getFrameAnimationResource_Frames()
   * @model containment="true"
   * @generated
   */
  EList<AnimationFrame> getFrames();

} // FrameAnimationResource
