package com.entor.file;

import java.io.File;
import java.io.IOException;

/**
 * File
 * @author obj
 *
 */
public class Test01 {

	public static void main(String[] args) throws IOException {
		//创建一个文件对象，使之与一个文件关联
	    File file = new File("test.txt");
	    //显示与文件有关的属性信息
	    System.out.println("文件或目录是否存在：" + file.exists());
	    System.out.println("是文件吗：" + file.isFile());
	    System.out.println("是目录吗：" + file.isDirectory());
	    System.out.println("名称：" + file.getName());
	    System.out.println("绝对路径：" + file.getAbsolutePath());
	    System.out.println("文件大小：" + file.length());
	    
	}
}
