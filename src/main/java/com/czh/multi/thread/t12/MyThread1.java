package com.czh.multi.thread.t12;

/**
 * stop()抛出异常
 * 
 * @author czh
 * @crete_time 2016年3月3日 下午2:50:45
 * @version 1.0
 * 
 */
public class MyThread1 extends Thread {

	@Override
	public void run() {
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("进入catch方法");
			e.printStackTrace();
		}
	}

}
