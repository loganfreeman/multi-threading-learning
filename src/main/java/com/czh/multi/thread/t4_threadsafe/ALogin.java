package com.czh.multi.thread.t4_threadsafe;

public class ALogin extends Thread {
  @Override
  public void run() {
    LoginServlet.doPost("a", "aaa");
  }
}
