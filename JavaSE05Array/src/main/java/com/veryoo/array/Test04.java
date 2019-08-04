package com.veryoo.array;

import java.util.Date;

/**
 * 其他类型的数组
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test04 {

	public static void main(String[] args) {
		String[] s = new String[5];
		s[0] = "hello";
		s[1] = "java";
		
//		System.out.println(s[2]);
		
		char[] a = new char[5];
		System.out.println((int)a[2]);
		
		
		Date[]  darr = new Date[3];
		Date d = new Date(2017, 1, 4);
		darr[1] = d;
		
	}
}
