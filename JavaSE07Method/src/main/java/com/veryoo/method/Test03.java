package com.veryoo.method;


/**
 * 成员变量与局部变量
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test03 {

	public String color;
	public double heigh;
	public int age;        //成员变量默认值，参考数组
	
	
	public void printAge(){
		int age = 2;
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
		Test03 t = new Test03();
		t.printAge();
//		System.out.println(t.color);
//		System.out.println(t.heigh);
//		System.out.println(t.age);
	}
	
	public void testint(){
		int i; //声明
		i = 0; //赋值
		
		int j = 1;
		System.out.println(i); //使用
	}
}
