package com.veryoo.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test07 {

	public static void main(String[] args) {
		File file = new File("d:/temp/test.txt");

		FileOutputStream out = null;

		try {

//			out = new FileOutputStream(file);  //复写
			out = new FileOutputStream(file, true);  //追加
			
			
//			out.write('a');
//			out.write('b');
//			out.write('c');
			
			String content = "你好java";
			out.write(content.getBytes());
			
			out.flush();   //把缓冲区的内容写入文件
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
