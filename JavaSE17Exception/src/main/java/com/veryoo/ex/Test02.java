package com.veryoo.ex;

/**
 * 多层方法调用时抛出异常，演示堆栈信息
 * @author obj
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Calc.cal2();
	}
}


class Calc {
	public static void cal2() {
		System.out.println(RealCalc.cal(100, 0));
	}
}

class RealCalc {
	public static int cal(int i, int j){
		return i/j;
	}
}