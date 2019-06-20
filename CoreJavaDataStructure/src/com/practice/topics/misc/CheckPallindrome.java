package com.practice.topics.misc;

public class CheckPallindrome {

	public static void main(String s[]) {
		System.out.println("String is Pallindrome::" + checkPallindrome("madam"));
	}

	public static boolean checkPallindrome(String str) {
		int lenth = str.length();
		StringBuilder sb = new StringBuilder();
		for (int i = lenth - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}

		System.out.println(sb.toString());
		if (sb.toString().equals(str)) {
			return true;
		} else {
			return false;
		}
	}

}
