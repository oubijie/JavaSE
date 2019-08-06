package com.veryoo.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test12BufferedReader {

	public static void main(String[] args) throws Exception{
		Reader in = new FileReader("d:/temp/bufferedReader.txt");
		BufferedReader br = new BufferedReader(in);
		
		String str;
		while( (str = br.readLine()) != null){
			System.out.println(str);
		}
		
		
		br.close();
	}
}
