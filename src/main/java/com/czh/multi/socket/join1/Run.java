package com.czh.multi.socket.join1;

public class Run {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			b.start();
			Thread.sleep(2000);
			ThreadC c = new ThreadC(b);
			c.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
