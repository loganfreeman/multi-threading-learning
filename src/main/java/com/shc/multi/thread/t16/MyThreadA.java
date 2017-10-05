package com.shc.multi.thread.t16;

public class MyThreadA extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread1 run priority  =" + this.getPriority());
		MyThreadB m = new MyThreadB();
		m.start();

	}

}
