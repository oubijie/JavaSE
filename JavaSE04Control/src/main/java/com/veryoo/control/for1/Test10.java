package com.veryoo.control.for1;

/**
 * 打印99乘法表
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test10 {

	public static void main(String[] args) {
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j+"x" + i + "=" + i*j + " ");
//			}
//			System.out.println();
//		}
		
		int i=1;
		while(i<=9) {
			int j=1;
			while(j<=i) {
				System.out.print(j+"x" + i + "=" + i*j + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
