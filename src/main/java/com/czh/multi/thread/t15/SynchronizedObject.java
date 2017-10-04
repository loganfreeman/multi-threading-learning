package com.czh.multi.thread.t15;

/**
 * 这个容易形成独占锁
 * 
 * @author czh
 * @crete_time 2016年3月3日 下午7:19:09
 * @version 1.0
 * 
 */
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
