package com.czh.multi.socket.threadLocal;

public class Run {
	public static ThreadLocal<String> t = new ThreadLocal<String>();

	public static void main(String[] args) {
		if (t.get() == null) {
			System.out.println("从未放过值");
			t.set("我的值");
		}
		System.out.println(t.get());
		//System.out.println(t.get());
	}
}
