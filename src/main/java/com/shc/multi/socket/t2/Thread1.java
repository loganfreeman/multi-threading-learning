package com.shc.multi.socket.t2;

public class Thread1 extends Thread {
	private Object lock;

	public Thread1(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				System.out.println("开始wait--" + System.currentTimeMillis());
				//等待
				lock.wait();
				System.out.println("结束wait--" + System.currentTimeMillis());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
