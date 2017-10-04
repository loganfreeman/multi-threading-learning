package com.czh.multi.thread.t2;

/**
 * 
 * @author czh
 * @crete_time 2016年3月1日 下午5:27:27
 * @version 1.0
 * 
 */
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
