package kr.co.mlec.day03;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϴ� ������ �Է�");
		String season = sc.nextLine();
		
		switch(season) {
		case "SPRING" :
		case "spring" : //����ġ ���ǹ��� ������ �����ִ� ���̱� ������ �̷������� ������ �����ص���
		case "��" :
			System.out.println(season + "�� 3�� - 5�������Դϴ�");
			break;
		case "SUMMER" :
		case "summer" :
			System.out.println(season + "�� 6�� - 8�������Դϴ�");
			break;
		case "FALL" :
		case "fall" :
			System.out.println(season + "�� 9�� - 11�������Դϴ�");
			break;
		case "WINTER" :
		case "winter" :
			System.out.println(season + "�� 12�� - 2�������Դϴ�");
			break;
		default :
			System.out.println("�丶 ����ġ��� �Ӹ�");
		}
	}

}
