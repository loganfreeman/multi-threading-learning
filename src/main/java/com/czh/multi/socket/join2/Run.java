package com.czh.multi.socket.join2;

public class Run {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
			b.join(2000);
			System.out.println("	main	结束	" + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
