package com.veryoo.array;

/**
 * 随机产生一个N个元素的数组
 * 将数组首尾元素依次相加再打印，如果为奇数个，中间的元素x2输出
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test06 {

	public static void main(String[] args) {
		int num = 6;  //数组的元素个数
		
		int[] arr = new int[num];
		Random random = new Random();

		//使用随机数赋值
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(20);
		}
		
		System.out.println(Arrays.toString(arr));  //格式化打印数组
		
		//数组元素首尾依次相加
		//方式一
//		for(int i=0; i<arr.length/2; i++) {
//			System.out.println(arr[i] + arr[arr.length-1-i]);
//		}
//		if(arr.length%2==1) {
//			System.out.println(arr[arr.length/2] * 2);
//		}
		
		//方式二
		int i=0;
		int j=arr.length-1;
		while(j>=i) {
			System.out.println(arr[i++] +arr[j--]);
		}
	}
}
