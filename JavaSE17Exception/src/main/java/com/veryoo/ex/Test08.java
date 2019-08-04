package com.veryoo.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 方法声明抛出异常
 * @author obj
 *
 */
public class Test08 {

	public static void main(String[] args) {
		try {
			readfile();
//			f();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readfile() throws IOException{
//		FileInputStream in = null;
//		try {
//			in = new FileInputStream("d:/temp/abc.txt");
//			int b = in.read();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		FileInputStream in = null;
		in = new FileInputStream("d:/temp/abc.txt");
		int b = in.read();
	}
	
	public static void f() throws Exception{
		readfile();
	}

}
