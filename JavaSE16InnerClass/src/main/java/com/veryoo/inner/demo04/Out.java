package com.veryoo.inner.demo04;


/**
 * 静态内部类
 * @author obj
 *
 */
public class Out {

	private static int age = 12;
	private String name = "E";
	
	static class In {
		public void showAge(){
			System.out.println(age);   //静态内部类只能访问静态外部成员变量
//			System.out.println(name);  //报错
		}
	}
}
