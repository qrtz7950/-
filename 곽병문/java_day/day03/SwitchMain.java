package kr.co.mlec.day03;

import java.util.Scanner;

public class SwitchMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�����ϴ� ������ �Է� : ");
		
		String input = s.nextLine();
		String str;
		
		switch(input) {
			case "SPRING":
			case "spring":
			case "��":
					str = "Ȳ��";
					break;
			case "SUMMER":
			case "summer":
			case "����":
					str = "����";
					break;
			case "FALL":
			case "fall":
			case "����":
					str = "����";
					break;
			case "WINTER":
			case "winter":
			case "�ܿ�":
					str = "�߿�";
					break;
			default: str = "�����?";
		}
		System.out.println(str);
		
		s.close();
	}

}
