package com.shc.multi.concurrent.t2;

public class HasSelfPrivateNum {

	private int num = 0;

	synchronized public void add(String uname) {
		try {
			if ("a".equals(uname)) {
				num = 100;
				System.out.println("a赋值");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b赋值");
			}
			System.out.println(uname + ",====num=" + num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
