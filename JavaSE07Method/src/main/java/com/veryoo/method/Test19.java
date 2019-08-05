package com.veryoo.method;

/**
 * 写一个方法求斐波那契数列的值f(n)，
 * f(0)=0, f(1)=1
 * n>=2,f(n)=f(n-1)+f(n-2)
 * 
 * 0,1,1,2,3,5,8,13
 * @author Administrator
 *
 */
public class Test19 {
	
	public static void main(String[] args) {
		System.out.println(fb(6));
	}
	
	
	public static int fb(int n) {
		if(n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		return fb(n-1) + fb(n-2);
	}
}


