package com.veryoo.control.switch1;


/**
 * switch演示
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test01 {

	public static void main(String[] args) {

		int num = 2;
		char a = 'b';

		switch (num) { // num是整型，byte,char,short

		case 1: // 任意case表达式的值不能相同
			System.out.println("num is 1"); // 允许有多个语句，可以不用{}括起来
			System.out.println("num is 1");
			System.out.println("num is 1");
			break; // break结束switch语句

		case 2: // case语句可以合并
		case 3:
			System.out.println("num is 3");
			break;

		default:
			System.out.println("num is not 1,2,3");
			break;
		}

		if (num == 1) {
			System.out.println("num is 1"); // 允许有多个语句，可以不用{}括起来
			System.out.println("num is 1");
			System.out.println("num is 1");
		} else if (num == 2) {
			System.out.println("num is 2");
		} else if (num == 3) {
			System.out.println("num is 3");
		} else {
			System.out.println("num is not 1,2,3");
		}

		char c = 'D';
		if (c == 'A') {

		} else if (c == 'B') {

		}

	}
}
