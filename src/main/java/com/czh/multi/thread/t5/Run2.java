package com.czh.multi.thread.t5;

public class Run2 {
	public static void main(String[] args) {
		MyThread m = new MyThread();
		/**
		 * 构造方法====main run方法====Thread-0
		 */
		m.start();
		/**
		 * 构造方法====main run方法====main
		 */
		// m.run();
	}
}
