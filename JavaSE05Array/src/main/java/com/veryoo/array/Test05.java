package com.veryoo.array;

/**
 * 练习一
 * 初始化一个长度为100数组，把 1000,999,998…依次赋值到数组元素中
 * 把数组前50个元素取出，倒着放到一个新的数组内
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test05 {

	public static void main(String[] args) {
		int[] arr = new int[100];

		// 写法一
		// int i=0;
		// for(int j=1000; j>900; j--){
		// arr[i] = j;
		// i++;
		// }

		// 写法二
//		for (int j = 1000, i = 0; j > 900; j--, i++) {
//			arr[i] = j;
//		}

		// 写法三
		int j = 1000;
		for (int i = 0; i<arr.length; i++) {
			arr[i] = j;
			j--;
		}

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		
		//把数组前50个元素取出，倒着放到一个新的数组内
		int[] b = new int[50];
		for(int bm = b.length-1; bm>=0; bm--){
			b[bm] = arr[b.length-1-bm];
		}
		
		System.out.println();
		for (int k = 0; k < b.length; k++) {
			System.out.print(b[k] + " ");
		}
		
		
	}
}
