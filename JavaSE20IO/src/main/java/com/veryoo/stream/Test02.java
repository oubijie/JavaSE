package com.veryoo.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test02 {

	public static void main(String[] args) throws Exception{
		File file = new File("d:/temp/test02.txt");
		file.createNewFile();
		
		OutputStream out = new FileOutputStream(file, true);
//		out.write('a');
//		out.write('b');
//		out.write('1');
		
//		out.write("hello".getBytes());
		out.write(", java".getBytes());
		
		
		out.close();
	}
}
