package com.shc.multi.concurrent.t12;

public class Test {
	public static void main(String[] args) {
		ServiceA service = new ServiceA();
		Thread1 a = new Thread1(service);
		a.setName("A");
		a.start();
		Thread2 b = new Thread2(service);
		b.setName("B");
		b.start();
		Thread3 c = new Thread3(service);
		c.setName("C");
		c.start();
	}
}
