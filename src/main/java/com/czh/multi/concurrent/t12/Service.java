package com.czh.multi.concurrent.t12;

/**
 * 讨论一下 静态同步synchronized方法与synchronized(this) 代码块
 * 
 * @author czh
 * @crete_time 2016年5月11日 下午1:59:24
 * @version 1.0
 * 
 */
public class Service {
	synchronized public static void printA() {
		try {
			System.out.println("线程名称:" + Thread.currentThread().getName() + "在"
					+ System.currentTimeMillis() + "进入printA");
			Thread.sleep(3000);
			System.out.println("线程名称:" + Thread.currentThread().getName() + "在"
					+ System.currentTimeMillis() + "离开printA");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized public static void printB() {
		System.out.println("线程名称:" + Thread.currentThread().getName() + "在"
				+ System.currentTimeMillis() + "进入printB");
		System.out.println("线程名称:" + Thread.currentThread().getName() + "在"
				+ System.currentTimeMillis() + "离开printB");
	}
}
