package com.czh.multi.socket.t3;

public class Test {
	public static void main(String[] args) {
		Object lock = new Object();
		Thread1 t1 = new Thread1(lock);
		Thread2 t2 = new Thread2(lock);
		t1.start();
		t2.start();
	}
}
