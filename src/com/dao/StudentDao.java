package com.dao;

import java.util.ArrayList;      	//ctr+shift+o
import java.util.List;
import com.entity.Student;

public class StudentDao {

	public List<Student> getAllStudents(){
		List<Student> db = new ArrayList<Student>();

		db.add(new Student("Suzy", 101, 95));
		db.add(new Student("nandini", 102, 90));
		db.add(new Student("jeny", 103, 85));
		db.add(new Student("Sara", 104, 86));
		db.add(new Student("hana", 105, 91));
		db.add(new Student("Ashwini", 106, 90));
		db.add(new Student("Suraj", 107, 35));
		db.add(new Student("Aniket", 108, 70));
		db.add(new Student("Gaurav", 109, 45));
		db.add(new Student("Devendra", 110, 89));
		db.add(new Student("Shiv", 111, 57));

		return db;

	}

}