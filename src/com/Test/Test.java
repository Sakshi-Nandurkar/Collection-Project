package com.Test;

import java.util.List;
import com.Controller.StudentController;
import com.entity.Student;

public class Test {

	public static void main(String[] args) {
		
		StudentController sc = new StudentController();
		
		System.out.println("************************ ALL STUDENTS *********************");
		List<Student> db = sc.getAllStudentController();
		System.out.println(db);	
		System.out.println();
		
		
		System.out.println("************************ All Students Starts with A **************************");
		List<Student> db1 =sc.getStudentNameStartsWithA();
		System.out.println(db1);
		System.out.println();
		
		
		System.out.println("************************ All Students Marks Above 90 *************************");
		List<Student> db2 =sc.getStudentNameWhoseMarksAbove90();
		System.out.println(db2);
		System.out.println();
		
		
		System.out.println("************************ All Students Marks below 90 *************************");
		List<Student> db3 =sc.getStudentNameWhoseMarksBelow90();
		System.out.println(db3);
		System.out.println();
		
		
		System.out.println("************************ All Students Marks below 90 and Above 50*************************");
		List<Student> db4 =sc.getStudentNameWhoseMarksBelow90AndAbove50();
		System.out.println(db4);
		System.out.println();
		
		
		System.out.println("************************ Descending *************************");
		List<Student> db5 =sc.getStudentRollnoDescending();
		System.out.println(db5);
		System.out.println();
		
		
		System.out.println("************************ All Students Starts with anyLetter **************************");
		List<Student> db6 =sc.getStudentNameStartsWithAnything();
		System.out.println(db6);
		System.out.println();
		
		
		System.out.println("************************ All Students lasts with anyLetter **************************");
		List<Student> db7 =sc.getStudentNameEndsWithAnything();
		System.out.println(db7);
		System.out.println();
		
		
		System.out.println("************************ All Students ends with i **************************");
		List<Student> db8 =sc.getStudentNameEndsWithI();
		System.out.println(db8);
		System.out.println();
		
		
		System.out.println("************************ Max Marks **************************");
		List<Student> db9 =sc.getStudentMaximunMarks();
		System.out.println(db9);
		System.out.println();
		
		System.out.println("************************ Min Marks **************************");
		List<Student> db10 =sc.getStudentMinimunMarks();
		System.out.println(db10);
		System.out.println();
		
		
	}

}
