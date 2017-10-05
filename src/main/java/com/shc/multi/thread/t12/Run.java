package com.shc.multi.thread.t12;

public class Run {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		try {
			thread.start();
			Thread.sleep(8000);
			thread.stop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
