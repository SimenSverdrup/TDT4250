/**
 */
package tdt4250;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.CourseGroup#getMandatory_courses <em>Mandatory courses</em>}</li>
 *   <li>{@link tdt4250.CourseGroup#getElective_courses <em>Elective courses</em>}</li>
 *   <li>{@link tdt4250.CourseGroup#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 *
 * @see tdt4250.Tdt4250Package#getCourseGroup()
 * @model
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Mandatory courses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory courses</em>' reference.
	 * @see #setMandatory_courses(Course)
	 * @see tdt4250.Tdt4250Package#getCourseGroup_Mandatory_courses()
	 * @model
	 * @generated
	 */
	Course getMandatory_courses();

	/**
	 * Sets the value of the '{@link tdt4250.CourseGroup#getMandatory_courses <em>Mandatory courses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory courses</em>' reference.
	 * @see #getMandatory_courses()
	 * @generated
	 */
	void setMandatory_courses(Course value);

	/**
	 * Returns the value of the '<em><b>Elective courses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective courses</em>' reference.
	 * @see #setElective_courses(Course)
	 * @see tdt4250.Tdt4250Package#getCourseGroup_Elective_courses()
	 * @model
	 * @generated
	 */
	Course getElective_courses();

	/**
	 * Sets the value of the '{@link tdt4250.CourseGroup#getElective_courses <em>Elective courses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elective courses</em>' reference.
	 * @see #getElective_courses()
	 * @generated
	 */
	void setElective_courses(Course value);

	/**
	 * Returns the value of the '<em><b>Specialisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation</em>' reference.
	 * @see #setSpecialisation(Specialisation)
	 * @see tdt4250.Tdt4250Package#getCourseGroup_Specialisation()
	 * @model
	 * @generated
	 */
	Specialisation getSpecialisation();

	/**
	 * Sets the value of the '{@link tdt4250.CourseGroup#getSpecialisation <em>Specialisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation</em>' reference.
	 * @see #getSpecialisation()
	 * @generated
	 */
	void setSpecialisation(Specialisation value);

} // CourseGroup
