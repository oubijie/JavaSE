package com.veryoo.string;

import java.util.Arrays;

/**
 * 字符串方法演示
 * @author obj
 */
public class Test01 {
	public static void main(String[] args) {

		// 把字符数组转换成字符串
		char[] c = new char[] { 'a', 'b', 'c', 'd', 'e', 'f' };
		String s1 = new String(c);
		System.out.println(c);

		// 转换成字符数组
		char[] c1 = s1.toCharArray();
		System.out.println(Arrays.toString(c1));

		// 返回索引下的字符
		System.out.println(s1.charAt(1));

		// 返回字符串长度
		System.out.println(s1.length());

		// 是否包含子字符串
		System.out.println(s1.contains("Ad"));

		// 是不是以XX开头
		System.out.println(s1.startsWith("ab"));

		// 是不是以XX结尾
		System.out.println(s1.endsWith("def"));

		// 比较两个字符串是否相等
		System.out.println(s1.equals("AdeBCdef"));

		// 忽略大小写比较
		System.out.println(s1.equalsIgnoreCase("AdeBCdef"));

		// 查找某个子字符串在字符串的中位置
		System.out.println(s1.indexOf("de"));

		// 查找某个子字符串在字符串最后一次出现的位置
		System.out.println(s1.lastIndexOf("de"));

		// 截取子字符串
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(2, 5)); // 前包后不包
		
		// 全部转成小写
		System.out.println(s1.toLowerCase());
		
		// 全部转成大写
		System.out.println(s1.toUpperCase());

		String s2 = "AB,lkjfd,@#AB";
		// 替换
		System.out.println(s2.replace("AB", ""));
		System.out.println(s2.replace("AB", "").replace(",", "-"));  // 链式编程
		
		// 分割数组
		String[] arr = s2.split(",");
		System.out.println(Arrays.toString(arr));
		

		String s3 = "   FX bbb   ";
		// 去除前后空格
		System.out.println(s3.trim());

	}
}
