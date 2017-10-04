package com.czh.multi.thread.t10;

/**
 * 在沉睡中停止
 * 
 * @author czh
 * @crete_time 2016年3月2日 下午9:19:25
 * @version 1.0
 * 
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("run  begin");
		try {
			Thread.sleep(5000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
