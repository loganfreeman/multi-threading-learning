package com.shc.multi.socket.t4;

public class Test {
	public static void main(String[] args) {
		Object lock = new Object();
		Thread1 t1 = new Thread1(lock);
		t1.start();
		Thread2 t2 = new Thread2(lock);
		t2.start();
		Thread2 t3 = new Thread2(lock);
		t3.start();
	}
}
