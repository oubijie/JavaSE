package com.veryoo.method;

import java.util.Random;

/**
 * 
 * 1.写一个方法，根据传入的数量值，打印相应数量的*号
 * xxx(1)    *
 * 
 * 2.再写一个方法，根据传入的数量值，打印相应行数的三角形
 * aaa(5)
 * 			*
 * 			**
 * 			***
 * 			****
 * 			*****
 * 
 * 3. 再写一个方法，根据传入的数量值和符号，打印相应行数的三角形
 * bbb(3, '#')
 * 			#
 * 			##
 * 			###
 * @author Administrator
 */
public class Test08 {

	public static void main(String[] args) {
//		printStars(100);
//		printTri(5);
		
		printTriByChar(5, '#');
	}
	
	//打印每行的*号
	public static void printStars(int num) {
//		for(int i=0; i<num; i++) {
//			System.out.print("*");
//		}
		printChar(num, '*');
	}
	
	//打印三角形
	public static void printTri(int row) {
		for(int i=0; i<row; i++) {
			printStars(i+1);
			System.out.println();
		}
	}
	
	/**第三问*/
	public static void printChar(int num, char point) {
		for(int i=0; i<num; i++) {
			System.out.print(point);
		}
	}
	
	public static void printTriByChar(int row, char point) {
		for(int i=0; i<row; i++) {
			printChar(i+1, point);
			System.out.println();
		}
	}
	/**第三问*/
	
}
