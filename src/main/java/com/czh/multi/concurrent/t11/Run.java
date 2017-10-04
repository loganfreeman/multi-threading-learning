package com.czh.multi.concurrent.t11;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyOneList list = new MyOneList();
		ThreadA a = new ThreadA(list);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(list);
		b.setName("B");
		b.start();
		Thread.sleep(6000);
		System.out.println("list的大小为:" + list.getSize());
	}
}
