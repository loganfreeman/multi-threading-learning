package com.czh.multi.socket.join1;

public class ThreadB extends Thread {

	@Override
	public void run() {
		try {
			ThreadA t = new ThreadA();
			t.start();
			t.join();
			System.out.println("在线程B结束后打印");
		} catch (Exception e) {
			System.out.println("在线程B出现异常");
			e.printStackTrace();
		}
	}
}
