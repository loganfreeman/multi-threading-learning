package com.shc.multi.socket.join1;

public class ThreadC extends Thread {

	private ThreadB b;

	public ThreadC(ThreadB b) {
		this.b = b;
	}

	@Override
	public void run() {
		b.interrupt();
	}

}
