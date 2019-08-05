package com.veryoo.javase01;

/**
 * 变量的声明和初始化
 * @author obj
 * @email oubijie@139.com
 * @vserion 2019年8月5日
 *
 */
public class Test02 {
	
	static int h = 10000;

	public static void main(String[] args) {
		int a;  //声明
		a = 18;  //初始化
		System.out.println(a); //使用
		
		int b = 99;
		
		System.out.println(b);
		
		if(true) {
			int c = 99;
		}
		
//		System.out.println(c);
		
		System.out.println(h);
		
	}
}
