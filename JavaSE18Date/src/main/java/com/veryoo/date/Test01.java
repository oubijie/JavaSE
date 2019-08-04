package com.veryoo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * 时间日期类演示
 * long / date / calendar / String 间的转换演示
 * @author obj
 */
public class Test01 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();  //***

		System.out.println(new Date());  //*****
		// Mon Nov 06 15:30:52 CST 2017 //CST 中国标准时间 UTC GMT

		System.out.println(System.currentTimeMillis());
		// 1509953668693 //从1970-01-01 00:00:00开始，到当前表示时间所经历的毫秒数

		System.out.println(new Date(1509953668693L + 6 * 60 * 1000));
		// Mon Nov 06 15:34:28 CST 2017

		Date date = new Date();
		System.out.println(date.getYear()); // Deprecated 70+47=117

		// xxxx年xx月xx日 xx:xx:xx
		// xxxx-xx-xx xx:xx:xx
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");   //*****
		System.out.println(sdf.format(new Date()));

		// 2017-11-06 03:47:14
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //*****
		try {
			Date date2 = sdf1.parse("2017-11-06 03:47:14");
			System.out.println(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();

		System.out.println("总共运行毫秒数：" + (end - start));

		// Calendar
		Calendar rightNow = Calendar.getInstance();  //***
		System.out.println(rightNow);
		// java.util.GregorianCalendar[time=1509955695756,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=10,WEEK_OF_YEAR=45,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=310,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=8,SECOND=15,MILLISECOND=756,ZONE_OFFSET=28800000,DST_OFFSET=0]

		System.out.println(rightNow.get(Calendar.YEAR));
		System.out.println(rightNow.get(Calendar.MONTH)); // 特殊，从0开始
		System.out.println(rightNow.get(Calendar.DAY_OF_MONTH));
		System.out.println(rightNow.get(Calendar.HOUR_OF_DAY));
		System.out.println(rightNow.get(Calendar.MINUTE));

		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		System.out.println(rightNow.get(Calendar.HOUR_OF_DAY));

		// 格式转化
		// long -> Date
		long curt = System.currentTimeMillis();
		Date d1 = new Date(curt);

		// Date -> long
		curt = d1.getTime();

		// long -> Calendar
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(curt);

		// Calendar -> long
		cal.getTimeInMillis();

		// Calendar -> date
		cal.getTime();

		// date -> Calendar
		cal.setTime(d1);

		// String -> Date
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			Date date2 = sdf2.parse("2017-11-06 03:47:14");
			System.out.println(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Date -> String
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf3.format(new Date()));
	}

}
