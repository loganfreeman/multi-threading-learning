package com.shc.multi.thread.t12;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("进入catch方法");
			e.printStackTrace();
		}
	}

}
