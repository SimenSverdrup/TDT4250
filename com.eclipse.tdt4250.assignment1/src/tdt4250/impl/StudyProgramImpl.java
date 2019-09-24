/**
 */
package tdt4250.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.Course;
import tdt4250.Specialisation;
import tdt4250.Student;
import tdt4250.StudyProgram;
import tdt4250.StudyProgramName;
import tdt4250.Tdt4250Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.impl.StudyProgramImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link tdt4250.impl.StudyProgramImpl#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link tdt4250.impl.StudyProgramImpl#getObligatory_courses <em>Obligatory courses</em>}</li>
 *   <li>{@link tdt4250.impl.StudyProgramImpl#getNumber_of_semesters <em>Number of semesters</em>}</li>
 *   <li>{@link tdt4250.impl.StudyProgramImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyProgramImpl extends MinimalEObjectImpl.Container implements StudyProgram {
	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * The cached value of the '{@link #getSpecialisations() <em>Specialisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> specialisations;

	/**
	 * The cached value of the '{@link #getObligatory_courses() <em>Obligatory courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligatory_courses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> obligatory_courses;

	/**
	 * The cached value of the '{@link #getNumber_of_semesters() <em>Number of semesters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_semesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> number_of_semesters;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final StudyProgramName NAME_EDEFAULT = StudyProgramName.COMPUTER_SCIENCE_5YEARS;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StudyProgramName name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tdt4250Package.Literals.STUDY_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyProgramName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(StudyProgramName newName) {
		StudyProgramName oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250Package.STUDY_PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectContainmentEList<Student>(Student.class, this, Tdt4250Package.STUDY_PROGRAM__STUDENTS);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialisation> getSpecialisations() {
		if (specialisations == null) {
			specialisations = new EObjectContainmentEList<Specialisation>(Specialisation.class, this, Tdt4250Package.STUDY_PROGRAM__SPECIALISATIONS);
		}
		return specialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getObligatory_courses() {
		if (obligatory_courses == null) {
			obligatory_courses = new EObjectContainmentEList<Course>(Course.class, this, Tdt4250Package.STUDY_PROGRAM__OBLIGATORY_COURSES);
		}
		return obligatory_courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumber_of_semesters() {
		if (number_of_semesters == null) {
			number_of_semesters = new EDataTypeUniqueEList<Integer>(Integer.class, this, Tdt4250Package.STUDY_PROGRAM__NUMBER_OF_SEMESTERS);
		}
		return number_of_semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tdt4250Package.STUDY_PROGRAM__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
			case Tdt4250Package.STUDY_PROGRAM__SPECIALISATIONS:
				return ((InternalEList<?>)getSpecialisations()).basicRemove(otherEnd, msgs);
			case Tdt4250Package.STUDY_PROGRAM__OBLIGATORY_COURSES:
				return ((InternalEList<?>)getObligatory_courses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tdt4250Package.STUDY_PROGRAM__STUDENTS:
				return getStudents();
			case Tdt4250Package.STUDY_PROGRAM__SPECIALISATIONS:
				return getSpecialisations();
			case Tdt4250Package.STUDY_PROGRAM__OBLIGATORY_COURSES:
				return getObligatory_courses();
			case Tdt4250Package.STUDY_PROGRAM__NUMBER_OF_SEMESTERS:
				return getNumber_of_semesters();
			case Tdt4250Package.STUDY_PROGRAM__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tdt4250Package.STUDY_PROGRAM__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
				return;
			case Tdt4250Package.STUDY_PROGRAM__SPECIALISATIONS:
				getSpecialisations().clear();
				getSpecialisations().addAll((Collection<? extends Specialisation>)newValue);
				return;
			case Tdt4250Package.STUDY_PROGRAM__OBLIGATORY_COURSES:
				getObligatory_courses().clear();
				getObligatory_courses().addAll((Collection<? extends Course>)newValue);
				return;
			case Tdt4250Package.STUDY_PROGRAM__NUMBER_OF_SEMESTERS:
				getNumber_of_semesters().clear();
				getNumber_of_semesters().addAll((Collection<? extends Integer>)newValue);
				return;
			case Tdt4250Package.STUDY_PROGRAM__NAME:
				setName((StudyProgramName)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Tdt4250Package.STUDY_PROGRAM__STUDENTS:
				getStudents().clear();
				return;
			case Tdt4250Package.STUDY_PROGRAM__SPECIALISATIONS:
				getSpecialisations().clear();
				return;
			case Tdt4250Package.STUDY_PROGRAM__OBLIGATORY_COURSES:
				getObligatory_courses().clear();
				return;
			case Tdt4250Package.STUDY_PROGRAM__NUMBER_OF_SEMESTERS:
				getNumber_of_semesters().clear();
				return;
			case Tdt4250Package.STUDY_PROGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Tdt4250Package.STUDY_PROGRAM__STUDENTS:
				return students != null && !students.isEmpty();
			case Tdt4250Package.STUDY_PROGRAM__SPECIALISATIONS:
				return specialisations != null && !specialisations.isEmpty();
			case Tdt4250Package.STUDY_PROGRAM__OBLIGATORY_COURSES:
				return obligatory_courses != null && !obligatory_courses.isEmpty();
			case Tdt4250Package.STUDY_PROGRAM__NUMBER_OF_SEMESTERS:
				return number_of_semesters != null && !number_of_semesters.isEmpty();
			case Tdt4250Package.STUDY_PROGRAM__NAME:
				return name != NAME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (number_of_semesters: ");
		result.append(number_of_semesters);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StudyProgramImpl
