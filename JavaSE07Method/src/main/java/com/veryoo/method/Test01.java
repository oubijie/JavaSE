package com.veryoo.method;


/**
 * 引出方法
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test01 {

	public static void main(String[] args) {
		char[] c = {'a', 'v', 'y', 'u' , 'e', 'w', 'k', 'u' , 'e', 'w', 'k'};
		
		int u = count(c, 'u');
		int w = count(c, 'w');
		int k = count(c, 'k');
		int a = count(c, 'a');
		System.out.println(u);
		System.out.println(w);
		System.out.println(k);
		
	}
	
	
	public static int count(char[] c, char toFind){  //标识符的命名规则
		int count=0;
		for(int i=0; i<c.length; i++){
			if(c[i] == toFind){
				count++;
			}
		}
		return count;
	}
}
