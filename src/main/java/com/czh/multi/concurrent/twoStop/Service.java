package com.czh.multi.concurrent.twoStop;

public class Service {
	/**
	 * 以下情况会出现死锁的情况
	 */
	/*
	 * synchronized public void methodA() { System.out.println("方法A  开始");
	 * boolean isContinueRun = true; while (isContinueRun) { }
	 * System.out.println("方法A  结束"); }
	 * 
	 * synchronized public void methodB() { System.out.println("方法B  开始");
	 * System.out.println("方法B  结束"); }
	 */

	/**
	 * 如何解决死锁呢，使用synchronized同步块
	 */

	Object ob1 = new Object();

	public void methodA() {
		synchronized (ob1) {
			System.out.println("方法A  开始");
			boolean isContinueRun = true;
			while (isContinueRun) {
			}
			System.out.println("方法A  结束");
		}
	}

	Object ob2 = new Object();

	public void methodB() {
		synchronized (ob2) {
			System.out.println("方法B  开始");
			System.out.println("方法B  结束");
		}
	}

}
