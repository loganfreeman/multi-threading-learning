package com.czh.multi.socket.join1;

public class ThreadA extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String str = new String();
			Math.random();
		}
	}
}
