package com.practice.topics.threads;

public class TryCatchPuzzle2 {

	public static void main(String[] args) {
		try {
			System.out.println("Hello world");
			System.exit(0); //System.exit stops all program threads immediately; it does not cause finally blocks to execute
		} finally {
			System.out.println("Goodbye world");
		}
	}
}
