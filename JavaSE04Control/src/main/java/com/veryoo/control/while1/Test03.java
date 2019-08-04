package com.veryoo.control.while1;


/**
 * 用while循环分别求奇数和偶数之和
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test03 {

	public static void main(String[] args) {
		int i=1;
		int sumOdd= 0;
		int sumEven = 0;
		
		while(i<=50){
			//把10的倍数剔除
			if(i%10==0){
				i++;
				continue;
			}
			
			//分别统计奇数和偶数之和，
			if(i%2==0){
				//偶数
				sumEven += i;
			}else{
				//奇数
				sumOdd += i;
			}
			
			i++;
		}
		System.out.println("奇数之和：" + sumOdd);
		System.out.println("偶数之和：" + sumEven);
	}
}
