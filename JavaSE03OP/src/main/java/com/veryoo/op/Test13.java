package com.veryoo.op;


/**
 * int a=10, int b = 30;
 * 将两个整型互换位置，a=30, b=10
 * @author obj
 * @email oubijie@139.com
 * @vserion 2019年8月5日
 *
 */
public class Test13 {

	public static void main(String[] args) {
		int a = -100;
		int b = 2147483647;
		
		int temp = a;
		a = b;
		b = temp;
		
//		a = b - a;
//		b = b - a;
//		a = a + b;
		
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}
