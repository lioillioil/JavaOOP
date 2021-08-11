package com.bdqn.ch07;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) {
		
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10000000, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));

		for (int i = 0; i < 15; i++) {
			MyTask myTask = new MyTask(i); // 要执行的任务
			executor.execute(myTask); // 执行任务
			System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，队列中等待执行的任务数目：" + executor.getQueue().size() + "，已执行完毕的任务数目：" + executor.getCompletedTaskCount());
		}
		executor.shutdown(); // 停止执行
	}
}

class MyTask implements Runnable {

	private int taskNum;

	public MyTask(int num) {
		this.taskNum = num;
	}

	@Override
	public void run() {
		System.out.println(taskNum + "正在挖金矿");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(taskNum + "任务完成，收工！");
	}
}
