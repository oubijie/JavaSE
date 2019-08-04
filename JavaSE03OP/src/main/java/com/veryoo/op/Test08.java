package com.veryoo.op;

/**
 * 三目运算符演示
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test08 {

	public static void main(String[] args) {
		int a =5;
		int b = 6;
		
		int max = a > b ? a+4 : b;
		System.out.println(max);
		
		int i = 5;
		System.out.println( i<5 ? 10.9 : 9);  //9.0
	}
}
