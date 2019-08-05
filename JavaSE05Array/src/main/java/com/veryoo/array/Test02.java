package com.veryoo.array;


/**
 * 数组的使用
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test02 {
	public static void main(String[] args) {
		//声明和初始化
		int[] a;
		a = new int[5];
		
		int b[];
		b = new int[5];
		
		//静态赋值初始化
		int[] c = {80,90,100};
		
		//取数组的元素，下标从0开始，超出边界会抛出异常
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
//		System.out.println(c[-1]);  //下标不能为负数
//		System.out.println(c[3]);  //下标越界
		System.out.println(a[0]);
		
		System.out.println("==============");
		//给数组的元素赋值
		c[0] = 100;
		System.out.println(c[0]);
		
		System.out.println("==============");
		//数组的长度
		System.out.println(c.length);
		System.out.println(a.length);
		System.out.println(b.length);
		
		System.out.println("==============");
		int[] d = new int[100];
		System.out.println(d[d.length-1]);  //数组的最大下标
	}
}
