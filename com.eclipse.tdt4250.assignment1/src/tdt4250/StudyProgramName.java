/**
 */
package tdt4250;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Study Program Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tdt4250.Tdt4250Package#getStudyProgramName()
 * @model
 * @generated
 */
public enum StudyProgramName implements Enumerator {
	/**
	 * The '<em><b>Computer science 5years</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTER_SCIENCE_5YEARS_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTER_SCIENCE_5YEARS(0, "computer_science_5_years", "computer_science_5_years"),

	/**
	 * The '<em><b>Computer science 2years</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTER_SCIENCE_2YEARS_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTER_SCIENCE_2YEARS(1, "computer_science_2_years", "computer_science_2_years"),

	/**
	 * The '<em><b>Informatics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATICS_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATICS(2, "informatics", "informatics");

	/**
	 * The '<em><b>Computer science 5years</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTER_SCIENCE_5YEARS
	 * @model name="computer_science_5_years"
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTER_SCIENCE_5YEARS_VALUE = 0;

	/**
	 * The '<em><b>Computer science 2years</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTER_SCIENCE_2YEARS
	 * @model name="computer_science_2_years"
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTER_SCIENCE_2YEARS_VALUE = 1;

	/**
	 * The '<em><b>Informatics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATICS
	 * @model name="informatics"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATICS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Study Program Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StudyProgramName[] VALUES_ARRAY =
		new StudyProgramName[] {
			COMPUTER_SCIENCE_5YEARS,
			COMPUTER_SCIENCE_2YEARS,
			INFORMATICS,
		};

	/**
	 * A public read-only list of all the '<em><b>Study Program Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StudyProgramName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Study Program Name</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StudyProgramName get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StudyProgramName result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Study Program Name</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StudyProgramName getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StudyProgramName result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Study Program Name</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StudyProgramName get(int value) {
		switch (value) {
			case COMPUTER_SCIENCE_5YEARS_VALUE: return COMPUTER_SCIENCE_5YEARS;
			case COMPUTER_SCIENCE_2YEARS_VALUE: return COMPUTER_SCIENCE_2YEARS;
			case INFORMATICS_VALUE: return INFORMATICS;
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
	private StudyProgramName(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //StudyProgramName
