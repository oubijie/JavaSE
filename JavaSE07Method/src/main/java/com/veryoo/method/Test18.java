package com.veryoo.method;

/**
 * 写一个方法，传入正整数n，计算1+2+3+...+n的总和
 * @author Administrator
 *
 */
public class Test18 {
	
	public static void main(String[] args) {
		System.out.println(    sum2(5)   );
	}
	
	//使用递归
	public static int sum2(int n) {
		if(n == 1) {
			return 1;
		}
		return n + sum2(n-1);
	}
	
	
	public static int sum(int n) {
		int s = 0;
		for(int i=1; i<=n; i++) {
			s += i;
		}
		return s;
	}
}


