package com.veryoo.method;

import java.util.Arrays;

/**
 * 数组 {‘a’, ‘v’, ‘y’, ‘u’ , ‘e’, ‘w’, ’ k’, ‘u’ , ‘e’, ‘w’, ’ k’}
 * 1. 统计 ‘u’ 在里面出现的次数
 * 2.给数组再增加几个字母，'n','k','p'
 * 统计 ‘k’ 在里面出现的次数
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		char[] arr = {'a', 'v', 'y', 'u' , 'e', 'w', 'k', 'u' , 'e', 'w', 'k'};
		
		int count = 0;   //计数器，记录出现的次数
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 'u') {
				count++;
			}
		}
		System.out.println("u出现的次数：" + count);
		
		//第二问
		char[] arr1 = Arrays.copyOf(arr, arr.length+3);
		arr1[arr.length] = 'n';
		arr1[arr.length+1] = 'k';
		arr1[arr.length+2] = 'p';
		
		int countK = 0;
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == 'k') {
				countK++;
			}
		}
		System.out.println("k出现的次数：" + countK);
	}
}






