package kr.co.mlec.day02;

import java.util.Scanner;

/*
 * 1.����Ѵ�;
 * if(���ǽ�){	//������ �����Ѵٸ� �극�̽� ���� ���� �Ҹ����̶�� �극�̽��� �ǳʶ�
 * 	2.��԰�; 		//����� ��԰� ���� �ȸ԰��⵵�ϰ�
 * }			//��� ���ؾ��ϴ� ���忡 �극�̽��� �ɾ��ش�
 * 3.�б�����;
 * 
 * 1-> ������ 	-> 2-> 3
 * 1- >���ǰ���        	-> 3
 * 
 * -----------------------
 * ����Ѵ�;
 * if() {
 * 		�ɾ;
 * }
 * if() {
 * 		����Ÿ��;
 * }
 * �б�����;
 * 
 * �ش� �ڵ�� 4������ ����� ���� ������ (TT TF FT FF) TT�� FF�� ���� ���� �� ����
 * 
 * �׷��� if���� �ΰ� �����ʰ� if�� else�� ����Ѵ�
 * 
 * if(����) {
 * 		�ɾ;
 * } else {
 * 		����Ÿ��;
 * } 
 *
 * 1 -> ���� �� ->  2 -> 4
 * 1 -> ���� ����-> 3 -> 4
 * 
 * --------------------
 * 8�ø� �������� ������ ���� ���̸� �ɾ���ٰ��غ��� 
 * if(8������)�϶��� if(8������)�϶� �չٴڵ�����ó�� if�� else�� �ٲ㼭 �����ִ�.
 * 
 *
 */
public class IFMain01 {

	public static void main(String[] args) {
		/*
		 * �����ϰ� �ִ� å �Ǽ��� �Է�: 1
		 * 1 book
		 * �����ϰ� �ִ� å �Ǽ��� �Է�: 10
		 * 10 books
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϰ��ִ� å�Ǽ� �Է�: ");
		int book = sc.nextInt();

		
/*
		 * System.out.print(book + " book");
				
		if(book>=2) {
			System.out.print("s");
		}
*/

/*		
		if(book == 1) {
			System.out.print(book + " book");
		} else {
			System.out.print(book + " books");
		}
*/		
/*		
		if(book > 1) {
			System.out.print(book + " books");
		} else {
			System.out.print(book + " book");
		}
*/
}
}
