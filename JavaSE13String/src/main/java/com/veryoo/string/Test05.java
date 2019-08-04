package com.veryoo.string;


/**
 * PPT练习三
 * 写一个方法来检查输入的字符串是否为回文（对称）？不区分大小写
 * 如ABCBA或ABDDBa 返回true
 * Abcc返回false
 * @author obj
 *
 */
public class Test05 {

	public static void main(String[] args) {
		String s = "ABDDBA";
		s = s.toLowerCase();
		
		int i = 0;
		int j = s.length()-1;
		
		boolean flag = true;
		while(true){
			char first = s.charAt(i);
			char end = s.charAt(j);
			if(first != end){
				flag = false;
				break;
			}else{
				i++;
				j--;
				if(i >= j){
					break;
				}
			}
		}
		
		System.out.println(flag);
		
	}
}
