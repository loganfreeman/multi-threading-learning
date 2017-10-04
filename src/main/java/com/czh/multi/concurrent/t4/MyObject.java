package com.czh.multi.concurrent.t4;

/**
 * 
 * @author czh
 * @crete_time 2016年3月5日 下午3:27:07
 * @version 1.0
 * 
 */
public class MyObject {

	synchronized public void methodA() {

		try {
			System.out.println("begin methodA threadName="
					+ Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
