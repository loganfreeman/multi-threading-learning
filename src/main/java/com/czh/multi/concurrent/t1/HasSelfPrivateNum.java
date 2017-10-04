package com.czh.multi.concurrent.t1;

/**
 * 方法内部的变量为线程安全
 * 
 * @author czh
 * @crete_time 2016年3月4日 下午3:18:18
 * @version 1.0
 * 
 */
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
