/**
 */
package tdt4250;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.Course#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.Course#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.Course#getStudy_points <em>Study points</em>}</li>
 *   <li>{@link tdt4250.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link tdt4250.Course#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see tdt4250.Tdt4250Package#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tdt4250.Tdt4250Package#getCourse_Code()
	 * @model annotation="https:///org/eclipse/emf/ecore/util/ExtendedMetaData maxLength='7' minLength='6'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.Tdt4250Package#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Study points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study points</em>' attribute.
	 * @see #setStudy_points(float)
	 * @see tdt4250.Tdt4250Package#getCourse_Study_points()
	 * @model
	 * @generated
	 */
	float getStudy_points();

	/**
	 * Sets the value of the '{@link tdt4250.Course#getStudy_points <em>Study points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study points</em>' attribute.
	 * @see #getStudy_points()
	 * @generated
	 */
	void setStudy_points(float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see tdt4250.Tdt4250Package#getCourse_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link tdt4250.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see tdt4250.Semester
	 * @see #setSemester(Semester)
	 * @see tdt4250.Tdt4250Package#getCourse_Semester()
	 * @model
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link tdt4250.Course#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see tdt4250.Semester
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

} // Course
