package kr.co.mlec.homework.homework03;

/*
 *  <5�� ����� ������ ���� ���>
 *  1 2 3 4 6 7 ... 97 98 99
 *  
 *  <5�� ����� ������ ���� 5���� ���ٷ� ���>
 *  1 2 3 4 6
 *  7 8 9 11 12 ...
 */
public class Homework03_03 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if(i%5!=0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		int n = 0;
		for(int i=1; i<=100; i++) {
			if(i%5!=0) {
				System.out.print(i + " ");
				n++;
				if(n==5) {
					System.out.println();
					n=0;
				}
			}
		}
	}

}
