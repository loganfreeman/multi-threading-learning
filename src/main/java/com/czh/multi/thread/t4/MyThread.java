package com.czh.multi.thread.t4;

public class MyThread extends Thread {
  private int count = 5;

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
