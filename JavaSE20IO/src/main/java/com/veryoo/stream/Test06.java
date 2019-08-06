package com.veryoo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) {
		File file = new File("d:/temp/test.txt");
		
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			
			//第一种
//			for(int i=0; i<file.length(); i++){
//				char c = (char)in.read();
//				System.out.print(c);
//			}
			
			//第二种
//			int c;
//			while( (c = in.read()) != -1){
//				System.out.print((char)c);
//			}
			
			
			byte[] b = new byte[1024];
			int i;
			while( (i=in.read(b)) != -1){
				System.out.print(new String(b, 0, i));
			}
			
			
//			byte[] b1 = new byte[(int)file.length()];
//			in.read(b1);
//			System.out.print(new String(b1));
			
			
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
