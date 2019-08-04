package com.veryoo.op;

/**
 * 位运算符演示
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test06 {
	public static void main(String[] args) {
		System.out.println(2&3);
		
//		0010
//		0011
//		0010

		System.out.println(3 >> 2);
//		0011  >> 0000
		
		System.out.println(3 << 2);
//		0011  << 1100
	}

}
