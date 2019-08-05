package com.veryoo.sort;

import java.util.Arrays;

/**
 * Arrays类演示
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test03 {

	public static void main(String[] args) {
		int[] arr = {6,7,1,4};
		
		//复制数组，产生一个新的数组，可以指定新数组的长度
		int[] newarr = Arrays.copyOf(arr, 10);
		
		//将数组转换成可阅读的字符串
		System.out.println(Arrays.toString(newarr));
		
		//给数组填充内容
//		Arrays.fill(arr, 9);
		System.out.println(Arrays.toString(arr));
		
		//排序
//		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//二分查找，数组要先有序
		int index = Arrays.binarySearch(arr, 9);
		System.out.println(index);
		
		
		//数组复制
		int[] na = new int[10];
		System.arraycopy(arr, 0, na, 0, 4);
		System.out.println(Arrays.toString(na));
	}
}
