package com.veryoo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/** 
 * 练习三
 * 根据身份证号码获取一个人的生日，
 * 在身份证中第7位到14位是出生日期，并打印生日(如：2016年01月01日)
 * @author obj
 */
public class Test04 {
	
	public static void main(String[] args) {
		String num = "450522199712073639";
		String bd = num.substring(6,14);
		System.out.println(bd);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		try {
			date = sdf.parse(bd);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(sdf1.format(date));
		
	}

}





