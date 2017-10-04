package com.czh.multi.concurrent.t8;

public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.setUsernamePassWord("b", "b");
	}
}
