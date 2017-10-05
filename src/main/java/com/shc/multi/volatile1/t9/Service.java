package com.shc.multi.volatile1.t9;

public class Service {

	private boolean isContinueRun = true;

	public void runMethod() {
		String str = new String();
		while (isContinueRun) {
			synchronized (str) {
				//TODO
			}
		}
		System.out.println("停下来了");
	}

	public void stopMethod() {
		
		isContinueRun = false;
	}
}
