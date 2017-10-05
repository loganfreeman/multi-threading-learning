package com.shc.multi.volatile1.t7;

public class MyThread extends Thread {

	private MyService service;

	public MyThread(MyService service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.addNum();
	}

}
