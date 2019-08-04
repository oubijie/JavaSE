package com.entor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 序列化和反序列化
 * @author obj
 *
 */
public class TestObjectStream {

	public static void main(String[] args) throws Exception {
		Student s = new Student("张飞", 30);
		FileOutputStream fos = new FileOutputStream("d:\\temp\\object.txt");
		//打开对象流
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		fos.flush();
		fos.close();
		
		s = new Student();
	}
	
}



class Student implements Serializable{
	private transient String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
