package com.czh.multi.concurrent.synLock2;

/**
 * 线程类
 * 
 * @author czh
 * @crete_time 2016年3月7日 下午2:35:28
 * @version 1.0
 * 
 */
public class MyThread extends Thread {
	@Override
	public void run() {
		Sub sub = new Sub();
		sub.operateSubMethod();
	}

}
