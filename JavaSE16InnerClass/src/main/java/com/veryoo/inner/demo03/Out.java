package com.veryoo.inner.demo03;


/**
 * 成员变量被覆盖
 * @author obj
 *
 */
public class Out {

	private int age = 12;
	
	class In {
		private int age = 13;
		public void showAge(){
			int age = 14;
			System.out.println("局部变量:" + age);
			System.out.println("内部类成员变量:" + this.age);
			System.out.println("外部类成员变量:" + Out.this.age);
		}
	}
}
