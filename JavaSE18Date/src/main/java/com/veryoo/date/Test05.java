package com.veryoo.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 练习四
 * 写一个方法getFirstDayOfMonth，接受一个String类型参数，格式如 2017-11-06，计算并打印出参数所表示月份的第一天日期
 * 再写一个方法getLastDayOfMonth，接受一个String类型参数，格式如 2017-11-06，计算并打印出参数所表示月份的最后一天日期
 * @author obj
 *
 */
public class Test05 {

	public static void main(String[] args) {
		getFirstDayOfMonth("2017-10-11");
		getLastDayOfMonth("2017-12-11");
	}
	
	public static void getFirstDayOfMonth(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try{
			d = sdf.parse(date);
			Calendar cal = Calendar.getInstance();
			cal.setTime(d);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			System.out.println(sdf.format(cal.getTime()));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
//		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-01");
//		System.out.println(sdf1.format(d));
	}
	
	//先取第一天 -> 月份+1 -> 天数 -1
	public static void getLastDayOfMonth(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try{
			d = sdf.parse(date);
			Calendar cal = Calendar.getInstance();
			cal.setTime(d);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			cal.add(Calendar.MONTH, 1);
			cal.add(Calendar.DAY_OF_MONTH, -1); 
			System.out.println(sdf.format(cal.getTime()));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
