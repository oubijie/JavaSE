package com.veryoo.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * RuntimeExcepption和非RuntimeExcepption的区别
 * @author obj
 *
 */
public class Test06 {

	/**
	 * 非RuntimeExcepption，必须要用try catch处理
	 */
	static void getFile(){
		try {
			FileInputStream in = new FileInputStream("d:/temp.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * RuntimeExcepption，可处理可不处理
	 */
	static void getChar(){
		String aString = "aa";
		aString.charAt(9);
	}
}
