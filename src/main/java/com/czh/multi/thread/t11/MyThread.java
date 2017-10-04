package com.czh.multi.thread.t11;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Run-----begin");
			Thread.sleep(20000);
			System.out.println("End-----end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
