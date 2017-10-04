package com.czh.multi.volatile1.t1;

public class PrintString {
	private boolean isContinuePrint = true;

	public void printStringMethod() {
		try {
			while (isContinuePrint) {
				System.out.println("开始运行 printStringMethod 线程名称为:"
						+ Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isContinuePrint() {
		return isContinuePrint;
	}

	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}

}
