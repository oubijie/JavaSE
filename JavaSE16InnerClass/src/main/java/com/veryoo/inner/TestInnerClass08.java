package com.veryoo.inner;


/**
 * 匿名内部类 Thread
 * @author obj
 *
 */
 
public class TestInnerClass08 {
    public static void main(String[] args) {
        Thread t = new Thread(){
        	public void run(){
        		for(int i=0; i<10; i++){
        			System.out.println(i);
        		}
        		
        	}
        };
        
        t.start();
    }
}