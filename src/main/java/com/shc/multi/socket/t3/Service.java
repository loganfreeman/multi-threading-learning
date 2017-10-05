package com.shc.multi.socket.t3;

public class Service {
	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait");
				//lock.wait();//执行完过后，自动释放锁
				Thread.sleep(10000);  //执行的时候不释放锁
				System.out.println("end wait");
			}
		} catch (Exception e) {

		}
	}
}
