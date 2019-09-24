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
import tdt4250.Student;
import tdt4250.Tdt4250Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.impl.StudentImpl#getStudentID <em>Student ID</em>}</li>
 *   <li>{@link tdt4250.impl.StudentImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.impl.StudentImpl#getCurrent_semester <em>Current semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student {
	/**
	 * The default value of the '{@link #getStudentID() <em>Student ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentID()
	 * @generated
	 * @ordered
	 */
	protected static final int STUDENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStudentID() <em>Student ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentID()
	 * @generated
	 * @ordered
	 */
	protected int studentID = STUDENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getCurrent_semester() <em>Current semester</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_semester()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> current_semester;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tdt4250Package.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStudentID() {
		return studentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudentID(int newStudentID) {
		int oldStudentID = studentID;
		studentID = newStudentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250Package.STUDENT__STUDENT_ID, oldStudentID, studentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<Course>(Course.class, this, Tdt4250Package.STUDENT__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCurrent_semester() {
		if (current_semester == null) {
			current_semester = new EDataTypeUniqueEList<Integer>(Integer.class, this, Tdt4250Package.STUDENT__CURRENT_SEMESTER);
		}
		return current_semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tdt4250Package.STUDENT__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
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
			case Tdt4250Package.STUDENT__STUDENT_ID:
				return getStudentID();
			case Tdt4250Package.STUDENT__COURSES:
				return getCourses();
			case Tdt4250Package.STUDENT__CURRENT_SEMESTER:
				return getCurrent_semester();
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
			case Tdt4250Package.STUDENT__STUDENT_ID:
				setStudentID((Integer)newValue);
				return;
			case Tdt4250Package.STUDENT__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case Tdt4250Package.STUDENT__CURRENT_SEMESTER:
				getCurrent_semester().clear();
				getCurrent_semester().addAll((Collection<? extends Integer>)newValue);
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
			case Tdt4250Package.STUDENT__STUDENT_ID:
				setStudentID(STUDENT_ID_EDEFAULT);
				return;
			case Tdt4250Package.STUDENT__COURSES:
				getCourses().clear();
				return;
			case Tdt4250Package.STUDENT__CURRENT_SEMESTER:
				getCurrent_semester().clear();
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
			case Tdt4250Package.STUDENT__STUDENT_ID:
				return studentID != STUDENT_ID_EDEFAULT;
			case Tdt4250Package.STUDENT__COURSES:
				return courses != null && !courses.isEmpty();
			case Tdt4250Package.STUDENT__CURRENT_SEMESTER:
				return current_semester != null && !current_semester.isEmpty();
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
		result.append(" (studentID: ");
		result.append(studentID);
		result.append(", current_semester: ");
		result.append(current_semester);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
