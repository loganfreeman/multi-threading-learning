package com.shc.multi.concurrent.synLock1;

public class Run {
	public static void main(String[] args) {
		MyThread m = new MyThread();
		m.start();
	}
}
