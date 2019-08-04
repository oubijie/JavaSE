package com.veryoo.array;


/**
 * 数组的使用
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test02 {
	public static void main(String[] args) {
		int[] a = {1,3,9,5,3,7,2};
		
		System.out.println(a[0]);
		
		System.out.println(a.length);   //数组的长度
		
		//最大下标 length-1
		//最小下标 0

		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		
		for(int i=0; i<args.length; i++){
			System.out.print(args[i] + " ");
		}
	}
}
