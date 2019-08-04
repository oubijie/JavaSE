package com.veryoo.javase01;

/**
 * 变量及作用域演示
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class User {

	String username = "李小龙";
	int year = 1940;
	
	public void howOld(){
		int now = 2017;   //now仅在howOld方法内可见
		int age;
		age = now - year;
		System.out.println(username + "今年" + age + "岁了！");
	}
	
	public void getYear(){
//		System.out.println(now);   //now仅在howOld方法内可见
		System.out.println(username + "生于" + year + "年");
	}
	
	
	public static void main(String[] args) {
		User user = new User();
		user.howOld();
	}
}
