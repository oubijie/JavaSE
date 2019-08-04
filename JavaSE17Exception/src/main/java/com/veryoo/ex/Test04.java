package com.veryoo.ex;

/**
 *  多个catch块
 * @author obj
 *
 */
public class Test04 {
	
	public static void main(String[] args) {
		test(5, 0);
	}

	public static void test(int num, int i) {
		try{
			int[] arr = {1, 2, 3};
			System.out.println(arr[num]);   
			
			System.out.println(100 / i);
			
			System.out.println("异常出现，本句无法被执行");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组越界异常");
		}catch(ArithmeticException e){
			System.out.println("除数为0异常");
		}
		
		System.out.println("异常被捕获，程序正常结束");
		
	}
}
