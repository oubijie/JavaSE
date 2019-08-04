package com.veryoo.sort;

import java.util.Arrays;

/**
 * 选择排序
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Selection {

	public static void main(String[] args) {
		int[] arr = {2,7,4,8,1,6,3};
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void selectionSort(int[] arr){
		//实现方式一
//		for(int i=0; i<arr.length; i++){
//			for(int j=i+1; j<arr.length; j++){
//				if(arr[i] > arr[j]){
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
		
		//实现方式二
		for(int i=0; i<arr.length; i++){
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[minIndex] > arr[j]){
					minIndex = j;
				}
			}
			if(minIndex != i){
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
