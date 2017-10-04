package com.czh.multi.socket.t6;


/**
 * 当wait等待的条件发生了变化，容易引起混乱
 * @author czh
 * @create_time 2016年7月11日 下午12:47:44
 * @version 1.0
 *
 */
public class Add {
	private String lock;
	public Add(String lock){
		this.lock = lock;
	}
	
	public void add(){
		synchronized(lock){
			ValueObject.list.add("anyString");
			lock.notifyAll();
		}
	}
}
