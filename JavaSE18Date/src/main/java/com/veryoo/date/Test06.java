package com.veryoo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 课后作业一
 * 计算劳动合同的续签日     
要求： DateUtil 类   Date getSignDate(Date date,int i)  
	1) 输入: 劳动合同的签订日期和签订年限   
	2) 返回: 劳动合同的续签日   
    3) 规则: 劳动合同的到期日的前一个月,  如果周末顺延到周一
 * @author ZHQL
 */
public class Test06 {

	public static void main(String[] args) throws ParseException {
		Scanner s = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("请输入签约日期(如:2016-09-09):");
		String date = s.next();
		System.out.println("请输入签约年限:");
		int year = s.nextInt();
		Date signDate = 
			DateUtil.getSignDate(sdf.parse(date), year);
		System.out.println("续签日期:" + sdf.format(signDate));
	}
}
