/**
 */
package tdt4250;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.StudyProgram#getStudents <em>Students</em>}</li>
 *   <li>{@link tdt4250.StudyProgram#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link tdt4250.StudyProgram#getObligatory_courses <em>Obligatory courses</em>}</li>
 *   <li>{@link tdt4250.StudyProgram#getNumber_of_semesters <em>Number of semesters</em>}</li>
 *   <li>{@link tdt4250.StudyProgram#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tdt4250.Tdt4250Package#getStudyProgram()
 * @model
 * @generated
 */
public interface StudyProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.StudyProgramName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see tdt4250.StudyProgramName
	 * @see #setName(StudyProgramName)
	 * @see tdt4250.Tdt4250Package#getStudyProgram_Name()
	 * @model
	 * @generated
	 */
	StudyProgramName getName();

	/**
	 * Sets the value of the '{@link tdt4250.StudyProgram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see tdt4250.StudyProgramName
	 * @see #getName()
	 * @generated
	 */
	void setName(StudyProgramName value);

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see tdt4250.Tdt4250Package#getStudyProgram_Students()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' containment reference list.
	 * @see tdt4250.Tdt4250Package#getStudyProgram_Specialisations()
	 * @model containment="true" upper="10"
	 * @generated
	 */
	EList<Specialisation> getSpecialisations();

	/**
	 * Returns the value of the '<em><b>Obligatory courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obligatory courses</em>' containment reference list.
	 * @see tdt4250.Tdt4250Package#getStudyProgram_Obligatory_courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getObligatory_courses();

	/**
	 * Returns the value of the '<em><b>Number of semesters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number of semesters</em>' attribute list.
	 * @see tdt4250.Tdt4250Package#getStudyProgram_Number_of_semesters()
	 * @model lower="4" upper="10"
	 * @generated
	 */
	EList<Integer> getNumber_of_semesters();

} // StudyProgram
