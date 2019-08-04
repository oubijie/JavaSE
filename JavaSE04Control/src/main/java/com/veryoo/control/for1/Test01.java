package com.veryoo.control.for1;

/**
 * FOR循环演示
 * 
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test01 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 0; i < 4; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}

		// 求和
		int sum = 0;
		for (int j = 1; j <= 100; j++) {
			sum = sum + j;
		}

		System.out.println(sum);

	}
}
