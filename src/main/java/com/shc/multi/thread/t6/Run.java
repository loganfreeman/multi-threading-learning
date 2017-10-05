package com.shc.multi.thread.t6;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread m = new MyThread();
		System.out.println("begin===" + m.isAlive());
		m.start();
		Thread.sleep(1000);
		System.out.println("end===" + m.isAlive());
	}
}
