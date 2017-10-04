package com.czh.multi.thread.t14;

/**
 * 使用suspend和resume 暂停线程和恢复线程
 * 
 * @author czh
 * @crete_time 2016年3月3日 下午4:14:14
 * @version 1.0
 * 
 */
public class MyThread extends Thread {

	private long i = 0;

	public long getI() {
		return i;
	}

	public void setI(long i) {
		this.i = i;
	}

	@Override
	public void run() {
		while (true) {
			i++;
		}
	}
}
