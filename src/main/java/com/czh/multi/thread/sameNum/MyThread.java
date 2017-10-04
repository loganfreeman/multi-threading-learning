package com.czh.multi.thread.sameNum;

/**
 * println()和i++ 联合使用起来的情况
 * 
 * @author czh
 * @crete_time 2016年3月1日 下午6:31:51
 * @version 1.0
 * 
 */
public class MyThread extends Thread {

  private int i = 8;

  @Override
  synchronized public void run() {
    System.out.println("i=" + (i--) + "线程名=" + Thread.currentThread().getName());
  }
}
