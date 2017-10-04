package com.czh.multi.thread.t11;

/**
 * 在沉睡中停止
 * 
 * @author czh
 * @crete_time 2016年3月3日 下午2:13:35
 * @version 1.0
 * 
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Run-----begin");
			Thread.sleep(20000);
			System.out.println("End-----end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
