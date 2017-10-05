package com.shc.multi.thread.t4_threadsafe;

public class BLogin extends Thread {

  @Override
  public void run() {
    LoginServlet.doPost("b", "bbbb");
  }
}
