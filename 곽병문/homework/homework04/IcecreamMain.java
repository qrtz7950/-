package kr.co.mlec.homework.homework04;

import java.util.Scanner;

/*
 *	�Է�, ����	
 *
 * 	*** 1��° ���̽�ũ�� ���� �Է� ***
 * 	���̽�ũ���� : (�Է�)
 * 	���̽�ũ������ : (�Է�)
 * 
 * 	...
 * 
 * 	*** 4��°
 * 
 * 	<���̽�ũ�� ���� ����>
 * 	��ȣ	���̽�ũ����	���̽�ũ������
 * 	1	
 * 	2
 * 	3
 * 	4
 */

public class IcecreamMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���̽�ũ�� � �����ҷ�? => ");
		int n = s.nextInt();
		
		Icecream[] ice = new Icecream[n];
		
		for(int i=0; i<ice.length; i++) {
			ice[i] = new Icecream();
			System.out.print("*** " + (i+1) + "��° ���̽�ũ�� ���� �Է� ***\n���̽�ũ���� : ");
			ice[i].name = s.next();
			System.out.print("���̽�ũ������ : ");
			ice[i].price = s.nextInt();
			System.out.println();
		}
		
		System.out.println("< ���̽�ũ�� ���� ���� >\n��ȣ\t���̽�ũ����\t���̽�ũ������");
		for(int i=0; i<ice.length; i++) {
			System.out.printf("%d\t%s\t\t%d��\n", i+1, ice[i].name, ice[i].price);
		}
		
		
		s.close();
	}

}

class Icecream {
	String name;
	int price;
}
