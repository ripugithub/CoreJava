package com.practice.topics.oca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchWithResource {

	public static void main(String s[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Number Of Oranges::");
			int oranges = sc.nextInt();
			System.out.println("Number of Apples::");
			int apples = sc.nextInt();
			System.out.println("Total number of fruits::" + (oranges + apples));
		} catch (InputMismatchException ime) {
			ime.printStackTrace();

		}
	}

}
