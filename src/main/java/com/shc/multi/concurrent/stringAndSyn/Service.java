package com.shc.multi.concurrent.stringAndSyn;

public class Service {

	public static void print(String str) {
		try {
			synchronized (str) {
				while (true) {
					System.out.println("当前的线程名称为:"
							+ Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
