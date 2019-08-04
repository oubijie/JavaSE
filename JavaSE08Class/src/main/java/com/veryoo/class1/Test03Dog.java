package com.veryoo.class1;

public class Test03Dog {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breed = "中华田园犬";
		dog.weight = 9;
		dog.color = "yellow";
		
		dog.bark();
		dog.eat();
		dog.bark();
		
		dog.catchDisk();
		
	}
}
