/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.tests;

import junit.textui.TestRunner;

import org.eclipse.amalgam.tutorials.emf.droid.BooleanVA;
import org.eclipse.amalgam.tutorials.emf.droid.DroidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean VA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanVATest extends ValueAccessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanVATest.class);
	}

	/**
	 * Constructs a new Boolean VA test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVATest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean VA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanVA getFixture() {
		return (BooleanVA)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DroidFactory.eINSTANCE.createBooleanVA());
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

} //BooleanVATest
