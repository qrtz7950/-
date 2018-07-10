package kr.co.mlec.day06.exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodExam {
	
	int sum(int a, int b) {
		int c;
		c = a + b;
		
		return c;
	}
	
	int tsum(int a, int b) {
		int c=0;
		
		for(int i = a; i<=b; i++) {
			c += i;
		}
		
		return c;
	}
	
	void displaySum(int a, int b, int c) {
		System.out.printf("%d + %d = %d", a, b, c);
	}
	
	int getInt() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("���� ����? : ");
		int num = s.nextInt();
		
		return num;
	}
	
	// getNums() : 1~100������ ������ 10�� �����Ͽ� ȣ���ڸ޼ҵ忡 �����ϴ� ���
	
	int[] getNums() {
		Random r = new Random();
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
		}
		
		return arr;
	}
	
	int[] getNums(int a) {
		Random r = new Random();
		int[] arr = new int[a];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
		}
		
		return arr;
	}
	
	int[] getNums(int size, int max) {	//size������ŭ, 1~max������ ����
		Random r = new Random();
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(max)+1;
		}
		
		return arr;
	}
	
	void displayArray(int[] arr, int a) {
		System.out.println(Arrays.toString(arr));
	}
}
