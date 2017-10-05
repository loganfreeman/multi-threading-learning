package com.shc.multi.volatile1.t6;

public class Run {

	public static void main(String[] args) {
		AddCountThread service = new AddCountThread();
		Thread t1 = new Thread(service);
		t1.start();
		Thread t2 = new Thread(service);
		t2.start();
		Thread t3 = new Thread(service);
		t3.start();
		Thread t4 = new Thread(service);
		t4.start();
		Thread t5 = new Thread(service);
		t5.start();

	}
}
