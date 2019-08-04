package com.entor.regex;

public class Test07 {

	public static void main(String[] args) {
		String str1 = "0X100";
		//十六进制数
		System.out.println(
				str1.matches("^0[xX][0-9A-Fa-f]+$"));
		String str2 = "2014-09-09";
		//日期
		System.out.println(
				str2.matches("\\d{4}-\\d{2}-\\d{2}"));
	}

}
