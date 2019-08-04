package com.veryoo.string;


/**
 * String不变演示
 * @author obj
 *
 */
public class Test00 {
	public static void main(String[] args) {
		String a = "hello";
		String b = "hello";
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		String c = new String("java");
		String d = new String("java");
		
		System.out.println(c == d);
		System.out.println(c.equals(d));
	}
}
