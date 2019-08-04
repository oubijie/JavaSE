package com.veryoo.co;

public class Test01 {

	public static void main(String[] args) {
		SchoolClass sc = new SchoolClass();
		for(int i=0; i<10; i++){
			Student s = new Student(i+1, "s"+i);
			sc.students.add(s);
		}
		
//		sc.showStudents();
		
		Student newS = new Student(100, "s100");
		sc.students.add(newS);
		sc.showStudents();
		
//		sc.students[10] = newS;
		
//		Student[] ss = new Student[11];
////		for (int i = 0; i < ss.length; i++) {
//	
//		ss[10] = newS;
//		sc.students = ss;

	}
}
