package com.entor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputDemo {
	public static void main(String[] args) throws IOException {
		// 将System.in转化成字符流对象
		InputStreamReader isr = new InputStreamReader(System.in);
		// 用缓冲流进行包装
		BufferedReader br = new BufferedReader(isr);
		System.out.println("请输入您的姓名：");
		String name = br.readLine(); // 接受输入
		System.out.println("请输入您的年龄：");
		int age = Integer.parseInt(br.readLine()); // 接受输入
		System.out.println("您的姓名：" + name);
		System.out.println("您的年龄：" + age);
		br.close(); // 关闭流
		isr.close(); // 关闭流
	}
}
