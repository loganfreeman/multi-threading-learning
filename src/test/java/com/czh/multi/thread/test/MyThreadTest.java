package com.czh.multi.thread.test;

import org.junit.Test;

import com.czh.multi.thread.t1.MyThread;
import com.czh.multi.thread.t1.MyThread1;

/**
 * 测试
 * 
 * @author czh
 * @crete_time 2016年3月1日 下午3:30:04
 * @version 1.0
 * 
 */
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
   // myThread1.setName("czh");
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
     myThread1.setName("czh");
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
