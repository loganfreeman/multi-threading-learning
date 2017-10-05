package com.shc.multi.concurrent.throwExceptionNoLock;

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
