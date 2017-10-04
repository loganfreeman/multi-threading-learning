package com.czh.multi.thread.t5;

/**
 * 一个复杂的情况
 * 
 * @author czh
 * @crete_time 2016年3月2日 下午4:15:14
 * @version 1.0
 * 
 */
public class CountOperate extends Thread {
	public CountOperate() {
		System.out.println("CountOperate------开始");
		System.out.println("Thread.currentThread().getName="
				+ Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("CountOperate------结束");
	}

	@Override
	public void run() {
		System.out.println("run----------开始");
		System.out.println("Thread.currentThread().getName="
				+ Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("run----------结束");
	}
}
