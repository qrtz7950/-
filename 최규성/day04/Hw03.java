package day04Hw;

import java.util.Scanner;

public class Hw03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		
		System.out.print("2~9������ �����Է�: ");
		int a = sc.nextInt();
		System.out.println(a+"�� ����� ������ �������");
		for (int i = 1; i <= 100; i++) {
			
			if (i % a != 0) {
				System.out.print(i+" ");
				cnt++;
				if(cnt % a ==0) {
					System.out.println();
				}
			} else if(i == a+1) {
				System.out.println();
			}

		}
		
	}
}
