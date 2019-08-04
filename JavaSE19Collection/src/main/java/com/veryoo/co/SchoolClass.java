package com.veryoo.co;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {

	public String className;
	
//	public Student[] students;
	
	public List<Student> students;
	
	public SchoolClass() {
		students = new ArrayList<Student>();
	}
	
	public void showStudents(){
//		System.out.println(Arrays.toString(students));
		for(Student s : students){
			System.out.println(s);
		}
	}
	
}
