/**
 */
package tdt4250.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.Course;
import tdt4250.CourseGroup;
import tdt4250.Specialisation;
import tdt4250.Tdt4250Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.impl.CourseGroupImpl#getMandatory_courses <em>Mandatory courses</em>}</li>
 *   <li>{@link tdt4250.impl.CourseGroupImpl#getElective_courses <em>Elective courses</em>}</li>
 *   <li>{@link tdt4250.impl.CourseGroupImpl#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseGroupImpl extends MinimalEObjectImpl.Container implements CourseGroup {
	/**
	 * The cached value of the '{@link #getMandatory_courses() <em>Mandatory courses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory_courses()
	 * @generated
	 * @ordered
	 */
	protected Course mandatory_courses;

	/**
	 * The cached value of the '{@link #getElective_courses() <em>Elective courses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElective_courses()
	 * @generated
	 * @ordered
	 */
	protected Course elective_courses;

	/**
	 * The cached value of the '{@link #getSpecialisation() <em>Specialisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected Specialisation specialisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tdt4250Package.Literals.COURSE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getMandatory_courses() {
		if (mandatory_courses != null && mandatory_courses.eIsProxy()) {
			InternalEObject oldMandatory_courses = (InternalEObject)mandatory_courses;
			mandatory_courses = (Course)eResolveProxy(oldMandatory_courses);
			if (mandatory_courses != oldMandatory_courses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tdt4250Package.COURSE_GROUP__MANDATORY_COURSES, oldMandatory_courses, mandatory_courses));
			}
		}
		return mandatory_courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetMandatory_courses() {
		return mandatory_courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatory_courses(Course newMandatory_courses) {
		Course oldMandatory_courses = mandatory_courses;
		mandatory_courses = newMandatory_courses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250Package.COURSE_GROUP__MANDATORY_COURSES, oldMandatory_courses, mandatory_courses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getElective_courses() {
		if (elective_courses != null && elective_courses.eIsProxy()) {
			InternalEObject oldElective_courses = (InternalEObject)elective_courses;
			elective_courses = (Course)eResolveProxy(oldElective_courses);
			if (elective_courses != oldElective_courses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tdt4250Package.COURSE_GROUP__ELECTIVE_COURSES, oldElective_courses, elective_courses));
			}
		}
		return elective_courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetElective_courses() {
		return elective_courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElective_courses(Course newElective_courses) {
		Course oldElective_courses = elective_courses;
		elective_courses = newElective_courses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250Package.COURSE_GROUP__ELECTIVE_COURSES, oldElective_courses, elective_courses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialisation getSpecialisation() {
		if (specialisation != null && specialisation.eIsProxy()) {
			InternalEObject oldSpecialisation = (InternalEObject)specialisation;
			specialisation = (Specialisation)eResolveProxy(oldSpecialisation);
			if (specialisation != oldSpecialisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tdt4250Package.COURSE_GROUP__SPECIALISATION, oldSpecialisation, specialisation));
			}
		}
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation basicGetSpecialisation() {
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialisation(Specialisation newSpecialisation) {
		Specialisation oldSpecialisation = specialisation;
		specialisation = newSpecialisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250Package.COURSE_GROUP__SPECIALISATION, oldSpecialisation, specialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tdt4250Package.COURSE_GROUP__MANDATORY_COURSES:
				if (resolve) return getMandatory_courses();
				return basicGetMandatory_courses();
			case Tdt4250Package.COURSE_GROUP__ELECTIVE_COURSES:
				if (resolve) return getElective_courses();
				return basicGetElective_courses();
			case Tdt4250Package.COURSE_GROUP__SPECIALISATION:
				if (resolve) return getSpecialisation();
				return basicGetSpecialisation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tdt4250Package.COURSE_GROUP__MANDATORY_COURSES:
				setMandatory_courses((Course)newValue);
				return;
			case Tdt4250Package.COURSE_GROUP__ELECTIVE_COURSES:
				setElective_courses((Course)newValue);
				return;
			case Tdt4250Package.COURSE_GROUP__SPECIALISATION:
				setSpecialisation((Specialisation)newValue);
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
			case Tdt4250Package.COURSE_GROUP__MANDATORY_COURSES:
				setMandatory_courses((Course)null);
				return;
			case Tdt4250Package.COURSE_GROUP__ELECTIVE_COURSES:
				setElective_courses((Course)null);
				return;
			case Tdt4250Package.COURSE_GROUP__SPECIALISATION:
				setSpecialisation((Specialisation)null);
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
			case Tdt4250Package.COURSE_GROUP__MANDATORY_COURSES:
				return mandatory_courses != null;
			case Tdt4250Package.COURSE_GROUP__ELECTIVE_COURSES:
				return elective_courses != null;
			case Tdt4250Package.COURSE_GROUP__SPECIALISATION:
				return specialisation != null;
		}
		return super.eIsSet(featureID);
	}

} //CourseGroupImpl
