package com.veryoo.reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 反射获取类中的方法
 * @author obj
 *
 */
public class Test05 {

	public static void main(String[] args) throws Exception {
		Class clz = User.class;
		
		//获取类中所有public方法，包括继承和接口的
		Method[] ms = clz.getMethods();
		for(Method m : ms){
			System.out.println(m);
		}
		
		System.out.println("========================");
		//获取类中所有方法，与访问修饰符无关，不包括继承和接口的方法
		ms = clz.getDeclaredMethods();
		for(Method m : ms){
			System.out.println(m);
		}
	
		
		System.out.println("========================");
		//获取某一个方法
		Method m = clz.getMethod("dowork", String.class);
		System.out.println(m);
		m.invoke(null, "abc");
	
		System.out.println("========================");
		//调用
		m = clz.getMethod("dowork");
		m.invoke(clz.newInstance());
		
		
		//私有成员先setAccess
		
		
	}
}
