package com.czh.multi.concurrent.t6;

/**
 * synchronized方法的弊端
 * 
 * @author czh
 * @crete_time 2016年3月29日 上午11:11:47
 * @version 1.0
 * 
 */
public class Task {

	private String getData1;
	private String getData2;

	public synchronized void doLongTimeTask() {
		try {
			System.out.println("开始任务:");
			Thread.sleep(3000);
			getData1 = "长时间处理任务后从远程返回的值1  threadName="
					+ Thread.currentThread().getName();
			getData2 = "长时间处理任务后从远程返回的值2  threadName="
					+ Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("结束任务");
		} catch (Exception e) {
			// TODO
			e.printStackTrace();
		}
	}
}
