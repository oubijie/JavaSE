package com.veryoo.control.hw;

import java.util.Scanner;

/**
 * 辗除法求最大公约数和最小公倍数
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test02 {

	public static void main(String[] args) {
		System.out.println("输入两个正整数：");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		int max = a > b ? a : b;
		int min = a < b ? a : b;
		
		int m = max % min;
		while(m != 0){
			max = min;
			min = m;
			m = max % min;
		}
		System.out.println(min);
		
		System.out.println(a*b/min);
		
		
	
	}
}
