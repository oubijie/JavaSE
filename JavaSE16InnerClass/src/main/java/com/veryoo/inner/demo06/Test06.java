package com.veryoo.inner.demo06;


/**
 * 匿名内部类实现抽象类
 * @author obj
 *
 */
public class Test06 {

	public static void main(String[] args) {
        Person p = new Person() {
            public void eat() {
                System.out.println("eat something");
            }
        };
        p.eat();
    }
}
