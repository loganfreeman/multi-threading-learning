package com.shc.multi.socket.t6;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");
		Add add = new Add(lock);
		Sub sub = new Sub(lock);
		ThreadB t_sub_1 = new ThreadB(sub);
		t_sub_1.setName("减法1");
		t_sub_1.start();
		ThreadB t_sub_2 = new ThreadB(sub);
		t_sub_2.setName("减法2");
		t_sub_2.start();
		Thread.sleep(4000);
		ThreadA t_add = new ThreadA(add);
		t_add.setName("加法1");
		t_add.start();
	}
}
