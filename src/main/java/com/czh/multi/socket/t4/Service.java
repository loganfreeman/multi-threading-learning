package com.czh.multi.socket.t4;

public class Service {

	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait()--"
						+ Thread.currentThread().getName());
				lock.wait();
				System.out.println("end wait()--"
						+ Thread.currentThread().getName());
			}
		} catch (Exception e) {

		}
	}

	public void synNotifyMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin notify()--"
						+ Thread.currentThread().getName() + "--"
						+ System.currentTimeMillis());
				lock.notify();
				Thread.sleep(5000);
				System.out.println("end notify()--"
						+ Thread.currentThread().getName() + "--"
						+ System.currentTimeMillis());
			}
		} catch (Exception e) {

		}
	}
}
