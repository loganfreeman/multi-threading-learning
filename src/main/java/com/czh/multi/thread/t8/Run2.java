package com.czh.multi.thread.t8;

public class Run2 {
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().interrupt();
		System.out.println("是否停止1==" + Thread.interrupted());
		System.out.println("是否停止2==" + Thread.interrupted());
	}
}
