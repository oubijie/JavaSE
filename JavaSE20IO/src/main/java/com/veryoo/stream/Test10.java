package com.veryoo.stream;

import java.io.File;
import java.io.FileReader;


/**
 * FileReader演示
 * @author obj
 *
 */
public class Test10 {

	public static void main(String[] args) throws Exception{
		File file = new File("d:/temp/filereader.txt");
		FileReader fr = new FileReader(file);
		
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
		
		int c = -1;
		while( (c = fr.read()) != -1){
			System.out.print( (char)c );
		}
		
		char[] arr = new char[1024];
		
		
		fr.close();
		
	}
	
	
	
	
	
	
	
	
	
	
}
