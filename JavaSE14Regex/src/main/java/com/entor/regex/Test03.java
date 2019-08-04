package com.entor.regex;

import java.util.Arrays;

/**
 * String对正则表达式的支持
 * @author ZHQL
 */
public class Test03 {

	public static void main(String[] args) {
		String s  = "*&^%#$#al32kjl3232treiow3232uio32te";
		//分割
		String[] arr = s.split("\\d+");
		System.out.println(Arrays.toString(arr));
		//替换
		s = s.replaceAll("[^0-9]+", "");
		System.out.println(s);
		
	}

}
