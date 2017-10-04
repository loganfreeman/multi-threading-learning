package com.czh.multi.socket.t7;

/**
 * 生产者
 * 
 * @author czh
 * @create_time 2016年7月11日 下午4:56:31
 * @version 1.0
 * 
 */
public class P {
	private String lock;

	public P(String lock) {
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				if (!"".equals(ValueObject.value)) {
					lock.wait();
				}
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				System.out.println("set的值是:" + value);
				ValueObject.value = value;
				lock.notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
