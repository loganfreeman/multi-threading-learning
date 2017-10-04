package com.czh.multi.socket.t2;

public class MyTest {
	public static void main(String[] args) {
		try {
			Object obj = new Object();
			Thread1 t1 = new Thread1(obj);
			t1.start();
			Thread2 t2 = new Thread2(obj);
			t2.start();
		} catch (Exception e) {

		}
	}
}
