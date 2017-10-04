package com.czh.multi.thread.t8;

public class Run3 {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();
		System.out.println("是否停止1==" + thread.isInterrupted());
		System.out.println("是否停止2==" + thread.isInterrupted());
	}
}
