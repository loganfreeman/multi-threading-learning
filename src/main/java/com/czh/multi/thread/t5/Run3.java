package com.czh.multi.thread.t5;

public class Run3 {
	public static void main(String[] args) {
		CountOperate cu = new CountOperate();
		cu.setName("A");
		cu.start();
		Thread t1 = new Thread(cu);
		t1.setName("B");
		t1.start();
	}
}
