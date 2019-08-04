package com.veryoo.regex;
/**
 * 5、正则表达式练习:
 A、QQ邮箱,以com或cn结尾  
 B、10000以内的数字，有两位小数；
 C、多项选择题答案(ABCD)
 D、一个小写字母串
 E、两位数中的偶数
 * @author ZHQL
 */
public class Test01 {

	public static void main(String[] args) {
		String regex01 = "\\d{1,10}@qq\\.(com|cn)";
		System.out.println("123456@qq.com".matches(regex01));
		String regex02 = "(0|[1-9]\\d{0,3})\\.\\d{2}";
		System.out.println("1200.00".matches(regex02));
		String regex03 = "[ABCD]{1,4}";
		System.out.println("AED".matches(regex03));
		String regex04 = "[a-z]+";
		System.out.println("werrr".matches(regex04));
		String regex05 = "[1-9][02468]";
		System.out.println("90".matches(regex05));	
	}

}












