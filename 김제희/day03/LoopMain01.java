package kr.co.mlec.day03;

/*
 *  �ݺ��� �⺻���
 *  1.�ݺ��� ����
 *  2.���۰�
 *  3.����/����
 *  4.��������
 *  
 *  1. ���۰�;
 *  
 *  while(2.��������){
 *  	3.�ݺ��� ����;
 *  	4.����/����
 *  }
 *  5.����
 *  
 *  1 -> 2������ -> 3 -> 4
 *    -> 2������ -> 3 -> 4
 *    -> 2������ -> 3 -> 4
 *    -> 2���ǰ��� -> 5
 *    
 * for()���� �˾ƺ���
 * 
 * for(1.���۰�; 2.���Ṯ����; 4.����/����) {
 * 	3.�ݺ��� ����;
 * }
 * 
 * 1  -> 2������ -> 3 -> 4
 *    -> 2������ -> 3 -> 4
 *    -> 2������ -> 3 -> 4
 *    -> 2���ǰ��� -> 5
 *    
 * 1.���۰�;
 * do {
 * 		3.�ݺ��� ����;
 * 		4.����/����;
 * }while(2.��������);
 * 5.����;
 * 
 * 1	-> 			-> 3 -> 4
 * 		-> 2������	-> 3 -> 4
 * 		-> 2������	-> 3 -> 4
 * 		-> 2���ǰ���	-> 5
 * 
 * for�� while�� ���Ͽ� ����� Ƚ���� 1ȸ����
 */
public class LoopMain01 {

	public static void main(String[] args) {
		
		int cnt = 1;
		
		//while
		while(cnt <= 5) {
		System.out.println("Hello");
		cnt++;
		}
		
		System.out.println("---------------------------------");
		
		//for
		for(int count = 1; count<= 5;count++){
		System.out.println("Hello");
		}
		
		
		//while�̳� for���� �ּҷ���Ƚ�� 0ȸ
		int j = 5;
		while(j<=0) {
			System.out.println("Hello");
			j--;
		}
		
		//do while�� �ּҷ���Ƚ�� 1ȸ
			int count = 1;
		do {
			System.out.println("Hello");
		}while(count <= 5); //while�� � �극�̽��� ¦���� �˱⽱�� �ϱ����� �����ݷ��� ����
		//�ּ� ���� 1ȸ��� Ư������ ���� ����üũ � ���ȴ�
		//��� �ѹ� �̻� ������ �����Ѵٴ� ������ �߿��ϴ�
		
		//for�� ����
		//��� 5�����
		//for(int i = 1;i <=5 ;i++) {
		//for(int i = 1;i <=5 ;i++) {
		//for(int i = 5;i >=1 ;i--) {
		//for(int i = 5;i <=9 ;i++) {
		//for(int i = 10;i <=14 ;i++) {
		//for(int i = 3;i >=-1 ;i--) {
		for(int i = 1;i <=13 ;i+=3) {
			System.out.println("Hello");
		}
		
		
		
		
		}
	}

