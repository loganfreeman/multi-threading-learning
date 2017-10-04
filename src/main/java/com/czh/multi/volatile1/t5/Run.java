package com.czh.multi.volatile1.t5;

public class Run {
	public static void main(String[] args) {
		MyThread[] thread = new MyThread[100];
		for (int i = 0; i < 100; i++) {
			thread[i] = new MyThread();
		}

		for (int i = 0; i < 100; i++) {
			thread[i].start();
		}
	}
}
