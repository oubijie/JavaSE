package com.veryoo.array;


/**
 * 练习五
 * 去除0
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test09 {

	public static void main(String[] args) {
		int[] a = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		
		//统计非0元素的个数
		int count = 0;
		for(int i=0; i<a.length; i++){
			if(a[i] != 0){
				count++;
			}
		}
		
		//拷贝非0元素到新的数组
		int[] b = new int[count];
		int j = 0;
		for(int i=0; i<a.length; i++){
			if(a[i] != 0){
				b[j++] = a[i];
			}
		}
		
		
		for(int k=0; k<b.length; k++){
			System.out.print(b[k] + " ");
		}
		
		
		
	}
}
