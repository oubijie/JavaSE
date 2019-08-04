package com.veryoo.inner;


/**
 * 匿名内部类 Thread Runnable
 * @author obj
 *
 */
 
public class TestInnerClass09 {
    public static void main(String[] args) {
        Runnable r = new Runnable(){
        	public void run(){
        		for(int i=0; i<10; i++){
        			System.out.println(i);
        		}
        		
        	}
        };
        
        Thread t = new Thread(r);
        t.start();
    }
}