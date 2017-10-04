package com.czh.multi.socket.t2;

/**
 * 会产生一个异常，是RuntimeException   IllegalMonitorStateException 
 * 没有持有适当的锁
 * @author czh
 * @create_time 2016年7月7日 下午2:14:02
 * @version 1.0
 *
 */
public class Test {
	public static void main(String[] args) {
		try {
			String newString = new String("");
			newString.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
