package com.czh.multi.concurrent.t8;

public class Service {
	private String unameParam;
	private String pwdParam;
	//其中这个是全局的变量
	private String anyString = new String();

	public void setUsernamePassWord(String uname, String pwd) {
		try {
			synchronized (anyString) {
				System.out.println("线程名称为：" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "进入同步块！！");
				unameParam = uname;
				Thread.sleep(3000);
				pwdParam = pwd;
				System.out.println("线程名称为：" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "离开同步块！！");
			}
		} catch (Exception e) {

		}
	}
}
