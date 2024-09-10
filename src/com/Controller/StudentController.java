package com.Controller;

import java.util.List;

import com.Service.StudentService;
import com.entity.Student;

public class StudentController {

	StudentService service = null;

	public List<Student> getAllStudentController(){
		service = new StudentService();
		List<Student> db = service.getAllStudentService();

		return db;
	}
	

	public List<Student> getStudentNameStartsWithA() {
		service = new StudentService();
		List<Student> db = service.getAllStudentNameStartsWithAService();

		return db;
	}
	

	public List<Student> getStudentNameWhoseMarksAbove90() {
		service = new StudentService();
		List<Student> db = service.getAllStudentNameMarksAbove90Service();

		return db;
	}

	
	public List<Student> getStudentNameWhoseMarksBelow90() {
		service = new StudentService();
		List<Student> db = service.getAllStudentNameMarksBelow90Service();
		return db;
	}

	
	public List<Student> getStudentNameWhoseMarksBelow90AndAbove50() {
		service = new StudentService();
		List<Student> db = service.getAllStudentNameMarksBelow90AndAbove50();
		return db;
	}

	
	public List<Student> getStudentRollnoDescending() {
		service = new StudentService();
		List<Student> db = service.getAllStudentRollnoDescendingService();
		return db;
	}

	
	public List<Student> getStudentNameStartsWithAnything() {
		service = new StudentService();
		List<Student> db = service.getNameStartsWithAnyLetterService("S");
		return db;
	}
	

	public List<Student> getStudentNameEndsWithAnything() {
		service = new StudentService();
		List<Student> db = service.getNameEndsWithAnyLetterService("y");
		return db;
	}
	

	public List<Student> getStudentNameEndsWithI() {
		service = new StudentService();
		List<Student> db = service.getNameEndsWithIService();
		return db;
	}


	public List<Student> getStudentMaximunMarks() {
		service = new StudentService();
		List<Student> db = service.getStudentMaximunMarksService();
		return db;
	}


	public List<Student> getStudentMinimunMarks() {
		service = new StudentService();
		List<Student> db = service.getStudentMinMarksService();
		return db;
	}
	
	
	
	
}
