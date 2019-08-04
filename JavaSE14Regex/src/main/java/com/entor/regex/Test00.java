package com.entor.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 正则表达式演示
 * @author obj
 *
 */
public class Test00 {

	public static void main(String[] args) {
//		System.out.println("abc".matches(".."));
//		System.out.println("dd88jkd152".replaceAll("\\d", "*"));
//		
//		Pattern p = Pattern.compile("\\d");
//		Matcher m = p.matcher("88");
//		System.out.println(m.matches());
		
		// .
//		System.out.println("aa".matches(".."));
//		System.out.println(".".matches("."));
//		System.out.println("中文".matches(".."));
		
		// * + ? {}
//		System.out.println("aaaasdfsds".matches(".*"));
//		System.out.println("".matches(".*"));
//		
//		System.out.println("aaaasdfsdsdfsdf".matches(".+"));
//		System.out.println("".matches(".+"));
//		System.out.println("x".matches(".+"));
		
//		System.out.println("aaaasdfsdsdfsdf".matches(".?"));
//		System.out.println("".matches(".?"));
//		System.out.println("x".matches(".?"));
		
//		System.out.println("abc".matches(".{3}"));
//		System.out.println("abc".matches(".{4}"));
//		
//		System.out.println("abc".matches(".{2,}"));
//		System.out.println("abc".matches(".{4,}"));
//		
//		System.out.println("abc".matches(".{2,100}"));
//		System.out.println("abc".matches(".{4,5}"));
		
		
		// []
//		System.out.println("3".matches("[abc]"));
//		System.out.println("aa".matches("[abc]*"));
//		
//		System.out.println("3".matches("[^abc]"));
//		System.out.println("g".matches("[a-z]"));
//		System.out.println("D".matches("[a-zA-Z]"));
		
		
		// \d \s \w
//		System.out.println("555".matches("\\d+"));
//		System.out.println("\t ".matches("\\s{2}"));
//		System.out.println("kskskj_j999".matches("\\w*"));
//		System.out.println("aa5888".matches("\\w{3}\\d{3}"));
		
		// ^ $ \b
//		System.out.println("hello java".matches("^h.+"));
//		System.out.println("hello java".matches(".+java$"));
//		System.out.println("hello,java".matches("\\w+\\b.+"));
//		System.out.println("hello,java".matches("\\w+\\b\\w+"));  //遗留问题
		
		// \. \\
//		System.out.println(".".matches("\\."));
//		System.out.println("\\".matches("\\\\"));
		
		// | ()
//		System.out.println("a".matches("a|b|c"));
//		System.out.println("2000".matches("200|100"));
//		System.out.println("192.168".matches("\\d{1,3}\\.\\d{1,3}(\\.\\d{1,3}\\.\\d{1,3})*"));
		
//		
//		System.out.println("510000".matches("[0-9]{6}"));
//		System.out.println("510000".matches("\\d{6}"));
//		
//		//192.168.1.1
//		System.out.println("192.168.1.1".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
//		
//		//2017-11-3
//		System.out.println("2017-11-3".matches("\\d{4}-\\d{1,2}-\\d{1,2}"));
//		System.out.println("2017-51-3".matches("\\d{4}-1?\\d{1}-\\d{1,2}"));
//		System.out.println("2017-17-3".matches("\\d{4}-1?\\d{1}-\\d{1,2}"));
//
//		//姓名
//		System.out.println("欧必杰".matches("[\u4e00-\u9fa5]{2,5}"));
		
		//邮箱
//		System.out.println("a-bc_dd99@qq.com".matches("[\\w-]+@[\\w-]+\\.com"));
//		System.out.println("aa@aa.cnxxxx".matches("[\\w-]+@[\\w-]+\\.[a-zA-Z]+"));
//		System.out.println("aa@aa.com.cn".matches("[\\w-]+@[\\w-]+\\.[a-zA-Z]+\\.[a-zA-Z]+"));
//		System.out.println("aa@aa.com.xxx".matches("[\\w-]+@[\\w-]+\\.[a-zA-Z]+(\\.[a-zA-Z]+)?"));

		//正则PPT 练习一
//		String reg = "\\d{1,4}(\\.\\d{2})?";
//		String reg = "(10000|[0-9]{1,4})(\\.\\d{2})?";
//		System.out.println("9999.99".matches(reg));
//		System.out.println("18".matches(reg));
//		System.out.println("673.39".matches(reg));
//		System.out.println("0.33".matches(reg));
//		System.out.println("10000".matches(reg));
		
		//查找
//		Pattern p = Pattern.compile("\\d{3,5}");
//		String string = "123-45678-900-00";
//		Matcher m = p.matcher(string);
//		System.out.println(m.find());
//		System.out.println(m.start()+"-"+m.end());
//		System.out.println(m.find());
//		System.out.println(m.start()+"-"+m.end());
//		System.out.println(m.find());
//		System.out.println(m.start()+"-"+m.end());
//		System.out.println(m.find());
//		System.out.println(m.start()+"-"+m.end());
		
		
		//替换
//		Pattern p = Pattern.compile("[jJ][aA][vV][aA]");
//		String s = "hello java oralce Java thinking JAva";
//		Matcher m = p.matcher(s);
//		System.out.println(m.replaceAll("JAVA"));
		
//		String s = "hello java oralce Java thinking JAva"
//				.replaceAll("[jJ][aA][vV][aA]", "JAVA");
//		System.out.println(s);
		
		
		//group
//		Pattern p = Pattern.compile("\\w{2}\\d{3}");
//		String string = "aa123-bb45678-c900-00";
//		Matcher m = p.matcher(string);
//		while(m.find()){
//			System.out.println(m.group());
//		}
		
//		Pattern p = Pattern.compile("(\\w{2})(\\d{3})");
//		String string = "aa123-bb45678-c900-00";
//		Matcher m = p.matcher(string);
//		while(m.find()){
//			System.out.println(m.group(0));
//			System.out.println(m.group(1));
//			System.out.println(m.group(2));
//		}
		
		
		//String对正则的支持
		String s = "1,2,3;4;85;88";
		String a[] = s.split("[,;]");
		
		for(int i=0; i<a.length; i++)
		System.out.println(a[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
