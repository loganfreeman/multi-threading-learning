package com.czh.multi.concurrent.t8;

public class ThreadA extends Thread {

	private Service service;

	public ThreadA(Service service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.setUsernamePassWord("a", "a");
	}
}