package kr.co.mlec.homework01;

import java.util.Scanner;

/*
 * ����Ѵ�;
 * if(���ǽ�){
 * 		��԰�;
 * }
 * �б�����;
 */

public class Homework01_09 {
	
	public static void main(String[] arg) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("�����ϰ� �ִ� å�Ǽ� : ");
		int bn = s.nextInt();
		
		if(bn < 0) {
			System.out.println("�߸��Է��߽��ϴ�");
		}
		else if(bn == 0) {
			System.out.println("�����ϰ� �ִ� å ����");
		}
		else if(bn == 1){
			System.out.println("1 book");
		}
		else {
			System.out.println(bn + " books");
		}
		
		s.close();
	}
	
}
