package com.veryoo.class1;

public class Administrator {

	String name = "Admin";
	int age;
	String department;
	String password;
	
	
	public void show(){
		System.out.println("����" + name + "�� ���룺 " + password);
	}
	
	public int getAge(){
		return age;
	}
	
	
	public boolean checkPassword(String username, String passwordInput){
		if( name.equals(username) && password.equals(passwordInput) ){
			return true;
		}else{
			return false;
		}
	}
	
}
