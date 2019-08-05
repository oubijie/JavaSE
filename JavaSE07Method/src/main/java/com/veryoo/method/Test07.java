package com.veryoo.method;

import java.util.Random;

/**
 * 
 * 方法的参数
 * @author Administrator
 *
 */
public class Test07 {

	public static void main(String[] args) {
		sayHello("张飞");
		
		String name="Abc";
		sayHello(name);
		
		sayDetail("老王", 18);
	}
	
	public static void sayHello(String name) {
		System.out.println("==============");
		System.out.println(" |        你好，"+name+"          |");
		System.out.println("==============");
	}
	
	
	public static void sayDetail(String name, int age) {
		System.out.println("==============");
		System.out.println(" |        你好，"+name+"          |");
		System.out.println(" |        年龄，"+age+"          |");
		System.out.println("==============");
	}
	
}
