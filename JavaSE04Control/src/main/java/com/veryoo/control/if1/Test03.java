package com.veryoo.control.if1;

/**
 * 练习二
 * 有一个1000内的正整数
 * 如果大于500
 *     则 如果是奇数  输出 “大于500的奇数”
 *       如果是偶数  输出 “大于500的偶数”
 * 如果小于500
 *    则 如果是5的倍数，输出“小于500的5的倍数”
 *      如果不是5的倍数，输出“小于500的数”
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test03 {

	public static void main(String[] args) {
		int k = 999;
		
		if(k>500){
			if(k%2 == 0){
				System.out.println("大于500的偶数");
			}else{
				System.out.println("大于500的奇数");
			}
		}else if(k < 500){
			if(k%5 == 0){
				System.out.println("小于500的5的倍数");
			}else{
				System.out.println("小于500的数");
			}
		}
		
//		方式二
		if(k>500 && k%2==0){
			System.out.println("大于500的偶数");
		}else if(k>500 && k%2!=0){
			System.out.println("大于500的奇数");
		}else if(k<500 && k%5==0){
			System.out.println("小于500的5的倍数");
		}else if(k<500 && k%5!=0){
			System.out.println("小于500的数");
		}
	}
}
