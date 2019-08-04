package com.veryoo.inner.demo07;


/**
 * 匿名内部类实现接口
 * @author obj
 *
 */
public class Test07 {

	public static void main(String[] args) {
        ICount c = new ICount(){
        	public int count(){
        		return 10;
        	}
        };
        
        System.out.println(c.count());
    }
}
