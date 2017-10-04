package com.czh.multi.thread.t1;

/**
 * 自定义一个线程类
 * 
 * @author czh
 * @crete_time 2016年3月1日 下午3:46:32
 * @version 1.0
 * 
 */
public class MyThread1 extends Thread{
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      int time = (int) (Math.random() * 1000);
      try {
        Thread.sleep(time);
        System.out.println("运行====" + Thread.currentThread().getName());
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

}