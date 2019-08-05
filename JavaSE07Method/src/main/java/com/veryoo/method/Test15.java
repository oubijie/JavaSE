package com.veryoo.method;

import java.util.Arrays;

/**
 * 同一个包或不同包中类的方法的调用方式
 * @author Administrator
 *
 */
public class Test15 {

	public static void main(String[] args) {
		//同一个包不用import，使用类名
		Test14.print();
		
		//不同包中要import
		Arrays.toString(new int[5]);
		
		//使用全限定名
		java.util.Random r = new java.util.Random();
	}
}
