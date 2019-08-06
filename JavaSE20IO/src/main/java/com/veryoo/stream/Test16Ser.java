package com.veryoo.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test16Ser {

	public static void main(String[] args) throws Exception {
//		save();
		read();
	}

	public static void save() throws Exception{
		Student s = new Student("张飞", 10);

		OutputStream out = new FileOutputStream("d:/temp/zhangfei.dat");
		ObjectOutputStream oo = new ObjectOutputStream(out);

		oo.writeObject(s);

		oo.close();
	}
	
	
	public static void read() throws Exception{
		InputStream in = new FileInputStream("d:/temp/zhangfei.dat");
		ObjectInputStream oi = new ObjectInputStream(in);
		
		Student student = (Student)oi.readObject();
		System.out.println(student.getName() + 
				student.getAge()
				+student.getSex());
	}

}













