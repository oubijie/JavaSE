package com.veryoo.op;

/**
 * 逻辑运算符演示
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test05 {

	public static void main(String[] args) {

		// System.out.println(true & true);
		// System.out.println(true & false);
		// System.out.println(false & true);
		// System.out.println(false & false);
		//
		// System.out.println(true | true);
		// System.out.println(true | false);
		// System.out.println(false | true);
		// System.out.println(false | false);

		// System.out.println(true ^ true);
		// System.out.println(true ^ false);
		// System.out.println(false ^ true);
		// System.out.println(false ^ false);

		//
		// System.out.println(!true);
		// System.out.println(!false);

		// System.out.println(true && true);
		// System.out.println(true && false);
		// System.out.println(false && true);
		// System.out.println(false && false);

		// System.out.println(true || true);
		// System.out.println(true || false);
		// System.out.println(false || true);
		// System.out.println(false || false);

		// int a = 1;
		// if(true && (a++ == 2)){ //右边的表达式可能被短路不执行
		//
		// }
		// System.out.println(a);

		// if(false || (a++ == 2)){
		//
		// }
		// System.out.println(a);

		boolean a = true;
		boolean b = false;
		System.out.println("a||b=" + (a || !b));

		System.out.println(b);

		System.out.println("a|b=" + (a | b));
		System.out.println("a&&b=" + (a && !b));
		System.out.println(b);

		System.out.println("a&b=" + (a & b));

	}
}
