package kr.co.Homework0710;

import java.util.Arrays;
import java.util.Scanner;

public class StringUtil {
	
	Scanner sc = new Scanner(System.in);
	
	char charGet() {
		
		System.out.print("�ϳ��� ���ڸ� �Է��ϼ���: ");
		char chars = sc.nextLine().charAt(0);
		
		return chars;
	}
	
	int intGet() {
		
		System.out.print("���ڸ� �Է���: ");
		int num = sc.nextInt();
		
		return num;
	}
	
	boolean isUpperChar(char c) {
		boolean bool;
		
		if(c>='A' && c<='Z') {
			bool = true;
		} else {
			bool = false;
		}
		
		return bool;
	}
	
	boolean isLowerChar(char c) {
		boolean bool;
		
		if(c>='a' && c<='z') {
			bool = true;
		} else {
			bool = false;
		}
		
		return bool;
	}
	
	int max (int i,int j) {
		
		int re = i>j?i:j;
		
		System.out.printf("%d�� %d �� �� ū ���� ",i,j);
		
		return re;
	}
	
	int min (int i,int j) {
		
		int re = i<j?i:j;
		
		System.out.printf("%d�� %d �� �� ���� ���� ",i,j);
		
		return re;
	}

	char [] reverseString(String str) {
		
		char [] arr = new char [str.length()];
		char [] arr2 = new char [str.length()];
		
		str.getChars(0, str.length(), arr, 0);
		str.getChars(0, str.length(), arr2, 0);
		
		for (int i = 0; i < str.length(); i++) {
			arr2[str.length()-i-1] = arr[i];
		}

		return arr2;
	}
	
	char [] toUpperString(String str) {
		
		char [] arr = new char [str.length()];
		char [] arr2 = new char [str.length()];
		
		str.getChars(0, str.length(), arr, 0);
		
		for(int i = 0; i < str.length(); i++) {
		arr[i] =(char)(arr[i] - ('a' - 'A'));
		}
		
		return arr;
	}
	
	char [] toLowerString(String str) {
		
		char [] arr = new char [str.length()];
		char [] arr2 = new char [str.length()];
		
		str.getChars(0, str.length(), arr, 0);
		
		for(int i = 0; i < str.length(); i++) {
		arr[i] =(char)(arr[i] + ('a' - 'A'));
		}
		
		return arr;
	}	
	
}
