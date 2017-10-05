package com.shc.multi.volatile1.t7;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {

	public static AtomicLong aiLong = new AtomicLong();

	synchronized public void addNum() {
		// 设置先加上100
		System.out.println("当前的线程名称为:" + Thread.currentThread().getName()
				+ "加了100之后的值是" + aiLong.addAndGet(100));
		// 后加上1
		aiLong.addAndGet(1);
	}
}
