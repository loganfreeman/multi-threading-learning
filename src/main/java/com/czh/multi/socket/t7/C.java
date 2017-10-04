package com.czh.multi.socket.t7;

/**
 * 消费者
 * 
 * @author czh
 * @create_time 2016年7月11日 下午4:58:26
 * @version 1.0
 * 
 */
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
