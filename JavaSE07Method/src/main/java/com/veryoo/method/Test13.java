package com.veryoo.method;

/**
 * 写三个重载方法
 * 第一个方法不需要参数，调用时打印一行10个*
 * 第二个方法接收一个整数，调用时打印传入数量的*
 * 第三个方法接收一个整数和一个字符，调用时打印相应数量的字符
 * @author Administrator
 */
public class Test13 {

	public static void print() {
		System.out.println("**********");
	}
	
	public static void print(int num) {
//		for(int i=0; i<num; i++) {
//			System.out.print("*");
//		}
		print(num, '*');
	}
	
	public static void print(int num, char c) {
		for(int i=0; i<num; i++) {
			System.out.print(c);
		}
	}
	
}
