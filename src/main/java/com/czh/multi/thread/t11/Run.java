package com.czh.multi.thread.t11;

/**
 * 
 * @author czh
 * @crete_time 2016年3月3日 下午2:17:55
 * @version 1.0
 * 
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(100);
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
