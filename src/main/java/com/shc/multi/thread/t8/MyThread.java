package com.shc.multi.thread.t8;

public class MyThread extends Thread {
	
	public MyThread(){
		Thread.currentThread().isAlive();
		this.isAlive();
	}
	@Override
	public void run() {
		for (int i = 0; i < 500000; i++) {
			System.out.println("i=" + (i + 1));
		}
	}
}
