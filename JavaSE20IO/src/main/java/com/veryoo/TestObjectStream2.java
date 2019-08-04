package com.veryoo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 序列化和反序列化
 * @author obj
 *
 */
public class TestObjectStream2 {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fos 
		= new FileInputStream("d:\\temp\\object.txt");
		//打开对象流
		ObjectInputStream oos = new ObjectInputStream(fos);
		//读入
		Student s = (Student) oos.readObject();
		System.out.println("name:" + s.getName());
		System.out.println("age:" + s.getAge());
		
		oos.close();
		fos.close();
	}
	
}
