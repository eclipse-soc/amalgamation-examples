/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.tests;

import junit.textui.TestRunner;

import org.eclipse.amalgam.tutorials.emf.droid.DrawableVA;
import org.eclipse.amalgam.tutorials.emf.droid.DroidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drawable VA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DrawableVATest extends ValueAccessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DrawableVATest.class);
	}

	/**
	 * Constructs a new Drawable VA test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawableVATest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Drawable VA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DrawableVA getFixture() {
		return (DrawableVA)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DroidFactory.eINSTANCE.createDrawableVA());
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

} //DrawableVATest
