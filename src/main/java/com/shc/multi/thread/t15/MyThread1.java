package com.shc.multi.thread.t15;

public class MyThread1 extends Thread {

	private long i = 0;

	@Override
	public void run() {
		while (true) {
			i++;
			System.out.println(i);
		}
	}

}
