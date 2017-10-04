package com.czh.multi.socket.join;

public class Thread1 extends Thread {

	@Override
	public void run() {
		try {
			int second = (int) (Math.random() * 1000);
			System.out.println("-----" + second);
			Thread.sleep(second);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
