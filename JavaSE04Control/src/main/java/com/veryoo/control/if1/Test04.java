package com.veryoo.control.if1;

/**
 * 课后作业一
 * 出租车计费标准为：3 公里以内 10 元，3 公里以后每 1 公里加 2 元，超过 15 公里，每公里加 3 元
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test04 {

	public static void main(String[] args) {
		int i=20;
		int money=0;
		
		if(i<=3){
			money = 10;
		}else if(i<=15){
			money = 10 + (i-3)*2;
		}else if(i>15){
			money = 34 + (i-15)*3;
		}
		
		System.out.println(money);
		
		
	}
}
