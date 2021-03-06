/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.tests;

import junit.textui.TestRunner;

import org.eclipse.amalgam.tutorials.emf.droid.AbstractLinearLayout;
import org.eclipse.amalgam.tutorials.emf.droid.DroidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Linear Layout</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractLinearLayoutTest extends LayoutTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbstractLinearLayoutTest.class);
	}

	/**
	 * Constructs a new Abstract Linear Layout test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractLinearLayoutTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Abstract Linear Layout test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AbstractLinearLayout getFixture() {
		return (AbstractLinearLayout)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DroidFactory.eINSTANCE.createAbstractLinearLayout());
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

} //AbstractLinearLayoutTest
