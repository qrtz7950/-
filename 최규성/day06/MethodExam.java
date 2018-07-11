package day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodExam {
	
	int sum(int a, int b) {
		return a + b;
	}
	
	int tsum(int a, int b) {
		int sum = 0;
		for(int i = a; i <=b ;i++) {
			sum = sum+i;
		}
		return sum;
	}
	void displaySum(int a, int b, int sum) {
		System.out.println(a + "+" + b + "=" + sum);
	}
	
	int getInt() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է�: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}
	
	/*
	 * getNums() :  1~100������ ������ 10�� �����Ͽ� ȣ���� �޼ҵ忡 �����ϴ� ���
	 */
	int[] getNums() {
		Random r = new Random();
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(100)+1;
		}
		return nums;
	}
	int[] getNums(int size) {
		return getNums(size, 100);
	}
	
	int[] getNums(int size, int max) {
		Random r = new Random();
		
		int[] nums = new int[size];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(max) + 1;
		}
		return nums;
	}
	void displayArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
