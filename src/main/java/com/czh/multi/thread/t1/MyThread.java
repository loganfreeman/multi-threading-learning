package com.czh.multi.thread.t1;

public class MyThread extends Thread{
  //重写Thread的run方法
    @Override
    public void run(){
      System.out.println("MyThread");
    }
}
