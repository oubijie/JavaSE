package com.veryoo.rw;

import java.io.BufferedWriter;
import java.io.FileWriter;


/**
 * FileWriter演示
 * @author obj
 *
 */
public class TestBufferedWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try{
			fw = new FileWriter("d:/temp/test.txt");
			bw = new BufferedWriter(fw);
			bw.write("你好，java");
			bw.newLine();
			bw.write("Java的世界很精彩");
//			for(int c=0; c<50000; c++){
//				fw.write(c);
//			}
			
			bw.flush();
			bw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
