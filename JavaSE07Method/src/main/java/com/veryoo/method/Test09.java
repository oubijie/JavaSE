package com.veryoo.method;

import java.util.Random;

/**
 * 写一个方法，传入烤鸡单价和用户付款的金额，尽量多买烤鸡，计算应该打包多少只烤鸡
 * 写一个方法，传入烤鸡单价和用户付款的金额，尽量多买烤鸡，计算找零的金额
 * 
 * @author Administrator
 */
public class Test09 {

	public static void main(String[] args) {
		System.out.println(  buy(5, 100)     );
		System.out.println(  change(6.1, 100)     );
	}
	
	/**
	 * 根据提供的单价和总金额计算最多能买多少只烤鸡
	 * @param price 烤鸡的单价
	 * @param money  用户付款的总金额
	 * @return 用户最多能购买的烤鸡数量
	 */
	public  static int buy(double price, double money) {
		return (int)(money/price);
	}
	
	/**
	 * 
	 * @param price
	 * @param money
	 * @return
	 */
	public  static double change(double price, double money) {
		return money - price*buy(price, money);
		
//		return money%price;
	}
	
}
