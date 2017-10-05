package com.shc.multi.concurrent.t10;

public class Service {
	private String anyString = new String();

	public void a() {
		try {
			synchronized (anyString) {
				System.out.println("a 开始");
				Thread.sleep(3000);
				System.out.println("a 结束");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized public void b() {
		System.out.println("b 开始");
		System.out.println("b 结束");
	}
}
