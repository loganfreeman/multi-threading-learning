package com.shc.multi.socket.t7;

public class C {
	private String lock;

	public C(String lock) {
		this.lock = lock;
	}

	public void getValue() {
		try {
			synchronized (lock) {
				if ("".equals(ValueObject.value)) {
					lock.wait();
				}
				System.out.println("get的值是:" + ValueObject.value);
				ValueObject.value = "";
				lock.notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
