package com.czh.multi.concurrent.t12;

public class Thread2 extends Thread{
	private ServiceA service;
	public Thread2(ServiceA service){
		this.service = service;
	}
	
	@Override
	public void run(){
		service.printB();
	}
}
