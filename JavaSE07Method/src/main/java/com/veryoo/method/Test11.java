package com.veryoo.method;

/**
 * 方法的重载
 * 方法名相同，参数类型或数量不同
 * 方法名+参数=签名
 * @author Administrator
 */
public class Test11 {

	public static void main(String[] args) {
		printTri(9, '%');
	}
	
	
	public static void printTri(int row) {
		for(int i=0; i<row; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void printTri(int row, char point) {
		for(int i=0; i<row; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(point);
			}
			System.out.println();
		}
	}
}
