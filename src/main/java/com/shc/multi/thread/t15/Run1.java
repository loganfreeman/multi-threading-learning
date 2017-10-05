package com.shc.multi.thread.t15;

public class Run1 {

	public static void main(String[] args) {
		try {
			MyThread1 thread = new MyThread1();
			thread.start();
			Thread.sleep(2000);
			thread.suspend();
			System.out.println("main end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
