/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.tests;

import junit.textui.TestRunner;

import org.eclipse.amalgam.tutorials.emf.droid.DroidFactory;
import org.eclipse.amalgam.tutorials.emf.droid.Widget;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WidgetTest extends ViewTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WidgetTest.class);
	}

	/**
	 * Constructs a new Widget test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Widget test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Widget getFixture() {
		return (Widget)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DroidFactory.eINSTANCE.createWidget());
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

} //WidgetTest
