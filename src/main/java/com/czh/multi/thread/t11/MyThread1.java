package com.czh.multi.thread.t11;

/**
 * 先停止 后睡眠
 * 
 * @author czh
 * @crete_time 2016年3月3日 下午2:25:42
 * @version 1.0
 * 
 */
public class MyThread1 extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 100000; i++) {
				System.out.println("i=" + (i + 1));
			}
			System.out.println("run begin");
			Thread.sleep(10000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("先停止  后睡眠！进入catch");
			e.printStackTrace();
		}
	}
}
