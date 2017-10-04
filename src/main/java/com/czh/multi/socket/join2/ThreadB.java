package com.czh.multi.socket.join2;

public class ThreadB extends Thread {
	@Override
	synchronized public void run() {
		try {
			System.out.println("开始	B	ThreadName="
					+ Thread.currentThread().getName() + "	"
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("结束	B	ThreadName="
					+ Thread.currentThread().getName() + "	"
					+ System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}