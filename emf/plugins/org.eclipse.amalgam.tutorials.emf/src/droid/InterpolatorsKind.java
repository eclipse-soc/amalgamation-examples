/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interpolators Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see droid.DroidPackage#getInterpolatorsKind()
 * @model
 * @generated
 */
public enum InterpolatorsKind implements Enumerator {
	/**
	 * The '<em><b>Accelerate decelerate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCELERATE_DECELERATE_VALUE
	 * @generated
	 * @ordered
	 */
	ACCELERATE_DECELERATE(0, "accelerate_decelerate", "accelerate_decelerate"),

	/**
	 * The '<em><b>Accelerate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCELERATE_VALUE
	 * @generated
	 * @ordered
	 */
	ACCELERATE(1, "accelerate", "accelerate"),

	/**
	 * The '<em><b>Anticipate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTICIPATE_VALUE
	 * @generated
	 * @ordered
	 */
	ANTICIPATE(2, "anticipate", "anticipate"),

	/**
	 * The '<em><b>Anticipate overshoot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTICIPATE_OVERSHOOT_VALUE
	 * @generated
	 * @ordered
	 */
	ANTICIPATE_OVERSHOOT(3, "anticipate_overshoot", "anticipate_overshoot"),

	/**
	 * The '<em><b>Bounce</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOUNCE_VALUE
	 * @generated
	 * @ordered
	 */
	BOUNCE(4, "bounce", "bounce"),

	/**
	 * The '<em><b>Cycle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYCLE_VALUE
	 * @generated
	 * @ordered
	 */
	CYCLE(5, "cycle", "cycle"),

	/**
	 * The '<em><b>Decelerate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECELERATE_VALUE
	 * @generated
	 * @ordered
	 */
	DECELERATE(6, "decelerate", "decelerate"),

	/**
	 * The '<em><b>Linear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR_VALUE
	 * @generated
	 * @ordered
	 */
	LINEAR(7, "linear", "linear"),

	/**
	 * The '<em><b>Overshoot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERSHOOT_VALUE
	 * @generated
	 * @ordered
	 */
	OVERSHOOT(8, "overshoot", "overshoot");

	/**
	 * The '<em><b>Accelerate decelerate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Accelerate decelerate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCELERATE_DECELERATE
	 * @model name="accelerate_decelerate"
	 * @generated
	 * @ordered
	 */
	public static final int ACCELERATE_DECELERATE_VALUE = 0;

	/**
	 * The '<em><b>Accelerate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Accelerate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCELERATE
	 * @model name="accelerate"
	 * @generated
	 * @ordered
	 */
	public static final int ACCELERATE_VALUE = 1;

	/**
	 * The '<em><b>Anticipate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Anticipate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANTICIPATE
	 * @model name="anticipate"
	 * @generated
	 * @ordered
	 */
	public static final int ANTICIPATE_VALUE = 2;

	/**
	 * The '<em><b>Anticipate overshoot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Anticipate overshoot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANTICIPATE_OVERSHOOT
	 * @model name="anticipate_overshoot"
	 * @generated
	 * @ordered
	 */
	public static final int ANTICIPATE_OVERSHOOT_VALUE = 3;

	/**
	 * The '<em><b>Bounce</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bounce</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOUNCE
	 * @model name="bounce"
	 * @generated
	 * @ordered
	 */
	public static final int BOUNCE_VALUE = 4;

	/**
	 * The '<em><b>Cycle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cycle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CYCLE
	 * @model name="cycle"
	 * @generated
	 * @ordered
	 */
	public static final int CYCLE_VALUE = 5;

	/**
	 * The '<em><b>Decelerate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decelerate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECELERATE
	 * @model name="decelerate"
	 * @generated
	 * @ordered
	 */
	public static final int DECELERATE_VALUE = 6;

	/**
	 * The '<em><b>Linear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Linear</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINEAR
	 * @model name="linear"
	 * @generated
	 * @ordered
	 */
	public static final int LINEAR_VALUE = 7;

	/**
	 * The '<em><b>Overshoot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overshoot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERSHOOT
	 * @model name="overshoot"
	 * @generated
	 * @ordered
	 */
	public static final int OVERSHOOT_VALUE = 8;

	/**
	 * An array of all the '<em><b>Interpolators Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InterpolatorsKind[] VALUES_ARRAY =
		new InterpolatorsKind[] {
			ACCELERATE_DECELERATE,
			ACCELERATE,
			ANTICIPATE,
			ANTICIPATE_OVERSHOOT,
			BOUNCE,
			CYCLE,
			DECELERATE,
			LINEAR,
			OVERSHOOT,
		};

	/**
	 * A public read-only list of all the '<em><b>Interpolators Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InterpolatorsKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interpolators Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterpolatorsKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterpolatorsKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interpolators Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterpolatorsKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterpolatorsKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interpolators Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterpolatorsKind get(int value) {
		switch (value) {
			case ACCELERATE_DECELERATE_VALUE: return ACCELERATE_DECELERATE;
			case ACCELERATE_VALUE: return ACCELERATE;
			case ANTICIPATE_VALUE: return ANTICIPATE;
			case ANTICIPATE_OVERSHOOT_VALUE: return ANTICIPATE_OVERSHOOT;
			case BOUNCE_VALUE: return BOUNCE;
			case CYCLE_VALUE: return CYCLE;
			case DECELERATE_VALUE: return DECELERATE;
			case LINEAR_VALUE: return LINEAR;
			case OVERSHOOT_VALUE: return OVERSHOOT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InterpolatorsKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //InterpolatorsKind
