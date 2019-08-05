package com.veryoo.array;

/**
 * 数组的基本操作
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test04 {

	public static void main(String[] args) {
		int[] arr = {80,90,100,88,90,900};
		
		//使用for循环操作数组
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//按以下格式打印数组 [80,90,100,88] 
		//10分钟
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]);   //最后一个元素不加逗号
			}else {
				System.out.print(arr[i]+",");
			}
		}
		System.out.print("]");
		System.out.println();
		
		
		//找出数组数组中最高的成绩
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("最大值：" + max);
		
		
		//输入一个分数，判断数组中是否已包含此分数
		//10分钟
		int score = 88;
		
		//是否找到分数的标记
		boolean found = false;
		for(int i=0; i<arr.length; i++) {
			if(score == arr[i]) {
				found = true;  //找到了
				break;
			}
		}
		
		if(found) {
			System.out.println("此分数已存在");
		}else {
			System.out.println("此分数不存在");
		}
	}
}
