/**
 */
package tdt4250;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.Student#getStudentID <em>Student ID</em>}</li>
 *   <li>{@link tdt4250.Student#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.Student#getCurrent_semester <em>Current semester</em>}</li>
 * </ul>
 *
 * @see tdt4250.Tdt4250Package#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Student ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student ID</em>' attribute.
	 * @see #setStudentID(int)
	 * @see tdt4250.Tdt4250Package#getStudent_StudentID()
	 * @model annotation="org.eclipse.emf.ecore.util.EcoreUtil.getConstraints/setConstraints totalDigits='6'"
	 * @generated
	 */
	int getStudentID();

	/**
	 * Sets the value of the '{@link tdt4250.Student#getStudentID <em>Student ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student ID</em>' attribute.
	 * @see #getStudentID()
	 * @generated
	 */
	void setStudentID(int value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see tdt4250.Tdt4250Package#getStudent_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Current semester</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current semester</em>' attribute list.
	 * @see tdt4250.Tdt4250Package#getStudent_Current_semester()
	 * @model required="true" upper="10"
	 * @generated
	 */
	EList<Integer> getCurrent_semester();

} // Student
