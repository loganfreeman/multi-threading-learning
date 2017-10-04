package com.czh.multi.socket.t6;

public class Sub {
	private String lock;

	public Sub(String lock) {
		this.lock = lock;
	}

	public void sub() {
		try {
			synchronized (lock) {
				while (ValueObject.list.size() == 0) {
					System.out.println("wait 开始 线程名称:"
							+ Thread.currentThread().getName() + "--"
							+ System.currentTimeMillis());
					lock.wait();
					System.out.println("wait 结束 线程名称:"
							+ Thread.currentThread().getName() + "--"
							+ System.currentTimeMillis());
				}
				ValueObject.list.remove(0);
				System.out.println("list的大小为" + ValueObject.list.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
