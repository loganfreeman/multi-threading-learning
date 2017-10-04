package com.czh.multi.thread.t16;

public class MyThreadB extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread2 run priority  =" + this.getPriority());
	}

}
