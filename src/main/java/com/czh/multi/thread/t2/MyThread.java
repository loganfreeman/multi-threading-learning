package com.czh.multi.thread.t2;

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
