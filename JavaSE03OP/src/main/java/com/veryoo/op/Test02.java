package com.veryoo.op;

/**
 * 基本运算符 ++ --
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test02 {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a++);	//打印10，a=11
		System.out.println(--a);	//打印10，a=10
		System.out.println(a++);	//打印10，a=11
		System.out.println(++a);	//打印12，a=12
		System.out.println(--a);	//打印11，a=11
		System.out.println("a="+a);
		
		
		int a1 = 5;
		int b1 = ++a1;
		System.out.println("a1=" + a1 + ", b1=" + b1);
		
		int a2 = 5;
		int b2 = a2++;
		System.out.println("a2=" + a2 + ", b2=" + b2);
		
		
		
	}
}
