package com.veryoo.string;


/**
 * PPT练习二
 * 输入一个字符串，对字符串进行去重复处理，最后打印字符串。
 * @author obj
 *
 */
public class Test04 {

	public static void main(String[] args) {
		String s = "abcddddkskk";
		String news = "";
		
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			String j = String.valueOf(c);
			if(!news.contains(j)){
				news += j;
			}
		}
		
		System.out.println(news);
	}
}
