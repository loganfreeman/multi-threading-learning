package com.czh.multi.thread.t13;

/**
 * 
 * @author czh
 * @crete_time 2016年3月3日 下午3:29:11
 * @version 1.0
 * 
 */
public class SynchronizedObject {
	private String username = "a";
	private String password = "aaaa";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	synchronized public void printString(String username, String password) {
		try {
			this.username = username;
			Thread.sleep(100000);
			this.password = password;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
