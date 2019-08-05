package com.veryoo.method;

/**
 * 方法的重载
 * 方法名相同，参数类型或数量不同
 * 方法名+参数=签名
 * @author Administrator
 */
public class Test12 {

	public static void main(String[] args) {
		say(90, 80);
	}
	
	public static void say() {}
	
	public static void say(int row) {}
	
//	public static void say(int abc) {}   //不能算重载，仅形参的名字不同不算
	
//	public static int say(int row) {}  //返回值不同不能算重载
	
	public static void say(double row) {}
	
	public static void say(int row, char point) {}
	
	public static void say(int a, int b) {}
	
	public static void say(int a, double b) {}
	
	public static void say(double a, int b) {}
	
	public static void say(double a, int b, String s) {}
	
	
	
}
