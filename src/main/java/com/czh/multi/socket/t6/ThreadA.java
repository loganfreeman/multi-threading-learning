package com.czh.multi.socket.t6;

public class ThreadA extends Thread {
	private Add add;

	public ThreadA(Add add) {
		this.add = add;
	}

	@Override
	public void run() {
		add.add();
	}

}
