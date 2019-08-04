package com.veryoo.parameter;

import java.util.Arrays;

/**
 * 带参数的方法
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test01 {
	String[] stu = { "学生1", "学生2", "学生3", "学生4" };

	public void changeName(String oldName, String newName) {
		for (int i = 0; i < stu.length; i++) {
			if (stu[i].equals(oldName)) {
				stu[i] = newName;
				break;
			}
		}
		System.out.println(Arrays.toString(stu));
	}

	public static void main(String[] args) {
		Test01 t = new Test01();
		t.changeName("学生3", "张飞");

	}
}
