package com.shc.multi.concurrent.t11;

public class ThreadA extends Thread {

	private MyOneList list;

	public ThreadA(MyOneList list) {
		this.list = list;
	}

	@Override
	public void run() {
		Service service = new Service();
		//service.add(list, "A");
		service.add_list(list, "A");
	}
}
