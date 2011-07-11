/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.tests;

import junit.textui.TestRunner;

import org.eclipse.amalgam.tutorials.emf.droid.BooleanRA;
import org.eclipse.amalgam.tutorials.emf.droid.DroidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean RA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanRATest extends ResourceAccessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanRATest.class);
	}

	/**
	 * Constructs a new Boolean RA test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanRATest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean RA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanRA getFixture() {
		return (BooleanRA)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DroidFactory.eINSTANCE.createBooleanRA());
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

} //BooleanRATest
