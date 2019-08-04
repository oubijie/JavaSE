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
		int[] a = {4,2,7,3,8,2};
		
		//排序
		Arrays.sort(a);
		
		//打印
		String result = Arrays.toString(a);
		System.out.println(result);
		
		//复制
		int[] b = Arrays.copyOf(a, 4);
		System.out.println(Arrays.toString(b));
		
		
//		System.arraycopy(src, srcPos, dest, destPos, length)
	}
}
