/**
 */
package tdt4250;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tdt4250.Tdt4250Factory
 * @model kind="package"
 * @generated
 */
public interface Tdt4250Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tdt4250";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com/eclipse/tdt4250/assignment1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.eclipse.tdt4250.assignment1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tdt4250Package eINSTANCE = tdt4250.impl.Tdt4250PackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250.impl.StudyProgramImpl <em>Study Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.impl.StudyProgramImpl
	 * @see tdt4250.impl.Tdt4250PackageImpl#getStudyProgram()
	 * @generated
	 */
	int STUDY_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__STUDENTS = 0;

	/**
	 * The feature id for the '<em><b>Specialisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__SPECIALISATIONS = 1;

	/**
	 * The feature id for the '<em><b>Obligatory courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__OBLIGATORY_COURSES = 2;

	/**
	 * The feature id for the '<em><b>Number of semesters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__NUMBER_OF_SEMESTERS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__NAME = 4;

	/**
	 * The number of structural features of the '<em>Study Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Study Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.impl.CourseImpl
	 * @see tdt4250.impl.Tdt4250PackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Study points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STUDY_POINTS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SEMESTER = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.impl.StudentImpl
	 * @see tdt4250.impl.Tdt4250PackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 2;

	/**
	 * The feature id for the '<em><b>Student ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STUDENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__COURSES = 1;

	/**
	 * The feature id for the '<em><b>Current semester</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__CURRENT_SEMESTER = 2;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.impl.CourseGroupImpl <em>Course Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.impl.CourseGroupImpl
	 * @see tdt4250.impl.Tdt4250PackageImpl#getCourseGroup()
	 * @generated
	 */
	int COURSE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Mandatory courses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__MANDATORY_COURSES = 0;

	/**
	 * The feature id for the '<em><b>Elective courses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__ELECTIVE_COURSES = 1;

	/**
	 * The feature id for the '<em><b>Specialisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__SPECIALISATION = 2;

	/**
	 * The number of structural features of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.impl.SpecialisationImpl <em>Specialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.impl.SpecialisationImpl
	 * @see tdt4250.impl.Tdt4250PackageImpl#getSpecialisation()
	 * @generated
	 */
	int SPECIALISATION = 4;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__STUDENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Further specialisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__FURTHER_SPECIALISATION = 2;

	/**
	 * The feature id for the '<em><b>Course group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__COURSE_GROUP = 3;

	/**
	 * The number of structural features of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link tdt4250.StudyProgramName <em>Study Program Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.StudyProgramName
	 * @see tdt4250.impl.Tdt4250PackageImpl#getStudyProgramName()
	 * @generated
	 */
	int STUDY_PROGRAM_NAME = 5;


	/**
	 * The meta object id for the '{@link tdt4250.Semester <em>Semester</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.Semester
	 * @see tdt4250.impl.Tdt4250PackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 6;


	/**
	 * Returns the meta object for class '{@link tdt4250.StudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Program</em>'.
	 * @see tdt4250.StudyProgram
	 * @generated
	 */
	EClass getStudyProgram();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.StudyProgram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.StudyProgram#getName()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EAttribute getStudyProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.StudyProgram#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see tdt4250.StudyProgram#getStudents()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EReference getStudyProgram_Students();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.StudyProgram#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialisations</em>'.
	 * @see tdt4250.StudyProgram#getSpecialisations()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EReference getStudyProgram_Specialisations();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.StudyProgram#getObligatory_courses <em>Obligatory courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Obligatory courses</em>'.
	 * @see tdt4250.StudyProgram#getObligatory_courses()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EReference getStudyProgram_Obligatory_courses();

	/**
	 * Returns the meta object for the attribute list '{@link tdt4250.StudyProgram#getNumber_of_semesters <em>Number of semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Number of semesters</em>'.
	 * @see tdt4250.StudyProgram#getNumber_of_semesters()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EAttribute getStudyProgram_Number_of_semesters();

	/**
	 * Returns the meta object for class '{@link tdt4250.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see tdt4250.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tdt4250.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.Course#getStudy_points <em>Study points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Study points</em>'.
	 * @see tdt4250.Course#getStudy_points()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Study_points();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see tdt4250.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.Course#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see tdt4250.Course#getSemester()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Semester();

	/**
	 * Returns the meta object for class '{@link tdt4250.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see tdt4250.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.Student#getStudentID <em>Student ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Student ID</em>'.
	 * @see tdt4250.Student#getStudentID()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_StudentID();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.Student#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see tdt4250.Student#getCourses()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Courses();

	/**
	 * Returns the meta object for the attribute list '{@link tdt4250.Student#getCurrent_semester <em>Current semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Current semester</em>'.
	 * @see tdt4250.Student#getCurrent_semester()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Current_semester();

	/**
	 * Returns the meta object for class '{@link tdt4250.CourseGroup <em>Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Group</em>'.
	 * @see tdt4250.CourseGroup
	 * @generated
	 */
	EClass getCourseGroup();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.CourseGroup#getMandatory_courses <em>Mandatory courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mandatory courses</em>'.
	 * @see tdt4250.CourseGroup#getMandatory_courses()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EReference getCourseGroup_Mandatory_courses();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.CourseGroup#getElective_courses <em>Elective courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elective courses</em>'.
	 * @see tdt4250.CourseGroup#getElective_courses()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EReference getCourseGroup_Elective_courses();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.CourseGroup#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialisation</em>'.
	 * @see tdt4250.CourseGroup#getSpecialisation()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EReference getCourseGroup_Specialisation();

	/**
	 * Returns the meta object for class '{@link tdt4250.Specialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation</em>'.
	 * @see tdt4250.Specialisation
	 * @generated
	 */
	EClass getSpecialisation();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.Specialisation#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see tdt4250.Specialisation#getStudents()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Students();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.Specialisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.Specialisation#getName()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_Name();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.Specialisation#getFurther_specialisation <em>Further specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Further specialisation</em>'.
	 * @see tdt4250.Specialisation#getFurther_specialisation()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Further_specialisation();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.Specialisation#getCourse_group <em>Course group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course group</em>'.
	 * @see tdt4250.Specialisation#getCourse_group()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Course_group();

	/**
	 * Returns the meta object for enum '{@link tdt4250.StudyProgramName <em>Study Program Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Study Program Name</em>'.
	 * @see tdt4250.StudyProgramName
	 * @generated
	 */
	EEnum getStudyProgramName();

	/**
	 * Returns the meta object for enum '{@link tdt4250.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester</em>'.
	 * @see tdt4250.Semester
	 * @generated
	 */
	EEnum getSemester();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tdt4250Factory getTdt4250Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tdt4250.impl.StudyProgramImpl <em>Study Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.impl.StudyProgramImpl
		 * @see tdt4250.impl.Tdt4250PackageImpl#getStudyProgram()
		 * @generated
		 */
		EClass STUDY_PROGRAM = eINSTANCE.getStudyProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PROGRAM__NAME = eINSTANCE.getStudyProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAM__STUDENTS = eINSTANCE.getStudyProgram_Students();

		/**
		 * The meta object literal for the '<em><b>Specialisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAM__SPECIALISATIONS = eINSTANCE.getStudyProgram_Specialisations();

		/**
		 * The meta object literal for the '<em><b>Obligatory courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAM__OBLIGATORY_COURSES = eINSTANCE.getStudyProgram_Obligatory_courses();

		/**
		 * The meta object literal for the '<em><b>Number of semesters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PROGRAM__NUMBER_OF_SEMESTERS = eINSTANCE.getStudyProgram_Number_of_semesters();

		/**
		 * The meta object literal for the '{@link tdt4250.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.impl.CourseImpl
		 * @see tdt4250.impl.Tdt4250PackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Study points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__STUDY_POINTS = eINSTANCE.getCourse_Study_points();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__SEMESTER = eINSTANCE.getCourse_Semester();

		/**
		 * The meta object literal for the '{@link tdt4250.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.impl.StudentImpl
		 * @see tdt4250.impl.Tdt4250PackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Student ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__STUDENT_ID = eINSTANCE.getStudent_StudentID();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__COURSES = eINSTANCE.getStudent_Courses();

		/**
		 * The meta object literal for the '<em><b>Current semester</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__CURRENT_SEMESTER = eINSTANCE.getStudent_Current_semester();

		/**
		 * The meta object literal for the '{@link tdt4250.impl.CourseGroupImpl <em>Course Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.impl.CourseGroupImpl
		 * @see tdt4250.impl.Tdt4250PackageImpl#getCourseGroup()
		 * @generated
		 */
		EClass COURSE_GROUP = eINSTANCE.getCourseGroup();

		/**
		 * The meta object literal for the '<em><b>Mandatory courses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_GROUP__MANDATORY_COURSES = eINSTANCE.getCourseGroup_Mandatory_courses();

		/**
		 * The meta object literal for the '<em><b>Elective courses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_GROUP__ELECTIVE_COURSES = eINSTANCE.getCourseGroup_Elective_courses();

		/**
		 * The meta object literal for the '<em><b>Specialisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_GROUP__SPECIALISATION = eINSTANCE.getCourseGroup_Specialisation();

		/**
		 * The meta object literal for the '{@link tdt4250.impl.SpecialisationImpl <em>Specialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.impl.SpecialisationImpl
		 * @see tdt4250.impl.Tdt4250PackageImpl#getSpecialisation()
		 * @generated
		 */
		EClass SPECIALISATION = eINSTANCE.getSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__STUDENTS = eINSTANCE.getSpecialisation_Students();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__NAME = eINSTANCE.getSpecialisation_Name();

		/**
		 * The meta object literal for the '<em><b>Further specialisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__FURTHER_SPECIALISATION = eINSTANCE.getSpecialisation_Further_specialisation();

		/**
		 * The meta object literal for the '<em><b>Course group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__COURSE_GROUP = eINSTANCE.getSpecialisation_Course_group();

		/**
		 * The meta object literal for the '{@link tdt4250.StudyProgramName <em>Study Program Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.StudyProgramName
		 * @see tdt4250.impl.Tdt4250PackageImpl#getStudyProgramName()
		 * @generated
		 */
		EEnum STUDY_PROGRAM_NAME = eINSTANCE.getStudyProgramName();

		/**
		 * The meta object literal for the '{@link tdt4250.Semester <em>Semester</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.Semester
		 * @see tdt4250.impl.Tdt4250PackageImpl#getSemester()
		 * @generated
		 */
		EEnum SEMESTER = eINSTANCE.getSemester();

	}

} //Tdt4250Package
