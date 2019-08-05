package com.veryoo.array;

import java.util.Arrays;
import java.util.Random;

/**
 *  练习，查找字符在数组中的位置，找到就打印下标，找不到就打印-1
 * @author Administrator
 *
 */
public class Test11 {

	public static void main(String[] args) {
		char[ ] chs ={'统','计','一','个','字','符','在','字','符','串','中'};
		char key = '的';
		 
//		boolean flag = false;
		for(int i=0; i<chs.length; i++) {
			if(chs[i] == key) {
//				flag = true;
				System.out.println(i);
			}
		}
		
//		if(!flag) {
//			System.out.println(-1);
//		}
	}
}
