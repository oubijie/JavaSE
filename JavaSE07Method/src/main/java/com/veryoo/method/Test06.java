package com.veryoo.method;

import java.util.Random;

/**
 * 写一个方法，每次调用的时候返回一个10以内的随机整数
 * 再写一个方法，每次调用的时候返回一个10以内的随机整数乘以3.14的乘积
 * 
 * @author Administrator
 *
 */
public class Test06 {

	public static void main(String[] args) {
		System.out.println( getRandomInt() );
		System.out.println( getRandonDouble());
	}
	
	public static int getRandomInt() {
		Random r = new Random();
		return r.nextInt(10);
	}
	
	public static double getRandonDouble() {
		return getRandomInt()*3.14;
	}
	
}
