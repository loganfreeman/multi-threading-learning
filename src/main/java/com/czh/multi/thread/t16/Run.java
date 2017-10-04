package com.czh.multi.thread.t16;

public class Run {

	public static void main(String[] args) {
		System.out.println("main begin priority ="
				+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println("main end priority ="
				+ Thread.currentThread().getPriority());
		MyThreadA m = new MyThreadA();
		m.start();
	}
}
