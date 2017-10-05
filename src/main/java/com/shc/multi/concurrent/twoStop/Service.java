package com.shc.multi.concurrent.twoStop;

public class Service {


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
