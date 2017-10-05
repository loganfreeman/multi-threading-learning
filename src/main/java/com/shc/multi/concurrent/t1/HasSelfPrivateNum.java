package com.shc.multi.concurrent.t1;

public class HasSelfPrivateNum {
	public void add(String username) {
		try {
			int num = 0;

			if ("a".equals(username)) {
				num = 100;
				System.out.println("此时  a赋值完毕");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b 赋值完毕");
			}
			System.out.println(username + "-----num=" + num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
