package com.shc.multi.concurrent.synLock2;

public class Main {
	public int i = 10;

	synchronized public void operateMainThread() {
		try {
			i--;
			System.out.println("main print i=" + i);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
