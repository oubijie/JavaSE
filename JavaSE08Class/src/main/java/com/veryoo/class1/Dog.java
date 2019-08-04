package com.veryoo.class1;

public class Dog {

	String breed;
	double weight;
	String color;
	
	
	
	public void bark(){
		if(weight < 10){
			System.out.println("喵喵喵");
		}else{
			System.out.println("汪汪汪");
		}
	}
	
	public void run(){
		System.out.println(breed + "品种的狗跑起来了");
	}
	
	public void eat(){
		weight++;
	}
	
	public void catchDisk(){
		run();
		bark();
		System.out.println("接住飞盘了");
	}
	
	
	
}
