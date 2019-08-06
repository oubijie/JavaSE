package com.veryoo.stream;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Properties演示
 * @author obj
 *
 */
public class Test17Properties {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		
		FileReader in = new FileReader("d:/temp/db.properties");
//		FileInputStream in = new FileInputStream("d:/temp/db.properties");
		prop.load(in);  //加载属性文件
		
		//读取属性
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("ip"));
		System.out.println(prop.getProperty("passwd"));
		
		in.close();
		
		//修改，增加属性
//		prop.setProperty("name", "李白");
//		prop.setProperty("age", "18");
//		
//		OutputStream out = new FileOutputStream("d:/temp/db.properties");
//		prop.store(out, "database configurations");  //写到流里面
//		out.close();
		
		
//		prop = System.getProperties();
		
		
	}
	
	
	
	
	
	
	
	
}
