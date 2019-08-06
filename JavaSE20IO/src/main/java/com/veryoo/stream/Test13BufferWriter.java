package com.veryoo.stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test13BufferWriter {

	public static void main(String[] args) throws Exception{
		Writer out = new FileWriter("d:/temp/test.txt");
		BufferedWriter bw = new BufferedWriter(out);
		
		bw.write("哈哈哈哈哈谢谢");
		
		bw.close();
	}
}
