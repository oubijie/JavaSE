package com.veryoo.op;

import java.util.Scanner;

/**
 * 让用户输入一个三位数的整数，将整数每位的数字拆开再求和
 * 如 634拆成6+3+4=13
 * @author obj
 * @email oubijie@139.com
 * @vserion 2019年8月5日
 *
 */
public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //创建一个输入器，接受从键盘输入内容
		
		System.out.println("请输入一个整数：");
		int num = sc.nextInt();
		
		int a1 = num/100;  //百位
		int a2 = num%100/10;  //num/10%10，十位
		int a3 = num%10;  //个位
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println("和：" + (a1 + a2 + a3));
		
	}
}
