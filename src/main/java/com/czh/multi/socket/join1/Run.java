package com.czh.multi.socket.join1;

/**
 * 说明join和interrupt相遇就会出现异常
 * 
 * @author czh
 * @create_time 2016年7月11日 下午8:25:10
 * @version 1.0
 * 
 */
public class Run {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			b.start();
			Thread.sleep(2000);
			ThreadC c = new ThreadC(b);
			c.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
