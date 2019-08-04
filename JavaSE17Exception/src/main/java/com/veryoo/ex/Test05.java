package com.veryoo.ex;

/**
 *  多个catch块
 *  1. 小的Exception写在上面
 *  2. 大的Exception可以接住子类所有的Exception
 * @author obj
 *
 */
public class Test05 {
	
	public static void main(String[] args) {
		test(1, 0);
	}

	public static void test(int num, int i) {
		try{
			int[] arr = {1, 2, 3};
			System.out.println(arr[num]);   
			
			System.out.println(100 / i);
			
			System.out.println("异常出现，本句无法被执行");
		}catch(Exception e){
			System.out.println("可能是数组越界异常，可能是除数为0异常");
//		}catch (ArithmeticException e) {
//			e.printStackTrace();
		}
		
		System.out.println("异常被捕获，程序正常结束");
		
	}
}
