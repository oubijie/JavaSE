package com.veryoo.control.switch1;

import java.util.Scanner;


/**
 * switch 转换星期
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test02 {

	public static void main(String[] args) {
		System.out.println("请输入星期的数字，1-7:");
		Scanner s = new Scanner(System.in);
//		String input = s.nextLine();
//		System.out.println(input+"aaaa");
		
		int input = s.nextInt();
		
//		int i =1;
//		
		switch(input){
		case 1+12:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期天");
			break;
		default:
			System.out.println("输入的数字有误");
			break;
		}
	}
}
