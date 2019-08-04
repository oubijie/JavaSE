package com.veryoo.reflection;


/**
 * 获取字节码对象的几种方式
 * @author obj
 *
 */
public class Test02 {

	public static void main(String[] args) throws Exception {
		
		//方式一，类的class属性
		Class<String> sc = String.class;
		
		//方式二，对象的getClass方法
		String s = new String();
		Class<?> sc1 = s.getClass();
		
		//方式三，Class.forName
		Class<?> sc2 = Class.forName("java.lang.String");
		
		System.out.println(sc);
		System.out.println(sc1);
		System.out.println(sc2);
		
//		new Class();    //私有构造器
		
		System.out.println(sc == sc1);
		System.out.println(sc2 == sc1);
		System.out.println(sc == sc2);
		
	}
}
