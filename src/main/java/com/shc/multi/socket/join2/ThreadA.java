package com.shc.multi.socket.join2;

public class ThreadA extends Thread {
	private ThreadB threadB;

	public ThreadA(ThreadB threadB) {
		this.threadB = threadB;
	}

	@Override
	public void run() {
		try {
			synchronized (threadB) {
				System.out.println("开始	A	ThreadName="
						+ Thread.currentThread().getName() + "	"
						+ System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println("结束	A	ThreadName="
						+ Thread.currentThread().getName() + "	"
						+ System.currentTimeMillis());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
