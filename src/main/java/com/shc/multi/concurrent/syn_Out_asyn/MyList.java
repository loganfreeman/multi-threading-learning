package com.shc.multi.concurrent.syn_Out_asyn;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private List<String> list = new ArrayList<String>();

	synchronized public void add(String name) {
		System.out.println("线程名称:" + Thread.currentThread().getName()
				+ "执行了add方法!");
		list.add(name);
		System.out.println("线程名称:" + Thread.currentThread().getName()
				+ "退出了add方法!");
	}

	synchronized public int getSize() {
		System.out.println("线程名称:" + Thread.currentThread().getName()
				+ "执行了getSize方法!");
		int size = list.size();
		System.out.println("线程名称:" + Thread.currentThread().getName()
				+ "执行了getSize方法!");
		return size;
	}

}
