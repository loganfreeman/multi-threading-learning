package com.czh.multi.thread.t4_threadsafe;

public class Run {
  public static void main(String[] args) {
    ALogin a = new ALogin();
    a.start();
    BLogin b = new BLogin();
    b.start();
  }
}
