package com.czh.multi.thread.t5;

/**
 * 
 * @author czh
 * @crete_time 2016年3月2日 上午10:08:25
 * @version 1.0
 * 
 */
public class Run1 {
	public static void main(String[] args) {
		// 证明main方法是main线程调用
		System.out.println(Thread.currentThread().getName());
	}
}
