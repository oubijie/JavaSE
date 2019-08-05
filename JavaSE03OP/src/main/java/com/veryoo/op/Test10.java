package com.veryoo.op;

import java.util.Scanner;

/**
 * 让用户输入一个圆的半径，计算并输出该圆的周长和面积（π=3.14）
 * @author obj
 * @email oubijie@139.com
 * @vserion 2019年8月5日
 *
 */
public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.println("请输入一个半径：");
		double r = sc.nextDouble();
		
		System.out.println("周长：" + 2*3.14*r);
		System.out.println("面积：" + 3.14*r*r);
		
	}
}
