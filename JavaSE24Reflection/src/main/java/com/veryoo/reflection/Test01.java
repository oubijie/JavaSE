package com.veryoo.reflection;

import java.util.Date;

/**
 * 引出反射
 * @author obj
 *
 */
public class Test01 {

	public static void main(String[] args) {
		Object obj = new Date();
		
		//要求调用toLocalString方法，此时可以强制转换
		Date d = (Date)obj;
		
		//如果不知道Object的真实类型
		
		System.out.println(obj.getClass());
	}
}
