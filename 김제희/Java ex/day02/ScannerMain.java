package kr.co.mlec.day02;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // System.out <-> System.in in�� Ű���� �Է�
		//ctrl + shift + o = �ڵ� import
		
		System.out.print("���ڸ� �Է�: ");//�����ϳ��� �Է¹���
		char ch = sc.nextLine().charAt(0); //�ڹٴ� ���ڵ� ���ڿ�ó�� �Է¹޴´� ��ɾ ��¦ �ٸ��Ծ���ȴ�
		System.out.println("ch = " + ch);
		
		System.out.print("���ڿ��� �Է�: ");
		//String str = sc.next(); //next�� ���鹮��(enter, tab, space)�� ���ڿ� ����
		String str = sc.nextLine(); //nextLine�� ���ͷ� ���ڿ��� �����ϹǷ� ������ ���Ե� ���� ��밡��
		System.out.println("str = " + str);
		
		System.out.print("������ �Է�: ");
		boolean bool = sc.nextBoolean();
		System.out.println("bool = " + bool);
		
		System.out.print("�Ǽ� d �Է�: ");
		double d = sc.nextDouble(); //�޼ҵ带 ���� ���´� �ܿ��� 
		System.out.println("d = " + d);
		
		System.out.print("���� num �Է�: ");
		int num = sc.nextInt(); //�̰� �ܿ���
		System.out.println("num = " + num);
		//��Ŭ���� �ܼ�â���� ������ �׸� ���α׷��� ���� ������ �ʰ� (�극�̽��� ������ �ʰ�) �����߿� �ִٴ� ��
		//���� �׸𴩸��� ��������
		//��Ŭ������ �ܼ�â�� Ŀ���� ����Ʈ�ϰ� �Ű����� ���ϴ� ���콺�� Ŀ���� ������ ����
	}

}
