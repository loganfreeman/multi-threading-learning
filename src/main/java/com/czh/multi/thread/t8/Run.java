package com.czh.multi.thread.t8;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();
		Thread.sleep(2000);
		thread.interrupt();
		System.out.println("是否停止1==" + thread.interrupted());
		System.out.println("是否停止2==" + thread.interrupted());
	}
}
