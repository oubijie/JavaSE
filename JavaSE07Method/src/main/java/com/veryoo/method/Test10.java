package com.veryoo.method;

import java.util.Random;

/**
 * 方法参数的值传递，基本数据类型和引用数据类型的不同
 * @author Administrator
 */
public class Test10 {

	public static void main(String[] args) {
//		int a = 5;
//		fun(a);
//		System.out.println("main: " + a);  //5
		
		int[] a = new int[1];
		a[0] = 5;
		funB(a);
		System.out.println("main: " + a[0]);   //10
	}
	
	public static void funB(int[] a) {
		System.out.println("fun1: "+ a[0]);  //5
		a[0] = 10;
		System.out.println("fun2: "+ a[0]);  //10
	}
	
//	public static void fun(int a) {
//		System.out.println("fun1: "+ a);  //5
//		a = 10;
//		System.out.println("fun2: "+ a);  //10
//	}
	
}
