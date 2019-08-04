package com.veryoo.thread;


/**
 * ��ϰ��
 * @author Administrator
 *
 */
public class Test06 {

	public static void main(String[] args) {
		Cooker c1 = new Cooker("�����");
		Cooker c2 = new Cooker("�л�С����");
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		//���ȼ� ������ȼ�10��������ȼ�1
//		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(2);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
//		System.out.println("�Ƿ�" + t1.isAlive());
		t1.start();
		t2.start();
		
//		System.out.println("�Ƿ�" + t1.isAlive());
//		
//		System.out.println("�Ƿ��ж�" + t1.isInterrupted());
		t1.interrupt();
//		System.out.println("�Ƿ��ж�" + t1.isInterrupted());
		
	}
}









