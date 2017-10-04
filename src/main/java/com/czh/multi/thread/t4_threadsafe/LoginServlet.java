package com.czh.multi.thread.t4_threadsafe;

public class LoginServlet {
  private static String loginNameRef;
  private static String passwordRef;

  synchronized public static void doPost(String loginName, String password) {
    loginNameRef = loginName;
    try {
      if ("a".equals(loginName)) {
        Thread.sleep(5000);
      }
      passwordRef = password;
      System.out.println("登录名=" + loginNameRef + ",密码=" + passwordRef);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }



}
