package com.shc.multi.volatile1.t8;

public class Service {

	private boolean isContinueRun = true;

	public void runMethod() {
		while (isContinueRun) {
		}
		System.out.println("停下来了");
	}

	public void stopMethod() {
		isContinueRun = false;
	}
}
