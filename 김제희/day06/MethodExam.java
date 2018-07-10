package kr.co.mlec.day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodExam {

	int sum(int a, int b) {
		return a + b;
	}
	
	int tsum(int a, int b) {
		int s = 0;
		for(int i = a; i <= b; i++) {
			s = s + i;
		}
		return s;
	}
	
	void displaySum(int a, int b, int sum) {
		System.out.println(a + " + " + b + " = " + sum);
	}
	
	int getInt() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}
	
	/**
	 * getNums() : 1 ~ 100������ ������ 10�� �����Ͽ� ȣ���ڸ޼ҵ忡 �����ϴ� ���
	 */
	int[] getNums() {
		
		return getNums(10, 100);
/*		
		int[] nums = getNums(10);
		return nums;
*/		
		/*
		Random r = new Random();
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(100) + 1;
		}
		
		return nums;
		*/
		
	}
	
	/**
	 * 1 ~ 100������ ������ size�� ��ŭ �����Ͽ� ȣ���� �޼ҵ忡 �����ϴ� ���
	 * @param size
	 * @return 
	 */
	int[] getNums(int size) {
		
		return getNums(size, 100);
/*		
		Random r = new Random();
		
		int[] nums = new int[size];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(100) + 1;
		}
		
		return nums;
*/		
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
















