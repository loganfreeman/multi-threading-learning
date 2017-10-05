package com.shc.multi.concurrent.t12;

public class Thread1 extends Thread{
	private ServiceA service;
	public Thread1(ServiceA service){
		this.service = service;
	}
	
	@Override
	public void run(){
		service.printA();
	}
}
