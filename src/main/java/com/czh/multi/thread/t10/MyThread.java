package com.czh.multi.thread.t10;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("run  begin");
		try {
			Thread.sleep(5000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
