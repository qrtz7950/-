package day04;

import java.util.Arrays;

public class ArrayMain03 {

	public static void main(String[] args) {

		// 10, 20, 30, 40, 50 �� ������ �迭����
		// int[] arr = {10,20,30,40,50};
		int[] arr = new int[] { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// ���� arr�� 100,200,300,400,500,600,700�� ���� �迭 �������� �����Ϸ���
		// arr={100,200,300,400,500,600,700}; //������
		/*arr = new int[7];
		for (int j = 0; j <= arr.length; j++) {
			arr[j] = j * 100;
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}*/
		String[] strArr = new String[3];

		System.out.println("1.5 ������ for���� �̿��� ���(for-each��)");
		for (String str : strArr) {
			System.out.print(str); // ��°�� nullnullnull
		}
		System.out.println();
		System.out.println("Arrays.toString()�� �̿��� ���");
		System.out.println(Arrays.toString(strArr)); // ��°�� [null, null, null]

	}

}
