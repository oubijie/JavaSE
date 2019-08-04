package com.veryoo.date;

import java.util.Calendar;
import java.util.Date;
/**
 * 时间工具类
 * @author ZHQL
 */
public class DateUtil {
	/**
	 * 计算续签约日期
	 * @param date 签约日期
	 * @param i 签约年限
	 * @return
	 */
	public static Date getSignDate(Date date,int i){
		Calendar c = Calendar.getInstance();
		c.setTime(date);//把签约日期转换成日历对象
		c.add(Calendar.YEAR, i);//后移i年
		c.add(Calendar.MONTH, -1);//前移一个月
		//获取星期几(数字)
		int week = c.get(Calendar.DAY_OF_WEEK);
		if(7==week){//如果是周六
			c.add(Calendar.DATE, 2);//后移2天
		}else if(1==week){//如果是周日
			c.add(Calendar.DATE, 1);//后移1天
		}
		return c.getTime();
	}
}
