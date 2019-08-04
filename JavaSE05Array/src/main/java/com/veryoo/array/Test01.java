package com.veryoo.array;


/**
 * 数组的声明与初始化
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test01 {

	public static void main(String[] args) {
		int[] a;
		a = new int[5];
		
		a[0] = 1;    //动态赋值
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
//		System.out.println(a[3]);
		
		
		int[] b = {1, 2, 9, 4, 5};   //静态赋值
//		System.out.println(b[4]);	
		
	}
}
