package com.czh.multi.thread.t2;

/**
 * 实例变量和线程安全 此处是：变量不共享
 * 
 * @author czh
 * @crete_time 2016年3月1日 下午5:17:18
 * @version 1.0
 * 
 */
public class MyThread extends Thread {

  private int count = 5;

  public MyThread(String name) {
    super();
    this.setName(name);
  }

  public void run() {
    while (count > 0) {
      count--;
      System.out.println("由" + this.currentThread().getName() + "======,count" + count);
    }
  }
}
