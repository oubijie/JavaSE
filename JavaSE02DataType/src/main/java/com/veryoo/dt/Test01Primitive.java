package com.veryoo.dt;


/**
 * 8种基本数据类型
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test01Primitive {

	public static void main(String[] args) {
		long a = 123L;
		System.out.println(a);
		
		
		double d = 4.9;
		double d1 = 4.9D;
		
		float f = 4.5F;
		float f1 = 4.5F;
		
		char c1 = 'a';
//		char c2 = "a";
		System.out.println(c1);
		char c2 = 37;  //编码
		System.out.println(c2);
		
		char c3 = '\uE08C';  
		System.out.println(c3);
		
	   
//		for(int i=0; i<65536; i++){
//			System.out.println(""+ i +(char)i);
//		}
		
		
		
	}
}
