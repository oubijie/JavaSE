package com.veryoo.op;


/**
 * 华氏温度和摄氏温度的转换
 * 华氏温度》摄氏温度，用华氏温度减去32，乘以5，除以9就能得到摄氏温度
 * @author obj
 * @email oubijie@139.com
 * @vserion 2019年8月5日
 *
 */
public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.println("请输入您要转换的华氏温度：");
		double h = sc.nextDouble();
		double s = (h - 32) * 5 / 9;
		System.out.println("转换后的摄氏温度为：" + s);
		
		double h2 = s * 9 / 5 + 32;
		System.out.println("转换后的华氏温度为：" + h2);
		
	}
}
