package com.shc.multi.socket.join;

public class Run {
	public static void main(String[] args) {
		// 创建线程
		MyThread thread = new MyThread();
		thread.start();
		System.out.println("想当上面都执行了再进行执行");
		System.out.println("但是目前做不了");
	}
}
