package day04;
import java.util.Scanner;

/*
 *  1 ~10 ������ ������ �Է��ϸ� ���ڸ�ŭ "Hello"�� ���
 *  ��, 1~10 ������ �ƴϸ� 1���� "Hello"�� ���
 */
public class LoopMain04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�ݺ��� Ƚ�� �Է�: ");
		int cnt = sc.nextInt();

		
		for (int i = 1; i <= cnt; i++) {
			System.out.println("Hello");
			if(cnt>10) {
				break;
			}
		}
		
		for(int i =1 ; i <=cnt ;i++) {
			System.out.print("hello");
			if (i % 2 ==1) {
				System.out.println();
			}
		}
		
		/*if (cnt <= 10) {
			for (int i = 1; i <= cnt; i++) {
				System.out.println("Hello");
			}
		} else {
			System.out.println("Hello!!");
		}*/
	}

}
