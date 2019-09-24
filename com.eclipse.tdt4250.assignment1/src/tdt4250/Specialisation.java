/**
 */
package tdt4250;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.Specialisation#getStudents <em>Students</em>}</li>
 *   <li>{@link tdt4250.Specialisation#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.Specialisation#getFurther_specialisation <em>Further specialisation</em>}</li>
 *   <li>{@link tdt4250.Specialisation#getCourse_group <em>Course group</em>}</li>
 * </ul>
 *
 * @see tdt4250.Tdt4250Package#getSpecialisation()
 * @model
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see tdt4250.Tdt4250Package#getSpecialisation_Students()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.Tdt4250Package#getSpecialisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Further specialisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Further specialisation</em>' reference.
	 * @see #setFurther_specialisation(Specialisation)
	 * @see tdt4250.Tdt4250Package#getSpecialisation_Further_specialisation()
	 * @model
	 * @generated
	 */
	Specialisation getFurther_specialisation();

	/**
	 * Sets the value of the '{@link tdt4250.Specialisation#getFurther_specialisation <em>Further specialisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Further specialisation</em>' reference.
	 * @see #getFurther_specialisation()
	 * @generated
	 */
	void setFurther_specialisation(Specialisation value);

	/**
	 * Returns the value of the '<em><b>Course group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course group</em>' reference.
	 * @see #setCourse_group(CourseGroup)
	 * @see tdt4250.Tdt4250Package#getSpecialisation_Course_group()
	 * @model
	 * @generated
	 */
	CourseGroup getCourse_group();

	/**
	 * Sets the value of the '{@link tdt4250.Specialisation#getCourse_group <em>Course group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course group</em>' reference.
	 * @see #getCourse_group()
	 * @generated
	 */
	void setCourse_group(CourseGroup value);

} // Specialisation
