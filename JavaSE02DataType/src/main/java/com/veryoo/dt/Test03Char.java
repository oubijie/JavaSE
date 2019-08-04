package com.veryoo.dt;

/**
 * char类型的几种赋值方式
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test03Char {

	public static void main(String[] args) {
		char c1 = 'A'; //直接表示符号
		System.out.println(c1);
		
		char c2 = 65; //使用对应的十进制顺序
		System.out.println(c2);
		
		char c3 = '\u0041';  //使用十六进制顺序
		System.out.println(c3); 
	}
}
