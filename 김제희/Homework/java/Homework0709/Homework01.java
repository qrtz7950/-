package kr.co.Homework0709;

import java.util.Scanner;

import kr.co.mlec.day05.Handphone;

class Ice {
	String name;
	int price;
}

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("� �췡: ");
		int n = sc.nextInt();
		
		Ice [] iceArr = new Ice[n];
		
		for(int i=0; i<iceArr.length; i++) {
			iceArr[i] = new Ice();
		}
		
		for(int i=0; i<iceArr.length; i++) {
			
			System.out.println("***"+(i+1)+"��° ���̽�ũ�� �����Է�"+"***");
			
			System.out.print("���̽�ũ����: ");
			iceArr[i].name = sc.next();

			System.out.print("���̽�ũ�� ����: ");
			iceArr[i].price = sc.nextInt();
		}

		System.out.println("��ȣ   �̸�   ����");
		for(int i=0; i<iceArr.length; i++) {
			System.out.println((i+1) + "   " + iceArr[i].name + "   " + iceArr[i].price + "��");
		}
		
		
	}

}
