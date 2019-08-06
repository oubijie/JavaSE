package com.veryoo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 将当前日期按“xxxx年xx月xx日xx时xx分xx秒”的格式写入一个文件中。
再写一个程序从文件中读取该日期，按yyyy-mm-dd的格式打印到控制台
 * @author obj
 *
 */
public class Test09 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		String s = sdf.format(new Date());
		
		File file = new File("d:/temp/date.txt");
		
		
		FileOutputStream out = null;
		FileInputStream in = null;
		try {
			if(!file.exists()){
				file.createNewFile();  //创建文件
			}
			
			
			out = new FileOutputStream(file);
			
			out.write(s.getBytes()); //写入
			
			out.flush();   //缓存
			
			System.out.println("文件创建成功");
			
			System.out.println("开始读文件");
			in = new FileInputStream(file);
			byte[] b = new byte[(int)file.length()];
			in.read(b);
			String dateString = new String(b);
			System.out.println(dateString);
			Date date = sdf.parse(dateString);
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(sdf2.format(date));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
