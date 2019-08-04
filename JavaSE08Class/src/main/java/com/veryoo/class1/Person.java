package com.veryoo.class1;

public class Person {

	String name;    //定义属性
	double weight;
	String sex;
	
	
	public Person(String name, String sex){
		this(name);    //this() 可以调用自身的其他构造器，如果使用this()，必须写在第一行
		this.sex = sex;
	}
	
	public Person(String name){  //构造器的重载
		this.name = name;
	}
//	
//	public Person(double weight){
//		this.weight = weight;
//	}
	
//	public Person(String sex) {    //参数的类型或数量不一致。形参的名称不同不算重载
//		this.sex = sex;
//	}
	
	//如果一个构造器都不写，编译器默认提供一个
//	public Person(){
//		
//	}
	
	//如果定义了一个或多个构造器，编译器不再提供默认的构造器
//	public Person(String name){
//		this.name = name;
//	}
	
	public void run(){    //定义方法
		
	}
	
	public void eat(){
		
	}
	
	public void sayMyName(){
		System.out.println(name);
	}
}
