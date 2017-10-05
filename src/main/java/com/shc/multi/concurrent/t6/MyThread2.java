package com.shc.multi.concurrent.t6;

public class MyThread2 extends Thread {
	private Task task;

	public MyThread2(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		CommonUtil.beginTime2 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtil.endTime2 = System.currentTimeMillis();
	}

}
