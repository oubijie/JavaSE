package com.veryoo.stringbuilder;
/**
 * StringBuilder演示
 * @author obj
 */
public class Test01 {

	public static void main(String[] args) {
		String str = "abcdefhijk";
		
		//把字符串转换成StringBuilder
		StringBuilder sb = new StringBuilder(str);
		
		//字符串追加
		sb.append(100).append(true).append("12345");
		
		for(int i=0; i<100; i++){  //大量操作
			sb.append(i);
		}
		
		//删除子字符串
		sb.delete(1,4);
		
		//根据索引删除字符
		sb.deleteCharAt(2);
		
		//插入
		sb.insert(1, "$$$");
		
		//倒置
		sb.reverse();
		
		//把StringBuilder转换成字符串
		str = sb.toString();
		System.out.println(str);

	}

}
