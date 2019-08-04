package com.veryoo.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {
		File file = new File("d:/temp/temp.txt");
		FileOutputStream out = null;
		try{
			out = new FileOutputStream(file);
//			out = new FileOutputStream(file, true);  //追加模式
			
//			out.write('a');
//			out.write('1');
//			out.write('t');
			
			String content = "你好java";
			out.write(content.getBytes());
			
//			out.write(new String(content.getBytes(), "UTF-8").getBytes());
			
			out.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}
}
