package day02;

import java.util.Scanner;

/*
 * ���� 2���� �Է¹޾� �ι�° ������ ù���� ������ ������� �Ǵ�
 * ù��° ���� :12
 * �ι�° ���� :3
 * 
 * 3�� 12�� ��� ���� TRUE/FALSE
 * 
 */
public class OperationMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ����(ū ��): ");
		int num = sc.nextInt();
		System.out.print("�ι�° ����(���� ��): ");
		int num2 = sc.nextInt();
		
		//boolean bool2 = num % num2 == 0;
		boolean bool = (num2!=0) && (num % num2 == 0);
		System.out.println(num2+ "��(��)" + num +"�� ��� �ΰ�?: "+bool);
	}

}
