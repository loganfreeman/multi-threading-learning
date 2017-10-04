package com.czh.multi.thread.t1;

/**
 * 实现多线程的方式:1.继承Thread(其实Thread也实现了Runnable接口)
 * @author czh
 * @crete_time 2016年3月1日 下午3:09:51
 * @version 1.0
 *
 */
public class MyThread extends Thread{
  //重写Thread的run方法
    @Override
    public void run(){
      System.out.println("MyThread");
    }
}
