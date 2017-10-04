package com.czh.multi.thread.t13;

public class Run {

	public static void main(String[] args) {
		try {
			SynchronizedObject object = new SynchronizedObject();
			MyThread thread = new MyThread(object);
			thread.start();
			Thread.sleep(500);
			thread.stop();
			System.out.println("获得的名字是===" + object.getUsername() + ",密码是====="
					+ object.getPassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
