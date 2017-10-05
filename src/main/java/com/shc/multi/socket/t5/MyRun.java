package com.shc.multi.socket.t5;

import org.junit.Test;

public class MyRun {
	private String lock = new String("");
	private Runnable runnableA = new Runnable() {

		public void run() {
			try {
				synchronized (lock) {
					System.out.println("begin wait");
					lock.wait();
					System.out.println("end wait");
				}
			} catch (Exception e) {

			}
		}
	};

	private Runnable runnableB = new Runnable() {

		public void run() {
			try {
				synchronized (lock) {
					System.out.println("notify wait");
					lock.notify();
					System.out.println("notify end");
				}
			} catch (Exception e) {

			}
		}
	};

	@Test
	public void test1(){
		MyRun run = new MyRun();
		Thread a = new Thread(run.runnableA);
		a.start();
		Thread b = new Thread(run.runnableB);
		b.start();
	}
}
