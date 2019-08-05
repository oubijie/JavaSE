package com.veryoo.control.for1;

/**
 * 找出三位数中的水仙花数
 * 153 = 1*1*1  + 5*5*5 + 3*3*3
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test08 {

	public static void main(String[] args) {
		for(int i=100; i<1000; i++) {
			int a1 = i/100  ;//百位
			int a2 = i%100/10; //十位
			int a3 = i%10; //个位
			
			int sum = a1*a1*a1 + a2*a2*a2 + a3*a3*a3;
			if( sum == i) {
				System.out.println(i);
			}
		}
		
	}
}
