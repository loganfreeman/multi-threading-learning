package com.shc.multi.thread.t5;

public class Run1 {
	public static void main(String[] args) {
		// 证明main方法是main线程调用
		System.out.println(Thread.currentThread().getName());
	}
}
