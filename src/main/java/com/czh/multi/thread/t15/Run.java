package com.czh.multi.thread.t15;

public class Run {

	public static void main(String[] args) {
		try {
			final SynchronizedObject object = new SynchronizedObject();
			Thread thread = new Thread() {
				@Override
				public void run() {
					object.printString();
				}
			};

			thread.setName("a");
			thread.start();
			Thread.sleep(1000);
			Thread thread1 = new Thread() {
				@Override
				public void run() {
					System.out
							.println("thread1 启动了，但是进不了printString()方法,只打印了一个begin");
					System.out.println("因为printString()方法被a线程锁定并且永远暂停了");
					object.printString();
				}
			};
			thread1.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
