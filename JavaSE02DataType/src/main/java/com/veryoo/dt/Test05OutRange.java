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
	}
	
}
