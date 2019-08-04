package com.veryoo.ex;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * finally演示
 * 1. 没有异常，catch块不执行，finally执行
 * 2. 有异常，异常类型匹配，catch能处理，finally执行
 * 3. 有异常，异常类型不匹配，catch不能处理，finally执行
 * 4. System.exit(1); finally不执行
 * @author obj
 *
 */
public class Test07 {

	public static void main(String[] args) {
		FileInputStream in = null;
		try{
			
			System.out.println(100/0);
			
			System.out.println("异常出现，本句不执行");
			
			in = new FileInputStream("d:/temp.txt");
			in.read();
			
		}catch (Exception e) {
			System.out.println("Exception");
		}finally{
			System.out.println("finally");
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("异常被捕获，程序正常结束");
	}
	
}
