package com.veryoo.control.if1;

import java.util.Scanner;

/**
 * 让用户输入一个1-7的整数，打印出对应是星期几，如果输入不是1-7的数，提示错误
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个1-7的整数：");
		int i = sc.nextInt();
		if(i == 1) {
			System.out.println("星期一");
		}else if(i == 2) {
			System.out.println("星期二");
		}else if(i == 3) {
			System.out.println("星期三");
		}else if(i == 4) {
			System.out.println("星期四");
		}else if(i == 5) {
			System.out.println("星期五");
		}else if(i == 6) {
			System.out.println("星期六");
		}else if(i == 7) {
			System.out.println("星期天");
		}else {
			System.out.println("输入错误！");
		}
	}
}
