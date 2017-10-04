package com.czh.multi.volatile1.t9;

public class ThreadA extends Thread {

	private Service service;

	public ThreadA(Service service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.runMethod();
	}

}
