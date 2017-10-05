package com.shc.multi.concurrent.syn_Out_asyn;

public class Run {

	public static void main(String[] args) {
		MyList mylist = new MyList();
		ThreadA a = new ThreadA(mylist);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(mylist);
		b.setName("B");
		b.start();
	}
}
