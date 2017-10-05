package com.shc.multi.volatile1.t1;

public class Run1 {
	public static void main(String[] args) {
		PrintString1 service = new PrintString1();
		new Thread(service).start();
		System.out.println("结束它!!!  结束进程为:" + Thread.currentThread().getName());
		service.setContinuePrint(false);
	}
}
