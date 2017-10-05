package com.shc.multi.concurrent.t9;

public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.setUnamPwd("b", "b");
	}
}
