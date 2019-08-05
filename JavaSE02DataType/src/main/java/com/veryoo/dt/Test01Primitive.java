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
		long l1 = 322;
		long l2 = 2147483648L;    //整数字面量，默认是整型int
		System.out.println(l1);
		
		
		double d = 4.9;
		double d1 = 4.9D;
		double d2 = 2e20;  //科学计数法，2乘以10的20次方，2e20=2x10^20
		
		float f = 4.5F;  //浮点型的字面量，默认是double类型
		float f1 = 4.5F;
		
		char c1 = 'a';
//		char c2 = "a";
		System.out.println(c1);
		char c2 = 37;  //编码
		System.out.println(c2);
		
		char c3 = '\uE08C';  
		System.out.println(c3);
		
		char c4 = '汗';
		
//		for(int i=0; i<65536; i++){
//			System.out.println(""+ i +(char)i);
//		}
		
		int i5 = 0x85;  //十六进制整型
		int i8 = 077;   //八进制整型
		System.out.println(i5);
		
		byte b1 = 10;
		byte b2 = -10;
//		byte b3 = 128;
		
		boolean b = true;  //"true"
		boolean ff = false;
		

		
		
		
	}
}
