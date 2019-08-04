package com.veryoo.control.while1;


/**
 * 计算并打印1到10的阶乘的和
 * Result = 1! + 2! + … + 10!
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test04 {

	public static void main(String[] args) {
//		int sum = 0;
//		for(int j=1; j<=10; j++){
//			int num = 1;
//			for(int i=1; i<=j; i++){
//				num *= i;
//			}
//			System.out.println(num);
//			sum += num;
//		}
//		System.out.println(sum);
		
//		int sum = 0;
//		int j=1;
//		while(j<=10){
//			int num = 1;
//			int i = 1;
//			while(i<=j){
//				num *= i;
//				i++;
//			}
//			sum += num;
//			j++;
//		}
//		System.out.println(sum);
		
		
		int num = 1;
		int sum = 0;
		int i = 1;
		while(i<=10){
			num = i * num;  //2 * 1!
//			System.out.println(num);
			sum += num;
			i++;
		}
		System.out.println(sum);
		
		
		//3! = 3*2!
		//4! = 4*3!
		
	}
}
