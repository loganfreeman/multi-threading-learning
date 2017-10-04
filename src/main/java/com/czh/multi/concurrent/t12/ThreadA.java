package com.czh.multi.concurrent.t12;

public class ThreadA extends Thread {

	@Override
	public void run() {
		Service.printA();
	}
}
