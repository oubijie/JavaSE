package com.veryoo.method;

import java.util.Arrays;

/**
 * 使用方法优化
 * @author Administrator
 *
 */
public class Test02 {

	public static void main(String[] args) {
		char[] arr = {'a', 'v', 'y', 'u' , 'e', 'w', 'k', 'u' , 'e', 'w', 'k'};
		System.out.println("u出现的次数：" + countChar(arr, 'u'));
		
		//第二问
		char[] arr1 = Arrays.copyOf(arr, arr.length+3);
		arr1[arr.length] = 'n';
		arr1[arr.length+1] = 'k';
		arr1[arr.length+2] = 'p';
		
		System.out.println("k出现的次数：" + countChar(arr1, 'k'));
	}
	
	
	public static int countChar(char[] arr, char key) {
		int count = 0;   //计数器，记录出现的次数
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				count++;
			}
		}
		return count;
	}
}






