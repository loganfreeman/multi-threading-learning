package com.czh.multi.concurrent.t3;

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
