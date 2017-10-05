package com.shc.multi.thread.sameNum;

public class MyThread extends Thread {

  private int i = 8;

  @Override
  synchronized public void run() {
    System.out.println("i=" + (i--) + "线程名=" + Thread.currentThread().getName());
  }
}
