package com.shc.multi.concurrent.t3;

public class ThreadA extends Thread {

	private HasSelfPrivateNum has;

	public ThreadA(HasSelfPrivateNum has) {
		this.has = has;
	}

	@Override
	public void run() {
		has.add("a");
	}

}
