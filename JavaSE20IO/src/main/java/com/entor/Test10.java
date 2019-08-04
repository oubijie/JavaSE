package com.entor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Properties;
/**
 * Properties类演示
 * @author ZHQL
 */
public class Test10 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis 
		= new FileInputStream("d:\\temp\\db.properties");
		//过度流处理乱码问题
		InputStreamReader isr = new InputStreamReader(fis,"GBK");
		//创建属性文件对象
		Properties pro = new Properties();
		pro.load(isr);//加载属性文件
		System.out.println("用户名:" + pro.getProperty("username"));
		System.out.println("密码:" + pro.getProperty("password"));
		System.out.println("姓名:" + pro.getProperty("name"));
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("d:\\temp\\db.properties");
		pro.setProperty("cn", "中华人民共和国");
		pro.setProperty("us", "美国");
		pro.store(fos, "注释");
		fos.close();
	}

}
