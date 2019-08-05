package com.veryoo.op;


/**
 * 任意一个大写字母，输出对应的小写字母 'A' > 'a'
 * @author obj
 * @email oubijie@139.com
 * @vserion 2019年8月5日
 *
 */
public class Test12 {

	public static void main(String[] args) {
		char upper = 'Z';
		
		char lower = (char)(upper + 32);
		
		System.out.println(lower);
		
	}
}
