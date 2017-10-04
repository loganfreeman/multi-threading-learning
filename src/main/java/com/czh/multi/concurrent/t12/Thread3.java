package com.czh.multi.concurrent.t12;

public class Thread3 extends Thread{
	private ServiceA service;
	public Thread3(ServiceA service){
		this.service = service;
	}
	
	@Override
	public void run(){
		service.printC();
	}
}
