package com.shc.multi.thread.t7;

public class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50000; i++) {
			System.out.println("i=" + (i + 1));
		}
	}

}
