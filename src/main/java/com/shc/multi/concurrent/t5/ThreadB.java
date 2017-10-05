package com.shc.multi.concurrent.t5;

public class ThreadB extends Thread {
	private MyObject object;

	public ThreadB(MyObject object) {
		this.object = object;
	}

	@Override
	public void run() {
		object.methodB();
	}

}
