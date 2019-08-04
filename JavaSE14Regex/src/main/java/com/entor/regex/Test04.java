package com.entor.regex;

import java.util.Arrays;

/**
 * 6、正则表达式实现，输入一行字符(用Scanner的nextLine();)，
分别统计出其中的英文字母串、空格串、数字串和其它字符串的个数。
 * @author ZHQL
 *
 */
public class Test04 {

	public static void main(String[] args) {
		String s = "a&&b  v34 klj%^32   32jklfd2!@#";
		String[] a1 = s.split("[^a-zA-Z]+");
		System.out.println(Arrays.toString(a1));
		if(s.matches("^[a-zA-Z]+.*")){//判断是不是以字母开头
			System.out.println("字母串个数:" + a1.length);
		}else{
			System.out.println("字母串个数:" + (a1.length-1));
		}
		String[] a2 = s.split("\\D+");
		System.out.println(Arrays.toString(a2));
		if(s.matches("^\\d+.*")){//判断是不是以数字开头
			System.out.println("数字串个数:" + a2.length);
		}else{
			System.out.println("数字串个数:" + (a2.length-1));
		}
		String[] a3 = s.split("\\S+");
		System.out.println(Arrays.toString(a3));
		if(s.matches("^\\s+.*")){//判断是不是以空格开头
			System.out.println("空格串个数:" + a3.length);
		}else{
			System.out.println("空格串个数:" + (a3.length-1));
		}
		String[] a4 = s.split("[a-zA-Z\\d\\s]+");
		System.out.println("a4=" +Arrays.toString(a4));
		if(s.matches("^[^a-zA-Z\\d\\s]+.*")){//判断是不是以空格开头
			System.out.println("其它字符串个数:" + a4.length);
		}else{
			System.out.println("其它字符串个数:" + (a4.length-1));
		}
	}
}
