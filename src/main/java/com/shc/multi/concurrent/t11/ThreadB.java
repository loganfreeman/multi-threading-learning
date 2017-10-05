package com.shc.multi.concurrent.t11;

public class ThreadB extends Thread {

	private MyOneList list;

	public ThreadB(MyOneList list) {
		this.list = list;
	}

	@Override
	public void run() {
		Service service = new Service();
		// service.add(list, "B");
		service.add_list(list, "B");
	}
}
