package com.veryoo.stream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;


/**
 * 打印流演示
 * @author obj
 *
 */
public class Test15PrintStream {

	public static void main(String[] args) throws Exception{
		InputStream in = System.in;

		InputStreamReader ir = new InputStreamReader(in);

		OutputStream out = new FileOutputStream("d:/temp/out.txt");
		PrintStream ps = new PrintStream(out);

		System.setOut(ps);

		System.out.println((char) ir.read());
		System.out.println((char) ir.read());
		
		
		//标准输入输出 standard io
//		System.in
//		System.out 
	}
}
