package com.veryoo.control.if1;


/**
 * IF条件语句演示
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test01 {

	public static void main(String[] args) {
		int a = 0;

		// if(a == 0){
		// System.out.println("a is 0");
		// }else if(a == 1){
		// System.out.println("a is 1");
		// }else if(a == 2){
		// System.out.println("a is 2");
		// }else{
		// System.out.println("unknown");
		// System.out.println(a);
		// }

		if (a > 0) {
			if (a > 1) {
				System.out.println("a>1");
			}
		} else {
			System.out.println("a<=0");
		}

		
		int errorTimes = 4;
		if(errorTimes > 3){
			System.out.println("你已输入错误密码3次");
		}
		
		
		String name = "test";
		String passwd = "123";
		
		if("test".equals(name) && "123".equals(passwd)){
			System.out.println("登录成功");
		}else{
			System.out.println("用户名密码不正常");
		}
		
		
		
		char c = 'C';
		if(c == 'A'){
			System.out.println("用户选了A");
		}else if(c == 'B'){
			System.out.println("用户选了B");
		}else if(c == 'C'){
			System.out.println("用户选了C");
		}else{
			System.out.println("用户选了D");
		}
		
		
		int j = 10; 
		if(j<10){
			System.out.println("一位");
		}else if(j<100){
			System.out.println("两位");
		}else{
			System.out.println("三位");
		}
		
		
		if(j>=100){
			System.out.println("三位");
		}else if(j>=10){  //j>9
			System.out.println("两位");
		}else{
			System.out.println("一位");
		}
		
		
		
		
		int k = 999;
		
		if(k>500){
			if(k%2 == 0){
				System.out.println("大于500的偶数");
			}else{
				System.out.println("大于500的奇数");
			}
		}else if(k < 500){
			if(k%5 == 0){
				System.out.println("小于500的5的倍数");
			}else{
				System.out.println("小于500的数");
			}
		}
		
		
		if(k>500 && k%2==0){
			System.out.println("大于500的偶数");
		}else if(k>500 && k%2!=0){
			System.out.println("大于500的奇数");
		}else if(k<500 && k%5==0){
			System.out.println("小于500的5的倍数");
		}else if(k<500 && k%5!=0){
			System.out.println("小于500的数");
		}
		
	}
}
