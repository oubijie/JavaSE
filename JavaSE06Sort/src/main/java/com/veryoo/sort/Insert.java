package com.veryoo.sort;

import java.util.Arrays;


/**
 * 插入排序
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Insert {

	public static void main(String[] args) {
		int[] arr = {2,7,4,8,1,6,3};
		System.out.println(Arrays.toString(arr));
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	//实现方式一
	public static void insertSort(int[] arr){
		for(int i=1; i<arr.length; i++){
			for(int j=0; j<i; j++){
				if(arr[i] < arr[j]){
					int temp = arr[i];
					for(int k=i; k>j; k--){
						arr[k] = arr[k-1];
					}
					arr[j] = temp;
					break;
				}
			}
		}
	}
	
	public static void insertSort2(int[] arr){
		for(int i=1; i<arr.length; i++){
			//先找出要插入的目标位置
			int dest = i;
			for(int j=0; j<i; j++){
				if(arr[j] > arr[i]){
					dest = j;
					break;
				}
			}
			
			System.out.println("i=" + i + ", dest=" + dest);
			
			//移动数组并插入
			if(dest != i){
				int temp = arr[i];
				for(int k=i; k>dest; k--){
					arr[k] = arr[k-1];
				}
				arr[dest] = temp;
			}
			
			
			for(int j=0; j<arr.length; j++){
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}
}
