package com.veryoo.math;


/**
 * Enum类型1
 * @author obj
 *
 */
public class Test03 {
	

	public static void main(String[] args) {
		go(1);
	}
	
	public static void go(int i){
		switch (i) {
		case 0:
			System.out.println("站着不动");
			break;
		case 1:
			System.out.println("向上走");
			break;
		case 2:
			System.out.println("向下走");
			break;
		case 3:
			System.out.println("向左走");
			break;
		case 4:
			System.out.println("向右走");
			break;
		default:
			System.out.println("错误");
			break;
		}
	}
	
	//用类的静态变量改写
}
