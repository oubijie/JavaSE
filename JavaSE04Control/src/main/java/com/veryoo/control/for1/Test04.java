package com.veryoo.control.for1;

/**
 * 输出1-100内前5个可以被7整除的数，如果尾数是5的，不计入
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test04 {

	public static void main(String[] args) {
		int count = 0;
		for(int i=1; i<100; i++){  //i=35
			if(i%7 == 0){
				if(i%10 == 5){
					continue;    //i++
				}
				System.out.println(i);
				count++;
				if(count == 5){
					break;
				}
			}
		}
	}
}
