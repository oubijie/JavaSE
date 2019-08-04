package com.veryoo.control.switch1;

/**
 * switch面试题
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test03 {

	public static void main(String[] s){
		System.out.println("value="+ switchIt (4));
		}

	public static int switchIt(int x) {
		int j = 1;
		switch (x) {
		case 1:
			j++;
		case 2:
			j++;
		case 3:
			j++;
		case 4:
			j++;
		case 5:
			j++;
		default: 
			j++;
		}
		return j + x;
	}
}
