package com.veryoo.method;

import java.util.Scanner;

/**
 * 在屏幕上打印以下图形
 * 			*
 * 			**
 * 			***
 * 			===========
 * 			*
 * 			**
 * 			***
 * 			-----------------
 * 			*
 * 			**
 * 			***	
 * 
 * @author Administrator
 *
 */
public class Test04 {

	public static void main(String[] args) {
		printTri();
		System.out.println("============");
		printTri();
		System.out.println("--------------");
		printTri();
	}
	
	public static void printTri() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
	}
}


















