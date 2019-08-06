package com.veryoo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 文件复制
 * @author Administrator
 *
 */
public class Test08 {

	public static void main(String[] args) throws IOException {
	    File srcFile = new File("d:/temp/test.txt");    //源文件对象
	    File destFile = new File("d:/temp/abc.txt");  //目标文件对象
	    
	    
	    if (!(destFile.exists())) {  //判断目标文件是否存在
	      destFile.createNewFile();  //如果不存在则创建新文件
	    }
	    //使用源文件对象创建文件输入流对象
	    FileInputStream fis = new FileInputStream(srcFile);
	    //使用目标文件对象创建文件输出流对象
	    FileOutputStream fos = new FileOutputStream(destFile);
	    
	    
	    byte[] buf = new byte[1024];  //创建字节数组，作为临时缓冲
	    System.out.println("开始复制文件...");
	    while (fis.read(buf) != -1) {  //循环从文件输入流中读取数据
	      fos.write(buf);    //写入到文件输出流中
	    }
	    
	    System.out.println("文件复制成功！");
	    fis.close();    //关闭流
	    fos.close();
	  }

}
