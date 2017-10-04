package com.czh.multi.thread.t5;

/**
 * 
 * @author czh
 * @crete_time 2016年3月2日 下午4:18:24
 * @version 1.0
 * 
 */
public class Run3 {
	public static void main(String[] args) {
		/**
		 * 
		 */
		CountOperate cu = new CountOperate();
		cu.setName("A");
		cu.start();
		Thread t1 = new Thread(cu);
		t1.setName("B");
		t1.start();
	}
}
