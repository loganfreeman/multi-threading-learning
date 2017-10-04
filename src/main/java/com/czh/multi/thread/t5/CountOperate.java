package com.czh.multi.thread.t5;

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
