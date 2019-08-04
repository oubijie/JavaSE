package com.veryoo.control.for1;


/**
 * 练习四
 * 计算并打印1到10的阶乘的和
 * Result = 1! + 2! + … + 10!
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test06 {

	public static void main(String[] args) {

		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			int num = 1;
			for (int i = 1; i <= j; i++) {
				num *= i;
			}
			System.out.println(num);
			sum += num;
		}
		System.out.println(sum);
	}
}
