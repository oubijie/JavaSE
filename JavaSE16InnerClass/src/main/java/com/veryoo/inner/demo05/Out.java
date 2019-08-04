package com.veryoo.inner.demo05;


/**
 * 方法内部类（局部内部类）
 * @author obj
 *
 */
public class Out {

private int age = 12;
	
	public void showAgeOut(final String name){
		class In {
			public void showAge(){
				System.out.println(name);
				System.out.println(age);
			}
		}
		new In().showAge();
	}
}
