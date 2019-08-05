package com.veryoo.op;


/**
 * 让用户输入一个整数代表多少秒，将秒的时间转换成 “xx小时xx分钟xx秒”
 * 输入3910，输出“1小时5分钟10秒”
 * @author obj
 * @email oubijie@139.com
 * @vserion 2019年8月5日
 *
 */
public class Test14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.println("请输入时间秒：");
		int second = sc.nextInt();
		
		int h = second / 60 / 60;
		int m = second % 3600 / 60;
		int s = second % 60;
		
		System.out.println(h+"小时"+ m +"分钟"+ s +"秒");
	}
}
