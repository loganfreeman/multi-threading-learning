package com.czh.multi.concurrent.t9;

public class Service {

	private String unameParam;
	private String pwdParam;

	public void setUnamPwd(String uname, String pwd) {
		try {
			// synchronized（非this对象） 对象监视器必须是同一个对象，如果不是同一个对象，那么就是异步执行了
			String anyString = new String();
			synchronized (anyString) {
				System.out.println("线程名称为:" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "进入同步块");
				unameParam = uname;
				Thread.sleep(3000);
				pwdParam = pwd;
				System.out.println("线程名称为:" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "离开同步块");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
