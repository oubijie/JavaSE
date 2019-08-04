package com.veryoo.control.for1;

/**
 * 双重循环
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test02 {

	public static void main(String[] args) {

		int n = 6;

		// 第一个
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 打印1，3，5，7，9
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i*2-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// 打印9，7，5，3，1
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}
