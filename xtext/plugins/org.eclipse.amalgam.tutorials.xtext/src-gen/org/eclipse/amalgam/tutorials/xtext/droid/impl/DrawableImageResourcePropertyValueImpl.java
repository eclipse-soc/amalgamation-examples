/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.DrawableImageResourcePropertyValue;
import org.eclipse.amalgam.tutorials.xtext.droid.DrawableResource;
import org.eclipse.amalgam.tutorials.xtext.droid.DroidPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drawable Image Resource Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableImageResourcePropertyValueImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.amalgam.tutorials.xtext.droid.impl.DrawableImageResourcePropertyValueImpl#getExternalResource <em>External Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DrawableImageResourcePropertyValueImpl extends MinimalEObjectImpl.Container implements DrawableImageResourcePropertyValue
{
  /**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected DrawableResource resource;

  /**
   * The default value of the '{@link #getExternalResource() <em>External Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalResource()
   * @generated
   * @ordered
   */
  protected static final String EXTERNAL_RESOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExternalResource() <em>External Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalResource()
   * @generated
   * @ordered
   */
  protected String externalResource = EXTERNAL_RESOURCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DrawableImageResourcePropertyValueImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DroidPackage.Literals.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrawableResource getResource()
  {
    if (resource != null && resource.eIsProxy())
    {
      InternalEObject oldResource = (InternalEObject)resource;
      resource = (DrawableResource)eResolveProxy(oldResource);
      if (resource != oldResource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__RESOURCE, oldResource, resource));
      }
    }
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrawableResource basicGetResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResource(DrawableResource newResource)
  {
    DrawableResource oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__RESOURCE, oldResource, resource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExternalResource()
  {
    return externalResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternalResource(String newExternalResource)
  {
    String oldExternalResource = externalResource;
    externalResource = newExternalResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__EXTERNAL_RESOURCE, oldExternalResource, externalResource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DroidPackage.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__RESOURCE:
        if (resolve) return getResource();
        return basicGetResource();
      case DroidPackage.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__EXTERNAL_RESOURCE:
        return getExternalResource();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DroidPackage.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__RESOURCE:
        setResource((DrawableResource)newValue);
        return;
      case DroidPackage.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__EXTERNAL_RESOURCE:
        setExternalResource((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DroidPackage.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__RESOURCE:
        setResource((DrawableResource)null);
        return;
      case DroidPackage.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__EXTERNAL_RESOURCE:
        setExternalResource(EXTERNAL_RESOURCE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DroidPackage.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__RESOURCE:
        return resource != null;
      case DroidPackage.DRAWABLE_IMAGE_RESOURCE_PROPERTY_VALUE__EXTERNAL_RESOURCE:
        return EXTERNAL_RESOURCE_EDEFAULT == null ? externalResource != null : !EXTERNAL_RESOURCE_EDEFAULT.equals(externalResource);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (externalResource: ");
    result.append(externalResource);
    result.append(')');
    return result.toString();
  }

} //DrawableImageResourcePropertyValueImpl
