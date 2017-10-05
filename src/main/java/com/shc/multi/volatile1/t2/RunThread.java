package com.shc.multi.volatile1.t2;

public class RunThread extends Thread {
	private boolean isRunning = true;

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
