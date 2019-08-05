package com.veryoo.dt;

/**
 * 数据溢出问题
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test05OutRange{

	public static void main(String[] args) {
		int max = Integer.MAX_VALUE+1;//最大值
		int min = Integer.MIN_VALUE-1;//最小值
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		
		
//		01111111 11111111 11111111 11111111
//		00000000 00000000 00000000 00000001
//		10000000 00000000 00000000 00000000
		
		
		short s1 = 10000;  //00100111 00010000
		byte b2 = (byte)s1;  //强制转换，有可能造成精度丢失
		System.out.println(b2);
	}
	
}
