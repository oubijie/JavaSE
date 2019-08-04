package com.entor.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test01 {

	
	public static void main(String[] args) {
		File file = new File("d:/temp/temp.txt");
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			
			
//			for(int i=0; i<file.length(); i++){
//				char c = (char)in.read();
//				System.out.print(c);
//			}
			
//			int c;
//			while((c = in.read()) != -1){
//				System.out.print((char)(c));
//			}
			
//			byte[] b = new byte[1024];
//			int i;
//			while( (i=in.read(b)) != -1){
//				System.out.print(new String(b));
//			}
			
			byte[] b = new byte[1024];
			while(in.read(b) != -1){
				System.out.print(new String(b));
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
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
