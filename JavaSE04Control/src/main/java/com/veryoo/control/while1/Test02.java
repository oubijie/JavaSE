package com.veryoo.control.while1;


/**
 * while循环计数及求和演示
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test02 {

	public static void main(String[] args) {
		int sum = 0;
		int i=1;
		while(i<100){
			sum+=i;
			i+=2;
		}
		System.out.println(sum);
		
	}
}
