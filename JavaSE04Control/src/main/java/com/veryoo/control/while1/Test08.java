package com.veryoo.control.while1;

import java.util.Random;

/**
 * 输出100-200内的质数
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test08 {

	public static void main(String[] args) {
		for(int i=100; i<200; i++) {
			
			boolean flag = true;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
//					System.out.println(i+"不是一个质数");
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(i+"是一个质数");
			}
			
		}
	}
}
