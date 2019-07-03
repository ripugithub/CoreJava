package com.practice.topics.oca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	
	public static void main(String s[]) {
		Scanner sc = new Scanner(System.in)	;
		try {
		System.out.println("NUmber of Oranges::");
		int oranges = sc.nextInt();
		System.out.println("NUmber of Apples");
		int apples = sc.nextInt();
		System.out.println("Total number of fruits::"+(apples+oranges));
		}catch(InputMismatchException ime)
		{
			ime.printStackTrace();
		}finally {
			sc.close();
		}
	}
}
