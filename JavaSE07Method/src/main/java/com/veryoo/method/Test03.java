package com.veryoo.method;

import java.util.Scanner;

/**
 * 方法的定义
 * @author Administrator
 *
 */
public class Test03 {

	//方法要定义在class内部
	//public static 修饰符
	//void的位置表示返回值，void没有返回
	//printNum方法名，注意方法名的命名规范，建议使用 动词+名词
	//()
	//()内可以有形参
	
	public static void printNum() {
		System.out.print("1234567890");
		System.out.print(";");
	}
	
	public static void sayHello() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("你好，" + name);
	}
	
	public static void main(String[] args) {
		//调用方法，使用 方法名() 的方式调用方法
		printNum();
		
		sayHello();
	}
}

//1234567890;