package day02;

import java.util.Scanner;

public class Hw09 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.printf("������ å �Ǽ�: ");
		int book = sc.nextInt();
		
		if(book > 1) {
			System.out.println(book + " Books");
		} else if(book == 1) {
			System.out.println(book + " Book");
		} else if(book ==0){
			System.out.println("������ å ����");
		} else {
			System.out.println("�߸��� �Է�");
		}

	}

}
