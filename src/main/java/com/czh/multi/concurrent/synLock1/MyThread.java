package com.czh.multi.concurrent.synLock1;

/**
 * 锁重入的功能
 * 
 * @author czh
 * @crete_time 2016年3月7日 上午11:37:52
 * @version 1.0
 * 
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		Service service = new Service();
		service.service1();
	}
}
