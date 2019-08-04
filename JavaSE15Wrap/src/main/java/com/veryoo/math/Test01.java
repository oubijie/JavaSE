package com.veryoo.math;

/**
 * 数学运算类Math
 * @author obj
 *
 */
public class Test01 {

	public static void main(String[] args) {
		double a = Math.random();
		double b = Math.random();
		
		System.out.println(Math.sqrt(a*a + b*b));
		System.out.println(Math.pow(a, 3));
		System.out.println(Math.round(b));
		System.out.println(Math.PI);
		double d = 60.0;
		System.out.println(Math.toRadians(d));
		System.out.println(Math.toDegrees(Math.PI/4));
		System.out.println(Math.sin(Math.PI/2));
		
	}
}
