package com.veryoo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test09 {

	public static void main(String[] args) {
//		String s = "第8章12节";
//		
//		Pattern p = Pattern.compile("\\d+");
//		Matcher m = p.matcher(s);
//		while(m.find()){
//			System.out.println(m.group());
//		}
		
		String s = "第8章12节";
		
		Pattern p = Pattern.compile("第(\\d+)章(\\d+)节");
		Matcher m = p.matcher(s);
		if(m.matches()){
			System.out.println(m.group(0));
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}
		
		
		
//		String html = "<a href=\"http://www.baidu.com/?s=abc&name=obj\" />";
//		Pattern p = Pattern.compile("http://[\\w\\.\\?&%-/=]+");
//		Matcher m = p.matcher(html);
//		while(m.find()){
//			System.out.println(m.group());
//		}
		
	}
}
