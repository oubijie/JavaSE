package com.veryoo.class1;

public class Calc {

	public int add(int x, int y){  //方法的重载
		System.out.println("int int int");
		return x + y;
	}
	
	public long add(long x, long y){
		System.out.println("long long ");
		return x + y;
	}
	
	public int add(int x, int y, int z){
		return x + y +z ;
	}
	
//	public float add(int x, int y){
//		return (float)(x+y);
//	}
	
	
	
	
	
	public static void main(String[] args) {
		Calc cal = new Calc();
		
		
		cal.add(10, 100);  //数据类型的自动转换
	}
	
}
