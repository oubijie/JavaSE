package com.veryoo.ex;


/**
 * 引出异常演示
 * @author obj
 *
 */
public class Test01 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(arr[5]);   //注意错误的名字和行号
		
		System.out.println(3/0);
		
		String aString = null;
		aString.charAt(1);
	}
}
