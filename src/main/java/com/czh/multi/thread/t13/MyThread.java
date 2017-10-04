package com.czh.multi.thread.t13;

public class MyThread extends Thread {
	private SynchronizedObject object;

	public MyThread(SynchronizedObject object) {
		this.object = object;
	}

	@Override
	public void run() {
		object.printString("b", "bbbbb");
	}

}
