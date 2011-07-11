/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.tests;

import junit.textui.TestRunner;

import org.eclipse.amalgam.tutorials.emf.droid.DroidFactory;
import org.eclipse.amalgam.tutorials.emf.droid.InterpolatorVA;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interpolator VA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterpolatorVATest extends ValueAccessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterpolatorVATest.class);
	}

	/**
	 * Constructs a new Interpolator VA test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolatorVATest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interpolator VA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InterpolatorVA getFixture() {
		return (InterpolatorVA)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DroidFactory.eINSTANCE.createInterpolatorVA());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InterpolatorVATest
