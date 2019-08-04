package com.veryoo.wrap;


/**
 * 包装类演示
 * @author obj
 *
 */
public class Test01 {

	public static void main(String[] args) {
		Integer i = new Integer(1000000);
		
		//整型转字符串
		System.out.println(i.toString());
		
		//字符串转整型
		System.out.println(Integer.parseInt("100"));
		
		//比较
		System.out.println(i.compareTo(100));
		
		//转成二进制表示的字符串
		System.out.println(Integer.toBinaryString(i));
		
		//转成十六进制表示的字符串
		System.out.println(Integer.toHexString(i));
		
		//整型的最大最小值
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
	}
}
