package com.czh.multi.concurrent.synLock2;

public class Run {

	public static void main(String[] args) {
		MyThread m = new MyThread();
		m.start();
	}
}
