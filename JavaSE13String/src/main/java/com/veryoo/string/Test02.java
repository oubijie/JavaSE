package com.veryoo.string;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 1、输入一个由小写字母组成的字符串，
按照26个字母表顺序进行排序，打印排序后的字符串； 
 * @author obj
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入小写字母串:");
		String str = s.next();
		System.out.println("排序前:" + str);
		char[] arr =  str.toCharArray();//字符串转换成字符数组
		//选择排序
		/*char temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i; j < arr.length; j++) {
				//字符比较可以看成整数比较
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}*/
		Arrays.sort(arr);
		str =  new String(arr);//把字符数组转换成字符串
		System.out.println("排序后:" + str);
	}

}
