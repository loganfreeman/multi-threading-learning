package com.czh.multi.socket.t7;

public class ThreadP extends Thread {
	private P p;

	public ThreadP(P p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.setValue();
		}
	}
}
