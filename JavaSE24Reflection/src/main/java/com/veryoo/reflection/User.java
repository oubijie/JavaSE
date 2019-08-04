package com.veryoo.reflection;

public class User{
	public User(){
		System.out.println("无参构造器");
	}
	
	public User(String name){
		
	}
	
	private User(String name, int age){
		
	}
	
	
	public void dowork(){
		System.out.println("doing work");
	}
	
	public static void dowork(String name){
		
	}
	
	private void sayHello(){
		System.out.println("say hello");
	}
}
