package com.czh.multi.thread.t12;

/**
 * 暴力停止线程 stop()
 * 
 * @author czh
 * @crete_time 2016年3月3日 下午2:34:45
 * @version 1.0
 * 
 */
public class MyThread extends Thread {

	private int i = 0;

	@Override
	public void run() {
		try {
			while (true) {
				i++;
				System.out.println("i=" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
