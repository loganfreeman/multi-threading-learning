package com.czh.multi.concurrent.synLock2;

/**
 * 可重入锁也支持在父子类中继承
 * 
 * @author czh
 * @crete_time 2016年3月7日 上午11:45:11
 * @version 1.0
 * 
 */
public class Main {
	public int i = 10;

	synchronized public void operateMainThread() {
		try {
			i--;
			System.out.println("main print i=" + i);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
