package com.czh.multi.thread.t10;

/**
 * 先停止，后沉睡
 * @author czh
 * @crete_time 2016年3月2日 下午9:19:52
 * @version 1.0
 *
 */
public class MyThread1 extends Thread{
	
	@Override
	public void run(){
		try {
			for(int i=0;i<500000;i++){
				System.out.println("i="+(i+1));
			}
			System.out.println("run begin");
			Thread.sleep(5000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("先停止,后沉睡！！！！");
			e.printStackTrace();
		}
	}

}
