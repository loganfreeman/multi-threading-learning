package com.czh.multi.thread.t5;

/**
 * 
 * @author czh
 * @crete_time 2016年3月2日 下午3:53:26
 * @version 1.0
 * 
 */
public class MyThread extends Thread {
	public MyThread() {
		System.out.println("构造方法====" + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		System.out.println("run方法====" + Thread.currentThread().getName());
	}
}
