package com.shc.multi.socket.t6;

public class ThreadB extends Thread {
	private Sub sub;

	public ThreadB(Sub sub) {
		this.sub = sub;
	}

	@Override
	public void run() {
		sub.sub();
	}
}
