package com.veryoo.math;

import java.math.BigDecimal;

/**
 * BigDecimal
 * @author obj
 *
 * Float 1bit（符号位） 8bits（指数位） 23bits（尾数位）
 * Double 1bit（符号位） 11bits（指数位） 52bits（尾数位）
 */
public class Test02 {

	public static void main(String[] args) {
		System.out.println(0.11+2001299.32);
		System.out.println(0.58*100);
		float f = 2.2f;  
		double d = (double) f;  
		System.out.println(d); 
		
		BigDecimal a = new BigDecimal("0.11");
		BigDecimal b = new BigDecimal("2001299.32");
		System.out.println(a.add(b));
	}
}
