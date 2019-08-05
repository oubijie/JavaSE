package com.veryoo.array;

import java.util.Arrays;

/**
 * 请给数组[1, 2, 3, 4, 5, 6]增加一个元素7，打印结果 [1, 2, 3, 4, 5, 6, 7]
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test08 {

	public static void main(String[] args) {
		   int[] arr = {1,2,3,4,5,6};
		   System.out.println(Arrays.toString(arr));
		   
		   //由于数组一旦创建后就不能改变长度，
		   //需要增加元素的话就要重新创建一个新的数组
		   //并把原数组的内容复制到新数组
		   //创建一个新的数组，长度要增加
		   int[] newarr = new int[arr.length + 1];
		   //把原数组的内容复制到新的数组
		   for(int i=0; i<arr.length; i++) {
			   newarr[i] = arr[i];
		   }
		   //把新增的元素插入到最后一个位置
		   newarr[newarr.length-1] = 7;
		   arr = newarr;
		   System.out.println(Arrays.toString(arr));
		   
		   
		   //方式二
		   int[] b = Arrays.copyOf(arr, arr.length+1);
		   b[b.length-1] = 7;
		   
	}
}
