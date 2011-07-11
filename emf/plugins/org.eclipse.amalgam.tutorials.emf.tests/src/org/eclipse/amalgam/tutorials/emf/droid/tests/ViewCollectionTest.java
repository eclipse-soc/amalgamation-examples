/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.amalgam.tutorials.emf.droid.DroidFactory;
import org.eclipse.amalgam.tutorials.emf.droid.ViewCollection;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>View Collection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewCollectionTest extends TestCase {

	/**
	 * The fixture for this View Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewCollection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ViewCollectionTest.class);
	}

	/**
	 * Constructs a new View Collection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewCollectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this View Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ViewCollection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this View Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewCollection getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DroidFactory.eINSTANCE.createViewCollection());
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

} //ViewCollectionTest
