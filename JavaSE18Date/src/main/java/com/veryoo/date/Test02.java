package com.veryoo.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 练习一
 * 获取当前的日期对象，把它设置为8时8分8秒并打印出来。
 * @author obj
 *
 */
public class Test02 {
	public static void main(String[] args) {
		SimpleDateFormat sdf 
		= new SimpleDateFormat("yyyy-MM-dd 08:08:08");
		System.out.println("当前时间:" + sdf.format(new Date()));
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 8);
		cal.set(Calendar.MINUTE, 8);
		cal.set(Calendar.SECOND, 8);
		System.out.println("当前时间:" + sdf.format(cal.getTime()));
	}
}
