package com.veryoo.stream;

import java.io.File;
import java.io.FileWriter;


/**
 * FileWriter
 * @author obj
 *
 */
public class Test11 {

	public static void main(String[] args) throws Exception{
		File file = new File("d:/temp/filewriter.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("你好");
		fw.write('啊');
		
		fw.close();
		
	}
}
