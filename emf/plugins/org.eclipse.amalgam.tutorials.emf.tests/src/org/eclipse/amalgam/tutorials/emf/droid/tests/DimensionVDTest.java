/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.tests;

import junit.textui.TestRunner;

import org.eclipse.amalgam.tutorials.emf.droid.DimensionVD;
import org.eclipse.amalgam.tutorials.emf.droid.DroidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dimension VD</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DimensionVDTest extends ValueDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DimensionVDTest.class);
	}

	/**
	 * Constructs a new Dimension VD test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dimension VD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DimensionVD getFixture() {
		return (DimensionVD)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DroidFactory.eINSTANCE.createDimensionVD());
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

} //DimensionVDTest
