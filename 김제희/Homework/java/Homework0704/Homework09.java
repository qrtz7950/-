package kr.co.Homework0704;

import java.util.Scanner;

public class Homework09 {

	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		System.out.print("�����ϰ��ִ� å �Ǽ� �Է�: ");
		int book = sr.nextInt();
		
		if(book < 0) {
			System.out.print("�߸��Է��߽��ϴ�");
		} else if(book == 0) {
			System.out.print("�����ϰ��ִ� å ����");			
		} else if(book == 1) {
			System.out.print(book + " book");			
		} else if(book > 1) {
			System.out.print(book + " books");			
		}
	}
}
