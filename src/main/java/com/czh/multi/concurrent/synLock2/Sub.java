package com.czh.multi.concurrent.synLock2;

public class Sub extends Main {

	synchronized public void operateSubMethod() {
		try {
			while (i > 0) {
				i--;
				System.out.println("sub print i=" + i);
				Thread.sleep(100);
				this.operateMainThread();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String str = new String("CZH");
		Sub sub = new Sub();
		sub.test(str);
		System.out.println(str);
	}
	
	public void test(String str){
		str = new String("ZMG");
	}
}
