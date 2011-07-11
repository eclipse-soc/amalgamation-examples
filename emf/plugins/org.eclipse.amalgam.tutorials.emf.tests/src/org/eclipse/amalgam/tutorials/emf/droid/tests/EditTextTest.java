/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.tests;

import junit.textui.TestRunner;

import org.eclipse.amalgam.tutorials.emf.droid.DroidFactory;
import org.eclipse.amalgam.tutorials.emf.droid.EditText;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Edit Text</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditTextTest extends WidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EditTextTest.class);
	}

	/**
	 * Constructs a new Edit Text test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditTextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Edit Text test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EditText getFixture() {
		return (EditText)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DroidFactory.eINSTANCE.createEditText());
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

} //EditTextTest
