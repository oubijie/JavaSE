package com.veryoo.sort;


/**
 * 引出插入排序
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test02 {

	public static void main(String[] args) {
		int[] a = { 2, 6, 9, 3, 5, 7};
		
		int src = 4;
		int dest = 1;
		
		int temp = a[src];
		for(int i=src; i>dest; i--){
			a[i] = a[i-1];
		}
		a[dest] = temp;
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}
