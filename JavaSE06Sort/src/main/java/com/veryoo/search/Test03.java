package com.veryoo.search;

import java.util.Arrays;


/**
 * Arrays二分查找法演示
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test03 {

	public static void main(String[] args) {
		char[] c = {'a', 'b', 'c', 'd' , 'e', 'f', 'g'};
		
		//找出f
		int pos = Arrays.binarySearch(c, 'g');
		System.out.println(pos);
	}
}
