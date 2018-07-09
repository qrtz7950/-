package kr.co.mlec.homework.homework04;

import java.util.Scanner;

/*
 * 	��Ģ������ �����ϴ� Calculate Ŭ���� �ۼ�
 * 
 * 	���� �Է� : 12(Ű����)
 * 	���� �Է� : 5(Ű����)
 * 
 * 	12 + 5 = 17
 * 	12 - 5 = 7
 * 	12 * 5 = 60
 * 	12 / 5 = 2.4
 * 
 * 	12�� �Ҽ�üũ : false
 * 	5�� �Ҽ�üũ : true
 */

public class CalculateMain {

	public static void main(String[] args) {
		
		int[] a = new int[2];
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			System.out.print("���� �Է� : ");
			a[i] = s.nextInt();
		}
		
		Calculate calc = new Calculate(a);
		
		s.close();
	}

}

class Calculate{
	
	Calculate(int[] a){
		
		System.out.println(a[0] + " + " + a[1] + " = " + (a[0]+a[1]));
		System.out.println(a[0] + " - " + a[1] + " = " + (a[0]-a[1]));
		System.out.println(a[0] + " * " + a[1] + " = " + (a[0]*a[1]));
		System.out.println(a[0] + " / " + a[1] + " = " + ((double)a[0]/a[1]));
		
		for(int i=0; i<a.length; i++){
			if(a[i]>1) {
				int remainder = 0;
				for(int j=2; j<a[i]; j++) {
					remainder = a[i] % j;
					if(remainder==0) {break;}
				}
				System.out.println(a[i] + "�� �Ҽ�üũ : " + (remainder!=0));
			}
			else {
				System.out.println(a[i] + "�� �Ҽ�üũ : false");
			}
		}
	}
}
