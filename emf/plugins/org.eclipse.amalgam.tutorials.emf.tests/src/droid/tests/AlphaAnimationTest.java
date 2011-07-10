/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.tests;

import droid.AlphaAnimation;
import droid.DroidFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alpha Animation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlphaAnimationTest extends TerminalAnimationElementsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlphaAnimationTest.class);
	}

	/**
	 * Constructs a new Alpha Animation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphaAnimationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Alpha Animation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AlphaAnimation getFixture() {
		return (AlphaAnimation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DroidFactory.eINSTANCE.createAlphaAnimation());
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

} //AlphaAnimationTest
