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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.Course;
import tdt4250.CourseGroup;
import tdt4250.Specialisation;
import tdt4250.Student;
import tdt4250.Tdt4250Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.impl.SpecialisationImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link tdt4250.impl.SpecialisationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.impl.SpecialisationImpl#getFurther_specialisation <em>Further specialisation</em>}</li>
 *   <li>{@link tdt4250.impl.SpecialisationImpl#getCourse_group <em>Course group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialisationImpl extends MinimalEObjectImpl.Container implements Specialisation {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFurther_specialisation() <em>Further specialisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurther_specialisation()
	 * @generated
	 * @ordered
	 */
	protected Specialisation further_specialisation;

	/**
	 * The cached value of the '{@link #getCourse_group() <em>Course group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse_group()
	 * @generated
	 * @ordered
	 */
	protected CourseGroup course_group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tdt4250Package.Literals.SPECIALISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectContainmentEList<Student>(Student.class, this, Tdt4250Package.SPECIALISATION__STUDENTS);
		}
		return students;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250Package.SPECIALISATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialisation getFurther_specialisation() {
		if (further_specialisation != null && further_specialisation.eIsProxy()) {
			InternalEObject oldFurther_specialisation = (InternalEObject)further_specialisation;
			further_specialisation = (Specialisation)eResolveProxy(oldFurther_specialisation);
			if (further_specialisation != oldFurther_specialisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tdt4250Package.SPECIALISATION__FURTHER_SPECIALISATION, oldFurther_specialisation, further_specialisation));
			}
		}
		return further_specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation basicGetFurther_specialisation() {
		return further_specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFurther_specialisation(Specialisation newFurther_specialisation) {
		Specialisation oldFurther_specialisation = further_specialisation;
		further_specialisation = newFurther_specialisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250Package.SPECIALISATION__FURTHER_SPECIALISATION, oldFurther_specialisation, further_specialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseGroup getCourse_group() {
		if (course_group != null && course_group.eIsProxy()) {
			InternalEObject oldCourse_group = (InternalEObject)course_group;
			course_group = (CourseGroup)eResolveProxy(oldCourse_group);
			if (course_group != oldCourse_group) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tdt4250Package.SPECIALISATION__COURSE_GROUP, oldCourse_group, course_group));
			}
		}
		return course_group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseGroup basicGetCourse_group() {
		return course_group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourse_group(CourseGroup newCourse_group) {
		CourseGroup oldCourse_group = course_group;
		course_group = newCourse_group;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tdt4250Package.SPECIALISATION__COURSE_GROUP, oldCourse_group, course_group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tdt4250Package.SPECIALISATION__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
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
			case Tdt4250Package.SPECIALISATION__STUDENTS:
				return getStudents();
			case Tdt4250Package.SPECIALISATION__NAME:
				return getName();
			case Tdt4250Package.SPECIALISATION__FURTHER_SPECIALISATION:
				if (resolve) return getFurther_specialisation();
				return basicGetFurther_specialisation();
			case Tdt4250Package.SPECIALISATION__COURSE_GROUP:
				if (resolve) return getCourse_group();
				return basicGetCourse_group();
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
			case Tdt4250Package.SPECIALISATION__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
				return;
			case Tdt4250Package.SPECIALISATION__NAME:
				setName((String)newValue);
				return;
			case Tdt4250Package.SPECIALISATION__FURTHER_SPECIALISATION:
				setFurther_specialisation((Specialisation)newValue);
				return;
			case Tdt4250Package.SPECIALISATION__COURSE_GROUP:
				setCourse_group((CourseGroup)newValue);
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
			case Tdt4250Package.SPECIALISATION__STUDENTS:
				getStudents().clear();
				return;
			case Tdt4250Package.SPECIALISATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Tdt4250Package.SPECIALISATION__FURTHER_SPECIALISATION:
				setFurther_specialisation((Specialisation)null);
				return;
			case Tdt4250Package.SPECIALISATION__COURSE_GROUP:
				setCourse_group((CourseGroup)null);
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
			case Tdt4250Package.SPECIALISATION__STUDENTS:
				return students != null && !students.isEmpty();
			case Tdt4250Package.SPECIALISATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Tdt4250Package.SPECIALISATION__FURTHER_SPECIALISATION:
				return further_specialisation != null;
			case Tdt4250Package.SPECIALISATION__COURSE_GROUP:
				return course_group != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecialisationImpl
