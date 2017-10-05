package com.shc.multi.socket.t1;

public class ThreadB extends Thread{
	private MyList list;
	public ThreadB(MyList list){
		this.list = list;
	}
	
	@Override
	public void run(){
		System.out.println("xxxxxxxxxx");
		try {
			while (true) {
				if (list.size() == 5) {
					System.out.println("=====5,线程b要退出了");
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
