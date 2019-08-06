package com.veryoo.file;

import java.io.File;
import java.io.IOException;


/**
 * 在D:/a 下面创建100个txt文件
命名方式：学生信息001.txt

删除编号是奇数的文件
 * @author obj
 *
 */
public class Test03 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++){
			String path = "d:/a/学生信息" + formatNum(i) + ".txt";
			File file = new File(path);
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
//			if(i%2 == 1){
//				file.delete();
//			}
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		deleteOdd();
	}
	
	
	public static String formatNum(int i){
		String result = "";
		if(i<10){
			result = "00" + i;
		}else if(i<100){
			result = "0" + i;
		}else{
			result += i;
		}
		
		return result;
	}
	
	
	public static void deleteOdd(){
		File file = new File("d:/a");
		File[] files = file.listFiles();
		
		for(File f : files){
			if(isOdd(f.getName())){
				System.out.println("正在删除：" + f.getName());
				f.delete();
			}
		}
	}
	
	public static boolean isOdd(String name){
		
		int num = Integer.parseInt(name.substring(4, 7));
		return num%2 == 1;
	}
	
	
	
	
}
