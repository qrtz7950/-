package kr.co.mlec.day06;

import java.util.Arrays;

public class StingMain02 {

	public static void main(String[] args) {

		String str = new String("ABCDEFGHIJ");
		
		int length = str.length();
		
		System.out.println("[" + str + "]" + " str�� ����: " + length);
		
		//���ڿ��� ������ �迭�� �� �ּҹ����� ���� ���
		
		for(int i = 0; i< str.length(); i++) {
			System.out.println(i + "��° ����: " + str.charAt(i));
		}
		
		char [] chars = new char [str.length()];
		
		System.out.print(Arrays.toString(chars));
		//���� �ϱ� �� ���
		
		//str.getChars(0, str.length(), chars, 0); 	//���� �� ����
		//str.getChars(2, 6, chars, 0); 			// 2��°���� 6�������� 0�������� ����
		str.getChars(1, 5, chars, 4);
		
		//���� �� ���
		System.out.println();
		System.out.print(Arrays.toString(chars));
		
		
		
	}

}
