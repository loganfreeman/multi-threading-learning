package com.czh.multi.thread.t16;

/**
 * 优先级具有继承性
 * 
 * @author czh
 * @crete_time 2016年3月3日 下午9:06:48
 * @version 1.0
 * 
 */
public class MyThreadA extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread1 run priority  =" + this.getPriority());
		MyThreadB m = new MyThreadB();
		m.start();

	}

}
