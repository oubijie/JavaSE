package com.veryoo.string;

import java.util.Scanner;

/**
 * 编写一个程序，打印字符串所有的排列。
 * @author obj
 * @email oubijie@139.com
 * @vserion 2018年3月26日
 *
 */
public class Test06 {

	public static void main(String[] args) {
	    String str = "";

	    Scanner scan = new Scanner(System.in);

	    str = scan.nextLine();

	    permutation(str.toCharArray(), 0);
	}

	public static void permutation(char[] str, int i) {
	    if (i >= str.length)
	        return;
	    if (i == str.length - 1) {
	        System.out.println(String.valueOf(str));
	    } else {
	        for (int j = i; j < str.length; j++) {
	            char temp = str[j];
	            str[j] = str[i];
	            str[i] = temp;

	            permutation(str, i + 1);

	            temp = str[j];
	            str[j] = str[i];
	            str[i] = temp;
	        }
	    }
	}
}
