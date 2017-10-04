package com.czh.multi.volatile1.t5;

public class MyThread extends Thread {
	volatile static int count;

	// 注意，一定要添加static关键字
	// 这样synchronized与static锁的内容就是MyThread.class类
	// 也就达到了同步的效果
	synchronized private static void addCount() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count =" + count);
	}

	@Override
	public void run() {
		addCount();
	}

}
