package com.veryoo.string;

import java.util.Scanner;


/**
 * PPT练习一
 * 输入一行字符（用Scanner的nextLine()），
 * 分别统计出其中的大写英文字母、小写英文字母和其他非英文字母的个数。
 * @author obj
 *
 */
public class Test03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一串字符：");
		String s = scanner.nextLine();
		int lc = 0;
		int uc = 0;
		int oc = 0;
		
//		for(int i=0; i<s.length(); i++){
//			char c = s.charAt(i);
////			System.out.println(c);
//			if(c >= 'a' && c<='z'){
//				lc++;
//			}else if(c >= 'A' && c<='Z'){
//				uc++;
//			}else{
//				oc++;
//			}
//		}
		
		String lowString = "abcdefghijklmnopqrstuvwxyz";
		String upString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(lowString.indexOf(c) != -1){
				lc++;
			}else if(upString.indexOf(c) != -1){
				uc++;
			}else{
				oc++;
			}
		}
		
		
		System.out.println("小写："+ lc 
				+ " 大写：" + uc 
				+ " 其他：" + oc);
		
	}
}