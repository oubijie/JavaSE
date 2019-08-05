package com.veryoo.control.if1;

/**
 * 输入一个年份，判断这一年是否是闰年
 * 闰年标准：
 * 能够被400整除
 * 能够被4整除，但是不能被100整除
 * 以上二者满足其中一个条件就是闰年
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test05 {

	public static void main(String[] args) {
		int year = 2016;
		
		if(year % 400 == 0) {
			System.out.println(year + "年是闰年！");
		}else if(year % 4==0 && year % 100 != 0) {
			System.out.println(year + "年是闰年！");
		}else {
			System.out.println(year + "年不是闰年！");
		}
		
		
	}
}
