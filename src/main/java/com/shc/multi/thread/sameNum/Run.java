package com.shc.multi.thread.sameNum;

public class Run {
  public static void main(String[] args) {
    MyThread my = new MyThread();
    Thread t1 = new Thread(my);
    Thread t2 = new Thread(my);
    Thread t3 = new Thread(my);
    Thread t4 = new Thread(my);
    Thread t5 = new Thread(my);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

  }
}
