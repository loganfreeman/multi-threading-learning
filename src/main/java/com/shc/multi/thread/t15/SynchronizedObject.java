package com.shc.multi.thread.t15;

public class SynchronizedObject {

	synchronized public void printString() {
		System.out.println("Begin");
		if ("a".equals(Thread.currentThread().getName())) {
			System.out.println("a 线程永远  suspend 了");
			// 这个会形成独占锁
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}

}
