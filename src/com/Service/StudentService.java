package com.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {
	public static String ch ;
	StudentDao dao = null;


	public List<Student> getAllStudentService(){
		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();

		return db;
	}


	public List<Student> getAllStudentNameStartsWithAService() {

		List<Student> db1 = new ArrayList<Student>();

		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();

		for (Student s : db) {
			if(s.getName().startsWith("A")) {
				db1.add(s);
			}
		}

		return db1;
	}


	public List<Student> getAllStudentNameMarksAbove90Service() {

		List <Student> db2 = new ArrayList<Student>();

		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();

		for (Student s : db) {
			if(s.getMarks()>90) {
				db2.add(s);
			}
		}
		return db2;
	}


	public List<Student> getAllStudentNameMarksBelow90Service() {
		List <Student> db3 = new ArrayList<Student>();

		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();

		for (Student s : db) {
			if(s.getMarks()<90) {
				db3.add(s);
			}
		}

		return db3;
	}


	public List<Student> getAllStudentNameMarksBelow90AndAbove50() {

		List <Student> db4 = new ArrayList<Student>();

		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();

		for (Student s : db) {
			if(s.getMarks()<90 && s.getMarks()>50) {
				db4.add(s);
			}
		}

		return db4;
	}


	public List<Student> getAllStudentRollnoDescendingService() {

		List <Student> db5 = new ArrayList<Student>();

		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();

		return db5;
	}


	public List<Student> getNameStartsWithAnyLetterService(String ch) {

		List <Student> db6 = new ArrayList<Student>();

		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();

		for (Student s : db) {
			if(s.getName().startsWith(ch)) {
				db6.add(s);
			}
		}

		return db6;
	}


	public List<Student> getNameEndsWithAnyLetterService(String ch) {
		List <Student> db7 = new ArrayList<Student>();

		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();

		for (Student s : db) {
			if(s.getName().endsWith(ch)) {
				db7.add(s);
			}
		}
		return db7;
	}


	public List<Student> getNameEndsWithIService() {
		List<Student> db8 = new ArrayList<Student>();

		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();

		for (Student s : db) {
			if(s.getName().endsWith("i")) {
				db8.add(s);
			}
		}
		return db8;
	}


	public List<Student> getStudentMaximunMarksService() {
		List<Student> db9 = new ArrayList<Student>();

		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();

		int max = db.get(0).getMarks();
		for (Student s : db) {
			if (s.getMarks() > max) {
				max = s.getMarks();
			}
		}

		for (Student s : db) {
			if (s.getMarks() == max) {
				db9.add(s);
			}
		}
		return db9;
	}


	public List<Student> getStudentMinMarksService() {
		List<Student> db9 = new ArrayList<Student>();

		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();

		int min = db.get(0).getMarks();
		for (Student s : db) {
			if (s.getMarks() < min) {
				min = s.getMarks();
			}
		}

		for (Student s : db) {
			if (s.getMarks() == min) {
				db9.add(s);
			}
		}
		return db9;
	}





}
