package com.shc.multi.volatile1.t3;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		RunThread thread = new RunThread();
		thread.start();
		Thread.sleep(1000);
		thread.setRunning(false);
		System.out.println("已经赋值为false");
	}
}
