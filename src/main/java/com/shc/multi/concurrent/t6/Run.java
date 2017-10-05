package com.shc.multi.concurrent.t6;

public class Run {
	public static void main(String[] args) {
		Task task = new Task();
		MyThread1 thread1 = new MyThread1(task);
		thread1.setName("线程1");
		thread1.start();
		MyThread2 thread2 = new MyThread2(task);
		thread2.setName("线程2");
		thread2.start();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long beginTime = CommonUtil.beginTime1;
		if (CommonUtil.beginTime2 < CommonUtil.beginTime1) {
			beginTime = CommonUtil.beginTime2;
		}

		long endTime = CommonUtil.endTime1;
		if (CommonUtil.endTime2 > CommonUtil.endTime1) {
			endTime = CommonUtil.endTime2;
		}
		System.out.println("耗时: " + ((endTime - beginTime) / 1000));
	}
}
