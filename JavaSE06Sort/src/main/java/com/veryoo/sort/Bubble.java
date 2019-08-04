package com.veryoo.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Bubble {

	public static void main(String[] args) {
		int[] arr = {2,7,4,8,1,6,3};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void bubbleSort(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
