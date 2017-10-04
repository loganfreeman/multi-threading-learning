package com.czh.multi.concurrent.throwExceptionNoLock;

/**
 * 出现异常，锁自动释放
 * 
 * @author czh
 * @crete_time 2016年3月7日 下午4:27:24
 * @version 1.0
 * 
 */
public class Service {
	synchronized public void testMethod() {
		if ("a".equals(Thread.currentThread().getName())) {
			System.out.println("ThreadName ="
					+ Thread.currentThread().getName() + ",beginTime ="
					+ System.currentTimeMillis());
			int i = 1;
			while (i == 1) {
				if ("0.1234".equals(("" + Math.random()).substring(0, 6))) {
					System.out.println("ThreadName ="
							+ Thread.currentThread().getName()
							+ " run exceptionTime ="
							+ System.currentTimeMillis());
					// 出现异常的地方
					Integer.parseInt("a");
				}

			}

		} else {
			System.out.println("Thead B run Time ="
					+ System.currentTimeMillis());
		}
	}

}
