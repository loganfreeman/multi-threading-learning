package com.czh.multi.concurrent.t2;

public class Run {

	public static void main(String[] args) {
		HasSelfPrivateNum has = new HasSelfPrivateNum();
		ThreadA m1 = new ThreadA(has);
		m1.start();
		ThreadB m2 = new ThreadB(has);
		m2.start();
	}
}
