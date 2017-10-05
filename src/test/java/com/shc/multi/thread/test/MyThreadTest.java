package com.shc.multi.thread.test;

import org.junit.Test;

import com.shc.multi.thread.t1.MyThread;
import com.shc.multi.thread.t1.MyThread1;

public class MyThreadTest {
  @Test
  public void test1() {
    MyThread myThread = new MyThread();
    // 启动多线程
    myThread.start();
    System.out.println("MyThread运行结束");
  }

  @Test
  public void test2() {
    MyThread1 myThread1 = new MyThread1();
   // myThread1.setName("shc");
    myThread1.start();
//    for (int i = 0; i < 10; i++) {
//      int time = (int) Math.random() * 1000;
//      try {
//        Thread.sleep(time);
//        System.out.println("主程序==" + Thread.currentThread().getName());
//      } catch (InterruptedException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//      }
//    }
  }
  
  public static void main(String[] args) {
    MyThread1 myThread1 = new MyThread1();
     myThread1.setName("shc");
     myThread1.start();
     for (int i = 0; i < 10; i++) {
     int time = (int) Math.random() * 1000;
     try {
       Thread.sleep(time);
       System.out.println("主程序==" + Thread.currentThread().getName());
     } catch (InterruptedException e) {
       // TODO Auto-generated catch block
       e.printStackTrace();
     }
   }
  }
}
