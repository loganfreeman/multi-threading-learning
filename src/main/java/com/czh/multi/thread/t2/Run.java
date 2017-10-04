package com.czh.multi.thread.t2;

public class Run {
  public static void main(String[] args) {

    MyThread m1 = new MyThread("m1");
    MyThread m2 = new MyThread("m2");
    MyThread m3 = new MyThread("m3");
    m1.start();
    m2.start();
    m3.start();
  }

}
