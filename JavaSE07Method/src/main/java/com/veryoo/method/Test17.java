package com.veryoo.method;

/**
 * 写一个方法，传入一个整型数组和一个整数，返回该整数在数组中第一次出现的位置
 * 如果没有则返回-1
 * @author Administrator
 *
 */
public class Test17 {
	
	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5,76,78,8,5};
//		System.out.println(index(arr, 30));
		sayHi(20);
	}

	public static int index(int[] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		System.out.println("============");
		return -1;
	}
	
	
	public static void sayHi(int age) {
		if(age < 18) {
			System.out.println("goodbye");
			return;
		}
		
		System.out.println("你好");
		System.out.println("你好");
		return;
	}
}









