/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amalgam.tutorials.xtext.droid.impl;

import org.eclipse.amalgam.tutorials.xtext.droid.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DroidFactoryImpl extends EFactoryImpl implements DroidFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DroidFactory init()
  {
    try
    {
      DroidFactory theDroidFactory = (DroidFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/amalgam/tutorials/xtext/Droid"); 
      if (theDroidFactory != null)
      {
        return theDroidFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DroidFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DroidFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DroidPackage.MODEL: return createModel();
      case DroidPackage.GREETING: return createGreeting();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greeting createGreeting()
  {
    GreetingImpl greeting = new GreetingImpl();
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DroidPackage getDroidPackage()
  {
    return (DroidPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DroidPackage getPackage()
  {
    return DroidPackage.eINSTANCE;
  }

} //DroidFactoryImpl
