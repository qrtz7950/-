package kr.co.mlec.day02;

import java.util.Scanner;

/*
 * ����Ѵ�;
 * if(����1){
 * �ɾ;
 * } else{
 * 		if(){
 * 			����Ÿ��;
 * 		} else {
 * 		         �ý�Ÿ��;
 * 		}
 * }
 * �б�����;
 * 
 * 1-> ����1�� -> 2 ->5
 * 1-> ����1���� -> ����2�� -> 3 -> 5
 * 1-> ����1���� -> ����2����->4 -> 5
 * 
 * ���� �ڵ� else if�� ����Ͽ� �ٸ� ������� �����
 * 
 * ����Ѵ�;
 * if(����1){
 * 		�ɾ;
 * } else if() {
 * 		����Ÿ��;
 * 		} 
 * 	 else {
 * 		 �ý�Ÿ��;
 * 		}
 * }
 * 
 * �������� ����� ������ �ʰ� else�� ������ ������ 
 * �б�����; * else�ȿ� if else�� �ѹ��� ��ø�ȴ� �̸� ��ø�� if else���̶�� �Ѵ�.
 * ���� ������ 1�� 2���� �и���������
 * 1�� 2���� �и��� �����ϴ�
 * 
 * ����Ѵ�;
 * if(����1){
 * 		if(����2){
 * 			�ɾ;
 * 		
 * 		} else { 
 * 			����Ÿ��;
 * 		}
 * } else{
 * �ý�Ÿ��
 * }
 * �б�����;
 * ��ħ�� ����Ҷ� 8�� �����̸� �ɾ 8������ 15�����̸� ����Ÿ�� 15�� ���ĸ� �ý�ź��
 * �̷� �Ͱ� ���� �ð��� �帧�� ���� ����� �ð��� �帧 ������� �Ǵ� ������� ¥�� ���� ���ϴ� 
 */
public class IFMain02 {

	public static void main(String[] args) {
		/*
		 * �����ϰ� �ִ� å�Ǽ� : 0
		 * �����ϰ� �ִ� å ����
		 * 
		 * �����ϰ� �ִ� å�Ǽ� �Է� : 1
		 * 1 book
		 * 
		 * �����ϰ� �ִ� å�Ǽ� �Է� : 10
		 * 10 books
		 */
		Scanner sr = new Scanner(System.in);
		
		System.out.println("�����ϰ��ִ� å �Ǽ� �Է�: ");
		int book = sr.nextInt();
		
/*		if(book == 0) {
			System.out.println("�����ϰ��ִ� å ����");
		} else {
			if (book == 1) {
				System.out.println(book + "book");				
			} else {
				System.out.println(book + "books");
				}
			}
*/
		if(book == 0) {
			System.out.println("�����ϰ��ִ� å ����");
		} else {
			if (book == 1) {
				System.out.println(book + "book");				
			} else {
				System.out.println(book + "books");
				}
			}
	}

}
