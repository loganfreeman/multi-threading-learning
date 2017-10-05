package com.shc.multi.concurrent.t1;

public class ThreadB extends Thread {
	private HasSelfPrivateNum has;

	public ThreadB(HasSelfPrivateNum has) {
		this.has = has;
	}

	@Override
	public void run() {
		has.add("b");
	}

}
