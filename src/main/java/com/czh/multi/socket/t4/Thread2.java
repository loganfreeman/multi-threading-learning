package com.czh.multi.socket.t4;

public class Thread2 extends Thread {
	private Object lock;

	public Thread2(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.synNotifyMethod(lock);
	}
}
