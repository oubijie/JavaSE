package com.veryoo.dt;

/**
 * String类型演示
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test04String {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		String name = "obj";
		System.out.println("my name is " + name);
		
		String h = "你好，" + "obj";
		System.out.println(h);
		
		System.out.println("test" + 4 + 5);  //任意类型与字符串拼接都是字符串
		System.out.println(4 + 5 + "test");  
		System.out.println(4 + "test" + 5);
		
//		String b = 17;

	}
}
