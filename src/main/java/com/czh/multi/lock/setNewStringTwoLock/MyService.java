package com.czh.multi.lock.setNewStringTwoLock;

public class MyService {
	private String lock = "123";

	public void testMethod() {
		try {
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName() + "开始----"
						+ System.currentTimeMillis());
				lock = "456";
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + "结束----"
						+ System.currentTimeMillis());
			}
		} catch (Exception e) {

		}
	}
}
