package com.veryoo.control.while1;

import java.util.Random;

/**
 * 用代码产生0-100内的随机整数并打印，直到生成的随机数是88才能结束
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test07 {

	public static void main(String[] args) {
		//方式一
//		Random rand = new Random();
//		int num;
//		do {
//			num = rand.nextInt(100);
//			System.out.println(num);
//		}while(num != 88);
		
		//方式二
		Random rand = new Random();
		int num;
//		while(true) {
		for(;;) {
			num = rand.nextInt(100);
			System.out.println(num);
			if(num == 88) {
				break;
			}
		}
	}
}
