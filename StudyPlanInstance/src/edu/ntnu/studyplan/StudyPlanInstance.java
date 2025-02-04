package edu.ntnu.studyplan;

import com.eclipse.tdt4250.assignment1.*;

public class StudyPlanInstance {

	public static void main(String[] args) {
		
		StudyProgram CS_5years = new StudyProgram();
		StudyProgram CS_2years = new StudyProgram();
		StudyProgram Informatics = new StudyProgram();
		
		StudyProgramName CS_5 = StudyProgramName.COMPUTER_SCIENCE_5YEARS;
		StudyProgramName CS_2 = StudyProgramName.COMPUTER_SCIENCE_2YEARS;
		StudyProgramName Inf = StudyProgramName.INFORMATICS;

		CS_5years.setName(CS_5);
		CS_2years.setName(CS_2);
		Informatics.setName(Inf);
		
		Course TDT4250 = new Course();
		TDT4250.setCode("TDT4250");
		TDT4250.setName("Avansert programvaredesign");
		TDT4250.setStudy_points(7.5);
		TDT4250.setLevel("Master");
		
		Specialisation Programvaresystemer = new Specialisation();
		Programvareutvikling.setName("Programvaresystemer");
		Programvareutvikling.setFurtherSpecialisation("Programvareutvikling");
		Specialisation Programvareutvikling = new Specialisation();
		Programvareutvikling.setName("Programvareutvikling");
		
		CourseGroup CS_5years_Programvareutvikling = new CourseGroup();
		CS_5years_Programvareutvikling.setMandatory_courses(TDT4250);
		CS_5years_Programvareutvikling.setSpecialisation(Programvareutvikling);
		
		Programvareutvikling.setCourse_group(CS_5years_Programvareutvikling);
		
		Student student1 = new Student();
		student1.setStudentID(123456);
		student1.courses.append(TDT4250);
		student1.current_semester = 7;
	}

}
