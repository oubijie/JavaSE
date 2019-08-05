package com.veryoo.method;

import java.util.Date;

/**
 * 方法的返回值
 * 使用return关键字将其返回
 * @author Administrator
 *
 */
public class Test05 {

	public static void main(String[] args) {
		int a = getAge();
		System.out.println("年龄是：" + a);
		
		String name = getName();
		System.out.println(  name  );
		
		Date d = getNow();
		System.out.println(d);
	}
	
	public static int getAge() {
		return 20;
	}
	
	
	public static String getName() {
		String s = "我的名字叫";
		s += "Anna";
		return  s;
	}
	
	public static Date getNow() {
		return new Date();
	}
}
