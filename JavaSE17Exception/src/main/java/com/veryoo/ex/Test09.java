package com.veryoo.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * throw抛出异常
 * @author obj
 *
 */
public class Test09 {

	public static void main(String[] args) {
		calc(0);
	}
	

	static void calc(int i){
		if(i==0){
			throw new IllegalArgumentException("被除数为0");
		}
		System.out.println(12/i);
	}
}
