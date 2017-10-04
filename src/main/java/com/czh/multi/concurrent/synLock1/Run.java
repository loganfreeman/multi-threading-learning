package com.czh.multi.concurrent.synLock1;

/**
 * 实现的是锁的重入
 * @author czh
 * @crete_time 2016年3月7日 上午11:41:46
 * @version 1.0
 *
 */
public class Run {
	public static void main(String[] args) {
		MyThread m = new MyThread();
		m.start();
	}
}
