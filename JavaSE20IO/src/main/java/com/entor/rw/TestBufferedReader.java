package com.entor.rw;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * BufferedReader演示
 * @author obj
 *
 */
public class TestBufferedReader {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader("d:/temp/test.txt");
			br = new BufferedReader(fr);
			
			String str;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
//			int c = 0;
//			while( (c=fr.read()) != -1 ){
//				System.out.print((char)c);
//			}
			
			br.close();
//			fr.close();   // 只需要关闭处理流
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
