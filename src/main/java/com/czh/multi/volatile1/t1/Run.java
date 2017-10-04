package com.czh.multi.volatile1.t1;

public class Run {
	public static void main(String[] args) {
		PrintString service = new PrintString();
		service.printStringMethod();
		System.out.println("结束它!!!  结束进程为:" + Thread.currentThread().getName());
		service.setContinuePrint(false);
	}
}
