package com.veryoo.search;


/**
 * 普通遍历查找
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test01 {

	public static void main(String[] args) {
		char[] c = {'w', 'v', 'y', 'u' , 'e', 'w', 'k'};
		
		boolean flag = false;
		for(int i=0; i<c.length; i++){
			if(c[i] == 'w'){
				System.out.println("w的位置是" + i);
				flag = true;
				break;
			}
		}
		
		if(!flag){
			System.out.println("找不到");
		}
	}
}
