package com.czh.multi.volatile1.t9;

public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.runMethod();
	}

}
