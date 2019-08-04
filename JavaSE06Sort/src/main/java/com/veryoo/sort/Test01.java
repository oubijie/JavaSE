package com.veryoo.sort;


/**
 * 引出选择排序
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test01 {

	public static void main(String[] args) {
		int[] a = { 6, 9, 3, 5, 19, 2, 5, 7, 99, 41 };
		
		int min = a[0];
		int xb = 0;
		
		for(int i=1; i<a.length; i++){
			if(min > a[i]){
				min = a[i];
				xb = i;
			}
		}
		
		System.out.println("最小值" + min);
		System.out.println("最小值下标" + xb);
		
		int temp = a[0];
		a[0] = a[xb];
		a[xb] = temp;
		
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		
		//============================
		min = a[1];
		xb = 1;
		
		for(int i=2; i<a.length; i++){
			if(min > a[i]){
				min = a[i];
				xb = i;
			}
		}
		
		System.out.println("\n最小值" + min);
		System.out.println("最小值下标" + xb);
		
		temp = a[1];
		a[1] = a[xb];
		a[xb] = temp;
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}
