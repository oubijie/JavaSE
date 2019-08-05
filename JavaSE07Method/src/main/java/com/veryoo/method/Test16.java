package com.veryoo.method;

/**
 * 非static方法的调用方式
 * @author Administrator
 *
 */
public class Test16 {

	public static void main(String[] args) {
		//先创建一个对象
		Test16 t = new Test16();
		//使用对象去调用方法
		t.sayHello();
	}
	
	public void sayHello() {
		System.out.println("Hi");
	}
	
}

class Dog{
	int age;
	public void bark() {
		if(age<2) {
			System.out.println("wuwuwuw");
		}else {
			System.out.println("汪汪汪");
		}
	}
	
	public static void sleep() {
		
	}
}
