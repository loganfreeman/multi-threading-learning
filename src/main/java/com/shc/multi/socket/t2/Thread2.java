package com.shc.multi.socket.t2;

public class Thread2 extends Thread {

	private Object lock;

	public Thread2(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				System.out.println("开始notify--" + System.currentTimeMillis());
				//通知
				lock.notify();
				System.out.println("结束notify--" + System.currentTimeMillis());
			}
		} catch (Exception e) {

		}
	}
}
