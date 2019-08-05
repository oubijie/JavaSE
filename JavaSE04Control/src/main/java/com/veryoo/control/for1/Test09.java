package com.veryoo.control.for1;

/**
 * 阶乘及阶乘和
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test09 {

	public static void main(String[] args) {
		
//		int sum = 0;  //阶乘和
//		int m = 1;   //计算每个数的阶乘
//		for(int i=1; i<=10; i++) {
//			m *= i;
//			sum += m;
//		}
//		System.out.println("10的阶乘：" + m);
//		System.out.println("10的阶乘和：" + sum);
		
		
		int sum = 0; 
		int m = 1;
		int i=1;
		while(i<=10) {
			m *= i;
			sum += m;
			i++;
		}
		System.out.println("10的阶乘：" + m);
		System.out.println("10的阶乘和：" + sum);
	}
}
