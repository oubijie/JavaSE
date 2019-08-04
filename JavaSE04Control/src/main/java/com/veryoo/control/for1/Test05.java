package com.veryoo.control.for1;

/**
 * 输出100-200内的质数
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test05 {

	public static void main(String[] args) {

		// 外层循环，得出100-200以内的数
		for (int i = 100; i <= 200; i++) {
			boolean flag = true; // 用于标记是否是质数

			// 内层循环，得出除数因子
			for (int j = 2; j <= i - 1; j++) {

				if (i % j == 0) {
					// 不是质数
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.println(i);
			}
		}

	}
}
