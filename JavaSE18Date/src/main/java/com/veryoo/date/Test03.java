package com.veryoo.date;

import java.util.Calendar;
/**
 * 练习二
 * 用Calendar的get()方法获取每个字段的值，最后拼接成如下格式并打印
 * 2017年11月7日15点44分10秒 星期二
 * @author obj
 */
public class Test03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		String[] week ={"","星期日","星期一","星期二"
				          ,"星期三","星期四","星期五"
				          ,"星期六"};
		StringBuilder s1 = new StringBuilder("当前时间:");
		s1.append(c.get(Calendar.YEAR)).append("年");
		s1.append(c.get(Calendar.MONTH)+1).append("月");
		s1.append(c.get(Calendar.DATE)).append("日");
		s1.append(c.get(Calendar.HOUR_OF_DAY)).append("时");
		s1.append(c.get(Calendar.MINUTE)).append("分");
		s1.append(c.get(Calendar.SECOND)).append("秒 ");
		s1.append(week[c.get(Calendar.DAY_OF_WEEK)]);
		System.out.println(s1);
	}
}
