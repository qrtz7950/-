package kr.co.mlec.day04;

import java.util.Arrays;

public class ArrayMain03 {

	public static void main(String[] args) {
		
		//���� �� ���� ���� ������ �迭�� ������
		
		int [] Arr = {1,2,3};
		String [] strArr = {"������","������","�ֱԼ�"};
		String [] strArr2 = new String[]{"������","������","�ֱԼ�"};
		
		// �� ���� ��������� ���� ����� �ٸ�
		
		//10,20,30,40,50�� ������ ������ �迭�� ����
		
		int [] iArr = {10,20,30,40,50};
	
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i] + "  ");
		}
		System.out.println();
		
		// 100 200 300 400 500 600 700 �� ���� ������ �迭�� ������
		//iArr�� ���� �� 5���� ������ �迭�� �ƴ� �ٸ� �迭�� ����Ű���� ������
		//int [] iArr = {10,20,30,40,50};�� �ʱ�ȭ�Ҷ�
		//iArr = {100,200,300,400,500,600,700}; �� ��������
		//�ش� ����� �迭�� ������ ���� ����� �� �ִ�
		//iArr = new int[] {100,200,300,400,500,600,700};�� ��� ����
		//ù��°�� �ʱ�ȭ�Ҷ��� ������ ��� �ι�°�� �ʱ�ȭ�Ҷ��� ������ ����� �� ���� ����Ѵ�
		
		int [] iArr2 = {100,200,300,400,500,600,700};
		
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr2[i] + "  ");
		}
		System.out.print("\n\n");
		
		System.out.println("JDK 1.5�� for���� �̿��� ���");
		for(String str : strArr) {
			System.out.print(str + "  ");
		}
		// ������  ������  �ֱԼ�
		System.out.print("\n\n");
		
		System.out.println("Arrays.toString()�� �̿��� �迭 ���");
		System.out.println(Arrays.toString(strArr));
		// [������, ������, �ֱԼ�]
		
	}

}
