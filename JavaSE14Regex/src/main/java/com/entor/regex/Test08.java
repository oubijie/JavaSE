package com.entor.regex;

/**
 * PPT练习二
 * 输入一个字符串，统计其中纯字母串，纯数字串和其他串的个数
 * @author obj
 *
 */
public class Test08 {

	public static void main(String[] args) {
		String string = "aaa 888 a88 a uus88,ss";
		String a[] = string.split("( |,)"); // [ ,]
		
		int wc = 0;
		int dc = 0;
		int oc = 0;
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
			if(a[i].matches("[a-zA-Z]+")){
				wc++;
			}else if(a[i].matches("\\d+")){
				dc++;
			}else{
				oc++;
			}
		}
		
		System.out.println(wc + "-" + dc + "-" + oc);
	}
}
