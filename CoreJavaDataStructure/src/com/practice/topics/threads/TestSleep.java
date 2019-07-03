package com.practice.topics.threads;

public class TestSleep extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String s[]) throws InterruptedException {
		TestSleep t1 = new TestSleep();
		TestSleep t2 = new TestSleep();
		t1.start();
		t1.join();
		t2.start();

	}

}
