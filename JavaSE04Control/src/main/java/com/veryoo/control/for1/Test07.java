package com.veryoo.control.for1;

/**
 * 打印正杨辉三角
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test07 {

	public static void main(String[] args) {
		int n = 6;
		
		for(int i=1; i<=n; i++){
			
			for(int k=1; k<=n-i; k++){
				System.out.print(" ");
			}
			
			
			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
