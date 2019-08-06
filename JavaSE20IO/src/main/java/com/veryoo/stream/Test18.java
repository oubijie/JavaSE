package com.veryoo.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 * 练习二
 * 提示用户输入账号
 * 如果当前该账号不存在则创建，提示输入金额，然后 把账号和金额保存到文件中
 * 如账号存在则把金额显示出来。（提示：用Properties类实现）
 * @author obj
 * 
 */
public class Test18 {

	public static void main(String[] args) {
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.println("请输入您的账号：");
			String acount = s.nextLine();
			
			if(acount.equals("quit")){
				break;
			}

			Properties prop = new Properties();
			FileInputStream fin = null;
			FileOutputStream fos = null;
			try {
				fin = new FileInputStream("d:/temp/acount.properties");
				prop.load(fin);
				if (prop.containsKey(acount)) {
					System.out.println("您的账号余额：" + prop.getProperty(acount));
				} else {
					System.out.println("正在创建账号，请输入金额：");
					int amount = s.nextInt();

					prop.setProperty(acount, String.valueOf(amount));
					
					fos = new FileOutputStream("d:/temp/acount.properties");
					prop.store(fos, "acounts");

					System.out.println("账号创建并保存成功");
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fin.close();
					if(fos != null){
						fos.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
