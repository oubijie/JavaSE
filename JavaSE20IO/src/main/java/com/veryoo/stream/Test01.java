package com.veryoo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test01 {

	public static void main(String[] args) {
		File file = new File("d:/temp/filereader.txt");
		InputStream in = null;
		try {
			in = new FileInputStream(file);
			
			System.out.println((char)in.read());
			System.out.println((char)in.read());
			System.out.println((char)in.read());
			System.out.println((char)in.read());
			System.out.println((char)in.read());
			System.out.println((char)in.read());
			System.out.println((char)in.read());
			
			//第一种方法
//			for(int i=0; i<file.length(); i++){
//				System.out.print((char)in.read());
//			}
			
			
			//第二种
//			int c = -1;
//			while( (c = in.read()) != -1){
//				System.out.print((char)c);
//			}
			
			
			//第三种
//			byte[] b = new byte[1024];
//			int len = -1;
//			while( (len = in.read(b)) != -1){
//				System.out.print(new String(b, 0, len));
//			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

		

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
