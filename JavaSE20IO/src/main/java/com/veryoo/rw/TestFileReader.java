package com.veryoo.rw;

import java.io.FileReader;

/**
 * FileReader演示
 * @author obj
 *
 */
public class TestFileReader {

	public static void main(String[] args) {
		FileReader fr = null;
		try{
			fr = new FileReader("d:/temp/test.txt");
			int c = 0;
			while( (c=fr.read()) != -1 ){
				System.out.print((char)c);
			}
			fr.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
