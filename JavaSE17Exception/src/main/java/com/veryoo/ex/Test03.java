package com.veryoo.ex;

/**
 * 异常的处理
 * 1. 没有异常，catch块不执行
 * 2. 有异常，异常类型匹配，catch能处理
 * 3. 有异常，异常类型不匹配，catch不能处理
 * @author obj
 *
 */
public class Test03 {

	public static void main(String[] args) {
		test(3);
//		test(5);
	}
	
	
	public static void test(int num) {
		try{
			System.out.println("1");
			System.out.println(12/0);   //抛出除数为0异常  
			System.out.println("2");
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("3");
			e.printStackTrace();
		}
		
		System.out.println("4");
		
	}
}
