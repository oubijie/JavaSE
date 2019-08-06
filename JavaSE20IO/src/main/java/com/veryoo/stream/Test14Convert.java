package com.veryoo.stream;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 转换流演示
 * @author Administrator
 *
 */
public class Test14Convert {

	public static void main(String[] args) throws Exception{
		InputStream in = System.in;
		
		InputStreamReader ir = new InputStreamReader(in);
		
		System.out.println((char)ir.read());
		System.out.println((char)ir.read());
		

	}
}
