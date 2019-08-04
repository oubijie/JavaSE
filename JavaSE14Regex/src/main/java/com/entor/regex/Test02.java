package com.entor.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * java对正则表达式的支持
 * @author ZHQL
 */
public class Test02 {
	public static void main(String[] args) {
		String regex01 = "\\d{1,10}@qq\\.(com|cn)";
		Pattern p = Pattern.compile(regex01);//编译正则表达式
		Matcher m = p.matcher("23444@qq.com");//匹配
		System.out.println(m.matches());//返回是否匹配
	}
}
