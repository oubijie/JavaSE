package com.veryoo.control.while1;

import java.util.Random;

/**
 * 打印输出1-10的整数，如果是5则跳过，使用while，遇到错误就调试
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test09 {

	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
			if(i == 5) {
//				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
