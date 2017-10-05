package com.shc.multi.volatile1.t3;

public class RunThread extends Thread {
	// 使用volatile的作用是多个线程间变量可见 强制从公共堆栈中获取值
	volatile private boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	@Override
	public void run() {
		System.out.println("进入 run()");
		while (isRunning) {

		}

		System.out.println("线程已经停止!!!");
	}
}
