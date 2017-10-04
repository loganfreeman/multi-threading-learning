package com.czh.multi.concurrent.t12;

public class Run {
	public static void main(String[] args) {
		// 从运行的结果来看,和synchronized加在非static效果是一样的，但是本质上是不一样的
		// synchronized加载static上，是给Class进行加锁 而非static是对象锁
		ThreadA a = new ThreadA();
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB();
		b.setName("B");
		b.start();
	}
}
