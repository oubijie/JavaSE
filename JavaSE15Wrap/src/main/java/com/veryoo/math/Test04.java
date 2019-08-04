package com.veryoo.math;


/**
 * Enum类型2
 * @author obj
 *
 */
public class Test04 {

	public enum Direction {stop, up, down, left, right};
	
	public static void go(Direction d){
		switch (d) {
		case stop:
			System.out.println("站着不动");
			break;
		case up:
			System.out.println("向上走");
			break;
		case down:
			System.out.println("向下走");
			break;
		case left:
			System.out.println("向左走");
			break;
		case right:
			System.out.println("向右走");
			break;
		default:
			System.out.println("错误");
			break;
		}
	}
	
	public static void main(String[] args) {
//		go(1);
		go(Direction.stop);
	}
}
