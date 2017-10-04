package com.czh.multi.thread.t10;

public class Run1 {
public static void main(String[] args) {
	MyThread1 thread = new MyThread1();
	thread.start();
	thread.interrupt();
}
}
