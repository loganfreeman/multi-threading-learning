package com.shc.multi.concurrent.t3;

public class Run {

	public static void main(String[] args) {
		HasSelfPrivateNum has1 = new HasSelfPrivateNum();
		HasSelfPrivateNum has2 = new HasSelfPrivateNum();

		ThreadA m1 = new ThreadA(has1);
		m1.start();

		ThreadB m2 = new ThreadB(has2);

		m2.start();
	}
}
