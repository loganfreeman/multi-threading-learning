package com.czh.multi.concurrent.t12;

public class ThreadB extends Thread {
	@Override
	public void run() {
		Service.printB();
	}

}
