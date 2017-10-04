package com.czh.multi.thread.t4;

/**
 * 变量共享
 * 
 * @author czh
 * @crete_time 2016年3月1日 下午5:38:32
 * @version 1.0
 * 
 */
public class MyThread extends Thread {
  private int count = 5;

  /**
   * 以下是非线程安全
   */
//  @Override
//  public void run() {
//    super.run();
//    count--;
//    System.out.println("由" + this.currentThread().getName() + "========,count=" + count);
//  }
  
  @Override
  synchronized public void run(){
    super.run();
    count--;
    System.out.println("由" + this.currentThread().getName() + "========,count=" + count);
  }
  
  
}
