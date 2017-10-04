package com.czh.multi.concurrent.throwExceptionNoLock;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA m1 = new ThreadA(service);
			m1.setName("a");
			m1.start();
			//Thread.sleep(500);
			ThreadB m2 = new ThreadB(service);
			m2.setName("b");
			m2.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
