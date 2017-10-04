package com.czh.multi.thread.test;


import com.czh.multi.thread.t1.MyRunnable;
import com.czh.multi.thread.t1.MyThread;
/**
 * 
 * @author czh
 * @crete_time 2016年3月1日 下午5:06:28
 * @version 1.0
 *
 */
public class MyRunnableTest {
  public static void main(String[] args) {
    Runnable mr = new MyRunnable();
    Thread thread = new Thread(mr);
    thread.start();
    MyThread my = new MyThread();
    Thread thread1 = new Thread(my);
    thread1.start();
    System.out.println("运行结束");

  }
}
