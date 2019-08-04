package com.veryoo.reflection;

import java.lang.reflect.Method;

public class Test06 {

	public static void main(String[] args) {
		Class clz = User.class;
		
		try {
			Method m = clz.getMethod("dowork", String.class);
			m.invoke(null, "aa");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
