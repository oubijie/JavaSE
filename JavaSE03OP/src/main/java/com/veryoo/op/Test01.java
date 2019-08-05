package com.veryoo.op;

/**
 * 基本运算符 + - * / % 
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test01 {

	public static void main(String[] args) {
		//+号的三种情况
		System.out.println(3+2);       //加法
		System.out.println('a'+'b');   //char转为int计算
		System.out.println("a" + "b"); //字符串连接
		
		//这两个分别输出什么
		int i = 155, j = 10;
		System.out.println("s" + i + j);  //s15510
		System.out.println( i + j + "s");  //165s
		
		System.out.println(10/3);   //除0的几种情况
		System.out.println(10/0);
		System.out.println(10.0/0);
		
		System.out.println(10%3);
	}
}
