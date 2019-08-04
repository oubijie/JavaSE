package com.veryoo.reflection;

import java.lang.reflect.Constructor;

/**
 * 通过反射获取构造器
 * @author obj
 *
 */
public class Test04 {

	public static void main(String[] args) throws Exception {
		Class<?> dc = Class.forName("com.entor.reflection.User");
//		Class<User> dc = User.class;
		
		//所有public构造器
		Constructor<?>[] carr = dc.getConstructors();
		for(Constructor<?> c : carr){
			System.out.println(c);
		}
		
		//所有构造器
		Constructor<?>[] dcarr = dc.getDeclaredConstructors();
		for(Constructor<?> c : dcarr){
			System.out.println(c);
		}
		
		//无参
		Constructor<?> wc = dc.getConstructor();
		System.out.println(wc);
		
		//带String参数
		Constructor<?> sc = dc.getConstructor(String.class);
		System.out.println(sc);
		
		//两个参数，非public
		Constructor<?> sic = dc.getDeclaredConstructor(String.class, int.class);
		System.out.println(sic);
		
		
		//创建对象
		User u = (User)wc.newInstance();
		
		sic.newInstance("aa",89);
		sic.setAccessible(true);
		
		
		
	}
	
}


