package com.veryoo.inner.demo02;

/**
 * 内部类共享成员变量
 * @author obj
 *
 */
public class Out {

	private int age = 10;
	
	class In {
		public void showAge(){
			//内部类可以访问外部类的成员变量
			System.out.println(age);    
		}
	}
	
	private void getAge() {
		System.out.println(age+1);
	}
}

