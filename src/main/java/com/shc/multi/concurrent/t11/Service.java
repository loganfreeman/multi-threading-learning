package com.shc.multi.concurrent.t11;

public class Service {

	public MyOneList add(MyOneList list, String data) {
		// 这种情况会产生脏读
		try {
			if (list.getSize() < 1) {
				// 模拟从远程调用所要花费的时间
				Thread.sleep(2000);
				list.add(data);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public MyOneList add_list(MyOneList list, String data) {
		try {
			// 加上synchronized将不会产生脏读
			synchronized (list) {
				if (list.getSize() < 1) {
					// 模拟从远程调用所要花费的时间
					Thread.sleep(2000);
					list.add(data);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
