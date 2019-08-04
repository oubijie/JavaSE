package com.veryoo.control.if1;

/**
 * 练习一
 * 有一个1000内的正整数，判断一下这个整数有多少位
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test02 {

	public static void main(String[] args) {
		int j = 10; 
		if(j<10){
			System.out.println("一位");
		}else if(j<100){
			System.out.println("两位");
		}else{
			System.out.println("三位");
		}
		
//		方式二
		if(j>=100){
			System.out.println("三位");
		}else if(j>=10){  //j>9
			System.out.println("两位");
		}else{
			System.out.println("一位");
		}
	}
}
