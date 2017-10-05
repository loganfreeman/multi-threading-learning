package com.shc.multi.concurrent.t12;

public class ThreadB extends Thread {
	@Override
	public void run() {
		Service.printB();
	}

}
