package com.veryoo.rw;

import java.io.FileWriter;


/**
 * FileWriter演示
 * @author obj
 *
 */
public class TestFileWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		try{
			fw = new FileWriter("d:/temp/test.txt");
			for(int c=0; c<50000; c++){
				fw.write(c);
			}
			fw.flush();
			fw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
