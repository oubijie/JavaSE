package com.veryoo.array;

/**
 * 练习四
 * 合并数组
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test08 {

	public static void main(String[] args) {
		int[] a = {1,7,9,10,13,15,17,19};
		int[] b = {2,4,6,8,10};
		
		int[] c = new int[a.length + b.length];

		for(int i=0; i<a.length; i++){
			c[i] = a[i];
		}
		
		for(int i=0; i<b.length; i++){
			c[a.length+i] = b[i];
		}
		
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]);
		}
		
		
 	}
}
