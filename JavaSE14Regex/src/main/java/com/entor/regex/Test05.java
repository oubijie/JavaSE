package com.entor.regex;
/**
 * 7、输入一个字符串，如："abc d e f g ahijsaskdlamn "
  A.统计a的个数；
  B.去掉所有空格和数字；
  C.把字符串变成大写；
  D.把字符串转置后输出；
 * @author ZHQL
 */
public class Test05 {

	public static void main(String[] args) {
		String s = "abc d e f g ahijsaskdlamn ";
		s.replaceAll("[^a]+", "");
		System.out.println("a的个数:" 
		       + s.replaceAll("[^a]+", "").length());
		s = s.replaceAll("[\\d\\s]+", "");
		System.out.println("去空格和数字后: " + s);
		System.out.println("大写:" + s.toUpperCase());
		StringBuilder s1 = new StringBuilder(s);
		System.out.println("转置后:" + s1.reverse());
	}

}
