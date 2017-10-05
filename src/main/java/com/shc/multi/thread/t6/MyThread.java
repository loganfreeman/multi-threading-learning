package com.shc.multi.thread.t6;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("run=====" + this.isAlive());
	}
}
