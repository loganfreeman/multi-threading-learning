package com.czh.multi.thread.t4;

/**
 * 
 * @author czh
 * @crete_time 2016年3月1日 下午5:40:09
 * @version 1.0
 * 
 */
public class Run {
  public static void main(String[] args) {
    MyThread my = new MyThread();
    Thread a = new Thread(my, "A");
    Thread b = new Thread(my, "B");
    Thread c = new Thread(my, "C");
    Thread d = new Thread(my, "D");
    Thread e = new Thread(my, "E");
    a.start();
    b.start();
    c.start();
    d.start();
    e.start();

  }
}
