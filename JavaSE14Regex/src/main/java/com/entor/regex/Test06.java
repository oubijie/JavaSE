package com.entor.regex;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 10、题目：从控制台输入以下字符串
(提示：用数组装正则表达式,然后循环数组)：
  1、姓名（中文，1-5个字）
  2、年龄（小于100的正整数）
  3、出生年月日时分（格式：2014-07-08 20:06）
  4、邮箱地址
  5、存款（格式：必须有两位小数）
  6、ATM机取款（格式：只能50或100）
  7、IP地址(如：127.0.0.1);
  8、十六进制数（如：0XAF）
  9、偶数
   用正则表达式对它们的格式进行校验，
   格式不正确则提示重新输入；
   最后把输入的信息全部显示出来。
 * @author ZHQL
 *
 */
public class Test06 {

	public static void main(String[] args) {
		String[] field = {"姓名","年龄",
				          "出生日期","邮箱地址",
				          "存款","取款",
				          "IP地址","十六进制数",
				          "偶数"
		};
		String[] regex = {"[\u4e00-\u9fa5]{1,5}",
				          "[1-9][0-9]?",
				 		  "\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}",
				 		  "^[a-zA-Z]\\w{4,11}@[a-z0-9]+\\.(com|cn)",
				 		  "(0|[1-9]\\d*)\\.\\d{2}",
				 		  "(50|100)","\\d{1,3}(\\.\\d{1,3}){3}",
				 		  "0[xX][0-9a-fA-F]+",
				 		  "([2468]|[1-9]\\d*[24680])"
						 };
		String[] value = new String[field.length];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < value.length; ) {
			System.out.println("请输入" + field[i] +":");
			value[i] = s.nextLine();//读取一行
			if(!value[i].matches(regex[i])){//正则表达式匹配
				System.out.print(field[i] +"格式有误,");
			}else{
				i++;
			}			
		}
		System.out.println(Arrays.toString(value));
	}
}
