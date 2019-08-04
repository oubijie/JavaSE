package com.veryoo.stringbuilder;


/**
 * 用StringBuilder随机生成一个16位的密码，可以是大小写字母或数字。
 * @author obj
 */
import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		String a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		Random random = new Random();
		
//		for(int k=0; k<100; k++){
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<16; i++){
				int j = random.nextInt(a.length());
				sb.append(a.charAt(j));
			}
			System.out.println(sb);
//		}
	}
}
