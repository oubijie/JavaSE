package com.veryoo.array;

import java.util.Date;


/**
 * 增强for循环
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test10 {

	public static void main(String[] args) {
		// jdk 1.5 增强for循环
		int[] b = { 1, 2, 3 };
		for (int temp : b) {
			temp = 10;
		}

		Date[] c = { new Date(), new Date() };
		for (Date dd : c) {
			dd = new Date();
		}
	}
}
