package com.czh.multi.thread.t9;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.isInterrupted()) {
					System.out.println("已经是停止状态了,我要退出");
					// break;

					throw new InterruptedException();

				}
				System.out.println("i=" + (i + 1));
			}
			System.out.println("我被输出，说明线程并未停止");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
