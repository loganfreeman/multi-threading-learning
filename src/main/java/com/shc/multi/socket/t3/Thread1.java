package com.shc.multi.socket.t3;

public class Thread1 extends Thread {
	private Object lock;

	public Thread1(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}
