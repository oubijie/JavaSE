package com.veryoo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 课后作业二
 * 求倒计时，从控制台输入一个日期
 * (正则表达式对输入格式校验，如：2016-09-09)
 * 校验输入的日期必须大于当前日期
 * 计算还有多少天；
 * @author ZHQL
 */
public class Test07 {
	public static void main(String[] args) throws ParseException {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个日期(如:2016-09-09)");
		String date = s.next();
		if(!date.matches("^\\d{4}-\\d{2}-\\d{2}$")){
			System.out.println("日期格式输入错误！");
			return;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//把字符串转换成Date
		Date d1 = sdf.parse(date);
		//当前时间
		Date d2 = new Date();
		if(d1.before(d2)){
			System.out.println("不允许输入的日期在当前日期前");
			return;
		}
		long days = (d1.getTime()  - d2.getTime())/
				     (1000*60*60*24);
		System.out.println("距离["+ date+"]还有" + days+ "天");
	}
}
