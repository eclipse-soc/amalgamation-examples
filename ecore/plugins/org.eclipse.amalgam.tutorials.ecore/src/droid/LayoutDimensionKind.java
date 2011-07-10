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
 * A representation of the literals of the enumeration '<em><b>Layout Dimension Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see droid.DroidPackage#getLayoutDimensionKind()
 * @model
 * @generated
 */
public enum LayoutDimensionKind implements Enumerator {
	/**
	 * The '<em><b>Fill parent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_PARENT_VALUE
	 * @generated
	 * @ordered
	 */
	FILL_PARENT(0, "fill_parent", "fill_parent"),

	/**
	 * The '<em><b>Match parent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATCH_PARENT_VALUE
	 * @generated
	 * @ordered
	 */
	MATCH_PARENT(1, "match_parent", "match_parent"),

	/**
	 * The '<em><b>Wrap content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRAP_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	WRAP_CONTENT(2, "wrap_content", "wrap_content");

	/**
	 * The '<em><b>Fill parent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fill parent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILL_PARENT
	 * @model name="fill_parent"
	 * @generated
	 * @ordered
	 */
	public static final int FILL_PARENT_VALUE = 0;

	/**
	 * The '<em><b>Match parent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Match parent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MATCH_PARENT
	 * @model name="match_parent"
	 * @generated
	 * @ordered
	 */
	public static final int MATCH_PARENT_VALUE = 1;

	/**
	 * The '<em><b>Wrap content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wrap content</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRAP_CONTENT
	 * @model name="wrap_content"
	 * @generated
	 * @ordered
	 */
	public static final int WRAP_CONTENT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Layout Dimension Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LayoutDimensionKind[] VALUES_ARRAY =
		new LayoutDimensionKind[] {
			FILL_PARENT,
			MATCH_PARENT,
			WRAP_CONTENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Layout Dimension Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LayoutDimensionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Layout Dimension Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutDimensionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LayoutDimensionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Layout Dimension Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutDimensionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LayoutDimensionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Layout Dimension Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutDimensionKind get(int value) {
		switch (value) {
			case FILL_PARENT_VALUE: return FILL_PARENT;
			case MATCH_PARENT_VALUE: return MATCH_PARENT;
			case WRAP_CONTENT_VALUE: return WRAP_CONTENT;
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
	private LayoutDimensionKind(int value, String name, String literal) {
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
	
} //LayoutDimensionKind
