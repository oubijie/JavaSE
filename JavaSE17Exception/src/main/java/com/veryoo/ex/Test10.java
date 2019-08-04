package com.veryoo.ex;


/**
 * 练习四
 * 1. 写一个方法void isTriangle(int a,int b,int c)，判断三个参数是否能构成一个三角形。
 * 2. 如果不能则抛出异常IllegalArgumentException，显示异常信息 “a,b,c不能构成三角形”，如果可以构成则显示三角形三个边长。
 * 3. 在主方法中得到命令行输入的三个整数，调用此方法，并捕获异常
 * @author obj
 *
 */
public class Test10 {

	public static void main(String[] args) {
		isTriangle(0, 12, 12);
	}
	
	public static void isTriangle(int a, int b, int c){
		if( a>0 && b>0 && c>0 && a + b > c && a + c > b && c + b > a){
			System.out.println("可以构成三角形 " + a + " " + b+ " " + c);
		}else{
			throw new IllegalArgumentException("a,b,c不能构成三角形");
		}
		
	}
}
