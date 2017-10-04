package com.czh.multi.timer.t1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
	//这个不是守护线程,运行以后并不会关闭线程
	private static Timer timer = new Timer();

	static public class MyTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("运行了! 时间为:" + new Date());
		}

	}

	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateStr = "2016-07-18 17:06:56";
			System.out.println("字符串时间:" + dateStr + "当前时间："
					+ sdf.format(new Date()));
			timer.schedule(task, sdf.parse(dateStr));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
